package com.abel;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 
 * ��һ�����鵹��  ����[6,5,3,7,1]ת��֮��Ϊ[1,7,3,5,6]
 *
 */
public class A7 {

	public static void reset() {
		int[] arr = {6,5,3,7,1};
		ArrayUtils.reverse(arr);
		for (int a : arr) {
			System.out.println(a);
		}
		System.out.println("---------------");
	}

	public static void reset2() {
		int[] arr = {6,5,3,7,1};
		int a = arr.length;
		int[] arr2 = new int[a];
		for (int i=0;i<a;i++) {
			arr2[a-i-1] = arr[i];
		}
		for (int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("------------------");
	}
	public static void main(String[] args) {
		A7.reset();
		A7.reset2();
	}
}
