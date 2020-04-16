package b_operater;

public class ComparingOperater {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - <. >, <=, >=, == ,!=
		 * - 문자열 비교 : equals()
		 */
		
		boolean b = 10 < 20; //비교연산자의 연산결과는 boolean 이다.
		System.out.println(b);
		b = 10 <= 20 - 15; //산술연산 후 비교연산을 수행한다
		System.out.println(b);
		
		b = "abc" == "abc";
		System.out.println(b);
		b = "abc" == new String("abc");
		System.out.println(b);
		b = "abc".equals(new String("abc"));
		System.out.println(b);
		b = !"abc".equals("ABC"); //같지 않다의 결과를 얻가 위해서는 !(NOT)을 앞에 붙여준다.
		System.out.println(b);
		
		System.out.println("------");
		//int타입의 x와 y 변수를 만들고, 다음의 문장들을 코드로 작성해주세요.
		int x = 10;
		int y = 7;
		//1. x가  y보다 크다.
		boolean bo = x > y;
		System.out.println(bo);		
		//2. x는 y보다 작거나 같다.
		bo = x <= y;
		System.out.println(bo);
		//3. x+5와 y는 같다.
		bo = x + 5 == y;
		System.out.println(bo);
		//4. x 는 3의 배수이다.
		bo = x%3 == 0; //배수확인
		System.out.println(bo);
		//5. y는 홀수이다.
		bo =  y%2 ==1;//짝수 홀수
		System.out.println(bo);
		//6. x와 3y는 다르다.
		bo = x != y;
		System.out.println(bo);
		//7. "변수"와 "데이터"는 같다.
		bo = "변수".equals("데이터");
		System.out.println(bo);
		//8. "기본형"과 "참조형" 은 다르다.
		bo = !"기본형".equals("참조형");
		System.out.println(bo);
		
		
	}

}








