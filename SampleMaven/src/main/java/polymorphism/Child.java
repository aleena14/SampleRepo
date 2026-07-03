package polymorphism;

public class Child extends Parent{
	void print(int a, int b)
	{
		super.print(45,12);
		int c= a-b;
		System.out.println("Result = " +c);
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.print(45,12);

	}

}
