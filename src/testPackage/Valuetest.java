package testPackage;

public class Valuetest {
	public static void main(String[] args) {

	 int i = 1;
	 int j = 0;
     
     j = i++; // ���� ���� : 1] j = i�� ����, 2] i�� 1 ���� 
     System.out.printf("j = i++�� ��� : i=%d, j=%d%n",i,j);
     
     i = 1;
     j = 0;
     j = ++i; // ���� ���� : 1] i�� 1����, 2] j = i�� ����
     System.out.printf("j = ++i�� ��� : i=%d, j=%d%n",i,j);
     
     i = 1;
     j = 0;
     j = i--; // ���� ���� : 1] j = i�� ����, 2] i�� 1 ���� 
     System.out.printf("j = i--�� ��� : i=%d, j=%d%n",i,j);
     
     i = 1;
     j = 0;
     j = --i; // ���� ���� : 1] i�� 1����, 2] j = i�� ����
     System.out.printf("j = --i�� ��� : i=%d, j=%d%n",i,j);        
	}        
}