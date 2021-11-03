/*
 * Copyright 2011-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.internal;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class TokenBucketTest {

    @Test
    public void acquire_notEnabled_returnsTrue() {
        TokenBucket tb = new TokenBucket();
        assertThat(tb.acquire(0.0), equalTo(true));
    }

    @Test
    public void acquire_capacitySufficient_returnsImmediately() {
        TokenBucket tb = Mockito.spy(new TokenBucket());

        // stub out refill() so we have control over the capacity
        Mockito.doAnswer(new Answer() {
            @Override
            public Void answer(InvocationOnMock invocationOnMock) throws Throwable {
                return null;
            }
        }).when(tb).refill();

        tb.setFillRate(0.5);
        tb.setCurrentCapacity(1000.0);
        tb.enable();

        long a = System.nanoTime();
        boolean acquired = tb.acquire(1000.0);
        long elapsed = System.nanoTime() - a;

        assertThat(acquired, equalTo(true));
        assertThat(TimeUnit.NANOSECONDS.toMillis(elapsed), lessThan(3L));
    }

    @Test
    public void acquire_capacityInsufficient_sleepsForRequiredTime() {
        TokenBucket tb = Mockito.spy(new TokenBucket());

        // stub out refill() so we have control over the capacity
        Mockito.doAnswer(new Answer() {
            @Override
            public Void answer(InvocationOnMock invocationOnMock) throws Throwable {
                return null;
            }
        }).when(tb).refill();

        tb.setFillRate(1.0);
        tb.setCurrentCapacity(0.0);
        tb.enable();

        // 1 token to wait for at a rate of 1 per second should sleep for approx 1s
        long a = System.nanoTime();
        boolean acquired = tb.acquire(1);
        long elapsed = System.nanoTime() - a;

        assertThat(acquired, equalTo(true));
        assertThat(TimeUnit.NANOSECONDS.toSeconds(elapsed), equalTo(1L));
    }

    @Test
    public void acquire_capacityInsufficient_fastFailEnabled_doesNotSleep() {
        TokenBucket tb = Mockito.spy(new TokenBucket());

        // stub out refill() so we have control over the capacity
        Mockito.doAnswer(new Answer() {
            @Override
            public Void answer(InvocationOnMock invocationOnMock) throws Throwable {
                return null;
            }
        }).when(tb).refill();

        tb.setFillRate(1.0);
        tb.setCurrentCapacity(4.0);
        tb.enable();

        long a = System.nanoTime();
        boolean acquired = tb.acquire(5, true);
        long elapsed = System.nanoTime() - a;

        assertThat(acquired, equalTo(false));
        assertThat(tb.getCurrentCapacity(), equalTo(4.0));
        // The method call should be nowhere near a millisecond
        assertThat(TimeUnit.NANOSECONDS.toSeconds(elapsed), equalTo(0L));
    }

    @Test
    public void tryAcquireCapacity_capacitySufficient_returns0() {
        TokenBucket tb = new TokenBucket();
        tb.setCurrentCapacity(5.0);

        assertThat(tb.tryAcquireCapacity(5.0), equalTo(0.0));
    }

    @Test
    public void tryAcquireCapacity_capacityInsufficient_returnsDifference() {
        TokenBucket tb = new TokenBucket();
        tb.setCurrentCapacity(3.0);

        assertThat(tb.tryAcquireCapacity(5.0), equalTo(2.0));
    }
}
