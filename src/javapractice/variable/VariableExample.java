package javapractice.variable;

public class VariableExample {

	public static void main(String[] args) {

		// =====================
		// 1. 변수 선언 및 초기화
		// =====================

		int age = 20;
		String name = "GilDong";

		System.out.println(age); // 예상 결과 : 20
		System.out.println(name); // 예상 결과 : GilDong

		// =====================
		// 2. 값 변경
		// =====================

		age = 25;

		System.out.println(age); // 예상 결과 : 25

		// =====================
		// 3. 추가 자료형
		// =====================

		boolean isDeveloper = true;
		double height = 180.3;
		char gender = 'M';

		System.out.println(isDeveloper); // 예상 결과 : true
		System.out.println(height); // 예상 결과 : 180.3
		System.out.println(gender); // 예상 결과 : M

		// =====================
		// 4. 연산
		// =====================
		int a = 3;
		int b = 5;

		int sum = a + b;
		int product = a * b;

		System.out.println(sum); // 예상 결과 : 8
		System.out.println(product); // 예상 결과 : 15
	}
}
