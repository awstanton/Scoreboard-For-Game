package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
	
/* Testing Constructor */
	@Test // makes sure object is not null after constructor is called
	public void testCalculator1() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test // makes sure total is initialized with 0
	public void testCalculator2() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
	}
	
	@Test // makes sure history is initialized as "0"
	public void testCalculator3() {
		Calculator calc = new Calculator();
		assertEquals("0", calc.getHistory());
	}
	
	@Test // creating two calculators
	public void testCalculator4() {
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
		assertNotNull(calc1);
		assertNotNull(calc2);
	}
	
	
	
/* Testing Get Total Method and Add Method Alone */
	@Test // Tests if total is still 0 after 0 is added
	public void testGetTotalZero1() {
		Calculator calc = new Calculator();
		calc.add(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if total is 1 after 1 is added
	public void testGetTotalAddPos1() {
		Calculator calc = new Calculator();
		calc.add(1);
		assertEquals(1,calc.getTotal());
	}
	
	@Test // Tests if total is 50 after 50 is added
	public void testGetTotalAddPos2() {
		Calculator calc = new Calculator();
		calc.add(50);
		assertEquals(50,calc.getTotal());
	}
	
	@Test // Tests if total is -1 after -1 is added
	public void testGetTotalAddNeg1() {
		Calculator calc = new Calculator();
		calc.add(-1);
		assertEquals(-1,calc.getTotal());
	}
	
	@Test // Tests if total is -50 after -50 is added
	public void testGetTotalAddNeg2() {
		Calculator calc = new Calculator();
		calc.add(-50);
		assertEquals(-50,calc.getTotal());
	}
	
	@Test // Tests if total is 15 after 10 added and 5 added
	public void testGetTotalAddAdd1() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.add(5);
		assertEquals(15,calc.getTotal());
	}
	
	@Test // Tests if total is 5 after 10 added and -5 added
	public void testGetTotalAddAdd2() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.add(-5);
		assertEquals(5,calc.getTotal());
	}
	
	
	
/* Testing Get Total Method and Subtract Method Alone */
	@Test // Tests if total is still 0 after 0 is subtracted
	public void testGetTotalZero2() {
		Calculator calc = new Calculator();
		calc.subtract(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if total is 10 after -10 subtracted
	public void testGetTotalSubPos() {
		Calculator calc = new Calculator();
		calc.subtract(-10);
		assertEquals(10,calc.getTotal());
	}
	
	@Test // Tests if total is -10 after 10 subtracted
	public void testGetTotalSubNeg() {
		Calculator calc = new Calculator();
		calc.subtract(10);
		assertEquals(-10,calc.getTotal());
	}
	
	@Test // Tests if total is -15 after 10 subtracted and 5 subtracted
	public void testGetTotalSubSub1() {
		Calculator calc = new Calculator();
		calc.subtract(10);
		calc.subtract(5);
		assertEquals(-15,calc.getTotal());
	}
	
	@Test // Tests if total is -5 after 10 subtracted and -5 subtracted
	public void testGetTotalSubSub2() {
		Calculator calc = new Calculator();
		calc.subtract(10);
		calc.subtract(-5);
		assertEquals(-5,calc.getTotal());
	}
	
	
	
/* Testing Get Total Method and Add and Subtract Methods Used Together */
	@Test // Tests if total is 0 after 1 added and 1 subtracted
	public void testGetTotalAddSub1() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.subtract(1);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if total is 2 after 1 added and -1 subtracted
	public void testGetTotalAddSub2() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.subtract(-1);
		assertEquals(2,calc.getTotal());
	}
	
	@Test // Tests if total is -2 after -1 added and 1 subtracted
	public void testGetTotalAddSub3() {
		Calculator calc = new Calculator();
		calc.add(-1);
		calc.subtract(1);
		assertEquals(-2,calc.getTotal());
	}

	
	
/* Testing Get Total Method and Multiply Method Alone */
	@Test // Tests if a total of 0 multiplied by 0 is 0
	public void testMultiplyZero1() {
		Calculator calc = new Calculator();
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of 0 multiplied by 1 is 0
	public void testMultiplyZero2() {
		Calculator calc = new Calculator();
		calc.multiply(1);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of 0 multiplied by -1 is 0
	public void testMultiplyZero3() {
		Calculator calc = new Calculator();
		calc.multiply(-1);
		assertEquals(0,calc.getTotal());
	}
	
	
	
/* Testing Get Total Method and Divide Method Alone */
	@Test // Tests if a total of 0 divided by 0 is 0
	public void testDivideZero1() {
		Calculator calc = new Calculator();
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of 0 divided by 1 is 0
	public void testDivideZero2() {
		Calculator calc = new Calculator();
		calc.divide(1);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of 0 divided by -1 is 0
	public void testDivideZero3() {
		Calculator calc = new Calculator();
		calc.divide(-1);
		assertEquals(0,calc.getTotal());
	}
	
	
	
/* Testing Get Total Method and Multiply Method Used With Add Method */
	@Test // Tests if a total of 1 multiplied by 0 is 0
	public void testAddMultiplyZero1() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 multiplied by 0 is 0
	public void testAddMultiplyZero2() {
		Calculator calc = new Calculator();
		calc.add(-1);
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of 10 multiplied by 0 is 0
	public void testAddMultiplyZero3() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 multiplied by 1 is 1
	public void testAddMultiply1() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.multiply(1);
		assertEquals(1,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 multiplied by 7 is 7
	public void testAddMultiply2() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.multiply(7);
		assertEquals(7,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 multiplied by -7 is -7
	public void testAddMultiply3() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.multiply(-7);
		assertEquals(-7,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 multiplied by -7 is 7
	public void testAddMultiply4() {
		Calculator calc = new Calculator();
		calc.add(-1);
		calc.multiply(-7);
		assertEquals(7,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 multiplied by 7 is -7
	public void testAddMultiply5() {
		Calculator calc = new Calculator();
		calc.add(-1);
		calc.multiply(7);
		assertEquals(-7,calc.getTotal());
	}
	
	
	
/* Testing Get Total Method and Divide Method Used With Add Method */
	@Test // Tests if a total of 1 divided by 0 is 0
	public void testAddDivideZero1() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 divided by 0 is 0
	public void testAddDivideZero2() {
		Calculator calc = new Calculator();
		calc.add(-1);
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of 10 divided by 0 is 0
	public void testAddDivideZero3() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 divided by 1 is 1
	public void testAddDivide1() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.divide(1);
		assertEquals(1,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 divided by 7 is 1/7
	public void testAddDivide2() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.divide(7);
		assertEquals(1/7,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 divided by -7 is -1/7
	public void testAddDivide3() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.divide(-7);
		assertEquals(-1/7,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 divided by -7 is 1/7
	public void testAddDivide4() {
		Calculator calc = new Calculator();
		calc.add(-1);
		calc.divide(-7);
		assertEquals(1/7,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 divided by 7 is -1/7
	public void testAddDivide5() {
		Calculator calc = new Calculator();
		calc.add(-1);
		calc.divide(7);
		assertEquals(-1/7,calc.getTotal());
	}
	
	@Test // Tests if a total of 10 divided by 10 is 1
	public void testAddDivide6() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(10);
		assertEquals(1,calc.getTotal());
	}
	
	
	
	/* Testing Get Total Method and Multiply Method Used With Subtract Method */
	@Test // Tests if a total of -1 multiplied by 0 is 0
	public void testSubMultiplyZero1() {
		Calculator calc = new Calculator();
		calc.subtract(1);
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 multiplied by 0 is 0
	public void testSubMultiplyZero2() {
		Calculator calc = new Calculator();
		calc.subtract(-1);
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of -10 multiplied by 0 is 0
	public void testSubMultiplyZero3() {
		Calculator calc = new Calculator();
		calc.subtract(10);
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 multiplied by 1 is -1
	public void testSubMultiply1() {
		Calculator calc = new Calculator();
		calc.subtract(1);
		calc.multiply(1);
		assertEquals(-1,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 multiplied by 7 is -7
	public void testSubMultiply2() {
		Calculator calc = new Calculator();
		calc.subtract(1);
		calc.multiply(7);
		assertEquals(-7,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 multiplied by -7 is 7
	public void testSubMultiply3() {
		Calculator calc = new Calculator();
		calc.subtract(1);
		calc.multiply(-7);
		assertEquals(7,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 multiplied by -7 is -7
	public void testSubMultiply4() {
		Calculator calc = new Calculator();
		calc.subtract(-1);
		calc.multiply(-7);
		assertEquals(-7,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 multiplied by 7 is 7
	public void testSubMultiply5() {
		Calculator calc = new Calculator();
		calc.subtract(-1);
		calc.multiply(7);
		assertEquals(7,calc.getTotal());
	}
	
	
	
/* Testing Get Total Method and Divide Method Used With Subtract Method */
	@Test // Tests if a total of -1 divided by 0 is 0
	public void testSubDivideZero1() {
		Calculator calc = new Calculator();
		calc.subtract(1);
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 divided by 0 is 0
	public void testSubDivideZero2() {
		Calculator calc = new Calculator();
		calc.subtract(-1);
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of -10 divided by 0 is 0
	public void testSubDivideZero3() {
		Calculator calc = new Calculator();
		calc.subtract(10);
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 divided by 1 is -1
	public void testSubDivide1() {
		Calculator calc = new Calculator();
		calc.subtract(1);
		calc.divide(1);
		assertEquals(-1,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 divided by 7 is -1/7
	public void testSubDivide2() {
		Calculator calc = new Calculator();
		calc.subtract(1);
		calc.divide(7);
		assertEquals(-1/7,calc.getTotal());
	}
	
	@Test // Tests if a total of -1 divided by -7 is 1/7
	public void testSubDivide3() {
		Calculator calc = new Calculator();
		calc.subtract(1);
		calc.divide(-7);
		assertEquals(1/7,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 divided by -7 is -1/7
	public void testSubDivide4() {
		Calculator calc = new Calculator();
		calc.subtract(-1);
		calc.divide(-7);
		assertEquals(-1/7,calc.getTotal());
	}
	
	@Test // Tests if a total of 1 divided by 7 is 1/7
	public void testSubDivide5() {
		Calculator calc = new Calculator();
		calc.subtract(-1);
		calc.divide(7);
		assertEquals(1/7,calc.getTotal());
	}
	
	
	
/* Testing Get Total Method and Multiply and Divide Methods Used Together */
	@Test // Tests if 0 multiplied by 0 then divided by 0 is 0
	public void testMultiplyDivide1() {
		Calculator calc = new Calculator();
		calc.multiply(0);
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if 0 multiplied by 0 then divided by 1 is 0
	public void testMultiplyDivide2() {
		Calculator calc = new Calculator();
		calc.multiply(0);
		calc.divide(1);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if 0 multiplied by 1 then divided by 0 is 0
	public void testMultiplyDivide3() {
		Calculator calc = new Calculator();
		calc.multiply(1);
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if 0 multiplied by 0 then divided by -1 is 0
	public void testMultiplyDivide4() {
		Calculator calc = new Calculator();
		calc.multiply(0);
		calc.divide(-1);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if 0 multiplied by -1 then divided by 0 is 0
	public void testMultiplyDivide5() {
		Calculator calc = new Calculator();
		calc.multiply(-1);
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	@Test // Tests if 10 multiplied by 2 then divided by 4 is 5
	public void testMultiplyDivide6() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(2);
		calc.divide(4);
		assertEquals(5,calc.getTotal());
	}
	
	@Test // Tests if 10 divided by 2 then multiplied by 4 is 20
	public void testMultiplyDivide7() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(2);
		calc.multiply(4);
		assertEquals(20, calc.getTotal());
	}
	
	@Test // Tests if 10 divided by 0 then multiplied by 4 is 0
	public void testMultiplyDivide8() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(0);
		calc.multiply(4);
		assertEquals(0, calc.getTotal());
	}
	
	@Test // Tests if 10 divided by 2 then multiplied by 0 is 0
	public void testMultiplyDivide9() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(2);
		calc.multiply(0);
		assertEquals(0, calc.getTotal());
	}
	
	@Test // Tests if 10 multiplied by -2 then divided by 4 is -5
	public void testMultiplyDivide10() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(-2);
		calc.divide(4);
		assertEquals(-5,calc.getTotal());
	}
	
	@Test // Tests if 10 multiplied by 2 then divided by -4 is -5
	public void testMultiplyDivide11() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(2);
		calc.divide(-4);
		assertEquals(-5, calc.getTotal());
	}
	
/* Testing Update History Method */
	@Test // Tests that update history updates when number and + passed in
	public void testUpdateHistory1() {
		Calculator calc = new Calculator();
		calc.updateHistory(1, "+");
		assertEquals("0 + 1", calc.getHistory());
	}
	
	@Test // Tests that update history updates when number and - passed in
	public void testUpdateHistory2() {
		Calculator calc = new Calculator();
		calc.updateHistory(-2, "-");
		assertEquals("0 - -2", calc.getHistory());
	}
	
	@Test // Tests that update history updates when number and * passed in
	public void testUpdateHistory3() {
		Calculator calc = new Calculator();
		calc.updateHistory(-3, "*");
		assertEquals("0 * -3", calc.getHistory());
	}
	
	@Test // Tests that update history updates when number and / passed in
	public void testUpdateHistory4() {
		Calculator calc = new Calculator();
		calc.updateHistory(5, "/");
		assertEquals("0 / 5", calc.getHistory());
	}
	
	
	
/* Testing Get History Method */
	@Test // Tests string returned when 1 added to total
	public void testGetHistory1() {
		Calculator calc = new Calculator();
		calc.add(1);
		assertEquals("0 + 1", calc.getHistory());
	}
	
	@Test // Tests string returned when 1 subtracted from total
	public void testGetHistory2() {
		Calculator calc = new Calculator();
		calc.subtract(1);
		assertEquals("0 - 1", calc.getHistory());
	}
	
	@Test // Tests string returned when 0 added to total
	public void testGetHistory3() {
		Calculator calc = new Calculator();
		calc.add(0);
		assertEquals("0 + 0", calc.getHistory());
	}
	
	@Test // Tests string returned when 0 subtracted from total
	public void testGetHistory4() {
		Calculator calc = new Calculator();
		calc.subtract(0);
		assertEquals("0 - 0", calc.getHistory());
	}

	@Test // Tests string returned when total multiplied by 1
	public void testGetHistory5() {
		Calculator calc = new Calculator();
		calc.multiply(1);
		assertEquals("0 * 1", calc.getHistory());
	}
	
	@Test // Tests string returned when total divided by 1
	public void testGetHistory6() {
		Calculator calc = new Calculator();
		calc.divide(1);
		assertEquals("0 / 1", calc.getHistory());
	}
	
	@Test // Tests string returned when total multiplied by 0
	public void testGetHistory7() {
		Calculator calc = new Calculator();
		calc.multiply(0);
		assertEquals("0 * 0", calc.getHistory());
	}
	
	@Test // Tests string returned when total divided by 0
	public void testGetHistory8() {
		Calculator calc = new Calculator();
		calc.divide(0);
		assertEquals("0 / 0", calc.getHistory());
	}
	
	@Test // Tests string returned when -1 added to total
	public void testGetHistory9() {
		Calculator calc = new Calculator();
		calc.add(-1);
		assertEquals("0 + -1", calc.getHistory());
	}
	
	@Test // Tests string returned when -1 subtracted from total
	public void testGetHistory10() {
		Calculator calc = new Calculator();
		calc.subtract(-1);
		assertEquals("0 - -1", calc.getHistory());
	}

	@Test // Tests string returned when total multiplied by -1
	public void testGetHistory11() {
		Calculator calc = new Calculator();
		calc.multiply(-1);
		assertEquals("0 * -1", calc.getHistory());
	}
	
	@Test // Tests string returned when total divided by -1
	public void testGetHistory12() {
		Calculator calc = new Calculator();
		calc.divide(-1);
		assertEquals("0 / -1", calc.getHistory());
	}
	
	@Test // Tests string returned when 20 then 100 added to total
	public void testGetHistory13() {
		Calculator calc = new Calculator();
		calc.add(20);
		calc.add(100);
		assertEquals("0 + 20 + 100", calc.getHistory());
	}
	
	@Test // Tests string returned when 20 then 100 subtracted from total
	public void testGetHistory14() {
		Calculator calc = new Calculator();
		calc.subtract(20);
		calc.subtract(100);
		assertEquals("0 - 20 - 100", calc.getHistory());
	}
	
	@Test // Tests string returned when 20 added to then 100 subtracted from total
	public void testGetHistory15() {
		Calculator calc = new Calculator();
		calc.add(20);
		calc.subtract(100);
		assertEquals("0 + 20 - 100", calc.getHistory());
	}
	
	@Test // Tests string returned when total multiplied by 20 then 100
	public void testGetHistory16() {
		Calculator calc = new Calculator();
		calc.multiply(20);
		calc.multiply(100);
		assertEquals("0 * 20 * 100", calc.getHistory());
	}
	
	@Test // Tests string returned total divided by 20 then 100
	public void testGetHistory17() {
		Calculator calc = new Calculator();
		calc.divide(20);
		calc.divide(100);
		assertEquals("0 / 20 / 100", calc.getHistory());
	}
	
	@Test // Tests string returned total multiplied by 20 then divided by 100
	public void testGetHistory18() {
		Calculator calc = new Calculator();
		calc.multiply(20);
		calc.divide(100);
		assertEquals("0 * 20 / 100", calc.getHistory());
	}
	
	@Test // Tests string returned total multiplied then added to then divided from then subtracted from
	public void testGetHistory19() {
		Calculator calc = new Calculator();
		calc.multiply(20);
		calc.add(50);
		calc.divide(100);
		calc.subtract(200);
		assertEquals("0 * 20 + 50 / 100 - 200", calc.getHistory());
	}
	
	@Test // Tests string returned total multiplied then added to then divided from then subtracted from using large numbers
	public void testGetHistory20() {
		Calculator calc = new Calculator();
		calc.multiply(20000);
		calc.add(50000);
		calc.divide(100000);
		calc.subtract(200000);
		assertEquals("0 * 20000 + 50000 / 100000 - 200000", calc.getHistory());
	}
	
	@Test // Tests strings returned for two different calculators
	public void testGetHistory21() {
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
		calc1.add(5);
		calc2.subtract(10);
		assertEquals("0 + 5", calc1.getHistory());
		assertEquals("0 - 10", calc2.getHistory());
	}
	
}
