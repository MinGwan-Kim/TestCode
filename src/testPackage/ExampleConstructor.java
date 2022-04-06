package testPackage;

class sample1 {
	private String name;
	private int age;

	public sample1(String name, int age) {
	super();
	this.name = name;
	this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class sample2 {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class ExampleConstructor {

	public static void main(String[] args) {
		sample1 ec1 = new sample1("½Ã¹Î1", 25);
		System.out.println(ec1.getName());
		System.out.println(ec1.getAge());
		
		sample2 ec2 = new sample2();
		
		ec2.setName("½Ã¹Î2");
		ec2.setAge(26);
		System.out.println(ec2.getName());
		System.out.println(ec2.getAge());
	}

}
