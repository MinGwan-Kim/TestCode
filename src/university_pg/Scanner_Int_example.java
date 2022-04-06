package university_pg;

import java.util.Scanner;

public class Scanner_Int_example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt());
		}
			throw new Exception("숫자를 입력 해주세요.");
		} catch (Exception e){
            e.printStackTrace();
        }

	}

}
