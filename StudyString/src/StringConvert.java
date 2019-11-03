

public class StringConvert {


    public static void main(String args[]){
        /***将字符串类型转换为其他数据类型***/
        boolean bool = Boolean.getBoolean("false"); //字符串类型转换为布尔类型
        int integer = Integer.parseInt("20");    //字符串类型转换为整形
        long LongInt = Long.parseLong("1024");   //字符串类型转换为长整形
        float f = Float.parseFloat("1.521");     //字符串类型转换为单精度浮点型
        double d = Double.parseDouble("1.52123");//字符串类型转换为双精度浮点型
        byte bt = Byte.parseByte("20");         //字符串类型转换为byte型
        char ch = "棋哥".charAt(0);
        /***将其他数据类型转换为字符串类型方法1***/
        String strb1 = String.valueOf(bool);    //将布尔类型转换为字符串类型
        String stri1 = String.valueOf(integer); //将整形转换为字符串类型
        String strl1 = String.valueOf(LongInt); //将长整型转换为字符串类型
        String strf1 = String.valueOf(f);       //将单精度浮点型转换为字符串类型
        String strd1 = String.valueOf(d);       //将double类型转换为字符串类型
        String strbt1 = String.valueOf(bt);     //将byte转换为字符串类型
        String strch1 = String.valueOf(ch);     //将字符型转换为字符串类型
    }
}