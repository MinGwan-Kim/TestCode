package testPackage;

public class A_Company extends ManufacturingCompany{
	
	@Override
	public void click() {
		System.out.println(name + "키보드를 만들고 있습니다.");
		
	}
	
	public A_Company(){
		this.name = "A회사";
	}
}
