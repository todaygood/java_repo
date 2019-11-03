class Person{
    String name;
    int age ;
}
class Student extends Person{
    void study(){
        System.out.println("student study..." + age);
    }
}
class Worker extends Person{
    void work(){
        System.out.println("worker work..." + age);
    }
}

class ExtendDemo{
    public static void main(String[] args){
        Student s = new Student();
        s. name = "zhangsan" ;
        s. age = 20;
        s.study();
        Worker w = new Worker();
        w. name = "lisi" ;
        w. age = 30;
        w.work();
    }
}