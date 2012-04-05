package features.turtle;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {
	@Test
	public void Fizz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.fizzBuzz(3));
	}
	@Test
<<<<<<< HEAD
=======
	public void FizzNegative() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("-1", fb.fizzBuzz(-1));
	}
	@Test
>>>>>>> 407b6341eeb8ba71b61388c3d17d99f1186151a0
	public void Buzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz", fb.fizzBuzz(5));
	}
	@Test
<<<<<<< HEAD
	public void FizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz", fb.fizzBuzz(15));
	}
	@Test(expected=RuntimeException.class)
	public void FizzNegative() {
		FizzBuzz fb = new FizzBuzz();
		fb.fizzBuzz(-1);
	}
=======
	public void BuzzNegative() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("-5", fb.fizzBuzz(-5));
	}
	@Test
	public void FizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz", fb.fizzBuzz(15));
	}
	
>>>>>>> 407b6341eeb8ba71b61388c3d17d99f1186151a0
}
