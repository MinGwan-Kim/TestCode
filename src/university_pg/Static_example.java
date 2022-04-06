package university_pg;

class Static_example_ver_1{
	public static int nStaticField = 0;
	
}

public class Static_example {

	public static void main(String[] args) {
		Static_example_ver_1 sev1 = new Static_example_ver_1();
		sev1.nStaticField = 10;
		System.out.println(sev1.nStaticField); // 10
		
		Static_example_ver_1 sev2 = new Static_example_ver_1();
		sev2.nStaticField += 10;
		System.out.println(sev2.nStaticField); // nStaticField = nStaticField(10) + 10

	}

}
