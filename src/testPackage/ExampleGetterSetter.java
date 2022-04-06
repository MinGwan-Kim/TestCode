package testPackage;

class TestGetterSetter{
	
	private String name = "½Ã¹Î";
	private int age = 23;
	
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

public class ExampleGetterSetter {

	public static void main(String[] args) {
		
		TestGetterSetter gs = new TestGetterSetter();
		
		gs.setAge(25);
		
	//	System.out.println(gs.name);
	//	System.out.println(gs.age);
		
		System.out.println(gs.getName());
		System.out.println(gs.getAge());
		

	}

}
