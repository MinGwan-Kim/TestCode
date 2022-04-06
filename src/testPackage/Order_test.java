package testPackage;

import java.util.Scanner;

public class Order_test {

	public static void main(String[] args) {
		
		//String[] member = {"회원1", "회원2", "회원3", "회원4", "회원5", "회원6", "회원7"};
		//int[] memint = {1, 2, 3, 4, 5};
		
		String member1 = "회원1";
		String membersc;
		int memin;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력 해주세요.");
		membersc = sc.nextLine();
		
		if(member1.equals(membersc)) {
			System.out.println(membersc + "님 반갑습니다.");
		}
		else {
			System.out.println("아이디를 확인 해주세요.");
		}
		

		}
	}
