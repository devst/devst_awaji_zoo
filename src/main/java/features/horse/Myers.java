package features.horse;

public class Myers implements features.Myers {

	@Override
	public String getName(int a, int b, int c) {
		if( (a * b * c) <= 0 ){
			throw new RuntimeException("入力値不正");
		}
		
		if( (a + b < c) || (a + c < b) || (b + c < a) ){
			return "不等辺三角形";
		}
		else if( (a == b) && (b == c) ){
			return "正三角形";
		}
		else if( (a == b) || (b == c) || (a == c) ){
			return "二等辺三角形";
		}
		
		throw new RuntimeException("すべての条件に合致しない");
	}

}
