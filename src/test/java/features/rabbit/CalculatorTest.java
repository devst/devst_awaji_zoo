package features.rabbit;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;

import features.rabbit.Calculator;

public class CalculatorTest {
	
	Calculator sut;
	
	@Before
	public void setUp() {
		sut = new Calculator();
	}

    @Test
	public void plusと2つの10進数値をexecuteCalculateに渡すと2つの数値の加算結果の文字列が返る() {
    	
        assertThat(sut.executeCalc("+", "5", "3"),is("8"));
    }
    
    @Test
    public void minusと2つの10進数値をexecuteCalculateに渡すと2つの数値の減算結果の文字列が返る() {

        assertThat(sut.executeCalc("-", "5", "3"),is("2"));
    }
    
    @Test
    public void multiplyと2つの10進数値をexecuteCalculateに渡すと2つの数値の乗算結果の文字列が返る() {

        assertThat(sut.executeCalc("*", "5", "3"),is("15"));
    }
    
    @Test
    public void divideと2つの10進数値をexecuteCalculateに渡すと2つの数値の除算結果の文字列が返る() {

        assertThat(sut.executeCalc("/", "5", "3"),is("1.667"));
    }
}