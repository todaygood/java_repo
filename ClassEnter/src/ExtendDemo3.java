
class Fu{

    public void show(){

        System.out.println("fu show run");
    }
}

class Zi extends Fu{

    public void show(){

        System.out.println("zi show run");
    }

}

public class ExtendDemo3{

    public static void main(String[] args){
        Zi z = new Zi();
        z.show();

    }
}