package javapractice.controlstatement;

public class ControlStatementExample {

	public static void main(String[] args) {

		// =====================
		// 1. 조건문
		// =====================

		int a1 = 1;
		int b1 = 2;

		if(a1 > b1){
			System.out.println("a1은 b1보다 크다.");
		} else {
			System.out.println("a1은 b1보다 크지 않다.");
		}
		// 예상 : a1 < b1 이므로 else 구문의 "a1은 b1보다 크지 않다." 문자열 출력

		int score = 83;
		String grade;

		switch(score/10){
			case 10:
				grade = "A+";
				break;
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B+";
				break;
			case 7:
				grade = "B";
				break;
			case 6:
				grade = "C+";
				break;
			case 5:
				grade = "C";
				break;
			case 4:
				grade = "D";
				break;
			default:
				grade = "F";
		}

		System.out.println("성적 등급은 " + grade + "입니다."); // 예상 : case 8을 따라 B+


		// =====================
		// 2. 반복문
		// =====================

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		// 예상 : 1부터 10까지 자연수 출력(i가 11이 되는 순간 조건을 만족하지 않아 중단)
		System.out.println();

		int[] numbers = {1, 2, 3, 4, 5};
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		// 예상 : 1부터 4까지 자연수 출력(전체 순회)

		System.out.println();

		for (int i = 2; i < 4; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		// 예상 : 2단부터 3단까지의 구구단 중 일부 출력

		int a2 = 1;
		while(a2 <= 5) {
			System.out.println(a2 + " 출력 완료");
			a2++;
		}
		// 예상 : 1부터 5까지 출력

		// =====================
		// 3. 분기문
		// =====================

		for (int i = 1;; i++) {
			System.out.println(i + " 출력 완료");
			if (i >= 5) {
				break;
			}
		}
		// 예상 : 1부터 5까지 출력

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i + " 출력 완료");
		}
		// 예상 : 나누어 떨어지는 짝수를 제외하고 1부터 10까지의 홀수 출력
	}
}
