package com.hujun;

/*
    ��switch���ʵ�ּ���¼���·ݣ������Ӧ�ļ���

    ������
        A:����¼��һ���·ݣ���Scannerʵ��
        B:��switch���ʵ�ּ���
*/  
import java.util.Scanner;  

class SwitchTest4 {  
    public static void main(String[] args) {  
        //��������¼�����  
        Scanner sc = new Scanner(System.in);  

        //¼������  
        System.out.println("�������·�(1-12)��");  
        int month = sc.nextInt();  

        //case��͸  
        switch(month) {  
            case 1:  
            case 2:  
            case 12:  
                System.out.println("����");  
                break;  
            case 3:  
            case 4:  
            case 5:  
                System.out.println("����");  
                break;  
            case 6:  
            case 7:  
            case 8:  
                System.out.println("�ļ�");  
                break;  
            case 9:  
            case 10:  
            case 11:  
                System.out.println("�＾");  
                break;  
            default:  
                System.out.println("��������·�����");  
        }  
    }  
}