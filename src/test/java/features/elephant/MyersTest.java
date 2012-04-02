package features.elephant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyersTest {

	@Test
	public void 正三角形(){
		Myers tester = new Myers();
		assertEquals("正三角形", tester.getName(3, 3, 3));
	}
	
	@Test
	public void 二等辺三角形(){
		Myers tester = new Myers();
		assertEquals("二等辺三角形", tester.getName(3, 3, 2));		
		assertEquals("二等辺三角形", tester.getName(3, 2, 3));
		assertEquals("二等辺三角形", tester.getName(2, 3, 3));
	}
	
	@Test
	public void 不等辺三角形(){
		Myers tester = new Myers();
		assertEquals("不等辺三角形", tester.getName(2, 3, 4));			
	}
	
	@Test(expected = RuntimeException.class)
	public void 三角形不成立(){
		Myers tester = new Myers();
		tester.getName(1, 5, 1);	
	}
	
	@Test(expected = RuntimeException.class)
	public void ゼロ値(){
		Myers tester = new Myers();
		tester.getName(0, 2, 2);	
	}

	@Test(expected = RuntimeException.class)
	public void マイナス値(){
		Myers tester = new Myers();
		tester.getName(-1, 4, 4);	
	}
	
}
