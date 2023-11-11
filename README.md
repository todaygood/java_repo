# java_repo

study java technology.

java.util:包含Java中大量工具类、集合类等，例如Arrays、List、Set等。
java.net:包含Java网络编程相关的类和接口。
java.io:包含了Java输入、输出有关的类和接口。

## doc 

https://docs.oracle.com/en/java/javase/21/index.html

## 使用什么IDE? 

小程序使用VS code + Java插件，run和build，语法提示都很全。 
做小程序练习，建议使用Eclipse, 可以把多个小程序文件放在一起，IDE也有语法自动提示。
大程序，使用Intelij

# 知识点

## java文件名和类名，编译单元
https://blog.csdn.net/shaoxiaoning/article/details/40424087


## 注释

单行注释，格式： //注释文字
多行注释，格式： /* 注释文字 */
文档注释，格式：/** 注释文字 */


- synchronized 修饰符

同一时间只能被一个线程访问

public synchronized void showDetails(){


}


- final 类

final 类不能被继承，没有类能够继承 final 类的任何特性。


- abstract 修饰符
抽象类：

抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。

一个类不能同时被 abstract 和 final 修饰。如果一个类包含抽象方法，那么该类一定要声明为抽象类，否则将出现编译错误。

抽象类可以包含抽象方法和非抽象方法。


# Issue: 关于VS Code 中文显示乱码







