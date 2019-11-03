
class Fu{
    int num ;
    Fu(){
        num = 10;
        System.out.println("A fu run" );
    }
    Fu(int x){
        System.out.println("B fu run..." + x);
    }
}

class Zi extends Fu{
    Zi(){
    
        System.out.println("C zi run " + num);
    }
    Zi(int x){
        super(4);
        System.out.println("D zi run " + x);
    }
}

class ExtendDemo5{
    public static void main(String[] args){
        new Zi();
        System.out.println("-------------------" );
        new Zi(6);
    }
}