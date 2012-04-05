package features.horse;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	private void run( String calcuration, String expected ){
		assertEquals(expected, new Calculator().execute(calcuration) );
	}

	@Test
	public void 和() {
		run( "1+1", "2" );
	}

	@Test
	public void 差() {
		run( "1-1", "0" );
	}
	
	@Test
	public void 積() {
		run( "1*1", "1" );
	}
	
	@Test
	public void 積_2() {
		run( "3*2", "6" );
	}
	
	@Test
	public void 商() {
		run( "4/2", "2" );
	}
	
	@Test
	public void 商_2() {
		run( "4/3", String.valueOf((double)4/3) );
	}
	
	@Test(expected=RuntimeException.class)
	public void ゼロ割() {
		run( "4/0", "" );
	}
	
	@Test(expected=RuntimeException.class)
	public void 不正な式() {
		run( "=4/2", "" );
	}
	
	@Test(expected=RuntimeException.class)
	public void 不正な式_2() {
		run( "4/2=", "" );
	}
	
	@Test(expected=RuntimeException.class)
	public void 不正な式_3() {
		run( "4+/2=", "" );
	}
	
	@Test(expected=RuntimeException.class)
	public void 不正な式_4() {
		run( "4+;=", "" );
	}
}
