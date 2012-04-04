package features.rabbit;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import features.rabbit.Calculator;

public class CalculatorTest {

    @Test
	public void plusと2つの10進数値をexecuteCalculateに渡すと2つの数値の加算結果の文字列が返る() {
    	
        Calculator sut = new Calculator();
        assertThat(sut.executeCalc("+", "5", "3"),is("8"));
    }
    
    @Test
    public void minusと2つの10進数値をexecuteCalculateに渡すと2つの数値の減算結果の文字列が返る() {

        Calculator sut = new Calculator();
        assertThat(sut.executeCalc("-", "5", "3"),is("2"));
    }
}