package com.hujun;

public class StudyString {

	public static void TestStringConstruct(){
		// public String():�չ���  
		
		System.out.println("TestStringConstruct");
		
		String s1 = new String();  
		System.out.println("s1:" + s1);  
		System.out.println("s1.length():" + s1.length());  
		System.out.println("--------------------------");  
	}
	
	public static void TestStringEqual() {
		/*

		�ַ�������Ǳ�����ӣ��ȿ��ռ䣬��ƴ�ӡ�

		�ַ�������ǳ�����ӣ����ȼӣ�Ȼ���ַ������������ң�����о�ֱ�ӷ��أ�����ʹ�����

		*/		
		System.out.println("TestStringEqual");
	
	 	String s3="hello";
	    String s4="world";
	    String s5="helloworld";
	    System.out.println(s5==s3+s4);
	    System.out.println(s5=="hello"+"world");
	    System.out.println("���Կ����ַ�����ָ��");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String s = "hello";
	    s+=" world";

	    System.out.println("s:" + s);
	    
	    
	    String s1 = new String ("hello");
	    String s2 = "hello";
	    System.out.println(s1==s2);
	    System.out.println(s1.equals(s2));
	    
	    TestStringEqual();
	    
	    String s3="hello";
	    System.out.println(s3.indexOf('e'));
	    System.out.println(s3.indexOf('o'));
	    
	    TestStringConstruct();
	}
	
	

}





