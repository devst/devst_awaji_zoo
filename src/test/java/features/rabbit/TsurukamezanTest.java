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
	
	@Test(expected=RuntimeException.class)
	public void 足の数が2の倍数でないなら実行時例外() {
		sut.tsurukame(8,9);
	}
	
	@Test(expected=RuntimeException.class)
	public void 個体数の２倍が足の数以上あるなら実行時例外() {
		sut.tsurukame(2,2);
	}
}
