package university_pg;

class CSuper_Test {
	public double a;
}

class CSub_Test extends CSuper_Test{
	public double a;
	
	public CSub_Test(double new_a) {
		this.a = new_a;
		super.a = new_a * 10;
	}
	
	public CSub_Test() {
		
	}
	
	public double getSuper() {
		return super.a;
	}
	public double getSub() {
		return this.a;
	}
}

public class ThisSuper_example {

	public static void main(String[] args) {
		CSub_Test csub_test = new CSub_Test(10.0);
		System.out.println(csub_test.a);
		System.out.println(csub_test.getSuper());
		System.out.println(csub_test.getSub());
		

	}

}
