package superKeyword;

public class SuperVariableChild extends SuperVariableParent{
	
	String color = "green";
	void print()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		
		SuperVariableChild obj = new SuperVariableChild();
		obj.print();
	}

}
