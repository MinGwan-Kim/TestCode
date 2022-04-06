package university_pg;

class Shape{
	public double getArea(double h, double w) {
		return h * w;
	}
}

class Triangle extends Shape{
	public double getArea(double h, double w) {
		return h * w * 0.5;
	}
	public int getArea(int h, int w) {
		return h + w;
	}	
}

public class InheritanceMethod_example {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.println(t.getArea(3.0, 4.0));
		System.out.println(t.getArea(12, 3));

	}

}
