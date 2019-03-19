/**
 * This Program calculates Addition, Multiplication, Division.
 * @author Siva Kanth
 */
public class Calculator {
	
	/**
	 * Calculates Addition of two Numbers
	 * @param a 
	 * @param b 
	 * @return addition of two Numbers
	 */
	public int Addition(int a,int b) {
		return a+b;
	}
	
	/**
	 * Calculates Multiplication of two Numbers
	 * @param a 
	 * @param b 
	 * @return Double Multiplication of two Numbers 
	 */
	public int Multiplication(int a,int b) {
		return a*b;
	}
	
	/**
	 * Calculates the Division of two numbers
	 * @param a
	 * @param b
	 * @return a divides b
	 */
	public double Division(double a,double b) {

			return a/b;		
	}
	
	/**
	 * Driver Code to test the program
	 * @param args
	 */
	public static void main (String[] args) {
		
		Calculator calculate=new Calculator();
		
		System.out.println("2 + 3 = "+calculate.Addition(2, 3));
		
		System.out.println("2 * 3 = "+calculate.Multiplication(2, 3));
		
		System.out.println("2 / 3 = "+calculate.Division(2, 3));
	}
}