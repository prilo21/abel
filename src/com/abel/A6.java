package com.abel;

/**
 * 
 * @author abel
 *���д�����ڣ�һ�����꣬һ��һ����ɴ�
 *����һ��ʮ��   һ����Ϣ�ٷ�֮��  ��������Ϣ�ٷ�֮��  ��������Ϣ�ٷ�֮ʮ��
 *���볬��ʮ����ʮ��  һ����Ϣ�ٷ�֮��   ��������Ϣ�ٷ�֮��    ��������Ϣ�ٷ�֮ʮ��
 *���볬����ʮ��һ����  һ����Ϣ�ٷ�֮��  ��������Ϣ�ٷ�֮ʮ����������Ϣ�ٷ�֮ʮ��
 *���ݴ���Ǯ���ʹ��������������������㵽�ڱ�Ϣһ��ȡ������Ǯ
 */
public class A6 {

	public double getMoney(double money, int year) {
		double  price = 0;
		//д����
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
