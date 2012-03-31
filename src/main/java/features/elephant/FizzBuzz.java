package features.elephant;

public class FizzBuzz implements features.FizzBuzz {

	@Override
	public String fizzBuzz(int i) {
		if(i <= 0){
			throw new RuntimeException();
		}

		if (i % 15 == 0) {
			return "FizzBuzz";
		} else if (i % 5 == 0) {
			return "Buzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		}

		return String.valueOf(i);
	}

}
