package cse360assign2;

/**
 *Author Name: Jonathan Monk
 *Class ID: 2019Fall-T-CSE360-70642
 *Assignment number: Assignment 2
 *Description:
 *This class is a calculator. It can add and subtract close
 *to an infinite number of numbers. It will add and subtract
 *and return the history of a calculation to the screen. This
 *is the commented version of this assignment and will be 
 *completed in another version of this same assignment.
 *
 */

public class AddingMachine {
	private int total;
	
	
	/**
	 * constructor takes no parameters and sets up one private
	 * class atribute of type int called total. total is set initialy
	 * to zero
	 * @param None
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * computes the total value thus far
	 * @param None
	 * @return this method should return the total value
	 */
	
	public int getTotal () {
		return 0;
	}
	
	/**
	 * add the parameter to the total variable
	 * @param value is the value to be added to the total
	 * @return void
	 */
	public void add (int value) {
		
	}
	
	/**
	 * subtracts the value parameter from the total variable
	 * @param value is the value to be subtracted
	 * @return void
	 */
	
	public void subtract (int value) {
		
	}
		
	/**
	 * This method returns a String that will apply to this classes
	 * .toString() method that returns the history of the calculations
	 * of this calculator. should be able to be approximately infinite
	 * in length. should be initialized as zero and record all subsequent
	 * calculations. Numbers are separated by either the + or - operator
	 * and a space between each character in the calculation. For example:
	 * 
	 * 0 + 4 – 2 + 5
	 * 
	 * @param value is an int and will be subtracted from the total value.
	 * @return toString the history of the calculation
	 */
	
	public String toString () {
		return "";
	}

	/**I think this method is similar to the clear method on your calculator.
	 * It will remove the history of the calculator and clear the
	 * current calculation form the memory of the class.
	 * @param None
	 * @return void
	 */
	
	public void clear() {
		
		System.out.println("test 1");
	
	}
}
