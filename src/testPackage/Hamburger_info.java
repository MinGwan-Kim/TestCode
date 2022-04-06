package testPackage;

class Hamburger {
	private String Hamburgername;
	private String Hamburgersize;
	private int Hamburgerprice;
	
	Hamburger(String Hamburgername, String Hamburgersize, int Hamburgerprice){
		this.Hamburgername = Hamburgername;
		this.Hamburgersize = Hamburgersize;
		this.Hamburgerprice = Hamburgerprice;
	}
	
	Hamburger(){
		
	}

	public String getHamburgername() {
		return Hamburgername;
	}

	public void setHamburgername(String hamburgername) {
		Hamburgername = hamburgername;
	}

	public String getHamburgersize() {
		return Hamburgersize;
	}

	public void setHamburgersize(String hamburgersize) {
		Hamburgersize = hamburgersize;
	}

	public int getHamburgerprice() {
		return Hamburgerprice;
	}

	public void setHamburgerprice(int hamburgerprice) {
		Hamburgerprice = hamburgerprice;
	}
}

public class Hamburger_info {

	public static void main(String[] args) {
		Hamburger Hamburger_info1 = new Hamburger();
		Hamburger_info1.setHamburgername("ºò¸Æ");
		Hamburger_info1.setHamburgersize("½º¸ô");
		Hamburger_info1.setHamburgerprice(4900);
		System.out.println(Hamburger_info1.getHamburgername());
		System.out.println(Hamburger_info1.getHamburgersize());
		System.out.println(Hamburger_info1.getHamburgerprice());

		Hamburger Hamburger_info2 = new Hamburger("½ÎÀÌ¹ö°Å", "¶óÁö", 5900);
		System.out.println(Hamburger_info2.getHamburgername());
		System.out.println(Hamburger_info2.getHamburgersize());
		System.out.println(Hamburger_info2.getHamburgerprice());
	}

}
