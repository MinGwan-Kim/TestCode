package testPackage;

import java.util.Scanner;

public class Order_test {

	public static void main(String[] args) {
		
		//String[] member = {"ȸ��1", "ȸ��2", "ȸ��3", "ȸ��4", "ȸ��5", "ȸ��6", "ȸ��7"};
		//int[] memint = {1, 2, 3, 4, 5};
		
		String member1 = "ȸ��1";
		String membersc;
		int memin;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� ���ּ���.");
		membersc = sc.nextLine();
		
		if(member1.equals(membersc)) {
			System.out.println(membersc + "�� �ݰ����ϴ�.");
		}
		else {
			System.out.println("���̵� Ȯ�� ���ּ���.");
		}
		

		}
	}
