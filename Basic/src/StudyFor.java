package com.hujun;

/*
�����ڿ���̨������еġ�ˮ�ɻ�����

������
    ���Ƕ���֪��ʲô��"ˮ�ɻ���"����������ô����?

    ��ν��ˮ�ɻ�����ָһ����λ�������λ���ֵ������͵��ڸ�������
    ������153����һ��ˮ�ɻ�����
    153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

    A:��λ����ʵ�Ǹ��������Ƿ�Χ��
    B:ͨ��forѭ�����ǾͿ���ʵ�ֻ�ȡÿһ����λ��
      �����鷳����λ�ȡ�����λ���ĸ�,ʮ,��λ�ϵ�����

      ������λ�ȡһ�����ݵĸ�,ʮ,����?
        �����и�һ������:153
        ge: 153%10 = 3
        shi: 153/10%10 = 5
        bai��153/10/10%10 = 1
        qian��x/10/10/10%10
        wan:  x/10/10/10/10%10
        ...

    C:��ge*ge*ge+shi*shi*shi+bai*bai*bai�͸����ݱȽ�
      �����ͬ���ͰѸ������ڿ���̨�����
*/  
class ForDemo6 {  
public static void main(String[] args) {  
    //��λ����ʵ�Ǹ��������Ƿ�Χ��  
	
	 System.out.println("in ForDemo6...");
    for(int x=100; x<1000; x++) {  
        int ge = x%10;  
        int shi = x/10%10;  
        int bai = x/10/10%10;  
        
       
        //��ge*ge*ge+shi*shi*shi+bai*bai*bai�͸����ݱȽ�  
        if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)) {  
            //�����ͬ���ͰѸ������ڿ���̨�����  
            System.out.println(x);  
        }  
    }  
}  
}
/*
���н����


����ʾ����������

    ��ϰ��
        ���ڿ���̨�������������������λ��
        ��λ������λ
        ʮλ����ǧλ
        ��λ+ʮλ+ǧλ+��λ=��λ

    ������
        A:��λ���͸��������Ƿ�Χ��
        B:�ֽ�ÿһ����λ���ĸ���ʮ���٣�ǧ����λ�ϵ�����
        C:����Ҫ������жϼ���
*/  
public class StudyFor {  
    public static void main(String[] args) {  
        //��λ���͸��������Ƿ�Χ��  
    	
    	System.out.println("in StudyFor");
        for(int x=10000; x<100000; x++) {  
            //�ֽ�ÿһ����λ���ĸ���ʮ���٣�ǧ����λ�ϵ�����  
            int ge = x%10;  
            int shi = x/10%10;  
            int bai  = x/10/10%10;  
            int qian = x/10/10/10%10;  
            int wan = x/10/10/10/10%10;  
            
            
            //����Ҫ������жϼ���  
            if((ge==wan) && (shi==qian) && (ge+shi+qian+wan==bai)) {  
                System.out.println(x);  
            }  
        }  
    }  
}


/*
��ϰ����whileѭ��ʵ��
��ߣ����1-100֮��
�ұߣ�ͳ��ˮ�ɻ����ж��ٸ�

��ʼ�����;
while(�ж��������) {
     ѭ�������;
     �����������;
}



for(��ʼ�����;�ж��������;�����������) {
    ѭ�������;
}

*/  


class WhileDemo2 {  
	public static void main(String[] args) {  
	    //���1-100֮��  
	    //for���汾  
	    int sum = 0;  
	
	    for(int x=1; x<=100; x++) {  
	        sum+=x;  
	    }  
	
	    System.out.println("sum:"+sum);  
	    System.out.println("--------");  
	    //while���汾  
	    int sum2 = 0;  
	
	    int y=1;  
	    while(y<=100) {  
	        sum2+=y;  
	        y++;  
	    }  
	
	    System.out.println("sum2:"+sum2);  
	    System.out.println("--------");  
	}  
}



/*
 * ��ѭ��
 * while(true){...}
   for(;;){...}
 * 
 */


