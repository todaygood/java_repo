


//字符串替换与修改
public class StringFindandReplace {
    public static void main(String args[]){
        String str1 = "vBasic";
        String str2 = "Hello World";
        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);

        /***1、concat()方法将两字符串合并***/
        String str3 = str1.concat(str2);
        System.out.println("str1和str2合并后的字符串为："+str3);

        /***2、toLowerCase()方法将str1字符全部转换为小写***/
        String str4 = str1.toLowerCase();
        System.out.println("str1的字符全部转换为小写："+str4);

        /***3、toUpperCase()方法将str2字符全部转换为大写***/
        String str5 = str2.toUpperCase();
        System.out.println("str2的字符全部转换为大写："+str5);


        /***4、实现字符串的替换，原字符串内容不变***/
        String str6 = str1.replaceFirst("(?i)VBASIC","C++");
        String str7 = str2.replaceFirst("(?-i)World","C++");
        System.out.println("替换后的str1："+str6);
        System.out.println("替换后的str2:"+str7);
    }
}