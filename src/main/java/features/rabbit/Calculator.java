package features.rabbit;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Calculator implements features.Calculator {

    private static final DecimalFormat RESULT_FORMAT = new DecimalFormat("#.###");

    @Override
    public String execute(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String executeCalc(String op ,String left, String right) {
        BigDecimal leftNum = new BigDecimal(left);
        BigDecimal rightNum = new BigDecimal(right);
        BigDecimal result;
        if("+".equals(op)) result = leftNum.add(rightNum);
        else if("-".equals(op)) result = leftNum.subtract(rightNum);
        else if("*".equals(op)) result = leftNum.multiply(rightNum);
        else if("/".equals(op)) result = leftNum.divide(rightNum, 3, BigDecimal.ROUND_HALF_UP);
        else throw new IllegalArgumentException("無効な演算子が指定されました");
        return RESULT_FORMAT.format(result);
    }
}