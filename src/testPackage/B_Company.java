package testPackage;

public class B_Company extends ManufacturingCompany{
	
	@Override
	public void click() {
		System.out.println(name + "키보드를 만들고 있습니다.");
		
	}

	public B_Company(){
		this.name = "B회사";
	}

}
