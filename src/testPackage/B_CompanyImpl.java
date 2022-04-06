package testPackage;

public class B_CompanyImpl implements ManufacturingCompanyimpl {
	
	String name = "B회사Impl";

	@Override
	public void click() {
		System.out.println(name + "키보드를 만들고 있습니다.");
		
	}

}
