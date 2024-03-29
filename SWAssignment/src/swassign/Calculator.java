package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Calculator constructor that initializes total and history
	 */
	public Calculator () {
		total = 0;
		history = "0";
	}
	
	/**
	 * updates the history by concatenating history string with operator  and value all separated by spaces
	 * @param value the integer used to update total
	 * @param operator operator of the operation that was performed
	 */
	public void updateHistory (int value, String operator) {
		history = history + " " + operator + " " + value;
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
		updateHistory(value, "+");
	}
	
	/**
	 * subtracts input from the total
	 * @param value the value to be subtracted from total
	 */
	public void subtract (int value) {
		total = total - value;
		updateHistory(value, "-");
	}
	
	/**
	 * multiplies the total by the input
	 * @param value the value total is to be multiplied by
	 */
	public void multiply (int value) {
		total = total * value;
		updateHistory(value, "*");
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
		updateHistory(value, "/");
	}
	
	/**
	 * returns a string of the history of operations performed on Calculator's total
	 * @return string of history of calculator operations
	 */
	public String getHistory () {
		return history;
	}
}
