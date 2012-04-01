package features.tiger;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyersTest {

	Myers sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Myers();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void 全ての辺が同じならば正三角形() {
		assertThat(sut.getName(5, 5, 5), is("正三角形"));
	}
	
	@Test
	public void 両サイドの辺の長さが同じならば二等辺三角形() {
		assertThat(sut.getName(5, 5, 6), is("二等辺三角形"));
	}
	
	@Test
	public void 全ての辺の長さが異なれば不等辺三角形() {
		assertThat(sut.getName(5, 4, 3), is("不等辺三角形"));
	}
	
	@Test
	public void 右側の辺と底辺が同じならば二等辺三角形() {
		assertThat(sut.getName(5, 6, 6), is("二等辺三角形"));
	}
	
	@Test
	public void 左側の辺と底辺が同じならば二等辺三角形() {
		assertThat(sut.getName(6, 5, 6), is("二等辺三角形"));
	}
	
	@Test(expected=RuntimeException.class)
	public void サイドの辺の和が底辺より短ければ例外() throws Exception {
		sut.getName(1, 2, 5);
	}

	@Test(expected=RuntimeException.class)
	public void 右側の辺と底辺の和が左側の辺より短ければ例外() throws Exception {
		sut.getName(1, 5, 2);
	}
	
	@Test(expected=RuntimeException.class)
	public void 左側の辺と底辺の和が右側の辺より短ければ例外() throws Exception {
		sut.getName(5, 1, 2);
	}
	
	@Test(expected=RuntimeException.class)
	public void サイドの辺の和が底辺と同じならば例外() throws Exception {
		sut.getName(1, 2, 3);
	}
	
	@Test(expected=RuntimeException.class)
	public void 右側の辺と底辺の和が左側の辺と同じならば例外() throws Exception {
		sut.getName(1, 3, 2);
	}
	
	@Test(expected=RuntimeException.class)
	public void 左側の辺と底辺の和が右側の辺と同じならば例外() throws Exception {
		sut.getName(3, 1, 2);
	}

}
