package com.admin.training.jenkins;

import static org.junit.Assert.*;

import org.junit.*;

public class TestCalculator {

	@Test
	public void addtest() {
		Calculator mycal=new Calculator();
		assertEquals(10, mycal.addnum(5, 5));
	}
	@Test
	public void subtest() {
		Calculator mycal=new Calculator();
		assertEquals(0, mycal.subnum(5, 5));
	}
}
