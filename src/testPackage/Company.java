package testPackage;

class Employee {
	private String name; // 사원명
	private String task; // 업무
	private int age; // 나이
	private String gender; // 성별

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
	
	private String rank; // 직급
	
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
		
		Employee_rank ep = new Employee_rank("사원");
		
		info.setName("시민1");
		info.setTask("사무직");
		info.setAge(31);
		info.setGender("여자");
		System.out.println("해당 직원의 이름은 :" + info.getName() + "입니다.");
		System.out.println("해당 직원의 업무는 :" + info.getTask() + "입니다.");
		System.out.println("해당 직원의 나이는 :" + info.getAge() + "입니다.");
		System.out.println("해당 직원의 성별은 :" + info.getGender() + "입니다.");
		System.out.println("해당 직원의 직급은 :" + ep.getRank() + "입니다.");
		
		System.out.println("=====================================================================");
		
		info.setName("시민2");
		info.setTask("개발자");
		info.setAge(37);
		info.setGender("남자");
		System.out.println("해당 직원의 이름은:" + info.getName() + "입니다.");
		System.out.println("해당 직원의 업무는 :" + info.getTask() + "입니다.");
		System.out.println("해당 직원의 나이는 :" + info.getAge() + "입니다.");
		System.out.println("해당 직원의 성별은 :" + info.getGender() + "입니다.");
		System.out.println("해당 직원의 직급은 :" + ep.getRank() + "입니다.");
	}

}
