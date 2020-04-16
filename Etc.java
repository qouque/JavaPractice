package b_operater;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트 연산자
		 * - |, %, ^, ~, << , >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * - .(참조연산자) 	 : 특정 범위 내에 속해 있는 멤버를 지정할 때 사용한다.
		 * - (type)		 : 형변환(casting)
		 * - ?:(삼향연산자) : 조건식 ? 조건식의 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 */
		//1byte : 010101
		
		int x = 10;
		int y = 20;
		int result = (x < y)?x:y;
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNO = 2;
		String gender = regNO == 1 ? "남자":"여자";
		System.out.println("당신의 성별은 " + gender+ " 입니다.");
		
		gender = regNO == 1?"남자":(regNO == 2 ? "여자":"확인불가"); //괄호는 있어도되고 없어도 됨.
		System.out.println("당신의 성별은 " + gender+ " 입니다.");
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		/*System.out.print("숫자를 입력하시오. >>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("숫자를 입력하시오. >>");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println(a > b ? a:b);
		*/
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 5면 여자를 출력해주세요.
		//그외의 숫자를 입력하면 확인 불가를 출력해주세요.
		System.out.print("숫자를 입력하시오. >>");
		int a = Integer.parseInt(sc.nextLine());
		String s;
		s = a ==1||a == 3?"남자":(a == 2|| a == 4?"여자":"확인불가");
		System.out.println("당신의 성별은 " + s + " 입니다.");
		//과제 연습문제 3장 풀기!!!!!
	}

}












