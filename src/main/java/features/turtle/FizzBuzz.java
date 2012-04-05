package features.turtle;

public class FizzBuzz implements features.FizzBuzz {

	@Override
	public String fizzBuzz(int arg0) {
		if(arg0 < 1){
<<<<<<< HEAD
				throw new RuntimeException();
		}
		if(arg0 % 15 == 0){
			return "FizzBuzz";
		}
=======
			return new Integer(arg0).toString();
		}
		if(arg0 % 3 == 0 && arg0 % 5 == 0){
			return "FizzBuzz";
		}		
>>>>>>> 407b6341eeb8ba71b61388c3d17d99f1186151a0
		if(arg0 % 3 == 0){
			return "Fizz";
		}
		if(arg0 % 5 == 0){
			return "Buzz";
		}
		return new Integer(arg0).toString();
	}

}
