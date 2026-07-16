package javapractice.operator;

public class OperatorExample {

	public static void main(String[] args) {

		// =====================
		// 1. 단항 연산자
		// =====================

		boolean isTrue = true;
		System.out.println(!isTrue); // 예상 : false

		int a1 = 5;
		int b1 = ++a1;
		System.out.println(a1 + ", " + b1); // 예상 : 6, 6 | a1에 1이 더해진 후 b1 값 결정

		int a2 = 5;
		int b2 = a2++;
		System.out.println(a2 + ", " + b2); // 예상 : 6, 5 | b2 값 결정 후 a2에 1을 더함

		// =====================
		// 2. 비교 연산자
		// =====================

		int a3 = 5;
		int b3 = 5;
		System.out.println(a3 == b3); // 예상 : true
		System.out.println(a3 < b3); // 예상 : false

		// =====================
		// 3. 논리 연산자
		// =====================

		int a4 = 7;
		int b4 = 7;
		int c4 = 10;
		System.out.println(a4 == b4 && a4 == c4); // 예상 : false, 둘 중 하나만 만족
		System.out.println(a4 == b4 || a4 == c4); // 예상 : true

		// =====================
		// 4. 복합 대입 연산자
		// =====================

		int a5 = 20;
		a5 += 3;
		System.out.println(a5); // 예상 : 23

		a5 *= 2;
		System.out.println(a5); // 예상 : 46

		a5 %= 10;
		System.out.println(a5); // 예상 : 6

		// =====================
		// 5. 삼항 연산자
		// =====================

		int a6 = 20;
		int b6 = 15;

		int result1 = a6 > b6 ? a6-- : b6++;
		System.out.println(a6 + ", " + b6); // 예상 : 19, 15 (a6 > b6이 true 이므로 a6-- 실행)

		// =====================
		// 6. instanceof 연산자
		// =====================

		String str1 = "Welcome";
		System.out.println(str1 instanceof String); // 예상 : true
	}
}
