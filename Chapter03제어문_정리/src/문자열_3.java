/*
 * 
 *  문자열 정보
 *   length() : 문자의 갯수
 *   	ex) 비밀번호 8자리 이상
 * 
 */
import java.util.Scanner;
// 사용자가 입력한 문자의 갯수 확인(공백 포함)
//  
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scan=new Scanner(System.in);
		// BufferedReader > 예외처리
		System.out.print("문자열 입력:");
		String str1=scan.next();
		String str2=scan.next();
		String str3=scan.next();
		// next() 공백/ENTER
		// nextLine() 공백을 포함한 ENTER 입력까지
		System.out.println("===== 결과값 =====");
		System.out.println("문자의 갯수:"+str1.length());
		System.out.println("문자의 갯수:"+str2.length());
		System.out.println("문자의 갯수:"+str3.length());
	}

}
