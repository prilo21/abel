package com.abel;
/**
 * 
 * @author Abel
 *��Ʊϵͳ����ʶ������֤�����֤��ѧ��֤������֤���м���֤�����֤�������֤���жϣ�����ֱ�Ӹ���֤�������жϡ�
 *�������֤�ж����䣬0-10��ѡ�11-20�����ۡ�21-60ȫƱ��60��������
 *ѧ��֤����
 *����֤���
 *�м���֤���
 *��Ʊ�۸�100
 */
public class A5 {
	
	public String getCard(String a){
		if("ѧ��֤".equals(a)){
			return "B";
		}
		if("����֤".equals(a)){
			return "C";
		}
		if("�м���֤".equals(a)){
			return "D";
		}
		if(a.length() == 18){
			//�ַ�����ȡ
			String b = a.substring(6, 10);
			//System.out.println(b);
			//System.out.println("A,"+b);
			return "A,"+b;
		}
		return "E";
		
	}
	
	public int getMoney(String d){
		int money = 100;
		if(d.equals("B")){
			return money/2;
		}
		if(d.equals("C")){
			return 0;
		}
		if(d.equals("D")){
			return 0;
		}
		//�ַ�������
		if(d.contains("A")){
			//���ԡ�,���������ַ���ת��������
			 String[] result1 = d.split(",");
			 String e = result1[1];
			 //��stringת����int
			 int a = Integer.parseInt(e);
			 int f = 2017-a;
			 if(0<f && f<=10){
				 return 0;
			 }
			 if(11<f && 20>=f){
				 return money*3/4;
			 }
			 if(20<f && 60>=f){
				 return money;
			 }
			 if(f>60){
				 return money/2;
			 }
		}
		return 100;
	}
	
	public static void main(String[] args) {
		A5 c = new A5();
		//��������
		System.out.println(c.getMoney(c.getCard("372929199104012769")));
		
	}
}




