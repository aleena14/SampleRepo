package inheritance;

public class MultilevelChild extends MultilevelParent{
	
	public void child()
	{
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		
		MultilevelChild obj = new MultilevelChild();
		obj.grandParent();
		obj.parent();
		obj.child();
	}

}
