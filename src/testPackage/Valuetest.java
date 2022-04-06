package testPackage;

public class Valuetest {
	public static void main(String[] args) {

	 int i = 1;
	 int j = 0;
     
     j = i++; // 연산 과정 : 1] j = i를 실행, 2] i를 1 증가 
     System.out.printf("j = i++의 결과 : i=%d, j=%d%n",i,j);
     
     i = 1;
     j = 0;
     j = ++i; // 연산 과정 : 1] i를 1증가, 2] j = i를 실행
     System.out.printf("j = ++i의 결과 : i=%d, j=%d%n",i,j);
     
     i = 1;
     j = 0;
     j = i--; // 연산 과정 : 1] j = i를 실행, 2] i를 1 감소 
     System.out.printf("j = i--의 결과 : i=%d, j=%d%n",i,j);
     
     i = 1;
     j = 0;
     j = --i; // 연산 과정 : 1] i를 1감소, 2] j = i를 실행
     System.out.printf("j = --i의 결과 : i=%d, j=%d%n",i,j);        
	}        
}