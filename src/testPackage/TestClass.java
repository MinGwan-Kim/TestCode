package testPackage;

import java.util.Scanner;

public class TestClass {
	
	public static void main(String[] args) {
		
		System.out.println("값을 입력 해주세요.");
		Scanner in = new Scanner(System.in); // Scanner 객체 생성
		
		String a = in.next();
		String b = in.next();
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(ParameterMethod("Test1", "Test2"));
	}
	
	public static String ParameterMethod(String a, String b) {
		return a + b;
	}

}