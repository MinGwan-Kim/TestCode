package testPackage;

public class C_Company extends ManufacturingCompany{

	@Override
	public void click() {
		System.out.println(name + "키보드를 만들고 있습니다.");
		
	}
	
	public C_Company(){
		this.name = "C회사";
	}

}
