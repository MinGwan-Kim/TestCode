package university_pg;

public class GradeOutput_ver2 {
	
	int e; // 영어 성적 입력 변수
	int m; // 수학 성적 입력 변수
	
	void input_grade(int a, int b) { // 성적 입력 파라미터값을 받기 위한 메소드
		e = a;
		m = b;
	}
	
	void output_grade() { // 파라미터 값을 받아 합을 출력 하는 메소드
		System.out.println(e+m);
	}

	public static void main(String[] args) {
		GradeOutput_ver2 go1 = new GradeOutput_ver2(); // 객체(인스턴스) 생성
		GradeOutput_ver2 go2 = new GradeOutput_ver2(); // 객체(인스턴스) 생성
		
		go1.input_grade(90, 80); // input_gade 메소드에 정수 파라미터 값 입력
		go2.input_grade(75, 90); //input_gade 메소드에 정수 파라미터 값 입력
		
		go1.output_grade(); // output_grade 메소드를 통한 sum 값 출력
		go2.output_grade(); // output_grade 메소드를 통한 sum 값 출력

	}

}
