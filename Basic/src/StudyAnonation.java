/**
 * 注解是一系列元数据，它提供数据用来解释程序代码，但是注解并非是所解释的代码本身的一部分。
 * 注解对于代码的运行效果没有直接影响。注解有许多用处，主要如下： 
 * - 提供信息给编译器： 编译器可以利用注解来探测错误和警告信息 
 * - 编译阶段时的处理： 软件工具可以用来利用注解信息来生成代码、Html文档或者做其它相应处理。 
 * - 运行时的处理： 某些注解可以在程序运行的时候接受代码的提取

 * https://blog.csdn.net/briblue/article/details/73824058
 * 注解只有成员变量，没有方法。注解的成员变量在注解的定义中以“无形参的方法”形式来声明，
 * 其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型。
 * 
 * 注解有什么用？给谁用？给 编译器或者 APT 用的, Annotation Processing Tool
 */
@interface Persons {
    Person[]  value();
}

public @interface Test

/*
@Repeatable(Persons.class)
@interface Person{
    String role default "";
}


@Person(role="artist")
@Person(role="coder")
@Person(role="PM")
public class StudyAnnotation{

    public static void main(String []args){
        System.out.println("Hello,Java annonation!");

    }
    

}

class Hero {

    @Deprecated
    public void say(){
        System.out.println("Noting has to say!");
    }


    public void speak(){
        System.out.println("I have a dream!");
    }


}
*/

