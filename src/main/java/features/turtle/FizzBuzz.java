package features.turtle;

public class FizzBuzz implements features.FizzBuzz {

	@Override
	public String fizzBuzz(int arg0) {
		if(arg0 < 1){
				throw new RuntimeException();
		}
		if(arg0 % 15 == 0){
			return "FizzBuzz";
		}
		if(arg0 % 3 == 0){
			return "Fizz";
		}
		if(arg0 % 5 == 0){
			return "Buzz";
		}
		return new Integer(arg0).toString();
	}

}
