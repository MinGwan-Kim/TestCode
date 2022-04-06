package testPackage;

class Car {
	String type;
	String color;
	String geartype;
	String navigation; // 네비게이션 여부 추가
	String division; //신형 구형 옵션 추가
	
	Car(){
	}
	Car(String type, String color, String geartype){
		this.type = type;
		this.color = color;
		this.geartype = geartype;
	}
	
	Car(String type, String color, String geartype, String navigation){
		this.type = type;
		this.color = color;
		this.geartype = geartype;
		this.navigation = navigation;
	}
	
	Car(String type, String color, String geartype, String navigation, String division){
		this.type = type;
		this.color = color;
		this.geartype = geartype;
		this.navigation = navigation;
	}
}

public class CarConstructor {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.type = "아반떼";
		car1.color = "파란색";
		car1.geartype = "auto";
		System.out.println("car1 : " + car1.type + "/" + car1.color + "/" + car1.geartype);
		
		Car car2 = new Car("소나타", "초록색", "auto");
		System.out.println("car2 : " + car2.type + "/" + car2.color + "/" + car2.geartype);
		
		Car car3 = new Car("모닝", "노란색", "auto", "y");
		System.out.println("car3 : " + car3.type + "/" + car3.color + "/" + car3.geartype + "/" + car3.navigation);
		
		Car car4 = new Car("Lay", "회색", "auto", "y");
		car4.division = "신형";
		System.out.println("car4 : " + car4.type + "/" + car4.color + "/" + car4.geartype + "/" + car4.navigation + "/" + car4.division);
		
		Car car5 = new Car("SUV", "보라색", "auto", "y");
		car5.division = "구형";
		System.out.println("car5 : " + car5.type + "/" + car5.color + "/" + car5.geartype + "/" + car5.navigation + "/" + car5.division);
		}

	}