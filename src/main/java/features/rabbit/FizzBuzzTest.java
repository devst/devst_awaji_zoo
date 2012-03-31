package features.rabbit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import features.rabbit.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void 数値が3の倍数であればFizz() {
		FizzBuzz sut = new FizzBuzz();
		assertThat(sut .fizzBuzz(3),is("Fizz"));
	}

}
