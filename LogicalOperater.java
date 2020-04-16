package b_operater;

public class LogicalOperater {

	public static void main(String[] args) {
		/*
		 * 논리 연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피연산자로 boolean만 적용한다.
		 */
		
		boolean b;
		
		b = true && true; //true //둘중 하나라도 false면 false
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		
		b = true || true; //true //둘중 하나라도 true면 true
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		int i = 5;
		//0 < i < 10
		b = 0 < i && i < 10;
		System.out.println(b);
		
		b = i > 10 || i % 2 ==0;
		System.out.println(b);
		
		int d = 10;
		b = d < 10 && 0 < d++; //왼쪽의 피연산자에서 결과가 이미 나왔기 때문에  0 < d++은 작동되지않음.
		System.out.println(d); //결과 : 10
		
		b = !b; //b가 true면 false를 false면 true를 저장한다.
		b = !(10 < 20); //괼호를 쳐줘야 문장전체를 부정할 수 있다.
		
	}

}












