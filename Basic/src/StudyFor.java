package com.hujun;

/*
需求：在控制台输出所有的”水仙花数”

分析：
    我们都不知道什么叫"水仙花数"，你让我怎么做呢?

    所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
    举例：153就是一个水仙花数。
    153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

    A:三位数其实是告诉了我们范围。
    B:通过for循环我们就可以实现获取每一个三位数
      但是麻烦是如何获取这个三位数的个,十,百位上的数据

      我们如何获取一个数据的个,十,百呢?
        假设有个一个数据:153
        ge: 153%10 = 3
        shi: 153/10%10 = 5
        bai：153/10/10%10 = 1
        qian：x/10/10/10%10
        wan:  x/10/10/10/10%10
        ...

    C:让ge*ge*ge+shi*shi*shi+bai*bai*bai和该数据比较
      如果相同，就把该数据在控制台输出。
*/  
class ForDemo6 {  
public static void main(String[] args) {  
    //三位数其实是告诉了我们范围。  
	
	 System.out.println("in ForDemo6...");
    for(int x=100; x<1000; x++) {  
        int ge = x%10;  
        int shi = x/10%10;  
        int bai = x/10/10%10;  
        
       
        //让ge*ge*ge+shi*shi*shi+bai*bai*bai和该数据比较  
        if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)) {  
            //如果相同，就把该数据在控制台输出。  
            System.out.println(x);  
        }  
    }  
}  
}
/*
运行结果：


代码示例：回文数

    练习：
        请在控制台输出满足如下条件的五位数
        个位等于万位
        十位等于千位
        个位+十位+千位+万位=百位

    分析：
        A:五位数就告诉了我们范围。
        B:分解每一个五位数的个，十，百，千，万位上的数据
        C:按照要求进行判断即可
*/  
public class StudyFor {  
    public static void main(String[] args) {  
        //五位数就告诉了我们范围。  
    	
    	System.out.println("in StudyFor");
        for(int x=10000; x<100000; x++) {  
            //分解每一个五位数的个，十，百，千，万位上的数据  
            int ge = x%10;  
            int shi = x/10%10;  
            int bai  = x/10/10%10;  
            int qian = x/10/10/10%10;  
            int wan = x/10/10/10/10%10;  
            
            
            //按照要求进行判断即可  
            if((ge==wan) && (shi==qian) && (ge+shi+qian+wan==bai)) {  
                System.out.println(x);  
            }  
        }  
    }  
}


/*
练习：用while循环实现
左边：求出1-100之和
右边：统计水仙花数有多少个

初始化语句;
while(判断条件语句) {
     循环体语句;
     控制条件语句;
}



for(初始化语句;判断条件语句;控制条件语句) {
    循环体语句;
}

*/  


class WhileDemo2 {  
	public static void main(String[] args) {  
	    //求出1-100之和  
	    //for语句版本  
	    int sum = 0;  
	
	    for(int x=1; x<=100; x++) {  
	        sum+=x;  
	    }  
	
	    System.out.println("sum:"+sum);  
	    System.out.println("--------");  
	    //while语句版本  
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
 * 死循环
 * while(true){...}
   for(;;){...}
 * 
 */


