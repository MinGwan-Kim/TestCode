package university_pg;

class StaticMethod_example_ver_1{
	public static int nStaticField = 10;
	
	static void setStaticField(int n) {
		nStaticField = n;
	}
	static int getStaticField() {
		return nStaticField;
	}
}

public class StaticMethod_example {

	public static void main(String[] args) {
		StaticMethod_example_ver_1 sme = new StaticMethod_example_ver_1();
		sme.setStaticField(20);
		System.out.println(sme.getStaticField()); // 20
		StaticMethod_example_ver_1.setStaticField(30);
		System.out.println(StaticMethod_example_ver_1.getStaticField()); // 30

	}

}
