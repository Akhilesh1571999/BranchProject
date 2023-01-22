package com.velocity;

import java.util.Arrays;

public class SecLastArray {

	public static void main(String[] args) {
		int arr[] = {1,5,9,8,7,6,4,11,15};
		Arrays.sort(arr);
		int a = arr.length;
		int res = arr[a-2];
		System.out.println(res);

	}

}
