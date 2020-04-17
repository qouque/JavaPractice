import java.util.Scanner;


public class Test1 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		
		int a;
		int b;
		System.out.print("첫번째 숫자를 입력하시오. >");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("두번 째 숫자를 입력하시오, >");
		b = Integer.parseInt(sc.nextLine());
		int sum = a + b;
		
		
		for(int i=0; i <sum; i++){
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
