package com.abel;

/*
 * 
 * 
����һ���ٷ��Ƶķ����������Ӧ�ĵȼ�
90������        	   A��         
80~89          B��         
70~79          C��         
60~69          D��         
60������       	   E��
*/
public class A1 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.getPoint(50);
		
	}
	
	public void getPoint(int point) {
		if(point>90){
			System.out.println("A��");
		}else if(point>=80 && point<=89){
			System.out.println("B");
		}else if(point>=70 && point<=79){
			System.out.println("C");
		}else if(point>=60 && point<=69){
			System.out.println("D");
		}else{
			System.out.println("E");
		}
	}
}
