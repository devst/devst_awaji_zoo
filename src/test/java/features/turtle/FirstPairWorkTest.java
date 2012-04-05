package features.turtle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstPairWorkTest {
	@Test
	public void 意気込み() {
		FirstPairWork fpw = new FirstPairWork();
		assertEquals("Just do it.", fpw.getIkigomi());
	}

	@Test
	public void 名前() {
		FirstPairWork fpw = new FirstPairWork();
		assertEquals("cozykaz and urimaro", fpw.getMembers());
	}
}
