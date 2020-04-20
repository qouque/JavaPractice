package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		//서로다른 숫자 1-9
		Scanner sc = new Scanner(System.in);
		
		int rd1 = 0;
		int rd2 = 0;
		int rd3 = 0;
		
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		while(true) {
				rd1 = (int)(Math.random() * 9) + 1;
				rd2 = (int)(Math.random() * 9) + 1;
				rd3 = (int)(Math.random() * 9) + 1;
			if(rd1 != rd2 && rd2 != rd3 && rd1 != rd3){
				break;
			}
		}
		
		
		outer : 
		do{
			int st = 0;
			int ball = 0;
			int out = 0;
			System.out.print("첫번째 숫자를 입력하시오.(1~9) >>");
			s1 = Integer.parseInt(sc.nextLine());
			System.out.print("두번째 숫자를 입력하시오.(1~9) >>");
			s2 = Integer.parseInt(sc.nextLine());
			System.out.print("세번째 숫자를 입력하시오.(1~9) >>");
			s3 = Integer.parseInt(sc.nextLine());
			
			System.out.println("입력한 숫자 >> " + s1 + " " + s2 + " " + s3);
			
			
			if(s1 == rd1){
				st++;
			}else if(s1 == rd2 || s1 == rd3){
				ball++;
			}
			if(s2 == rd2){
				st++;
			}else if(s2 == rd1 || s2 == rd3){
				ball++;
			}if(s3 == rd3){
				st++;
			}else if(s3 == rd1 || s3 == rd2){
				ball++;
			}if(st + ball == 3){
				out = 0;
			}else if(st + ball == 0){
				out = 3;
			}else if(st + ball == 1){
				out = 2;
			}else if(st + ball == 2){
				out = 1;
			}if(s1 == rd1 && s2 == rd2 && s3 == rd3){
				System.out.println("3스트라이크! 성공!");
				break outer;
			}else { 
				System.out.println(st + "S " + ball + "B " + out + "O");
			}
			
									
		}while(true);
	}

}
