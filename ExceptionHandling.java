package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		int i = 0;// normal statement
		int j = 0;
		
		String str[] = new String[5];
		
		try {// better keep critical statements in try, where you feel this may give an error.
			 j = 18/i; //here this j throws an error, or an object and we have to catch that
			 
			 System.out.println(str[6]);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide by zero...");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Get the value of by index within the limit...");
		}
		catch(Exception e) { // Exception is a class e is a class, here we refer the error
			System.out.println("Something is wrong...");
		}
		
		System.out.println(j);
	}

}
