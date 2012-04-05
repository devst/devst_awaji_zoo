package features.horse;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyersTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	private void myAssert( String expected, int a, int b, int c ){
		assertEquals(expected, new Myers().getName(a, b, c) );
	}
	
	@Test
	public void 正三角形() {
		myAssert("正三角形", 1, 1, 1);
	}
	
	@Test
	public void 二等辺三角形() {
		myAssert("二等辺三角形", 2, 2, 1);
	}
	
	@Test
	public void 二等辺三角形_2() {
		myAssert("二等辺三角形", 2, 1, 2);
	}

	@Test
	public void 二等辺三角形_3() {
		myAssert("二等辺三角形", 2, 2, 1);
	}
	
	@Test
	public void 不等辺三角形() {
		myAssert("不等辺三角形", 1, 4, 2);
	}
	
	@Test
	public void 不等辺三角形_2() {
		myAssert("不等辺三角形", 4, 1, 2);
	}
	
	@Test
	public void 不等辺三角形_3() {
		myAssert("不等辺三角形", 1, 2, 4);
	}
	
	@Test(expected=RuntimeException.class)
	public void 一辺が他二辺の和() {
		myAssert("三角形", 1, 3, 2);
	}
	
	@Test(expected=RuntimeException.class)
	public void 一辺が他二辺の和_2() {
		myAssert("三角形", 1, 2, 3);
	}
	
	@Test(expected=RuntimeException.class)
	public void 一辺が他二辺の和_3() {
		myAssert("三角形", 1, 2, 3);
	}
	
	@Test(expected=RuntimeException.class)
	public void 入力値不正() {
		myAssert("", 0, 2, 3);
	}
	
	@Test(expected=RuntimeException.class)
	public void 入力値不正_2() {
		myAssert("", 1, -1, 3);
	}
}
