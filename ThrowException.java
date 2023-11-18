package exception;

public class ThrowException {

	public static void main(String[] args) {
		int i = 20;
		int j = 0;

		//Throw KW is used to throw the exception and the catch block will catch it.
		try {
			 j = 18/i; 
			 if(j==0)
				 throw new ArithmeticException("I don't want to print Zero");
		}
		catch(ArithmeticException e) {
			j = 18 / 1;//  just to make j = 18 when it is Zero.
			System.out.println("Default Output => " + e);
			System.out.println("Default Output => " + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Get the value of by index within the limit...");
		}
		catch(Exception e) {
			System.out.println("Something is wrong...");
		}
		
		System.out.println("J: "+j);

	}

}
