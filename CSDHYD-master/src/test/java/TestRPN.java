package test.java;

import junit.framework.TestCase;
import main.java.RPNCalc;

public class TestRPN extends TestCase{
	public void testCase1()
	{
		String expr = "2,2,+";
		RPNCalc rpnCalc = new RPNCalc();
		assertEquals(4, rpnCalc.Calculate(expr));
	}
	public void testCase2()
	{
		String expr = "2,5,+";
		RPNCalc rpnCalc = new RPNCalc();
		assertEquals(7, rpnCalc.Calculate(expr));
	}

}
