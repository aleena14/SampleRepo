package inheritance;

public class HierachicalChild1 extends HierarchicalParent{
	public void child1()
	{
		System.out.println("This is child1 class");
	}

	public static void main(String[] args) {
		HierachicalChild1 obj = new HierachicalChild1();
		obj.parent();
        obj.child1();
	}

}
