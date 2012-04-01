package features.rabbit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import features.rabbit.FizzBuzz;

public class FizzBuzzTest {

	FizzBuzz sut;
	
	@Before
	public void setUp() {
		sut = new FizzBuzz();
	}
	
	@Test
	public void 数値3が3の倍数であればFizz() {
		assertThat(sut.fizzBuzz(3),is("Fizz"));
	}

	@Test
	public void 数値5は5の倍数であればBuzz() throws Exception {
		assertThat(sut .fizzBuzz(5), is("Buzz"));
	}
	
	@Test
	public void 数値15は15の倍数であればFizzBuzz() throws Exception {
		assertThat(sut .fizzBuzz(15), is("FizzBuzz"));
	}
	
	@Test
	public void その他の数値はその数値の文字列を返す() throws Exception {
		assertThat(sut .fizzBuzz(1), is("1"));
	}
	
	@Test(expected=RuntimeException.class)
	public void 数値0は実行時例外を発生() throws Exception {
		sut.fizzBuzz(0);
	}
	
	@Test(expected=RuntimeException.class)
	public void 負数は実行時例外を発生() throws Exception {
		sut.fizzBuzz(-1);
	}
}
