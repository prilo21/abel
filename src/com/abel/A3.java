package com.abel;

import java.util.Random;

/**
 * ����һ��int�͵�һά���飬����10��Ԫ�أ�
 * �ֱ�һЩ���������Ȼ���������Ԫ�ص����ֵ����Сֵ��ƽ��ֵ����ֵ��
 * �����������
 * @author yuandian
 *
 */
public class A3 {
	public static void main(String[] args) {
		int [] arr = new int[5];
		/*arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;*/
		Random rand = new Random();
		for (int i = 0; i<=4; i++) {
			arr[i] = rand.nextInt(100);
			System.out.println(arr[i]);
		}
		
		int max = 0;
		for(int i=0;i<=4;i++){
			if(max<arr[i]){
				max = arr[i];	
			}
		}
		System.out.println("���ֵ��" + max);
		
		int min =100;
		for(int i=0;i<=4;i++){
			if(min>arr[i]){
				min = arr[i];
			}
			
		}
		System.out.println("��Сֵ��" + min);
		
		int num = 0;
		for(int i=0;i<=4;i++){
			num = num + arr[i];
		}
		System.out.println("�ͣ�" + num);
		
		System.out.println(num/arr.length);
	}
}
