package testPackage;

public class Human {
	private String name; // �̸�
	private int age; // ����
	private double height; // Ű
	private double weight; // ������
	private String gender; // ����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Human(String name, int age, double height, double weight, String gender) {
			setName(name);
			setAge(age);
			setHeight(height);
			setWeight(weight);
			setGender(gender);
	}
	
	public void PrintMethod() {
		System.out.println(getName() + "�� �����Դϴ�.");
		System.out.println("���� :" + getAge());
		System.out.println("Ű :" + getHeight());
		System.out.println("������ :" + getWeight());
		System.out.println("���� :" + getGender());
	}

	public static void main(String[] args) {
		
		Human simin1 = new Human("�ù�1", 21, 162.5, 52.1, "����");
		Human simin2 = new Human("�ù�2", 23, 167.3, 55.7, "����");
		
		simin1.PrintMethod();
		simin2.PrintMethod();


	}

}
