import java.util.Scanner;  


public class CharacterTest {  
    public static void main(String[] args) {  
        // ��������ͳ�Ʊ�����  
        int bigCount = 0;  
        int smallCount = 0;  
        int numberCount = 0;  


        Scanner sc = new Scanner(System.in);  
        System.out.println("������һ���ַ�����");  
        String line = sc.nextLine();  


        char[] chs = line.toCharArray();  

        for (int x = 0; x < chs.length; x++) {  
            char ch = chs[x];  

            // �жϸ��ַ�  
            if (Character.isUpperCase(ch)) {  
                bigCount++;  
            } else if (Character.isLowerCase(ch)) {  
                smallCount++;  
            } else if (Character.isDigit(ch)) {  
                numberCount++;  
            }  
        }  

        // ����������  
        System.out.println("��д��ĸ��" + bigCount + "��");  
        System.out.println("Сд��ĸ��" + smallCount + "��");  
        System.out.println("�����ַ���" + numberCount + "��");  
    }  
}