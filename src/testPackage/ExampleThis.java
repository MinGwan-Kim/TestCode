package testPackage;

class Sample {
	String name;
	int age;
	
	Sample(String name, int age){
		this.name = name;
		this.age = age;
	}
	
}

public class ExampleThis {

	public static void main(String[] args) {
		
		Sample sp = new Sample("시민", 25);
		System.out.println("이름 : " + sp.name);
		System.out.println("나이 : " + sp.age);
		
	}

}