package university_pg;

class CSuper{
	private int f1;
	public int f2;
	
	public void setPrivate() {
		f1 = 10;
	}
	public void setPublic() {
		f2 = 20;
	}
	public void mPrivate() {
		f1 = 30;
	}
}

class Csub extends CSuper{
	private int f3;
	public int f4;
}


public class Inheritance_example {

	public static void main(String[] args) {
		Csub Iie = new Csub();
	//	Iie.f1 = 40;
		Iie.f2 = 50;
		Iie.f4 = 70;
		
		System.out.println(Iie.f2);
		System.out.println(Iie.f4);
	}

}
