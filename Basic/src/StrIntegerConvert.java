/**
 * 数据和字符串相互转换
 * https://blog.csdn.net/allenchan3721/article/details/71437394
 * 
 */
public class StrIntegerConvert {

    public static void main(String []args){

        int a = 50;
        String str = a+"";

        System.out.println("integer -> string :  " + str);

        int b = Integer.parseInt(str);
        System.out.println("string  -> integer :  " + b);

        str = String.valueOf(a);
        System.out.println("integer -> string valueOf :  " + str);

    }

}

