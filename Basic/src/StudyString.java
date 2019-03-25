package com.hujun;

public class StudyString {

	public static void TestStringConstruct(){
		// public String():空构造  
		
		System.out.println("TestStringConstruct");
		
		String s1 = new String();  
		System.out.println("s1:" + s1);  
		System.out.println("s1.length():" + s1.length());  
		System.out.println("--------------------------");  
	}
	
	public static void TestStringEqual() {
		/*

		字符串如果是变量相加，先开空间，再拼接。

		字符串如果是常量相加，是先加，然后到字符串常量池中找，如果有就直接返回，否则就创建。

		*/		
		System.out.println("TestStringEqual");
	
	 	String s3="hello";
	    String s4="world";
	    String s5="helloworld";
	    System.out.println(s5==s3+s4);
	    System.out.println(s5=="hello"+"world");
	    System.out.println("可以看作字符串的指针");
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





