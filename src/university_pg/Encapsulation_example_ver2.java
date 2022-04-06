package university_pg;

class Encapsulation_example_ver_2{
	private int r;
	
	public Encapsulation_example_ver_2(int a){
		r = a;
	}
	
	public double getArea() {
		return r * r * 3.141592;
	}
}

public class Encapsulation_example_ver2 {

	public static void main(String[] args) {
		
		Encapsulation_example_ver_2 ese = new Encapsulation_example_ver_2(5);
		System.out.println(ese.getArea());

	}

}
