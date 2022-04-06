package testPackage;

import java.util.Scanner;

class PriceMethod{
	
	// 피자 가격 메소드
	int PizzaPrice(int PizzaPrice) {
		return PizzaPrice;
	}
	
	// 음료 가격 메소드
	int DrinkPrice(int DrinkPrice) {
		return DrinkPrice;
	}
	
	// 피자 + 음료 가격 메소드
	int Price_Sum(int PizzaPrice, int DrinkPrice) {
		return PizzaPrice + DrinkPrice;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // Scanner 객체 생성
		
		String BulgogiPizzaName = "불고기 피자";
		int BulgogiPizzaPrice = 5900;
		
		String PotatoPizzaName = "포테이토 피자";
		int PotatoPizzaPrice = 6100;
		
		System.out.println("피자를 선택 해주세요.");
		System.out.println("1.불고기 피자\n2.포테이토 피자");
		int PizzaNumber = in.nextInt();
	//	int SetStateNumber = in.nextInt();
		
		switch(PizzaNumber) {
		case 1:
			System.out.println("선택하신 피자는 " + BulgogiPizzaName + "입니다.");
			System.out.println("세트 여부를 선택 해주세요.");
			System.out.println("1.세트\n2.단품");
		// 음료 입력값
		int SetStateNumber = in.nextInt();
			if(SetStateNumber == 1) {
				System.out.println("음료를 선택 해주세요.");
				System.out.println("1.콜라\n2.사이다");
		int DrinkNumber = in.nextInt();
				if(DrinkNumber == 1) {
				}
			}
			else if(SetStateNumber == 2) {
				int PizzaPrice =+ BulgogiPizzaPrice;
				System.out.println("메뉴의 가격은 " + PizzaPrice +"원입니다");  // 7 출력
				break;
			}
		case 2:
			System.out.println("선택하신 피자는 " + PotatoPizzaName + "입니다.");
			
		case 3:
		System.out.println("보기 중에서 선택 해주세요.");
		}
	}
	//	PizzaTotal += PizzaNumber;
		

	}