package university_pg;

class Grade{
	int e; // 영어 성적 변수
	int m; // 수학 성적 변수
	
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
		Grade g1, g2; // 두명의 성적을 표현하는 객체
		g1 = new Grade(); // 객체 생성
		g2 = new Grade(); // 객체 생성
		*/
		
		Grade g1 = new Grade(); // 객체(인스턴스) 생성
		Grade g2 = new Grade(); // 객체(인스턴스) 생성
		
		g1.input_grade(90, 85); // input_gade 메소드에 정수 파라미터 값 입력
		g2.input_grade(80, 80); // input_gade 메소드에 정수 파라미터 값 입력
		
		g1.output_grade(); // output_grade 메소드를 통한 sum 값 출력
		g2.output_grade(); // output_grade 메소드를 통한 sum 값 출력

	}
}
