package university_pg;

class CSuperTest{
	public CSuperTest() {
		System.out.println("super non-argu");
	}
	
	public CSuperTest(int a) {
		System.out.println("super argu");
	}
}

class CSuperTestA extends CSuperTest {
	public CSuperTestA() {
		System.out.println("super non-argu");
	}
	
	public CSuperTestA(int a) {
		System.out.println("super argu");
	}
}

public class Constructor_example {

	public static void main(String[] args) {
		CSuperTestA sub1 = new CSuperTestA();
		CSuperTestA sub2 = new CSuperTestA(10);

	}

}
