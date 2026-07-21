package javapractice.object_array;

import javapractice.object_class.Object_ClassExample_1;

public class Object_ArrayExample {

	public static void main(String[] args) {

		// =====================
		// 1. 객체 배열 선언 및 할당
		// =====================

		Object_ClassExample_1 arr1[]; // 선언
		arr1 = new Object_ClassExample_1[2]; // 할당

		Object_ClassExample_1[] arr2 = new Object_ClassExample_1[2]; // 동시 진행

		// =====================
		// 2. 객체 배열 초기화
		// =====================

		arr2[0] = new Object_ClassExample_1();
		arr2[1] = new Object_ClassExample_1();
		// 특정 인덱스 초기화

		Object_ClassExample_1[] arr3 = {new Object_ClassExample_1(), new Object_ClassExample_1()};
		// 선언, 할당, 초기화를 동시에
	}
}
