package university_pg;

class StaticConstructor_example_ver_1 {
	public static int nStaticField1 = 10;
	public static int nStaticField2;
	
	public StaticConstructor_example_ver_1() {
		nStaticField2 = 20;
	}
}

public class StaticConstructor_example {

	public static void main(String[] args) {
		StaticConstructor_example_ver_1 sce1 = new StaticConstructor_example_ver_1();
		System.out.println("sce1 is constructed");
		System.out.println("nStaticField1 :" + sce1.nStaticField1); // 10
		System.out.println("nStaticField2 :" + sce1.nStaticField2); // 20
		
		sce1.nStaticField1 += 10;
		sce1.nStaticField2 += 10;
		System.out.println("Values are changed");
		
		System.out.println("nStaticField1 :" + sce1.nStaticField1); // 20
		System.out.println("nStaticField2 :" + sce1.nStaticField2); // 30
		
		StaticConstructor_example_ver_1 sce2 = new StaticConstructor_example_ver_1();
		System.out.println("sce2 is constructed");
		System.out.println("nStaticField1 :" + sce2.nStaticField1); // 20
		System.out.println("nStaticField2 :" + sce2.nStaticField2); // 20
		

	}

}
