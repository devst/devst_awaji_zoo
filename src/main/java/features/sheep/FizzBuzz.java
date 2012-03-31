package features.sheep;

public class FizzBuzz implements features.FizzBuzz {

	@Override
	public String fizzBuzz(int arg0) {
			if(arg0 % 15 == 0) {
				return "FizzBuzz";
			} else if(arg0 % 5 == 0) {
				return "Buzz";
			} else if(arg0 % 3 == 0) {
				return "Fizz";
			} else {
				return String.valueOf(arg0);
			}
		}
	}

