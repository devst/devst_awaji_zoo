package features.elephant;


import java.math.BigDecimal;

public class Calculator implements features.Calculator {

	@Override
	public String execute(String formula) {
		String[] items = parseFormula(formula);
		if(items == null || items.length != 3){
			throw new IllegalArgumentException("数式異常:" + formula);
		}
		
		BigDecimal num1 = new BigDecimal(items[0]);
		BigDecimal num2 = new BigDecimal(items[2]);
		
		if(num1.intValue() == 0){
			throw new IllegalArgumentException("数式異常:左辺ゼロ");
		}else if(num2.intValue() == 0){
			throw new IllegalArgumentException("数式異常:右辺ゼロ");
		}
		
		if(items[1].equals("+")){
			return num1.add(num2).toString();
		}else if(items[1].equals("-")){
			return num1.subtract(num2).toString();		
		}else if(items[1].equals("*")){
			return num1.multiply(num2).toString();
		}else if(items[1].equals("/")){
			return num1.divide(num2, 0, BigDecimal.ROUND_HALF_UP).toString();
		}else{
			throw new IllegalArgumentException(formula);
		}
	}
	
	private String[] parseFormula(String formula){
		StringBuilder num1 = new StringBuilder();
		StringBuilder num2 = new StringBuilder();
		String operator = null;
		int length = formula.length();
		for(int i=0; i<length; i++){
			char c = formula.charAt(i);
			if(c >= '0' && c <= '9'){
				// 数字
				if(operator == null){
					num1.append(c);
				}else{
					num2.append(c);					
				}
			}else if(c == '+' ||
					c == '-' ||
					c == '/' ||
					c == '*' ){
				// 演算子
				if(operator == null){
					operator = String.valueOf(c);
				}else{
					return null;
				}
			}else{
				return null;
			}
		}
		return new String[]{num1.toString(), operator, num2.toString()};
		
	}

}
