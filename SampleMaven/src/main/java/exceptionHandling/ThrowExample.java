package exceptionHandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age=7;
		if(age>=18)
			System.out.println("Eligible for Voting..!!!");
		else
			throw new ArithmeticException("Not eligible for Voting..!!!");

	}

}
