import java.util.Arrays;
import java.util.Scanner;

public class RottoGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[8];
		int rotto[] = new int[8];
		int outo[] = new int[8];
		int choice = 0;
		int sum = 0;
		int chage = 0;

		for (int i = 0; i < rotto.length; i++) {
			rotto[i] = (int) (Math.random() * 99) + 1;
		}

		
		choice: do {
			System.out.print("1.자동, 2.수동 >> ");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				for (int i = 0; i < outo.length; i++) {
					outo[i] = (int) (Math.random() * 99) + 1;
				}
				System.out.println("자동으로 나온 로또번호 : " + Arrays.toString(outo));
				for (int i = 0; i < outo.length; i++) {
					for (int j = 0; j < rotto.length; j++) {
						if (outo[i] == rotto[j]) {
							chage++;
						}
					}
				}
				break choice;
			case 2:
				System.out.print("숫자 8개를 입력하세요 ");
				for (int i = 0; i < a.length; i++) {
					System.out.print(">> ");
					a[i] = Integer.parseInt(sc.nextLine());
				}
				System.out.println("입력하신 로또 번호 : " + Arrays.toString(a));
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < rotto.length; j++) {
						if (a[i] == rotto[j]) {
							chage++;
						}
					}
				}
				break choice;

			default:
				System.out.println("잘못 입력하셧습니다. 1과 2둘중 하나를 적어주세요");
				continue choice;
			}
		} while (true);
		
		System.out.println("맞은 숫자 갯수  : " + chage);
		
		switch (chage) {
		case 8:
			System.out.println("로또번호 : " + Arrays.toString(rotto));
			System.out.println("축하합니다 1등입니다!!");
			break;
		case 7:
			System.out.println("로또번호 : " + Arrays.toString(rotto));
			System.out.println("축하합니다 2등입니다!!");
			break;
		case 6:
			System.out.println("로또번호 : " + Arrays.toString(rotto));
			System.out.println("축하합니다 3등입니다!!");
			break;
		case 5:
			System.out.println("로또번호 : " + Arrays.toString(rotto));
			System.out.println("축하합니다 4등입니다!!");
			break;
		case 4:
			System.out.println("로또번호 : " + Arrays.toString(rotto));
			System.out.println("축하합니다 5등입니다!!");
			break;
		case 3:
			System.out.println("로또번호 : " + Arrays.toString(rotto));
			System.out.println("축하합니다 6등입니다!!");
			break;
		case 2:
			System.out.println("로또번호 : " + Arrays.toString(rotto));
			System.out.println("축하합니다 7등입니다!!");
			break;
		case 1:
			System.out.println("로또번호 : " + Arrays.toString(rotto));
			System.out.println("축하합니다 8등입니다!!");
			break;
		default:
			System.out.println("로또번호 : " + Arrays.toString(rotto));
			System.out.println("꽝입니다 ㅜㅜ");
		}
	}
}
