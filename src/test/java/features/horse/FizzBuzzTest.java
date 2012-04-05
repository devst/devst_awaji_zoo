package features.horse;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import features.horse.FizzBuzz;


public class FizzBuzzTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	private String run( int arg ){
		FizzBuzz a = new FizzBuzz();
		
		return a.fizzBuzz(arg);
	}

	@Test
	public void test1() {
		assertEquals("FizzBuzz", run(15));
	}
	
	@Test
	public void test2(){
		assertEquals("Buzz", run(10) );
		assertEquals("Buzz", run(5) );
		assertFalse("Buzz".equals(run(3)));
	}
	
	@Test
	public void test3(){
		assertEquals("Fizz", run(6) );
	}
	
	@Test
	public void test4(){
		assertEquals("2", run(2) );
	}
	
	@Test
	public void test5(){
		assertEquals("1", run(1) );
		assertEquals("65536", run(65536) );
	}
	
	@Test
	public void test6(){
		assertEquals("FizzBuzz", run(65535) );
	}
	
	@Test(expected=RuntimeException.class)
	public void test7(){
		run(0);
	}
	
	@Test(expected=RuntimeException.class)
	public void test8(){
		run(-1);
	}
	
	
}
