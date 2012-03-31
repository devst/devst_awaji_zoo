package features.bird;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import features.bird.FizzBuzz;

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
	public void test1() {
		this.testFizzBuzz(1, "1");
	}
	@Test
	public void test2() {
		this.testFizzBuzz(2, "2");
	}
	@Test
	public void test3() {
		this.testFizzBuzz(3, "Fizz");
	}
	@Test
	public void test5() {
		this.testFizzBuzz(5, "Buzz");
	}
	@Test
	public void test6() {
		this.testFizzBuzz(6, "Fizz");
	}
	@Test
	public void test15() {
		this.testFizzBuzz(15, "FizzBuzz");
	}

	public void test0() {
		this.testFizzBuzz(0, "0");
	}
	@Test(expected=RuntimeException.class)
	public void test_minus() {
		new FizzBuzz().fizzBuzz(-1);
	}

	private void testFizzBuzz(int num, String ans) {
		FizzBuzz instance = new FizzBuzz();
		assertEquals(ans, instance.fizzBuzz(num));
 	}
}
