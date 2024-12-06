/*
 * 
 *  HTML / CSS / JavaScript > 프로젝트
 *  자바(서버 연결) / 자바스크립트(브라우저)
 *  데이터 저장 - 변수 > 데이터형
 *                    | 정수 - byte/int/long
 *                    | 실수 - double
 *                    | 논리 - boolean
 *                    | 문자 - char
 *                    | 문자열 - String
 *  데이터 가공 - 연산자 / 제어문
 *    1) 연산자
 *        > 단항연산자
 *             증감연산자( ++ , -- ) - 한개 증가, 한개 감소
 *             부정연산자( ! ) - 예약일이 아닌 경우
 *             *** 형변환연산자 - 클래스형변환
 *                            --------
 *                             > 상속/포함/라이브러리
 *              UpCasting - 자동형변환 
 *                 long a=10;
 *                   int > 10L
 *              DownCasting - 강제형변환 
 *                 int a=10.5
 *                   double 10.5 > (int)10.5
 *              char 연산이 된 경우는 자동으로 int 변환
 *              
 *        > 이항연산자
 *             산술연산자 ( + , - , * , / )
 *              산술 규칙
 *               1) 자동으로 같은 데이터형 형변환 후 처리
 *               2) int 이하(char,short,byte)는 자동으로 int 결과값
 *                       int + long = long
 *                       char + char = int
 *                       byte + byte = int
 *                       
 *               + : 산술(더하기)
 *                    문자열 결합용으로 사용
 *                    7+7"7"7+7
 *                    14+"7"
 *                    "147"+7 > "1477"+7 = "14777"
 *               / : 나누기
 *                    정수/정수=정수
 *                    0으로 나눌 수 없음
 *               % : 실제 결과값은 좌측 부호를 따라간다.
 *                    
 *              비교연산자 ( == , != , < , > , <= , >= )
 *                       --------
 *                       JS : === , !==
 *                       오라클 : = , <>
 *                       JSP : eq , ne(EL)
 *              논리연산자 ( && , || ) 다중조건
 *              ----------------------- if 조건문
 *              대입연산자 ( = , += , -= )
 *                           --------- 증가, 감소
 *                           여러개 증가, 감소
 *                           a+=10 > a에 10을 더한 값을 저장
 *                           ----- a=a+10
 *                         
 *        > 삼항연산자 > 웹(JSP > HTML+Java)
 *                    | HTML / 자바 > 분리 > MVC
 *             조건 ? 값1 : 값2
 *             --
 *             true = 값1
 *             false = 값2
 *              > 이전페이지/다음페이지
 *                --------------
 *             웹 사이트의 핵심 - 사용자의 편리성
 *                           -----------
 *                           1. 화면 UI > 이미지 12~15
 *                                       게시물 15~20     
 *                                       
 *    2) 제어문
 *        1. 조건문
 *            단일조건문
 *                       | 부정연산자 / 논리연산자 / 비교연산자
 *              형식) if(조건문)
 *                   {
 *                       조건 true 처리문장
 *                   }
 *               > 독립문장 > 속도가 느릴 수 있다
 *            선택조건문 - 조건 true / false 나눠서 처리
 *                      웹에서 가장 많이 사용되는 문장
 *                       > 웹은 결과값을 무조건 전송 해야하기 때문에
 *                         로그인 > 성공/실패
 *              형식) if(조건문)
 *                   {
 *                       조건 true 처리문장 > 로그인 성공 > 브라우저 전송 > Main 페이지
 *                   }
 *                   else
 *                   {
 *                       조건 false 처리문장 > 로그인 실패 > 다시 로그인, 회원가입
 *                   }
 *             *** 자바에 사용자 요청 처리
 *                      ------------ 메소드
 *                    처리결과를 브라우저 전송 > 러턴형은 항상 존재
 *        2. 반복문
 *            for - 반복 횟수 지정
 *                             | false 종료
 *              형식) for(초기값;조건식;증가식)
 *                   {
 *                       반복 수행 문장
 *                   }
 *            for-each - 화면 출력
 *              형식) for(데이터형 변수:배열(컬렉션))
 *                                 -- 데이터 여러개가 저장
 *                       > 저장된 데이터를 한개씩 읽어오기
 *            일차 for / 이차 for
 *              형식) for(초기값;조건식;증가식)
 *                   {
 *                       for(초기값;조건식;증가식)
 *                       {
 *                       
 *                       }
 *                   }
 *            while - 무한루프, 반복 횟수 미지정
 *              형식) 초기값
 *                   while(조건식)
 *                   {
 *                       반복문장
 *                       증가식
 *                   }
 *        3. 반복제어문
 *            break - 반복문 종료
 *                    프로그램 종료 > System.exit(0)
 *                                   | 0 정상 종료
 *                                   | 0이 아닌 경우 비정상 종료
 *                    System.out.println() 정상 출력
 *                    System.err.println() 에러 출력(붉은색)
 *   
 *  배열 - 데이터를 묶어서 사용
 *  문자열 - 문자를 여러개 사용하는 부분
 *  메소드 - 관련된 명령문을 묶어서 사용
 *  --------------------------- + 클래스 > 패키지 > 라이브러리
 *  
 *  변수 명이 여러개 있을 경우 > 제어문 사용이 어려움
 *                        반복문 사용
 *  1. 배열 - 관련된 데이터를 묶어서 사용
 *           한개 이름으로 여러개 제어
 *           변수
 *           클래스 여러개(한개 이름으로 제어 > 인터페이스)
 *                                      | 7장
 *    배열(일차배열)
 *      선언
 *       데이터형[] 배열명; > 권장
 *       데이터형 배열명[]; > C언어 호환
 *         예) 무한정 설정 가능
 *           문자열 배열
 *           String[] arr;
 *           정수 배열
 *           int[] arr;
 *      초기값 설정
 *       명시적 초기화
 *        int[] arr={1,2,3,4,5}
 *       기본값 초기화
 *        int[] arr=new int[5]; > 0 값으로 초기화
 *                  ---
 *                  Stirng(null)
 *                  int(0)
 *                  double(0.0)
 *                  boolean(false)
 *       선언 후 추가
 *        int[] arr;
 *        arr=new int[]{1,2,3,4,5}
 *        ** 연속적으로 메모리 저장
 *           ---------------
 *             | 메모리 크기 동일 > 같은 데이터형만 모은 후 관리
 *        ** 설정 후 변경 불가능(고정적)
 *            > 가변형 배열 > 클래스형(Collection)
 *              ArrayList / Map / Set
 *        ** int[] arr=new int[5];
 *                          인덱스/첨자/데이터 구분자
 *                          arr[0] arr[1]...
 *        ---arr---    -----------------
 *          0x100      0 | 0 | 0 | 0 | 0 
 *        ---------   |-----------------
 *                   0x100
 *        ** 인덱스 0부터 순차적 > 반복문 용이
 *         arr[0] > 일반변수와 동일
 *          > 값 변경 / 값 읽기
 *          > 갯수 : 배열명.length
 *          > 배열의 크기를 벗어나면 오류 발생
 *          for(;i<배열명.length)
 *      데이터 수정/데이터 출력
 *        1) 값 변경 / 초기값
 *          일반 for 사용
 *           > 인덱스를 이용
 *        2) 값 읽기
 *          for-each 주로 사용 
 *           > 실제 배열에 저장된 값을 이용
 *           
 *  메소드 - 한개의 기능을 만들어 재사용
 *   1. 종류
 *     사용자 정의
 *      1) 특정 작업을 진행하기 위한 명령문의 집합
 *                            ----
 *                             > ; (int a=10;)
 *           | 기능처리
 *           | 한가지 기능만 처리(권장)
 *           | 재사용, 유지보수(수정 가능) > 오버라이딩
 *                                    오버로딩(기능 추가)
 *        ** 형상관리 : GIT(공통 프로젝트)
 *            > 협업(면접 필수사항)
 *      2) 메소드 사용 목적
 *        반복되는 기능을 제거
 *        코드 관리를 쉽게 하기위해 > 기능별로 나누어 관리
 *        소스를 간결하게 제작
 *        다른 클래스와의 연결
 *        재사용률 향상
 *      3) 메소드의 종류
 *        ** 공통 메소드 - 자동으로 메모리에 저장
 *        static
 *        인스턴스 메소드 - 메모리마다 따로 저장하는 과정
 *        new
 *        추상 메소드 - 선언 > 필요 상황마다 구현
 *                   셜계단계에서 주로 이용
 *      4) 메소드 생성 방법
 *        리턴형 - 사용자 요청 시 처리된 결과값
 *               결과값이 있는 경우
 *                | 기본형, 배열, 클래스
 *               결과값이 없는 경우 > 메소드 자체 처리
 *                | void
 *          ** 결과값은 무조건 한개만 사용 가능
 *            int 메소드명()
 *            --- 기본형
 *            int[] 메소드명()
 *            ----- 배열
 *            String 메소드명
 *            ------ 클래스
 *            void 메소드명()
 *            ---- 결과값이 없는 경우
 *            void System.out.println()
 *        메소드명 - 변수 식별자
 *                 알파벳, 한글 시작
 *                 알파벳은 대소문자 구분
 *                 숫자 사용가능 > 앞에서 사용금지
 *                 공백 사용 불가능
 *                 특수문자(% , _)
 *                 *** 소문자로 시작
 *                 *** 구분자 > 메소드명은 중복이 없게 약간의 의미만 부여
 *                 *** 7~15
 *        매개변수 - 여러개 사용 가능(없는 경우 존재)
 *                               | Math.random(), trim()
 *                  > 가급적 3개 이상이면 클래스/배열 사용
 *                    사용자 요청에서 보내주는 값
 *                     로그인
 *                     로그인(String id, String pwd)
 *                     회원가입(아이디, 비밀번호, 이름, 이메일, 성별, 생년월일, 주소, 전화번호..)
 *                     회원가입(Member m)
 *                     변수 > 읽기/쓰기 setXxx()
 *                           getXxx()
 *                      class Member
 *                      {
 *                          String 아이디, 비밀번호, 이름, 이메일, 성별, 생년월일, 주소, 전화번호..
 *                          int age
 *                      }
 *        
 *        [접근지정어][옵션]리턴형 메소드명(메개변수)
 *        {
 *        }
 *      5) return 사용법
 *         ------ 메소드 종료
 *         리턴형이 존재하는 경우 반드시 return 값;
 *         리턴형이 없는 경우 return 생략 가능
 *          > 자동 컴파일러에 의해 자동 추가      
 *         *** 반드시 리턴을 사용
 *         *** return 문은 항상 마지막 코딩 X
 *          > 중간에 return 처리 가능
 *            조건마다 return 사용도 가능
 *           예)
 *              void login()
 *              {
 *                  if(로그인이 안된 경우)
 *                     return
 *                  else
 *                     return
 *              }
 *      6) 메소드
 *        1. 동작과정(행위)
 *        2. 화면 출력 내용 - 리턴형
 *        3. 사용자에게 유도 - 매개변수
 *      7) 메소드 유형  
 *         ------------------------------------
 *                 리턴형        매개변수
 *         ------------------------------------
 *                   O           O
 *         ------------------------------------
 *                   O           X 
 *         ------------------------------------
 *                   X           O    
 *                  void > 데이터베이스 - insert/update/delete
 *                          출력 > 규정된 상태 X
 *         ------------------------------------
 *                   X           X
 *                  void
 *         ------------------------------------
 *         로그인 > boolean isLogin(String id, String pwd)
 *         목록 > String[] movieList()
 *         상세 보기 > String movieDetail(int movieNo)
 *          > 리턴형/매개변수가 없는 경우는 빈도수가 매우 낮음
 *     라이브러리 제공(API) > 이후 API 이용
 *      mvnrepository.com
 *    
 *   객체지향 프로그램 - Actor
 *    클래스의 구성요소
 *     변수
 *      변수의 종류
 *     생성자
 *      변수의 초기화 > 초기화 블럭
 *     메소드
 *      메소드 종류
 * 
 */
public class 배열_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
