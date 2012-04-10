package features.turtle;

import java.math.BigDecimal;

public class Calculator implements features.Calculator{
	@Override
	public String execute(String fomula) {
		// TODO 自動生成されたメソッド・スタブ
		//String fomula = "1+3";
		//System.out.println(getOperator(fomula));
		String strToken = getOperator(fomula);
		String[] strAry = fomula.split(strToken);
		//String[] strAry = fomula.split("\\+");

		int firstValue = Integer.valueOf(strAry[0]).intValue();
		int secondValue = Integer.valueOf(strAry[1]).intValue();

		BigDecimal result = calOperator(strToken,firstValue, secondValue);
		//System.out.println(result);
		return result.toString();
	}

	private String getOperator(String arg_fomula)
	{
		//System.out.println(arg_fomula);
		//System.out.println(arg_fomula.indexOf("+"));
		if(arg_fomula.indexOf("+") != -1){
			return "\\+";
		}else if(arg_fomula.indexOf("-") != -1){
			return "\\-";
		}else if(arg_fomula.indexOf("*") != -1){
			return "\\*";
		}else{
			return "\\/";
		}

	}
	private BigDecimal calOperator(String arg_fomula,int arg_num1,int arg_num2)
	{
		//System.out.println(arg_fomula);
		//System.out.println(arg_fomula.indexOf("+"));
		BigDecimal num1 = BigDecimal.valueOf(arg_num1);
		BigDecimal num2 = BigDecimal.valueOf(arg_num2);


		if(arg_fomula.equals("\\+")){
			return num1.add(num2);
		}else if(arg_fomula.equals("\\-")){
			return num1.subtract(num2);
		}else if(arg_fomula.equals("\\*")){
			return num1.multiply(num2);
		}else{
			if((arg_num1 % arg_num2) == 0){
				return num1.divide(num2);
			}else{
				return num1.divide(num2,3,BigDecimal.ROUND_HALF_UP);
			}
		}
	}
}
