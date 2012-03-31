package features.sheep;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class FizzBuzzTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		FizzBuzz a = new FizzBuzz();
		String fizzBuzz = a.fizzBuzz(1);
		assertEquals(fizzBuzz, "1");
		
//		fail("not yet implemented");
	}

	@Test
	public void test1() {
		FizzBuzz a = new FizzBuzz();
		String fizzBuzz = a.fizzBuzz(3);
		assertEquals(fizzBuzz, "Fizz");
		
//		fail("not yet implemented");
	}

	@Test
	public void test2() {
		FizzBuzz a = new FizzBuzz();
		String fizzBuzz = a.fizzBuzz(5);
		assertEquals(fizzBuzz, "Buzz");
		
//		fail("not yet implemented");
	}
	
	@Test
	public void test3() {
		FizzBuzz a = new FizzBuzz();
		String fizzBuzz = a.fizzBuzz(15);
		assertEquals(fizzBuzz, "FizzBuzz");
		
//		fail("not yet implemented");
	}
}
