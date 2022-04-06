package university_pg;

import java.util.Scanner;

public class Scanner_String_example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력 해주세요.");
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
