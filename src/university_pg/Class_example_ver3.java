package university_pg;

class Class_example_ver_3 {
	
	private int nSize = 0;
	
	public Class_example_ver_3(int nNewSize) {
		this.nSize = nNewSize;
	}
	
	public Class_example_ver_3() {
		nSize = 20;
	}

	public int getnSize() {
		return nSize;
	}

	public void setnSize(int nSize) {
		this.nSize = nSize;
	}
	
}

public class Class_example_ver3 {
	

	public static void main(String[] args) {
		Class_example_ver_3 cev1 = new Class_example_ver_3(10);
		System.out.println(cev1.getnSize());
		
		Class_example_ver_3 cev2 = new Class_example_ver_3();
		System.out.println(cev2.getnSize());

	}

}
