package com.hujun;  

/*

 */  
public class CharactorDemo {  
    public static void main(String[] args) {  

        System.out.println("isUpperCase:" + Character.isUpperCase('A'));  
        System.out.println("isUpperCase:" + Character.isUpperCase('a'));
        System.out.println("isUpperCase:" + Character.isUpperCase('0'));  
        System.out.println("-----------------------------------------");  

        System.out.println("isLowerCase:" + Character.isLowerCase('A'));  
        System.out.println("isLowerCase:" + Character.isLowerCase('a'));  
        System.out.println("isLowerCase:" + Character.isLowerCase('0'));  
        System.out.println("-----------------------------------------");  

        System.out.println("isDigit:" + Character.isDigit('A'));  
        System.out.println("isDigit:" + Character.isDigit('a'));  
        System.out.println("isDigit:" + Character.isDigit('0'));  
        System.out.println("-----------------------------------------");  

        System.out.println("toUpperCase:" + Character.toUpperCase('A'));  
        System.out.println("toUpperCase:" + Character.toUpperCase('a'));  
        System.out.println("-----------------------------------------");  

        System.out.println("toLowerCase:" + Character.toLowerCase('A'));  
        System.out.println("toLowerCase:" + Character.toLowerCase('a'));  
    }  
}