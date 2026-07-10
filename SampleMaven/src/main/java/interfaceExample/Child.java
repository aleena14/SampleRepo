package interfaceExample;

public class Child implements Parent{

	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
		obj.print1();
		obj.show();
		
		// interface creation
		// Interfacename obj = new classname();
		Parent obj1 = new Child();
		obj1.print();
		obj1.print1();
		}

	@Override
	public void print() {
		System.out.println("Interface method 1");
		
	}

	@Override
	public void print1() {
		System.out.println("Interface method 2");
		
	}
	public void show() {
		System.out.println("show method");
		
	}

}
