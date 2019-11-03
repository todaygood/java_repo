public class UseDeprecated1 {

    @Deprecated
    public static int sum (int a , int b ){
        System.out.println("sum= " + (a+b));
        return a+b;
    }

    public static  void main(String[] args){
        System.out.println("3+5="+ sum(3,5));
    }
}
