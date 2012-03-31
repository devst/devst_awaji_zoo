package features.snake;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fb;
	
	@Before
	public void before() {
		fb = new FizzBuzz();
	}

	@Test
	public void testInput1() {
		assertEquals("1",fb.fizzBuzz(1));
	}
	
	@Test
	public void testInput3() {
		assertEquals("Fizz", fb.fizzBuzz(3));
	}
	
	@Test
	public void testInput5() {
		assertEquals("Buzz", fb.fizzBuzz(5));
	}
	
	@Test
	public void testInput15() {
		assertEquals("FizzBuzz", fb.fizzBuzz(15));
	}

}
