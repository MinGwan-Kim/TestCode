package testPackage;

class Car {
	String type;
	String color;
	String geartype;
	String navigation; // �׺���̼� ���� �߰�
	String division; //���� ���� �ɼ� �߰�
	
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
		car1.type = "�ƹݶ�";
		car1.color = "�Ķ���";
		car1.geartype = "auto";
		System.out.println("car1 : " + car1.type + "/" + car1.color + "/" + car1.geartype);
		
		Car car2 = new Car("�ҳ�Ÿ", "�ʷϻ�", "auto");
		System.out.println("car2 : " + car2.type + "/" + car2.color + "/" + car2.geartype);
		
		Car car3 = new Car("���", "�����", "auto", "y");
		System.out.println("car3 : " + car3.type + "/" + car3.color + "/" + car3.geartype + "/" + car3.navigation);
		
		Car car4 = new Car("Lay", "ȸ��", "auto", "y");
		car4.division = "����";
		System.out.println("car4 : " + car4.type + "/" + car4.color + "/" + car4.geartype + "/" + car4.navigation + "/" + car4.division);
		
		Car car5 = new Car("SUV", "�����", "auto", "y");
		car5.division = "����";
		System.out.println("car5 : " + car5.type + "/" + car5.color + "/" + car5.geartype + "/" + car5.navigation + "/" + car5.division);
		}

	}