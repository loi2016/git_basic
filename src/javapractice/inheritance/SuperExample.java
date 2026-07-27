package javapractice.inheritance;

public class SuperExample {

	int exampleField = 100;

	SuperExample() {
		System.out.println("부모 생성자");
	}

	void testMessage() {
		System.out.println("부모 메서드");
	}

	public final void finalExample() {}
}
