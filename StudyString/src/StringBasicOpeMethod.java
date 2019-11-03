public class StringBasicOpeMethod {


    public static void main(String[] args){

        String str = "如何才能变得像棋哥一样优秀？算了吧，憋吹牛逼！";

        System.out.println(str);

        int len = str.length();

        char a = str.charAt(3);

        System.out.println("len = " + len + "\na=" + a);

        char b[]  = new char[80];

        str.getChars(0,14,b,0);

        System.out.println( b);

    }
}
