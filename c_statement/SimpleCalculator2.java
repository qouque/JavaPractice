package c_statement;

import java.util.Scanner;

public class SimpleCalculator2 {

	public static void main(String[] args) {
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
		
		switch(st){
		case "+" :
			System.out.println(a + " + " + b +" = " + (a+b));
			break;
		case "-" :
			System.out.println(a + " - " + b +" = " + (a-b));
			break;
		case "/" :
			System.out.println(a + " / " + b +" = " + (a/b));
			break;
		case "%" :
			System.out.println(a + " % " + b +" = " + (a%b));
			break;
		case "*" :
			System.out.println(a + " * " + b +" = " + (a*b));
			break;
		default :
			System.out.println("올바른 연산자를 입력하시오.");
		}

	}

}
