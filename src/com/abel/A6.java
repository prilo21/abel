package com.abel;

/**
 * 
 * @author abel
 *银行存款死期，一到三年，一到一百万可存
 *存入一到十万   一年利息百分之二  两年总利息百分之六  三年总利息百分之十二
 *存入超过十万到三十万  一年利息百分之三   两年总利息百分之八    三年总利息百分之十五
 *存入超过三十万到一百万  一年利息百分之四  两年总利息百分之十，三年总利息百分之十八
 *根据存入钱数和存入年数这两个参数计算到期本息一共取出多少钱
 */
public class A6 {

	public double getMoney(double money, int year) {
		double  price = 0;
		//写方法
		if(money>1 && money<=100000){
			if(year==1){
				price  = money*0.02 + money;
			}
			if(year==2){
				price = money*0.06 + money;
			}
			if(year==3){
				price = money*0.12 + money;
			}
		}
		
		if(money>300000 && money<=1000000){
			if(year==1){
				price = money*0.04 +money;
			}
			if(year==2){
				price  = money*0.08 + money;
			}
			if(year==3){
				price  = money*0.15 + money;
			}
		}
		
		if(money>100000 && money<=300000){
			if(year==1){
				price = money*0.03 +money;
			}
			if(year==2){
				price  = money*0.10 + money;
			}
			if(year==3){
				price  = money*0.18 + money;
			}
		}
		System.out.println(price);
		return price;
	}
	
	public static void main(String[] args) {
		A6 a = new A6();
		a.getMoney(100000,2);
	}
}
