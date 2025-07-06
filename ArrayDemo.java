package omi;

import java.util.Arrays;

public class ArrayDemo {

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

	public static void main(String[] args) {

//		int[] arr = { 10, 10, 10, 20, 30, 40, 40, 40, 40, 50, 50, 50, 60, 60, 60 };
//		int[] arr1 = new int[arr.length];
//		display(arr);
		System.out.println();
		System.out.println("******************************************************");
		System.out.println("Zero shift right side");
		// Zero shift right side
//	int count = 0;
//	for (int num : arr) {
//		if (num != 0) {
//			arr1[count++] = num;
//			
//		}
//	}
//	display(arr1);

		System.out.println();
		System.out.println("******************************************************");
		System.out.println("Zero shift Left side");
//Zero shift Left side 
//int count1 = arr.length - 1;
//for (int num1 : arr) {
//	if (num1 != 0) {
//		arr1[count1] = num1;
//		count1--;
//	}
//}
//display(arr1);
		System.out.println();
		System.out.println("******************************************************");
		System.out.println("Reverse Array");
		// Reverse//

//		int start = 0;
//		int end = arr.length - 1;
//		for (int i = 0; i < end; i++) {
//
//			int j = arr[start];
//			arr[start] = arr[end];
//			arr[end] = j;
//			start++;
//			end--;
//		}
//
//		display(arr);
		System.out.println();
		System.out.println("******************************************************");
		System.out.println("left side rotetion");
		// left side //

//		int n1 = 1;
//		for (int j = 0; j < n1; j++) {
//
//			int i, temp;
//			temp = arr[0];
//			for (i = 0; i < arr.length-1; i++) {
//				arr[i] = arr[i + 1];
//			}
//			arr[arr.length-1] = temp;
//		}
//		display(arr);

		System.out.println();
		System.out.println("******************************************************");
		System.out.println("Right side rotetion");

		// Right Side//
//			int n2 = 1;
//			for (int j = 0; j < n2; j++) {

//				int n = arr.length;
//				int i, temp;
//				temp = arr[arr.length - 1];
//				for (i = n - 1; i > 0; i--){
//					arr[i] = arr[i - 1];
//				}
		// arr[0] = temp;
//			}
//			display(arr);

		System.out.println();
		System.out.println("******************************************************");
		System.out.println("Duplicate Element in Array :");

		// Duplicate Element in Array//
//		int index = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					index = index + 1;
//				}
//			}
//			if (index == 1) {
//				System.out.print(arr[i] + ",");
//			}
//			index = 0;
//		}
		// display(arr);
//		System.out.println();
//		System.out.println("******************************************************");
//		System.out.println("Duplicate Element Remove Given Array");
//		Arrays.sort(arr);
//		int rd = 0;
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[rd] != arr[i]) {
//				rd++;
//				arr[rd] = arr[i];
//			}
//		}
//		arr[++rd] = arr.length - 1;
//		System.out.println("Duplicate Element Remove ");
//		for (int i = 0; i < rd; i++) {
//			System.out.print("" + arr[i] + ",");
//		}
		System.out.println();
		System.out.println("******************************************************");
		System.out.println("0S,1S,2S...Sort Element in Array :");

//		int length = arr.length - 1;
//		int i = 0;
//		int j = 0;
//		int temp = 0;
//		while (i <= length) {
//			if (arr[i] == 0) {
//				temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
//				i++;
//				j++;
//			} else if (arr[i] == 1) {
//				i++;
//			} else if (arr[i] == 2) {
//				temp = arr[i];
//				arr[i] = arr[length];
//				arr[length] = temp;
//				length--;
//			}
//		}
//		display(arr);

		System.out.println();
		System.out.println("******************************************************");
		System.out.println("2nd Max Numbers");
//		int t = 0;
//		Arrays.sort(arr);
//		for (int j2 = 0; j2 < arr.length - 1; j2++) {
//			if (arr[j2] != arr[j2 + 1]) {
//				arr[t++] = arr[j2];
//				// t++;
//			}
//		}
//		arr[t] = arr[arr.length - 1];
//		System.out.print(arr[t - 1]);

		System.out.println();
		System.out.println("******************************************************");
		System.out.println("frequency of each element in the array");
      
		String ab="Testing Shastra";  
		String a=ab.toLowerCase();
        char[] arr=a.toCharArray();
		int[] fr = new int[arr.length];
		int visit = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					// To avoid counting same element again
					fr[j] = visit;
				}
			}
			if (fr[i] != visit)
				fr[i] = count;
		}
		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
	          if (fr[i] != visit) {
				System.out.println("    " + arr[i] + "    |    " + fr[i]);
}
		}
		System.out.println();
		System.out.println("******************************************************");
	}
}
