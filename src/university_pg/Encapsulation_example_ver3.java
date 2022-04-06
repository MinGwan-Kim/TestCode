package university_pg;

class Encapsulation_example_ver_3 {
	private Encapsulation_example_ver_2 ese;
	private int h;
	
	public Encapsulation_example_ver_3(Encapsulation_example_ver_2 a, int b) {
		ese = a;
		h = b;
	}
	
	public double getVolume() {
		return ese.getArea() * h;
	}
}

public class Encapsulation_example_ver3 {
	public static void main(String[] args) {
		Encapsulation_example_ver_2 ese = new Encapsulation_example_ver_2(7);
		
		int h = 8;
		Encapsulation_example_ver_3 ese2 = new Encapsulation_example_ver_3(ese, h);
		System.out.println(ese2.getVolume());
	}
}