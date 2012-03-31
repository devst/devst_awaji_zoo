package features.tiger;

import static org.junit.Assert.*;
//import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new FizzBuzz();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void 三の時はFizzを返す() {
		assertThat(sut.fizzBuzz(3), is("Fizz"));
	}
	
	@Test
	public void 五の時はBuzzを返す() {
		assertThat(sut.fizzBuzz(5), is("Buzz"));
	}
	
	@Test
	public void 三の倍数の時はFizzを返す() {
		assertThat(sut.fizzBuzz(6), is("Fizz"));
	}
	
	@Test
	public void 五の倍数の時はBuzzを返す() {
		assertThat(sut.fizzBuzz(10), is("Buzz"));
	}
	
	@Test
	public void 一の時は引数の数字を文字列にして返す() {
		assertThat(sut.fizzBuzz(1), is("1"));
	}
	
	@Test
	public void 二の時は引数の数字を文字列にして返す() {
		assertThat(sut.fizzBuzz(2), is("2"));
	}
	
	@Test
	public void 十五の時はFizzBuzzを返す() {
		assertThat(sut.fizzBuzz(15), is("FizzBuzz"));
	}
	
	@Test
	public void 三と五の公倍数の時はFizzBuzzを返す() {
		assertThat(sut.fizzBuzz(30), is("FizzBuzz"));
	}
	
}
