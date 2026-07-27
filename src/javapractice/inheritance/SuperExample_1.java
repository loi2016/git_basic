package javapractice.inheritance;

public class SuperExample_1 {

	int exampleField = 100;

	SuperExample_1() {
		System.out.println("부모 생성자");
	}

	void testMessage() {
		System.out.println("부모 메서드");
	}

	public final void finalExample() {}
}
