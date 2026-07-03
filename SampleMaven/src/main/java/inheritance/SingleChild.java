package inheritance;

public class SingleChild extends SingleParent{
	public void print()
	{
		System.out.println("This is child method");
	}

	public static void main(String[] args) {
		SingleChild obj = new SingleChild();
		obj.display();
		obj.print();
    }

}
