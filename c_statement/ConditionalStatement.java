package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * if문
		 * - if		: 조건식의 결과가 true 이면 블럭안의 문장을 수행한다.
		 * - else if: 다수의 조건이 필요할때 if 뒤에 추가한다
		 * - else	: 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 * 
		 * if(조건식){}
		 * else if(조건식){}
		 * else{}
		 */
		Scanner sc = new Scanner(System.in);
		int a = 10;
		if(a < 100) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
//			System.out.println();//Ctrl + Space
		}
		if(a < 10) {
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		System.out.println("------------------");
		int regNo = 1;
		String gender = null;
		
		if(regNo == 1) {
			gender = "남자";
		}
		else if(regNo == 2)  {
			gender = "여자";
		}
		else if(regNo == 3) {
			gender = "남자";
		}
		else if(regNo ==4) {
			gender = "여자";
		}
		else {
			gender = "확인 불가";
		}
		
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		System.out.println("--------------------");
		
		regNo = 5;
		gender = null;
		if(regNo == 1 || regNo == 3)  // {} 안에 문장이 한문장일 경우 생략 가능!!!!!!!!!
			gender = "남자";
		
		else if(regNo == 2 || regNo == 4) 
			gender = "여자";
		
		else 
			gender = "확인불가";
		
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		//성적에 등급을 부여하는 프로그램
		int score = 88;
		String grade = null;
		
		if(score >= 90)
			grade = "A";
		else if(score >= 80 && score < 90)
			grade = "B";
		else if(score >=70)
			grade = "C";
		else if(score >= 60)
			grade = "D";
		else
			grade = "F";
		
		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		System.out.println("-------------------------------");
		//등급 안에서 +와 -를 나누어보자.
		/*System.out.print("점수를 입력하시오 >>");
		score = Integer.parseInt(sc.nextLine());*/
		score = 99;
		grade = null;
		
		if( 90 <= score){
			grade = "A";			
			if(97<= score){
				grade += "+";
			}
			else if(score <= 93){
				grade += "-";
			}
		}
		else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}
			else if(83 >= score){
				grade += "-";
			}
		}
		else if(70 <= score) {
			grade = "C";
			if(77 <= score){
				grade += "+";
			}
			else if(73 >= score)
				grade += "C";
		}
		else if(60 <= score){
			grade = "D";
			if(67 <= score){
				grade += "+";
			}
			else if(63 >= score){
				grade += "-";
			}
		}
		else{
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		
		/*
		 * switch 문
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 * 
		 * switch(조건식) {
		 * 		case 값 : break;
		 * 		case 값 : break;
		 * }
		 */
		System.out.println("------------------------");
		regNo = 6;
		gender = null;
		
		switch(regNo){
		case 1 : case 3 : 
			gender = "남자";
			break;
		case 2 : case 4 : 
			gender = "여자";
			break;
		/*case 3 : 
			gender = "남자";
			break;
		case 4 :
			gender = "여자";
			break;
		*/
		default : //if문의 else와 같은 역할을 한다.
			gender = "확인불가";	
		}
		
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		System.out.println("----------------------------");
		score = 120;
		grade = null;
		
		if(score <=100 ){
		switch(score/10){
		case 10 : case 9 :
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		case 7 :
			grade = "C";
			break;
		case 6 :
			grade = "D";
			break;
		default :
			grade = "F";
			break;
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		}
		else {
			System.out.println("100이 넘는 숫자입니다.");
		}
		
		//숫자를 입력받아 그 숫자가 0인지 아닌지를 출력해주세요.
		System.out.println("----------------");
		System.out.print("숫자를 입력하세용 >>");
		int in = Integer.parseInt(sc.nextLine());
		String st = null;
		if(in == 0){
			st = "맞습니다.";
		}
		else {
			st = "아닙니다.";
		}
		System.out.println(in + "은 숫자 0이 " + st);
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		System.out.println("----------------");
		System.out.print("숫자를 입력해주세요 >>> ");
		int i = Integer.parseInt(sc.nextLine());
		String s = null;
		
		if(i%2 == 1){
			s = "홀수";
		}
		else {
			s = "짝수";
		}
		System.out.println("입력하신 숫자" + i + "는 " + s + " 입니다");
		
		//정수 3개 입력받아 총점, 평균, 등급을 출력해주세요.
		System.out.println("-------------");
		double avr;
		int sum;
		String t = null;
		System.out.print("국어 점수를 입력하시오 >>>> ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수를 입력하시오 >>>> ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수를 입력하시오 >>>> ");
		int z = Integer.parseInt(sc.nextLine());
		sum = x + y + z;
		avr = sum/3.0;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avr);
		if(avr >= 90){
			t = "A";
		}
		else if(avr >= 80){
			t = "B";
		}
		else if(avr >= 70){
			t = "C";
		}
		else if(avr >= 60){
			t = "D";
		}
		else {
			t = "F";
		}
		System.out.println("등급 : " + t);
		
		
	}

}

















