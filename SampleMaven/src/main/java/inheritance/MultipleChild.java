package inheritance;

public class MultipleChild implements MultipleParent1,MultipleParent2{
	
	public void show()
	{
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
	
		MultipleChild obj = new MultipleChild();
		obj.print1();
		obj.print2();
		obj.show();

	}

	@Override
	public void print2() {
		System.out.println("Parent1 Method");
		
	}

	@Override
	public void print1() {
		System.out.println("Parent2 Method");
		
	}
	

}
