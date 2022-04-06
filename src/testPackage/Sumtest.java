package testPackage;
import java.util.Scanner;

public class Sumtest {

	public static void main(String[] args) {
		
		int a = 0;
		int even = 0;
		int odd = 0;
		int num = 100;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력 해주세요.");
		
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
		System.out.println("입력하신 짝수의 합은 :" + even + "입니다.");
		System.out.println("입력하신 홀수으 합은 :" + odd + "입니다.");
	}
	else {
		System.out.println("100이하의 값을 입력 해주세요.");
		}
	}
}