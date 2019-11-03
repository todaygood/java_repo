import java.util.Scanner;  


public class CharacterTest {  
    public static void main(String[] args) {  
        // 定义三个统计变量。  
        int bigCount = 0;  
        int smallCount = 0;  
        int numberCount = 0;  


        Scanner sc = new Scanner(System.in);  
        System.out.println("请输入一个字符串：");  
        String line = sc.nextLine();  


        char[] chs = line.toCharArray();  

        for (int x = 0; x < chs.length; x++) {  
            char ch = chs[x];  

            // 判断该字符  
            if (Character.isUpperCase(ch)) {  
                bigCount++;  
            } else if (Character.isLowerCase(ch)) {  
                smallCount++;  
            } else if (Character.isDigit(ch)) {  
                numberCount++;  
            }  
        }  

        // 输出结果即可  
        System.out.println("大写字母：" + bigCount + "个");  
        System.out.println("小写字母：" + smallCount + "个");  
        System.out.println("数字字符：" + numberCount + "个");  
    }  
}