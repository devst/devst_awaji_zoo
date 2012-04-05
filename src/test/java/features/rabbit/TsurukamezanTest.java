package features.rabbit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;

public class TsurukamezanTest {

	Tsurukamezan sut;
	
	@Before
	public void setUp() {
		sut = new Tsurukamezan();
	}
	
	@Test
	public void 亀の個体数算出() {
		assertThat(sut.calcKameNum(8,26), is(5));
	}

	@Test
	public void 鶴の個体数算出() {
		assertThat(sut.calcTsuruNum(8,26), is(3));
	}
	
	@Test
	public void 鶴と亀の個体数を整形出力できる() {
		assertThat(sut.tsurukame(8,26), is("鶴3羽、亀5匹"));
	}
	
	@Test
	public void 鶴が１羽のみのとき() {
		assertThat(sut.tsurukame(1,2), is("鶴1羽、亀0匹"));
	}
	
	@Test
	public void 鶴も亀も0のとき() {
		assertThat(sut.tsurukame(0,0), is("鶴0羽、亀0匹"));
	}
	
	@Test
	public void 亀が１匹のみのとき() {
		assertThat(sut.tsurukame(1,4), is("鶴0羽、亀1匹"));
	}
	
	@Test(expected=RuntimeException.class)
	public void 足の数が2の倍数でないなら実行時例外() {
		sut.tsurukame(8,9);
	}
	
	@Test(expected=RuntimeException.class)
	public void 個体数の２倍が足の数以上あるなら実行時例外() {
		sut.tsurukame(2,2);
	}
	
	@Test(expected=RuntimeException.class)
	public void 個体数が0未満なら実行時例外() {
		sut.tsurukame(-1,2);
	}
	
	@Test(expected=RuntimeException.class)
	public void 足の数が0未満なら実行時例外() {
		sut.tsurukame(1,-2);
	}
}
