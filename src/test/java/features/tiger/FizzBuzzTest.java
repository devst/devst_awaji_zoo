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
	public void return_Fizz_when_argument_is_three() { //O‚Ì‚ÍFizz‚ğ•Ô‚·
		assertThat(sut.fizzBuzz(3), is("Fizz"));
	}
	
	@Test
	public void  ŒÜ‚Ì‚ÍBuzz‚ğ•Ô‚·() {
		assertThat(sut.fizzBuzz(5), is("Buzz"));
	}
	
	@Test
	public void O‚Ì”{”‚Ì‚ÍFizz‚ğ•Ô‚·() {
		assertThat(sut.fizzBuzz(6), is("Fizz"));
	}
	
	@Test
	public void ŒÜ‚Ì”{”‚Ì‚ÍBuzz‚ğ•Ô‚·() {
		assertThat(sut.fizzBuzz(10), is("Buzz"));
	}
	
	@Test
	public void ˆê‚Ì‚Íˆø”‚Ì”š‚ğ•¶š—ñ‚É‚µ‚Ä•Ô‚·() {
		assertThat(sut.fizzBuzz(1), is("1"));
	}
	
	@Test
	public void “ñ‚Ì‚Íˆø”‚Ì”š‚ğ•¶š—ñ‚É‚µ‚Ä•Ô‚·() {
		assertThat(sut.fizzBuzz(2), is("2"));
	}
	
	@Test
	public void  ‚¶‚ã‚¤‚²‚Ì‚ÍFizzBuzz‚ğ•Ô‚·() {
		assertThat(sut.fizzBuzz(15), is("FizzBuzz"));
	}
	
	@Test
	public void O‚ÆŒÜ‚ÌŒö”{”‚Ì‚ÍFizzBuzz‚ğ•Ô‚·() {
		assertThat(sut.fizzBuzz(30), is("FizzBuzz"));
	}
	
}
