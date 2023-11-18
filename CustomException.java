package exception;
//We can create our own exception, by creating the class and extending the Exception calss and we need to catch it.
//If you are accepting the message you need to pass the message to the Exception constructor.

class ShyamException extends Exception{
	//Creating the ShyamException Constructor[Exception has constructor which takes in string]
	public ShyamException(String msg) {
		super(msg); // we know how to call a super class constructor
	}
}

public class CustomException {

	public static void main(String[] args) {
		int i = 20;
		int j = 0;

		//Throw KW is used to throw the exception and the catch block will catch it.
		try {
			 j = 18/i; 
			 if(j==0)
				 throw new ShyamException("I don't want to print Zero");
		}
		catch(ArithmeticException | ShyamException e) {
			j = 18 / 1;//  just to make j = 18 when it is Zero.
			System.out.println("Default Output => " + e);
		}

	}

}
