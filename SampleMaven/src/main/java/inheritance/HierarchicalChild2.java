package inheritance;

public class HierarchicalChild2 extends HierarchicalParent{
	public void child2()
	{
		System.out.println("This is child2 class");
	}

	public static void main(String[] args) {
		HierarchicalChild2 obj = new HierarchicalChild2();
		obj.parent();
		obj.child2();
	}

}
