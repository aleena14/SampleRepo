package superKeyword;

public class SuperConstructorChild extends SuperConstructorParent{
	
	SuperConstructorChild()
	{
		super(45,12);
	    System.out.println("This is child constructor..!");
	}

	public static void main(String[] args) {
		
		SuperConstructorChild obj = new SuperConstructorChild();
	}

}
