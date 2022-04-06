package testPackage;

public class ExampleMethod {
	
	public void PrintMethod(String a, String b) {
		System.out.println(a + b);		
	}
	
	public String VarPrintMethod(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {
		ExampleMethod TestMethod = new ExampleMethod();
		TestMethod.PrintMethod("Test ", "Method");
		
		String TM = TestMethod.VarPrintMethod("Var ", "Method");
		System.out.println(TM);

	}

}
