package javapractice.polymorphism;

public class PolymorphismExample {

	public static void main(String[] args) {
		// =====================
		// 1. Up Casting
		// =====================
		Animal animal1 = new Cat();

		animal1.speak(); // 예상 : Animal Sound
		// animal1.meow(); // 컴파일 에러 : 참조 변수 타입인 Animal에 선언된 것만 접근 가능

		// =====================
		// 2. Down Casting
		// =====================
		Animal animal2 = new Cat();

		Cat cat = (Cat) animal2;
		cat.speak(); // 예상 : Animal Sound
		cat.meow(); // 예상 : Meow, 자식 필드 및 메서드 호출 가능

		// =====================
		// 3. Safe Casting
		// =====================
		Animal animal3 = new Cat();

		if (animal3 instanceof Cat) {
			Cat cat2 = (Cat) animal3;
			cat2.meow(); // 예상 : Meow
		}

		if (animal3 instanceof Cat cat3) {
			cat3.meow(); // 예상 : Meow
		}

		// =====================
		// 4. Dynamic Binding
		// =====================
		Animal animal4 = new Cat();
		Animal animal5 = new Dog();

		animal4.speak(); // 예상 : 오버라이드 메서드가 실행되어 Cat Sound
		animal5.speak(); // 예상 : 오버라이드 메서드가 실행되어 Dog Sound

		// =====================
		// 5. Polymorphic Array
		// =====================
		Animal[] animals = {
			new Cat(),
			new Dog()
		};

		for (Animal animal : animals) {
			animal.speak();
		} // 예상 : Cat Sound, Dog Sound
	}

}
