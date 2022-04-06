package testPackage;

public class Human {
	private String name; // 이름
	private int age; // 나이
	private double height; // 키
	private double weight; // 몸무게
	private String gender; // 성별

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
		System.out.println(getName() + "의 정보입니다.");
		System.out.println("나이 :" + getAge());
		System.out.println("키 :" + getHeight());
		System.out.println("몸무게 :" + getWeight());
		System.out.println("성별 :" + getGender());
	}

	public static void main(String[] args) {
		
		Human simin1 = new Human("시민1", 21, 162.5, 52.1, "여자");
		Human simin2 = new Human("시민2", 23, 167.3, 55.7, "여자");
		
		simin1.PrintMethod();
		simin2.PrintMethod();


	}

}
