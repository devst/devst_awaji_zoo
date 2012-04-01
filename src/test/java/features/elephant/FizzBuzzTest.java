package features.elephant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz = new FizzBuzz();
	@Test
	public void fizzBussReturnFizz(){
		assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
		assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
	}

	@Test
	public void fizzBuzzReturnBuzz() {
		assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
		assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
	}

	@Test
	public void fizzBuzzReturnOther() {
		assertEquals("4", fizzBuzz.fizzBuzz(4));
	}

	@Test
	public void fizzBuzzReturnFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
	}

	@Test(expected = RuntimeException.class)
	public void fizzBuzzIfInputMinus(){
		fizzBuzz.fizzBuzz(-1);
	}

	@Test(expected = RuntimeException.class)
	public void fizzBuzzIfInputZero(){
		fizzBuzz.fizzBuzz(0);
	}

}
