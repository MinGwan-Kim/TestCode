package testPackage;

import testPackage.UserService;

public class UserServiceImpl implements UserService{
	
	@Override
	public void CU_User(String CU_User) {
		System.out.println(CU_User + "님은 CU 편의점 고객입니다.");
		
	}

	@Override
	public void GS_User(String GS_User) {
		System.out.println(GS_User + "님은 GS25 편의점 고객입니다.");
		
	}

	@Override
	public void SevenEleven_User(String SevenEleven_User) {
		System.out.println(SevenEleven_User + "님은 SevenEleven 편의점 고객입니다.");
		
	}
	
	@Override
	public void Hyundai_Agency_User(String Hyundai_User) {
		System.out.println(Hyundai_User + "님은 현대차 대리점 고객입니다.");
		
	}

	@Override
	public void Kia_Agency_User(String Kia_User) {
		System.out.println(Kia_User + "님은 기아차 대리점 고객입니다.");
		
	}

	public static void main(String[] args) {
		UserService cu = new UserServiceImpl();
		cu.CU_User("김민지");
		
		UserService gs = new UserServiceImpl();
		gs.GS_User("유민지");
		
		UserService SevenEleven = new UserServiceImpl();
		SevenEleven.SevenEleven_User("박다영");
		
		UserService HyundaiAgency = new UserServiceImpl();
		HyundaiAgency.Hyundai_Agency_User("김미진");
		
		UserService KiaAgency = new UserServiceImpl();
		KiaAgency.Kia_Agency_User("이유진");

	}

}
