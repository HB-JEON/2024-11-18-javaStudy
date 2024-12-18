package com.sist.main;
/*
 *   1. 클래스의 종류
 *       *** 일반 클래스
 *         형식)
 *             [접근지정어][제어어] class ClassName
 *             {
 *                ----------------------------
 *                 멤버변수(전역변수)
 *                ----------------------------
 *                생성자
 *                ----------------------------
 *                메소드
 *                ----------------------------
 *             }
 *          메모링 저장 후에 사용(객체를 생성)
 *          클래스명 객체명 = new 생성자()
 *          객체명.메소드, 객체명.변수
 *          --------------------------
 *          객체=null => GC => 메모리 회수
 *          멤버변수
 *           객체마다 따로 저장하는 공간
 *           한개의 공간에 저장(static) => 공유변수
 *          생성자
 *           멤버변수의 초기화 / 시작과 동시에 처리하는 기능
 *                           ------------
 *                            Layout / 데이터베이스 연동
 *           생성자가 없는 경우에는 디폴트 생성자 자동 생성
 *          기능 설정 - 메소드 => ㄷ3ㅏ른 클래스와 통신 담당
 *          재사용 - 상속
 *           기존의 클래스의 기능을 다시 사용 - extends
 *           --------- 웹에서는 사용자 정의 클래스 상속
 *                     일반 => 라이브러리
 *                     상속처리 - 추상클래스 / 인터페이스
 *                     ----- 오버라이딩 기법을 사용
 *       추상 클래스 - 미완성 클래스 (메소드만 선언)
 *                  사용 시에는 반드시 상속을 받아 구현 후 사용
 *                  서로 다른 클래스를 여러개 묶어 한개의 객체명으로 사용
 *                  오라이딩 기법 사용
 *         형식)
 *             공통적인 내용을 모아서 저장
 *             abstract - 추상적인 => 공통적인    
 *             [접근지정어] abstract class ClassName
 *             {
 *                -------------------------------
 *                 변수 => 멤버변수
 *                -------------------------------
 *                 생성자
 *                -------------------------------
 *                 메소드 - 구현된 메소드
 *                -------------------------------
 *                 메소드 - 구현이 안된 메소드
 *                 public 리턴형 메소드(매개변수)
 *                 {
 *                    return 값;
 *                 }
 *                 => 클래스마다 공통 사용
 *                 => 클래스에서 필요 시에 오버라이딩
 *                 ------------------------------
 *                 메소드 - 구현이 안된 메소드 => 추상 메소드
 *                  클래스마다 처리 내용이 다른 경우
 *                  프로그램에 맞게 구현해서 사용
 *                 public abstract 리턴형 메소드명(매개변수);
 *                 => 데이터 베이스 연동
 *                    => 드라이버를 설정 => 모든 데이터베이스에 연결
 *                       oracle.jdbc.driver.OracleDriver
 *                       com.mysql.cj.Driver
 *                 => 추상 클래스는 자체에서 객체 생성 불가능
 *                    ----------------------------
 *                    => 상속받은 클래스를 이용해서 사용
 *                       상위클래스 객체=new 하위클래스 생성자()
 *                    => 녹색C A
 *             }      
 *       *** 인터페이스 - 오라클 연동 / 웹 개발 / 스프링
 *            추상클래스의 일종
 *            추상클래스 보완 형태
 *            추상클래스 (단일 상속), 인터페이스는 다중 상속이 가능
 *             => 결합성이 낮은 프로그램에 주로 사용
 *                ---------------
 *                 | 목적 - 스프링
 *         형식)
 *             [접근지정어] interface interface명
 *             {
 *                ----------------------------
 *                 상수형 변수
 *                 public static final int A=10
 *                ----------------------------
 *                 생략이 가능
 *                 int B=10; => 상수
 *                ----------------------------
 *                 생성자는 존재하지 않는다
 *                 메소드 => 선언만 되어있는 상태
 *                 public abstract 리턴형 메소드명(매개);
 *                 --------------- 생략 가능
 *                 *** 인터페이스는 모든 변수/메소드가 public
 *                ----------------------------
 *                 jdk1.8 추가
 *                  => 구현된 메소드
 *                 public default 리턴형 메소드명()
 *                        -------
 *                {
 *                }
 *                ----------------------------
 *                 => 구현된 메소드
 *                 public static 리턴형 메소드명()
 *                 {
 *                 }
 *                ----------------------------
 *             }
 *             => 윈도우 - Button / KeyBorad / Mouse / Menu
 *                웹 - 사용자 요청값 받기
 *                     request
 *                    사용자 요청 처리 결과값 보내기
 *                                ---- 오라클
 *                     response
 *       네트워크/쓰레드
 *        = 내부 클래스 - 서버 제작
 *                     서버 / 클라이언트 통신 담당
 *           class Server
 *           {
 *              접속한 클라이언트 정보 저장 => ip, port
 *                | 공통으로 사용되는 변수/메소드
 *              class Client
 *              {
 *                 통신하는 메소드 => 쓰레드
 *              }
 *           }
 *        *** 마이바티스 / JPA   
 *           익명의 클래스 - 상속 없이 오버라이딩 가능
 *           class A
 *           {
 *              B b=new B(){
 *              public void display()
 *              }
 *           }
 *           class B
 *           {
 *              public void display()
 *              {
 *              }
 *           }
 *       java.lang에서 지원
 *        = 종단 클래스 - 상속이 안되는 클래스
 *           String / System / Scanner...
 *        public final class String
 *               ----
 *        {
 *        }
 *       *** 일반클래스 / 인터페이스
 */
public class 클래스종류_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
