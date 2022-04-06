package university_pg;

class MethodOverloading_example_ver_1 {
	public int add(int a, int b) {
		return a + b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
}

public class MethodOverloading_example {

	public static void main(String[] args) {
		MethodOverloading_example_ver_1 moe1 = new MethodOverloading_example_ver_1();
		System.out.println(moe1.add(10, 15));
		System.out.println(moe1.add(10.5, 15.3));
		System.out.println(moe1.add(10, 10.5));

	}

}
