package university_pg;

class Grade{
	int e; // ���� ���� ����
	int m; // ���� ���� ����
	
	void input_grade(int a, int b) {
		e = a;
		m = b;
	}
	
	void output_grade() {
		System.out.println(e+m);
	}
}

public class GradeOutput {

	public static void main(String[] args) {
		/*
		Grade g1, g2; // �θ��� ������ ǥ���ϴ� ��ü
		g1 = new Grade(); // ��ü ����
		g2 = new Grade(); // ��ü ����
		*/
		
		Grade g1 = new Grade(); // ��ü(�ν��Ͻ�) ����
		Grade g2 = new Grade(); // ��ü(�ν��Ͻ�) ����
		
		g1.input_grade(90, 85); // input_gade �޼ҵ忡 ���� �Ķ���� �� �Է�
		g2.input_grade(80, 80); // input_gade �޼ҵ忡 ���� �Ķ���� �� �Է�
		
		g1.output_grade(); // output_grade �޼ҵ带 ���� sum �� ���
		g2.output_grade(); // output_grade �޼ҵ带 ���� sum �� ���

	}
}
