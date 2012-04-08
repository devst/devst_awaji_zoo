package features.elephant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalclaterTest {

	private Calculator tester = new Calculator();
	
	@Test
	public void 足し算(){
		assertEquals("3", tester.execute("1+2"));
	}

	@Test
	public void 引き算(){
		assertEquals("2", tester.execute("5-3"));
	}

	@Test
	public void 割り算(){
		assertEquals("4", tester.execute("12/3"));
		assertEquals("0.5", tester.execute("1/2"));
		assertEquals("0.333", tester.execute("1/3"));
		assertEquals("0.001", tester.execute("1/2000"));
	}
	
	@Test
	public void 掛け算(){
		assertEquals("15", tester.execute("3*5"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void 異常文字(){
		tester.execute("3%5");
	}

	@Test(expected = IllegalArgumentException.class)
	public void 書式異常１(){
		tester.execute("35");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 書式異常左辺ゼロ(){
		tester.execute("0+2");
	}

	@Test(expected = IllegalArgumentException.class)
	public void 書式異常右辺ゼロ(){
		tester.execute("3+0");
	}

	// 除算切り捨て切り上げ
	// いずれかゼロ


	
}
