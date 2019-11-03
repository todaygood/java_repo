/*
final关键字可用于修饰类、变量和方法，它有“无法改变”或者“最终”的含义，因此被final修饰的类、变量和方法将具有以下特性：
final可以修饰类，方法，变量
final修饰的类不可以被继承
final修饰的方法不可以被覆盖
final修饰的变量是一个常量，只能被赋值一次
为什么要用final修饰变量，其实，在程序中如果一个数据是固定的。那么直接使用这个数据就可以了，但是这种阅读性差，所以应该给数据起个名称。而且这个变量名称的值不能变化，所以加上final固定
写法规范：常量所有字母都大写，多个单词，中间用_连接

*/
 class Fu{
        void method(){
        }
 }

 class Zi extends Fu{
        public static final double PI = 3.14;
        void method(){
             System.out.println(PI);
        }
 }

 class FinalDemo{
        public static void main(String[] args){
             Zi zi = new Zi();
             zi.method();
        }
 }
 