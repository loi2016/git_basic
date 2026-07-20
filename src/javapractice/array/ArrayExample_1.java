package javapractice.array;

import java.util.Arrays;

public class ArrayExample_1 {

	public static void main(String[] args) {

		// =====================
		// 1. 배열 선언 및 할당
		// =====================

		int[] arr1 = new int[2];
		int arr2[] = new int[5]; // 배열의 크기가 5

		System.out.println(arr1.length); // 예상 : 2
		System.out.println(arr2.length); // 예상 : 5

		// =====================
		// 2. 배열 초기화
		// =====================

		arr1[0] = 0;
		arr1[1] = 1;

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i * 2;
		}

		int[] arr3 = {1, 3, 5, 7, 9};
		String[] arr4 = {"모니터", "마우스", "키보드"};

		// =====================
		// 3. 배열 데이터 출력
		// =====================

		System.out.println(arr1); // 예상 : 배열의 원소들 출력, 실제 : 배열의 메모리 주소값 출력

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		// 예상 : arr3 배열의 원소 순차 출력
		System.out.println();

		System.out.println(Arrays.toString(arr4)); // 예상 : arr4 배열의 괄호와 원소를 포함한 형태로 출력

		// =====================
		// 4. Shallow Copy(얕은 복사)
		// =====================

		int[] arr5 = arr3;
		System.out.println(Arrays.toString(arr5));
		// 예상 : arr3과 동일하게 [1, 3, 5, 7, 9] 출력

		arr5[4] = 10;
		System.out.println(Arrays.toString(arr5));
		// 예상 : 4번 원소가 9 -> 10으로 변경
		System.out.println(Arrays.toString(arr3));
		// 예상 : 같은 메모리 영역을 공유하여 arr5의 변경이 동일하게 적용

		// =====================
		// 5. Deep Copy(깊은 복사)
		// =====================

		int[] arr6 = arr3.clone();
		System.out.println(Arrays.toString(arr6));
		// 예상 : arr3과 동일하게 출력

		arr6[3] = 6;
		System.out.println(Arrays.toString(arr6));
		// 예상 : 3번 원소가 7 -> 6으로 변경
		System.out.println(Arrays.toString(arr3));
		// 예상 : 원본 arr3는 변경에 영향받지 않음
	}
}
