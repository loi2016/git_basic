package javapractice.array;

import java.util.Arrays;

public class ArrayExample_2 {

	public static void main(String[] args) {

		// =====================
		// 1. 2차원 배열 선언
		// =====================

		int[][] arr1;
		int arr2[][];

		// =====================
		// 2. 2차원 배열 할당
		// =====================

		int[][] arr3 = new int[2][2];
		int arr4[][] = new int[3][2];

		// =====================
		// 3. 2차원 배열 초기화
		// =====================

		arr3[0][0] = 1;
		arr3[0][1] = 3;
		arr3[1][0] = 5;
		arr3[1][1] = 7;

		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				arr4[i][j] = i + j;
			}
		}

		int[][] arr5 = {{2, 3}, {5, 7, 11}};

		// =====================
		// 4. 2차원 배열 출력
		// =====================

		System.out.println(Arrays.toString(arr3));
		// 예상 : 2차원 배열의 원소가 순차 출력, 실제 : 2차원 배열에 포함된 1차원 배열의 주소 값 출력

		System.out.println(Arrays.deepToString(arr4));
		// 예상 : 2차원 배열의 원소가 일반적인 형식으로 출력

		for (int i = 0; i < arr5.length; i++) {
			int[] inArr = arr5[i];
			for (int j = 0; j < inArr.length; j++) {
				System.out.print(inArr[j] + " ");
			}
			System.out.println();
		}
		// 예상 : 2차원 배열의 원소가 행 마다 층층이 출력
	}
}
