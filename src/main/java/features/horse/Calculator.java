package features.horse;

public class Calculator implements features.Calculator {
	// 仕様メモ
	// * 二項演算だけ許容
	// * 式の最後に=はつかない
	// * 小数は許容しない？？？
	enum Operator{
		ADD,
		SUB,
		MULTI,
		DIV,
	}

	private Integer[] getNumbers( String calculation ){
		String[] params = calculation.split("(\\+|-|\\*|\\/)");
		if( params.length != 2 ){
			throw new IllegalArgumentException();
		}
		
		Integer[] result = new Integer[2];
		for( int i = 0; i < params.length; i++ ){
			result[i] = Integer.valueOf(params[i]);
		}
		
		return result;
	}
	
	private Operator getOperator( String calculation ){
		String result = calculation.split("[0-9]+")[1];
		
		if( result.equals("+") ){
			return Operator.ADD;
		}
		else if( result.equals("-") ){
			return Operator.SUB;
		}
		else if( result.equals("*") ){
			return Operator.MULTI;
		}
		else if( result.equals("/") ){
			return Operator.DIV;
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	
	@Override
	public String execute(String arg0) {
		Integer[] params = getNumbers( arg0 );
		switch( getOperator(arg0) ){
		case ADD:
			return String.valueOf(params[0] + params[1]);
		case SUB:
			return String.valueOf(params[0] - params[1]);
		case MULTI:
			return String.valueOf(params[0] * params[1]);
		case DIV:
			if( params[1] == 0 ){
				throw new IllegalArgumentException("0割");
			}
			return String.valueOf((double)(params[0]) / params[1]);
		default:
			throw new IllegalArgumentException();
		}
	}

}
