import java.util.Scanner;
public class 메소드_문제 {
	
	static void print1()
	{
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
	}
	
	static int print2()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	static int print3(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 1~10까지 출력하는 메소드를 구현하시오
//		2. 1~10까지 합을 구하는 메소드를 구현하시오
//		3. 1~n까지 합을 구하는 메소드를 구현하시오
		
		print1();
		print2();
		int hop=print2();
		System.out.println("\n1~10의 합:"+hop);
		hop=print3(100);
		System.out.println("1~n의 합:"+hop);
		
//		4. 두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
//		5. 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
//		6. 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
//		7. 문자열을 거꾸로 출력하는 메소드를 구현하시오
//		8. 학점을 구하는 메소드를 구현하시오
//		9. 년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오
//		10. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
//		11. 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오
//		12. 3의 배수를 판별하는 메소드를 구현하시오
//		13. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오
//		14. 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 쉬를 출력하는 프로그램을 작성하세요

	}

}
