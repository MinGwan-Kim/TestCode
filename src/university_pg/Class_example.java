package university_pg;

public class Class_example {
	int a;
	int b;
	int c;

	public static void main(String[] args) {
		Class_example A1 = new Class_example();
		A1.a = 2;
		System.out.println(A1.a);
		
		Class_example A2 = new Class_example();
		A2.b = 5;
		System.out.println(A2.b);
		
		Class_example A3 = new Class_example();
		A3.c = 7;
		System.out.println(A3.c);
		
		Class_example newA1 = new Class_example();
		newA1.a = 12;
		System.out.println("���ο� ��ü�� �����Ͽ� a���� �Ҵ��� ���� : " + newA1.a);
		
		Class_example newA2 = new Class_example();
		newA2.b = 15;
		System.out.println("���ο� ��ü�� �����Ͽ� b���� �Ҵ��� ���� : " + newA2.b);
		
		Class_example newA3 = new Class_example();
		newA3.c = 17;
		System.out.println("���ο� ��ü�� �����Ͽ� c���� �Ҵ��� ���� : " + newA3.c);

	}

}
