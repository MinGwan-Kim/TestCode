package university_pg;

class parents { // �θ� Ŭ����
	int a = 2;
	int b = 3;
	
}

class child extends parents{ // �ڻ� Ŭ����
	int aa = 32;
	int bb = 37;
	
}

public class Inheritance_example_ver2 {

	public static void main(String[] args) {
		child pa = new child();
		System.out.println(pa.a);
		System.out.println(pa.b);
		System.out.println(pa.aa);
		System.out.println(pa.bb);

	}

}
