package c_statement;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산 결과를 알려주는 프로그램을 만들어주세요.
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		String st = null;
		System.out.print("첫번째 숫자를 입력하시요 >>");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자를 입력하시요 >>");
		b = Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력하시요 >>");
		st = sc.nextLine();
		
		if("+".equals(st)){
			System.out.println(a + " + "+ b +" = " + (a+b));
		}
		else if("-".equals(st)){
			System.out.println(a + " - " + b +" = " + (a-b));
		}
		else if("/".equals(st)){
			System.out.println(a + " / " + b +" = " + (a/b));
		}
		else if("%".equals(st)){
			System.out.println(a + " % " + b +" = " + (a%b));
		}
		else if("*".equals(st)){
			System.out.println(a + " * " + b +" = " + (a*b));
		}
		else {
			System.out.println("올바른 연산자를 입력하시오.");
		}
	}

}
