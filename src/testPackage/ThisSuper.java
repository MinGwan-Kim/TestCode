package testPackage;

class Mother{ // �θ� �޽��� ����
	public String name = "�кθ�1"; // �кθ� �̸�
	public int age = 51; // �кθ� ����
	
	public void MotherInfo() {
		System.out.println("�̸��� " + name + "�̰� " + "���̴� " + age + "�Դϴ�.");
		}
}

class Child extends Mother {
	public String name = "�ڽ�1";
	public int age = 23;
	
	public void ChildInfo() {
		System.out.println("�̸��� " + name + "�̰� " + "���̴� " + age + "�Դϴ�.");
		}
	
	public void MotherInfo() { 
		super.MotherInfo();
		System.out.println("�̸��� " + name + "�̰� " + "���̴� " + age + "�Դϴ�.");
		System.out.println("�̸��� " + super.name + "�̰� " + "���̴� " + super.age + "�Դϴ�.");
	}

}

public class ThisSuper {

	public static void main(String[] args) {
		Child child = new Child();
		child.MotherInfo();
		child.ChildInfo();

	}

}
