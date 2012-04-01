package features.bird;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import features.bird.FizzBuzz;

public class FizzBuzzTest {

	private FizzBuzz instance;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		instance = new FizzBuzz();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		assertEquals(this.instance.fizzBuzz(1), "1");
	}
	@Test
	public void test2() {
		assertEquals(this.instance.fizzBuzz(2), "2");
	}
	@Test
	public void test3() {
		assertEquals(this.instance.fizzBuzz(3), "Fizz");
	}
	@Test
	public void test5() {
		assertEquals(this.instance.fizzBuzz(5), "Buzz");
	}
	@Test
	public void test6() {
		assertEquals(this.instance.fizzBuzz(6), "Fizz");
	}
	@Test
	public void test15() {
		assertEquals(this.instance.fizzBuzz(15), "FizzBuzz");
	}

	@Test(expected=RuntimeException.class)
	public void test0() {
		this.instance.fizzBuzz(0);
	}

	@Test(expected=RuntimeException.class)
	public void test_minus() {
		this.instance.fizzBuzz(-1);
	}

}
