package javapractice.object_class;

public class Object_ClassExample_2 {

	public static void main(String[] args) {

		Object_ClassExample_1 user1 = new Object_ClassExample_1();

		// =====================
		// 6. 접근 제한자 : public
		// =====================

		user1.name = "GilDong";
		System.out.println(user1.name); // 예상 : GilDong

		// =====================
		// 7. 접근 제한자 : default
		// =====================

		user1.age = 40;
		System.out.println(user1.age); // 예상 : 40, 같은 패키지이므로 default 접근 가능

		// =====================
		// 8. 접근 제한자 : private
		// =====================

		// user1.gender = 'M';
		// private 필드에 접근이 불가하여 컴파일 에러가 발생

		// =====================
		// 9. Getter와 Setter를 이용한 접근
		// =====================

		user1.setGender('M');
		System.out.println(user1.getGender()); // 예상 : M
	}
}
