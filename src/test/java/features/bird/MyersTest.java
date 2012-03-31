package features.bird;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyersTest {

	@Test
	public void testRegularTriangle() {
		Myers instance = new Myers();
		String ret = instance.getName(5, 5, 5);
		assertEquals("正三角形", ret);
	}
	@Test
	public void testIsoscelesTriangle1() {
		Myers instance = new Myers();
		String ret = instance.getName(5, 5, 6);
		assertEquals("二等辺三角形", ret);
	}
	@Test
	public void testIsoscelesTriangle2() {
		Myers instance = new Myers();
		String ret = instance.getName(6, 5, 5);
		assertEquals("二等辺三角形", ret);
	}
	@Test
	public void testIsoscelesTriangle3() {
		Myers instance = new Myers();
		String ret = instance.getName(5, 6, 5);
		assertEquals("二等辺三角形", ret);
	}
	@Test
	public void testTriangle() {
		Myers instance = new Myers();
		String ret = instance.getName(4, 5, 6);
		assertEquals("不等辺三角形", ret);
	}
	@Test(expected = RuntimeException.class)
	public void testInvalidTriangle1() {
		Myers instance = new Myers();
		String ret = instance.getName(0, 3, 3);
	}
	@Test(expected = RuntimeException.class)
	public void testInvalidTriangle2() {
		Myers instance = new Myers();
		String ret = instance.getName(3, -1, 3);
	}
	@Test(expected = RuntimeException.class)
	public void testInvalidTriangle3() {
		Myers instance = new Myers();
		String ret = instance.getName(3, 3, -4);
	}

	@Test(expected = RuntimeException.class)
	public void testInvalidTriangle11() {
		Myers instance = new Myers();
		String ret = instance.getName(1, 2, 3);
	}

	@Test(expected = RuntimeException.class)
	public void testInvalidTriangle12() {
		Myers instance = new Myers();
		String ret = instance.getName(1, 2, 4);
	}

	@Test(expected = RuntimeException.class)
	public void testInvalidTriangle13() {
		Myers instance = new Myers();
		String ret = instance.getName(3, 2, 1);
	}

	@Test(expected = RuntimeException.class)
	public void testInvalidTriangle14() {
		Myers instance = new Myers();
		String ret = instance.getName(2, 3, 1);
	}

}
