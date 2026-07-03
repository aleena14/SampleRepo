package superKeyword;

public class SuperKeywordChild extends SuperMethodParent{
	
	void display()
	{
		super.print();
		System.out.println("To the child class.....!");
	}

	public static void main(String[] args) {
		
		SuperKeywordChild obj = new SuperKeywordChild();
		obj.display();

	}

}
