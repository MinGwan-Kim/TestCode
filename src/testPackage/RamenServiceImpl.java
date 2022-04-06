package testPackage;

public class RamenServiceImpl implements MenuService{
	
	@Override
	public void User(String User) {
		System.out.println(User + "님이 방문 했습니다.");
		
	}
	
	@Override
	public void Ramen(String Ramen) {
		System.out.println(Ramen + "을 주문 하셨습니다.");
		
	}

	public static void main(String[] args) {
		MenuService ChainStore_1 = new RamenServiceImpl();
		System.out.println("1호 체인점입니다.");
		ChainStore_1.User("유민지");
		ChainStore_1.Ramen("신라면");
		
		MenuService ChainStore_2 = new RamenServiceImpl();
		System.out.println("2호 체인점입니다.");
		ChainStore_2.User("염보윤");
		ChainStore_2.Ramen("진라면");

	}

	@Override
	public void Kimbab(String Kimbab) {
		// TODO Auto-generated method stub
		
	}
}
