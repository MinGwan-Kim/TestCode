package testPackage;
import java.util.Scanner;

public class Sumtest {

	public static void main(String[] args) {
		
		int a = 0;
		int even = 0;
		int odd = 0;
		int num = 100;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� ���ּ���.");
		
		int math = sc.nextInt();
		if( math <= 100) {
		for(int i = 0; i < math; i++) {
			if(i % 2 == 0) {
				even += i;
			}
			else if(i % 2 == 1) {
				odd += i;
			}
		}
		System.out.println("�Է��Ͻ� ¦���� ���� :" + even + "�Դϴ�.");
		System.out.println("�Է��Ͻ� Ȧ���� ���� :" + odd + "�Դϴ�.");
	}
	else {
		System.out.println("100������ ���� �Է� ���ּ���.");
		}
	}
}