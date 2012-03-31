package features.rabbit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import features.rabbit.FirstPairWork;

public class FirstPairWorkTest {
	
	FirstPairWork sut;
	
	@Before
	public void setUp() {
		sut = new FirstPairWork();
	}
	
	@Test
	public void ペアの名前が取得できる() {
		assertThat(sut.getMembers(), is("white/pocketberserker"));
	}

	@Test
	public void 意気込みが取得できる() throws Exception {
		assertThat(sut.getIkigomi(), is("understand TDD."));
	}
}
