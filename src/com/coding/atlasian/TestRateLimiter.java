package com.coding.atlasian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRateLimiter {
	
	
	@Test
	public void TestisAllowedParallelRequestTrue() {
		RateLimiter r = new RateLimiter();

		assertEquals("isAllowe=True ", true, r.isAllowed(1));
		assertEquals("isAllowe=True ", true, r.isAllowed(1));
		assertEquals("isAllowe=True ", true, r.isAllowed(1));
	}

	@Test
	public void TestisAllowedParallelRequestfalse() {
		RateLimiter r = new RateLimiter();

		assertEquals("isAllowe=True ", true, r.isAllowed(1));
		assertEquals("isAllowe=True ", true, r.isAllowed(1));
		assertEquals("isAllowe=True ", true, r.isAllowed(1));
		assertEquals("isAllowe=True ", false, r.isAllowed(1));
	}
	
	@Test
	public void TestisAllowedPassedTime() throws InterruptedException {
		RateLimiter r = new RateLimiter();

		assertEquals("isAllowe=True ", true, r.isAllowed(1));
		Thread.sleep(70000);
		assertEquals("isAllowe=True ", true, r.isAllowed(1));
	}
}
