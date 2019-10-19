package cse360assign3;

/**
 *Author Name: Jonathan Monk
 *Class ID: 2019Fall-T-CSE360-70642
 *Assignment number: Assignment 3
 *Description:
 *This class is a calculator. It can add, subtract, multiply
 *and divide close to an infinite number of numbers. It will 
 *add, subtract multiply, and divide and return the history 
 *of a calculation to the screen.
 *
 */

public class calculator extends  AddingMachine{

	/**
	 * Constructor takes no parameters and sets up one protected
	 * class attribute of type int called total in the call
	 * to the super class AddingMachine. total is set initialy
	 * to zero. Also sets up the totalString at "0".
	 * @param None
	 */
	public calculator() {
		super();
	}
	
	/**
	 * Multiplies the total stored in AddingMachine by value
	 * and restores it in AddingMachine.
	 * @param int value
	 * @return this method should return void
	 */
	public void mult(int value) {
		super.total = value * super.total;
		super.totalString = super.totalString + " * " + value;
	}
	
	/**
	 * Divides the total stored in AddingMachine by value
	 * and restores it in AddingMachine.
	 * @param int value
	 * @return this method should return void
	 */
	public void div(int value) {
		if(value == 0) {
			super.total = 0;
		}else {
			super.total = super.total / value;
			super.totalString = super.totalString + " / " + value;
		}
	}
	
	/**
	 * It Raises the total stored in AddingMachine to the power
	 * of parameter pow and restores it in AddingMachine.
	 * @param int pow
	 * @return this method should return void
	 */
	public void pow(int pow) {
		if(pow < 0) {
			super.total = 0;
		}else {
			int subtotal = 1;
			int i;
			for(i=0;i<pow;i++) {
			subtotal = subtotal * super.total ;
			}
			super.total = subtotal;
			super.totalString = super.totalString + " ans^" + pow;
		}
	}
	
	
}
