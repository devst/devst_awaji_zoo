package src.test.java.features.turtle;

import static org.junit.Assert.*;

import org.junit.Test;
import src.main.java.features.turtle.FizzBuzz;

public class FizzBuzzTest {
	@Test
	public void Fizz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.fizzBuzz(3));
	}
	@Test
	public void FizzNegative() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("-1", fb.fizzBuzz(-1));
	}
	@Test
	public void Buzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz", fb.fizzBuzz(5));
	}
	@Test
	public void BuzzNegative() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("-5", fb.fizzBuzz(-5));
	}
	@Test
	public void FizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz", fb.fizzBuzz(15));
	}
	
}
