package aggregation;

public class Child {
	
	String state,city;
	Parent ref;
	public Child(String state,String city,Parent ref)
	{
		this.state = state;
		this.city = city;
		this.ref = ref;
	}
	
	public void print()
	{
		System.out.println(ref.name);
		System.out.println(ref.rno);
		System.out.println(ref.address);
		System.out.println(state);
		System.out.println(city);
	}

	public static void main(String[] args) {
		
		Parent obj = new Parent("Lisa",65,"XYZ Lane");
		Child obj1 = new Child("KL","ABC",obj);
		obj1.print();
	}

}
