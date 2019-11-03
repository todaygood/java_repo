class Father {
    void test(){
        System.out.println("test in Father");
    }
}

class Child extends Father{
    @Override
    void test() {
        System.out.println("test in clild");
    }
}


public class UseAnnotation1 extends Child{

    public  static  void main(String[] args){

        UseAnnotation1 ua = new UseAnnotation1();
        ua.test();
        System.out.println("use annotation1");

    }
}
