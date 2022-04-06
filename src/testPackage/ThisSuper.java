package testPackage;

class Mother{ // 부모 메신저 선언
	public String name = "학부모1"; // 학부모 이름
	public int age = 51; // 학부모 나이
	
	public void MotherInfo() {
		System.out.println("이름은 " + name + "이고 " + "나이는 " + age + "입니다.");
		}
}

class Child extends Mother {
	public String name = "자식1";
	public int age = 23;
	
	public void ChildInfo() {
		System.out.println("이름은 " + name + "이고 " + "나이는 " + age + "입니다.");
		}
	
	public void MotherInfo() { 
		super.MotherInfo();
		System.out.println("이름은 " + name + "이고 " + "나이는 " + age + "입니다.");
		System.out.println("이름은 " + super.name + "이고 " + "나이는 " + super.age + "입니다.");
	}

}

public class ThisSuper {

	public static void main(String[] args) {
		Child child = new Child();
		child.MotherInfo();
		child.ChildInfo();

	}

}
