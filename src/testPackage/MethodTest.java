package testPackage;

import java.util.Scanner;

class PriceMethod{
	
	// ���� ���� �޼ҵ�
	int PizzaPrice(int PizzaPrice) {
		return PizzaPrice;
	}
	
	// ���� ���� �޼ҵ�
	int DrinkPrice(int DrinkPrice) {
		return DrinkPrice;
	}
	
	// ���� + ���� ���� �޼ҵ�
	int Price_Sum(int PizzaPrice, int DrinkPrice) {
		return PizzaPrice + DrinkPrice;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // Scanner ��ü ����
		
		String BulgogiPizzaName = "�Ұ�� ����";
		int BulgogiPizzaPrice = 5900;
		
		String PotatoPizzaName = "�������� ����";
		int PotatoPizzaPrice = 6100;
		
		System.out.println("���ڸ� ���� ���ּ���.");
		System.out.println("1.�Ұ�� ����\n2.�������� ����");
		int PizzaNumber = in.nextInt();
	//	int SetStateNumber = in.nextInt();
		
		switch(PizzaNumber) {
		case 1:
			System.out.println("�����Ͻ� ���ڴ� " + BulgogiPizzaName + "�Դϴ�.");
			System.out.println("��Ʈ ���θ� ���� ���ּ���.");
			System.out.println("1.��Ʈ\n2.��ǰ");
		// ���� �Է°�
		int SetStateNumber = in.nextInt();
			if(SetStateNumber == 1) {
				System.out.println("���Ḧ ���� ���ּ���.");
				System.out.println("1.�ݶ�\n2.���̴�");
		int DrinkNumber = in.nextInt();
				if(DrinkNumber == 1) {
				}
			}
			else if(SetStateNumber == 2) {
				int PizzaPrice =+ BulgogiPizzaPrice;
				System.out.println("�޴��� ������ " + PizzaPrice +"���Դϴ�");  // 7 ���
				break;
			}
		case 2:
			System.out.println("�����Ͻ� ���ڴ� " + PotatoPizzaName + "�Դϴ�.");
			
		case 3:
		System.out.println("���� �߿��� ���� ���ּ���.");
		}
	}
	//	PizzaTotal += PizzaNumber;
		

	}