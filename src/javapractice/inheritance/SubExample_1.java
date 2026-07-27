package javapractice.inheritance;

// =====================
// 1. 상속 문법
// =====================
public class SubExample_1 extends SuperExample_1 { // 클래스 간 상속은 extends, 단일 상속만 가능

	int exampleField = 200;

	// =====================
	// 2. 오버라이딩
	// =====================
	@Override
	public void testMessage() {
		System.out.println("자식 메서드");
	}

	// @Override
	// public final void finalExample() {}
	// final 메서드는 오버라이딩 불가

	// =====================
	// 3. 생성자 오버로딩
	// =====================
	public SubExample_1() {
		super(); // 생략해도 자동 생성
		System.out.println("자식 생성자");
	}
	public SubExample_1(int a) {
		this.exampleField = a;
	}

	// =====================
	// 4. 메서드 오버로딩
	// =====================
	public void mul(int a, int b) {
		System.out.println(a * b);
	}
	public double mul(double a, double b) {
		return a * b;
	}


	// =====================
	// 5. super와 this 및 생략
	// =====================
	void superAndChild() {
		System.out.println("super.exampleField : " + super.exampleField);
		System.out.println("this.exampleField : " + this.exampleField);
		System.out.println("exampleField : " + exampleField); // this 생략 : 자식

		super.testMessage();
		this.testMessage();
		testMessage(); // this 생략 : 자식
	}

	public static void main(String[] args) {
		SubExample_1 obj1 = new SubExample_1();

		obj1.superAndChild();
		// 예상 : 부모 생성자/자식 생성자, 100/200/200, 부모 메서드/자식 메서드/자식 메서드

		SubExample_1 obj2 = new SubExample_1(33);
		obj2.superAndChild();
		// 예상 : 부모 생성자/자식 생성자, 100/33/33, 부모 메서드/자식 메서드/자식 메서드

		obj1.mul(3, 5); // 예상 : int가 파라미터인 mul() 메서드를 사용해 15 출력
		obj1.mul(2.5, 11.6); // 예상 : double이 파라미터인 mul() 메서드를 사용해 출력 X
	}
}
