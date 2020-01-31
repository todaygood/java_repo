

public class Outer {
    public static void main(String[] args) {
        //Double d=5; //不通过，类型不匹配。5是int
        //Double b;
        //b=10;//不通过

        Double a=new Double(5); //通过，这样就不是自动装箱了
        System.out.println(a);

        int a1=9;
        System.out.println(a1);

        Outer outer=new Outer();
        System.out.println(outer.display(a1));//参数传递的过程中也存在自动装箱／拆箱


        Integer m=5;   //java.lang.Integer类
        double d=m;
        System.out.println(d+"   "+m+"  "+ m.toString());


    }
    public int display(Integer a){

        System.out.println("in display a="+a);
        return a+1;
    }
}