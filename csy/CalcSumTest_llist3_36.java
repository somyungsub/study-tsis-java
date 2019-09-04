package chapter3.template;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CalcSumTest_llist3_36 {
	
	Calculator_list3_34 calc;
	String numFilepath;
	
	@Before
	public void setUp() {
		this.calc = new Calculator_list3_34();
		this.numFilepath = getClass().getResource("numbers.txt").getPath();
	}

	@Test
	public void sumOfNumbers() throws IOException{
		assertThat(calc.calcSum(this.numFilepath), is(10));
	}
	
	

	@Test
	public void multiplyOfNumbers() throws IOException{
		assertThat(calc.calcMultiply(this.numFilepath), is(24));
	}
	
	
	

}
