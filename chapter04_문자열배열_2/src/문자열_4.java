
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello Java";
		String s2="Hello Java";
		String s3=new String("Hello Java");
		// equalsIgnoreCase > 대소문자 없이 비교
		// 나머지 String 모든 메소드는 대소문자를 구분
		if(s1.equals(s3)) // == 메모리 주소 비교
						  // equals 저장 되어있는 문자열이 같은지 비교
						  // 메모리 주소보다 문자열 자체를 비교
		{
			System.out.println("s1==s2");
		}
		else
		{
			System.out.println("s1!=s2");
		}
		
	}

}
