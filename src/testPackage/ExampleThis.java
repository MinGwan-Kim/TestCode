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
		
		Sample sp = new Sample("�ù�", 25);
		System.out.println("�̸� : " + sp.name);
		System.out.println("���� : " + sp.age);
		
	}

}