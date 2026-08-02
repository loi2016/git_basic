package javapractice.polymorphism;

public class Cat extends Animal {

	void meow() {
		System.out.println("Meow");
	}

	@Override
	public void speak() {
		System.out.println("Cat Sound");
	}
}
