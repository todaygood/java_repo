

public class MammaInt implements  Animal {
    @Override
    public void eat() {
        System.out.println("Mamma eat");
    }

    @Override
    public void travel() {
        System.out.println("Mamma travel");
    }

    public int noOfLegs(){
        return 0;
    }

    public static  void main(String[] args){
        MammaInt  a = new MammaInt();
        a.eat();

        a.travel();
    }


}
