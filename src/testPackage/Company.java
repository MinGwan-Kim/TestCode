package testPackage;

class Employee {
	private String name; // �����
	private String task; // ����
	private int age; // ����
	private String gender; // ����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}

class Employee_rank {
	
	private String rank; // ����
	
	public Employee_rank(String rank) {
		this.rank = rank;
	}
	
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
}

public class Company {

	public static void main(String[] args) {
		
		Employee info = new Employee();
		
		Employee_rank ep = new Employee_rank("���");
		
		info.setName("�ù�1");
		info.setTask("�繫��");
		info.setAge(31);
		info.setGender("����");
		System.out.println("�ش� ������ �̸��� :" + info.getName() + "�Դϴ�.");
		System.out.println("�ش� ������ ������ :" + info.getTask() + "�Դϴ�.");
		System.out.println("�ش� ������ ���̴� :" + info.getAge() + "�Դϴ�.");
		System.out.println("�ش� ������ ������ :" + info.getGender() + "�Դϴ�.");
		System.out.println("�ش� ������ ������ :" + ep.getRank() + "�Դϴ�.");
		
		System.out.println("=====================================================================");
		
		info.setName("�ù�2");
		info.setTask("������");
		info.setAge(37);
		info.setGender("����");
		System.out.println("�ش� ������ �̸���:" + info.getName() + "�Դϴ�.");
		System.out.println("�ش� ������ ������ :" + info.getTask() + "�Դϴ�.");
		System.out.println("�ش� ������ ���̴� :" + info.getAge() + "�Դϴ�.");
		System.out.println("�ش� ������ ������ :" + info.getGender() + "�Դϴ�.");
		System.out.println("�ش� ������ ������ :" + ep.getRank() + "�Դϴ�.");
	}

}
