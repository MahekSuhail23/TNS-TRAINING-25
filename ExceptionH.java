package trainingTns;

public class ExceptionH {

	static void ariexp(int x, int y) {
		System.out.println("In method");
		try {
		int c=x/y;
		}
		catch(ArithmeticException e) {
		System.err.println(e.getMessage());}
		finally {System.out.println("This will exceute even if the exception occur not occur");}
		
	}
}
