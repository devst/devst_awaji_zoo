package features.mouse;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import features.mouse.Myers;

public class MyersTest {

	Myers target;
	
	@Before
	public void setUp() throws Exception {
		target = new Myers();
	}

	/**
	 * 正三角形:すべての辺が同じ長さ
	 */
	@Test
	public void 正三角形(){
		assertEquals("正三角形", target.getName(1, 1, 1));
	}
	
	/**
	 * 二等辺三角形:2つの辺だけが同じ
	 */
	@Test
	public void 二等辺三角形(){
		assertEquals("二等辺三角形", target.getName(2, 2, 1));
	}
	
	/**
	 * 不等辺三角形:すべての辺が違う長さ
	 */
	@Test
	public void 不等辺三角形(){
		assertEquals("不等辺三角形", target.getName(1, 2, 3));
	}

	/**
	 * 不等辺三角形:すべての辺が違う長さ
	 * 三角形にならない場合: いずれかの辺が0
	 */
	@Test(expected = IllegalArgumentException.class)
	public void 非三角形_value0(){
		target.getName(0, 1, 1);
	}

	/**
	 * 不等辺三角形:すべての辺が違う長さ
	 * 三角形にならない場合: いずれかの辺がマイナス値
	 */
	@Test(expected = IllegalArgumentException.class)
	public void 非三角形_value_minus(){
		target.getName(-1, 1, 1);
	}

}
