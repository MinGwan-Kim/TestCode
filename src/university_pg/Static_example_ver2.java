package university_pg;

class Static_example_ver_2 {
	public static int nStaticFieid = 0;
}

public class Static_example_ver2 {

	public static void main(String[] args) {
		Static_example_ver_2.nStaticFieid = 10;
		System.out.println(Static_example_ver_2.nStaticFieid); // 10

	}

}
