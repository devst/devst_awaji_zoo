package features.turtle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void calAdd() {
		Calculator fb = new Calculator();
		assertEquals("2", fb.calculator("1+1"));
	}
	@Test
	public void calAdd2() {
		Calculator fb = new Calculator();
		assertEquals("3", fb.calculator("1+2"));
	}
	@Test
	public void calSub1() {
		Calculator fb = new Calculator();
		assertEquals("-1", fb.calculator("1-2"));
	}
	@Test
	public void calMulti1() {
		Calculator fb = new Calculator();
		assertEquals("20", fb.calculator("10*2"));
	}
	@Test
	public void calDev1() {
		Calculator fb = new Calculator();
		assertEquals("5", fb.calculator("10/2"));
	}
	@Test
	public void calDev2() {
		Calculator fb = new Calculator();
		assertEquals("2.500", fb.calculator("10/4"));
	}
	@Test
	public void calDev3() {
		Calculator fb = new Calculator();
		assertEquals("0.167", fb.calculator("1/6"));
	}
}
