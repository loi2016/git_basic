package javapractice.object_class;

import java.util.UUID;

public class Object_ClassExample_1 {

	// =====================
	// 1. 필드 선언
	// =====================

	public String name;
	public final UUID USER_ID = UUID.randomUUID(); // 상수 : 변경 불가

	// =====================
	// 2. 접근 제한자
	// =====================

	int age; // default
	private char gender;

	// =====================
	// 3. 생성자
	// =====================

	public Object_ClassExample_1() {} // 기본 생성자

	// =====================
	// 4. Getter & Setter
	// =====================

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public static void main(String[] args) {

		// =====================
		// 5. 객체 생성(할당)
		// =====================

		Object_ClassExample_1 user1 = new Object_ClassExample_1();
		user1.name = "GilDong";

		System.out.println(user1.name); // 예상 : GilDong, public 이므로 접근 가능
		System.out.println(user1.USER_ID); // 예상 : 랜덤으로 부여된 UUID 기반 ID 출력, 실행할 때 마다 바뀜

		user1.setAge(25);
		user1.setGender('M');

		System.out.println(user1.age); // 예상 : 25, default 이지만 동일 패키지(클래스)이므로 접근 가능
		System.out.println(user1.gender); // 예상 : M, private 이지만 동일 클래스이므로 접근 가능

		user1.getAge(); // 예상 : 25, 실제 : 값을 반환하지만 사용하지 않아 콘솔 출력 없음
		user1.getGender(); // 예상 : M, 실제 : 값을 반환하지만 사용하지 않아 콘솔 출력 없음

		System.out.println(user1.getName() + "님의 나이는 " + user1.getAge() + "살 입니다.");
		// 예상 : GilDong님의 나이는 25살 입니다.
		System.out.println(user1.getName() + "님의 성별은 " + user1.getGender() + " 입니다.");
		// 예상 : GilDong님의 성별은 M입니다.
	}
}
