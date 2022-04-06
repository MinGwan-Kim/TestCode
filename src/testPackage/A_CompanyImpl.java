package testPackage;

public class A_CompanyImpl implements ManufacturingCompanyimpl {
	
	String name = "A회사Impl";

	@Override
	public void click() {
		System.out.println(name + "키보드를 만들고 있습니다.");
		
	}
}
