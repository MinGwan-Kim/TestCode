package testPackage;

import testPackage.UserService;

public class UserServiceImpl implements UserService{
	
	@Override
	public void CU_User(String CU_User) {
		System.out.println(CU_User + "���� CU ������ ���Դϴ�.");
		
	}

	@Override
	public void GS_User(String GS_User) {
		System.out.println(GS_User + "���� GS25 ������ ���Դϴ�.");
		
	}

	@Override
	public void SevenEleven_User(String SevenEleven_User) {
		System.out.println(SevenEleven_User + "���� SevenEleven ������ ���Դϴ�.");
		
	}
	
	@Override
	public void Hyundai_Agency_User(String Hyundai_User) {
		System.out.println(Hyundai_User + "���� ������ �븮�� ���Դϴ�.");
		
	}

	@Override
	public void Kia_Agency_User(String Kia_User) {
		System.out.println(Kia_User + "���� ����� �븮�� ���Դϴ�.");
		
	}

	public static void main(String[] args) {
		UserService cu = new UserServiceImpl();
		cu.CU_User("�����");
		
		UserService gs = new UserServiceImpl();
		gs.GS_User("������");
		
		UserService SevenEleven = new UserServiceImpl();
		SevenEleven.SevenEleven_User("�ڴٿ�");
		
		UserService HyundaiAgency = new UserServiceImpl();
		HyundaiAgency.Hyundai_Agency_User("�����");
		
		UserService KiaAgency = new UserServiceImpl();
		KiaAgency.Kia_Agency_User("������");

	}

}
