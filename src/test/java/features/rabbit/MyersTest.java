package features.rabbit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class MyersTest {

	@Test
	public void 不等辺三角形() throws Exception {
		String actual = new Myers().getName(3,4,5);
		assertThat(actual, is("不等辺三角形"));
	}
	
	@Test
	public void 正三角形() throws Exception {
		String actual = new Myers().getName(2,2,2);
		assertThat(actual, is("正三角形"));
	}
	
	@Test
	public void 二等辺三角形その1() throws Exception {
		String actual = new Myers().getName(2,2,1);
		assertThat(actual, is("二等辺三角形"));
	}
	
	@Test
	public void 二等辺三角形その2() throws Exception {
		String actual = new Myers().getName(1,2,2);
		assertThat(actual, is("二等辺三角形"));
	}
	
	@Test
	public void 二等辺三角形その3() throws Exception {
		String actual = new Myers().getName(2,1,2);
		assertThat(actual, is("二等辺三角形"));
	}
	
	@Test(expected=RuntimeException.class)
	public void マイナス値は例外をなげる() throws Exception {
		new Myers().getName(-1, -1, -1);
	}
	
	@Test(expected=RuntimeException.class)
	public void 辺の値が0ならは例外をなげる() throws Exception {
		new Myers().getName(0, 1, 2);
	}
	
	@Test(expected=RuntimeException.class)
	public void 三角形として成立しないその1() throws Exception {
		new Myers().getName(1, 1, 2);
	}
	
	@Test(expected=RuntimeException.class)
	public void 三角形として成立しないその2() throws Exception {
		new Myers().getName(2, 1, 1);
	}
	
	@Test(expected=RuntimeException.class)
	public void 三角形として成立しないその3() throws Exception {
		new Myers().getName(1, 2, 1);
	}
	
	@Test(expected=RuntimeException.class)
	public void 辺の１つが長すぎて三角形を形成できない() throws Exception {
		new Myers().getName(1, 1, 20);
	}
}
