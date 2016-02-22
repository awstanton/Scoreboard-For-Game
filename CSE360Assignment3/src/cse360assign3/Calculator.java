// following source was used for reminder on how to generate JUNIT test cases:
// https://courses.cs.washington.edu/courses/cse143/11wi/eclipse-tutorial/junit.shtml
// the following video was used to help with using Git and Github:
// https://www.youtube.com/watch?v=r5C6yXNaSGo

package cse360assign3;

/**
 * Assignment 3 for CSE 360
 * @author Andrew Stanton, PIN: 817
 * @version second version, February 21,2016
 */
public class Calculator {

	private int total;
	
	/**
	 * Calculator constructor that initializes total
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * returns the Calculator's total value
	 * @returns the total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * adds input to the total
	 * @param value the value to be added to total
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * subtracts input from the total
	 * @param value the value to be subtracted from total
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * multiplies the total by the input
	 * @param value the value total is to be multiplied by
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * divides the total by the input
	 * @param value the value total is to be divided by
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
	}
	
	/**
	 * returns a string of the history of operations performed on Calculator's total
	 * @return string of history of calculator operations
	 */
	public String getHistory () {
		return "";
	}
}