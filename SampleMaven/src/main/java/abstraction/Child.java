package abstraction;

public  class Child extends Parent {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
		obj.print1();
		obj.print2();
	}

	@Override
	public void print1() {
		System.out.println("Overrride method1");
		
	}

	@Override
	public void print2() {
		System.out.println("Overrride method2");
		
	}

}
