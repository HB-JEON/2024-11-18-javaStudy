package com.sist.util;
import java.util.*;
public class 라이브러리_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오늘 날짜 읽기
		Calendar today=Calendar.getInstance();
		System.out.println("년도 : "+today.get(Calendar.YEAR));
		// MONTH  => 0 값 => 저장 -1 / 읽기 +1
		System.out.println("월 : "+(today.get(Calendar.MONTH)+1));
		System.out.println("일 : "+today.get(Calendar.DATE));
		// week => 1 "", 통하여 0 값 채워주기
		String[] strWeek={"","일","월","화","수","목","금","토"};
		System.out.println("요일 : "+strWeek[today.get(Calendar.DAY_OF_WEEK)]);
		
		System.out.println("시간 : "+today.get(Calendar.HOUR));
		System.out.println("시간 : "+today.get(Calendar.MINUTE));
		System.out.println("시간 : "+today.get(Calendar.SECOND));
		
		System.out.println((today.get(Calendar.MONTH)+1)+"월의 마지막 날 : "+today.getActualMaximum(Calendar.DATE));
	}

}
