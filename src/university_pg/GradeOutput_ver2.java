package university_pg;

public class GradeOutput_ver2 {
	
	int e; // ���� ���� �Է� ����
	int m; // ���� ���� �Է� ����
	
	void input_grade(int a, int b) { // ���� �Է� �Ķ���Ͱ��� �ޱ� ���� �޼ҵ�
		e = a;
		m = b;
	}
	
	void output_grade() { // �Ķ���� ���� �޾� ���� ��� �ϴ� �޼ҵ�
		System.out.println(e+m);
	}

	public static void main(String[] args) {
		GradeOutput_ver2 go1 = new GradeOutput_ver2(); // ��ü(�ν��Ͻ�) ����
		GradeOutput_ver2 go2 = new GradeOutput_ver2(); // ��ü(�ν��Ͻ�) ����
		
		go1.input_grade(90, 80); // input_gade �޼ҵ忡 ���� �Ķ���� �� �Է�
		go2.input_grade(75, 90); //input_gade �޼ҵ忡 ���� �Ķ���� �� �Է�
		
		go1.output_grade(); // output_grade �޼ҵ带 ���� sum �� ���
		go2.output_grade(); // output_grade �޼ҵ带 ���� sum �� ���

	}

}
