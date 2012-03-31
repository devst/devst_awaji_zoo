package features.penguin;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

import org.junit.Test;

import features.penguin.FizzBuzz;

public class FizzBuzzTest {

	private FizzBuzz fi = new FizzBuzz();
	
	@Test
	public void testNotFizzBuzz() {
		assertThat(fi.fizzBuzz(1), is("1"));
	}
		
	@Test
	public void testFizz() {
		assertThat(fi.fizzBuzz(3), is("Fizz"));
	}
	
	@Test
	public void testBuzz() {
		assertThat(fi.fizzBuzz(5), is("Buzz"));
	}
	
	@Test
	public void testFizzBuzz() {
		assertThat(fi.fizzBuzz(15), is("FizzBuzz"));
	}
}
