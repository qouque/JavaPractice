import java.util.Scanner;


public class Test2 {

	public static void main(String[] args) {
		
		int a = 0;
		int r = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 똑같은 숫자가 될때까지 입력 하시오(최대 100)");
		do{
			r = (int)(Math.random()*101);
			System.out.print(">>");
			a = Integer.parseInt(sc.nextLine());
			if(a >100) {
				System.out.println("100이하의 수를 입력하세요.");
			}
			else if(a != r){
				System.out.println("나 : " + a + ", 컴퓨터 : " + r);
				System.out.println("땡!!");
			}
			else {
				System.out.println("나 : " + a + ", 컴퓨터 : " + r);
				System.out.println("축하합니다!!!");
			}
		}while(a != r);
		System.out.println();
	}

}
