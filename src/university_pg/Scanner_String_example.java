package university_pg;

import java.util.Scanner;

public class Scanner_String_example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� ���ּ���.");
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
