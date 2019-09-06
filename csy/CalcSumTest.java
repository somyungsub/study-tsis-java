package chapter3.template;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CalcSumTest {

	@Test
	public void sumOfNumbers() throws Exception{
		Calculator calc = new Calculator();
		
		int sum = calc.calcSum(getClass().getResource("numbers.txt").getPath());
		assertThat(sum, is(10));
	}
	

}
