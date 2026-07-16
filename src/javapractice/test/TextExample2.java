package javapractice.test;

public class TextExample2 {

	public static void main(String[] args) {

		// =====================
		// 1. 상수 선언
		// =====================

		final int MAX_SCORE = 100; // PascalCase로 대문자와 언더바(_) 사용
		final String USER_NAME = "GilDong";

		System.out.println(MAX_SCORE); // 예상 : 100
		System.out.println(USER_NAME); // 예상 : GilDong

		// =====================
		// 2. 상수 값 변경 시도
		// =====================

		// int MAX_SCORE = 120; // 컴파일 에러 발생(already defined)

		// =====================
		// 3. String 초기화 및 합성
		// =====================

		String userName1 = "Hong"; // 일반적 선언 방식
		String userName2 = new String("GilDong");
		String userName3 = userName1 + " " + userName2;
		String userName4 = userName1 + " " + 11;
		String userName5 = userName1 + " " + null;

		System.out.println(userName1); // 예상 : Hong
		System.out.println(userName2); // 예상 : GilDong
		System.out.println(userName3); // 예상 : Hong GilDong
		System.out.println(userName4); // 예상 : Hong 11
		System.out.println(userName5); // 예상 : Hong, 실제 : Hong Null(null 문자열 그대로 합성)

		// =====================
		// 4. Var 초기화
		// =====================

		var userName6 = "Hong GilDong";
		var age = 30;

		System.out.println(userName6); // 예상 : Hong GilDong
		System.out.println(age); // 예상 : 30

		// =====================
		// 5. Data Overflow
		// =====================

		byte a = 127;
		byte b = 1;
		byte c = (byte) (a + b);

		System.out.println(c); // 예상 : 128, 실제 : -128(오버플로우 발생)

		// =====================
		// 6. Type Casting
		// =====================

		int num1 = 5;
		double num2 = 2.5;
		double num3 = num1 + num2;

		System.out.println(num3); // 예상 : 7.5

		int num4 = 1557;
		int num5 = (byte) num4;

		System.out.println(num5); // 예상 : 128 미만의 어떤 값, 실제 : 21(명시적 형 변환으로 인한 데이터 손실 발생)


		// =====================
		// 7. 콘솔 출력 방식 조정
		// =====================

		double num6 = 3.1415926535;

		System.out.printf("%.6f%n", num6); // 예상 : 3.141592, 실제 : 3.141593(소숫점 아래 7번째에서 반올림되어 표기)
	}
}
