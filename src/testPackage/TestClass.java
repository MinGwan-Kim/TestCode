package testPackage;

import java.util.Scanner;

public class TestClass {
	
	public static void main(String[] args) {
		
		System.out.println("���� �Է� ���ּ���.");
		Scanner in = new Scanner(System.in); // Scanner ��ü ����
		
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