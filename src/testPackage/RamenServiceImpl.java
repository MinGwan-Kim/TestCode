package testPackage;

public class RamenServiceImpl implements MenuService{
	
	@Override
	public void User(String User) {
		System.out.println(User + "���� �湮 �߽��ϴ�.");
		
	}
	
	@Override
	public void Ramen(String Ramen) {
		System.out.println(Ramen + "�� �ֹ� �ϼ̽��ϴ�.");
		
	}

	public static void main(String[] args) {
		MenuService ChainStore_1 = new RamenServiceImpl();
		System.out.println("1ȣ ü�����Դϴ�.");
		ChainStore_1.User("������");
		ChainStore_1.Ramen("�Ŷ��");
		
		MenuService ChainStore_2 = new RamenServiceImpl();
		System.out.println("2ȣ ü�����Դϴ�.");
		ChainStore_2.User("������");
		ChainStore_2.Ramen("�����");

	}

	@Override
	public void Kimbab(String Kimbab) {
		// TODO Auto-generated method stub
		
	}
}
