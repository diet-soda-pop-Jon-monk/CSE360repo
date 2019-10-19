package cse360assign3;

public class assignment1main {
	public static void main(String[] args) {
	AddingMachine calc = new AddingMachine();
	calc.add(3);
	System.out.println(calc.toString());
	calc.subtract(2);
	System.out.println(calc.toString());
	System.out.println(calc.getTotal());
	System.out.println(calc.toString());
	calc.clear();
	System.out.println(calc.toString());
	System.out.println(calc.getTotal());
	int i;
	for(i=1;i<=10;i++) {
		calc.add(3);
	}
	System.out.println(calc.getTotal());
	System.out.println(calc.toString());
	
	calc.clear();
	System.out.println(calc.toString());
	System.out.println(calc.getTotal());
	
	calc.add(-3);
	System.out.println(calc.toString());
	System.out.println(calc.getTotal());
	
	calc.subtract(-4);
	System.out.println(calc.toString());
	System.out.println(calc.getTotal());
	
	System.out.println("new cal2");
	calculator calc2 = new calculator();
	calc2.add(2);
	System.out.println(calc2.getTotal());
	calc2.subtract(1);
	System.out.println(calc2.getTotal());
	calc2.mult(3);
	System.out.println(calc2.getTotal());
	calc2.mult(2);
	System.out.println(calc2.getTotal());
	calc2.div(2);
	System.out.println(calc2.getTotal());
	calc2.pow(3);
	System.out.println(calc2.getTotal());
	calc2.pow(-1);
	System.out.println(calc2.getTotal());
	System.out.println(calc2.toString());
	calc2.clear();
	System.out.println(calc2.toString());
	}
}
