package com.abel;
/**
 * 
 * @author abel
 *要求：把类A5的两个方法合成一个，需求跟A5一致
 */
public class A5_1 {

	
	public double getMoney(String a) {
		//写方法
		double price = 100;
		if(a.equals("学生证")){
			price = price*0.5;
		}
		if(a.equals("军官证")){
			price = 0;
		}
		if(a.equals("残疾人证")){
			price = 0;
		}
		if(a.length()==18){
			String b = a.substring(6, 10);
			int c = Integer.parseInt(b);
			int f = 2017- c;
			 if(0<f && f<=10){
				 return 0;
			 }
			 if(11<f && 20>=f){
				 return price*3/4;
			 }
			 if(20<f && 60>=f){
				 return price;
			 }
			 if(f>60){
				 return price/2;
			 }
		}
		return price;
	}
	
	//测试类
	public static void main(String[] args) {
		A5_1  c = new   A5_1();
		System.out.println(c.getMoney("学生证"));
		System.out.println(c.getMoney("372929199104012769"));
	}
}
