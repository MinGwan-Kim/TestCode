package testPackage;

public class C_CompanyImpl implements ManufacturingCompanyimpl {

	String name = "c회사Impl";

	@Override
	public void click() {
		System.out.println(name + "키보드를 만들고 있습니다.");
		
	}

}