import java.util.*;

public class UseScanner {

    public static void main(String []args ){

        Scanner sc = new Scanner(System.in);

        System.out.println("please input your name:");

        String name = sc.nextLine();

        System.out.println("please input your age:");
        int age = sc.nextInt();

        System.out.println("please input your salary:");
        double salary = sc.nextDouble();

        System.out.println(name+" age is " + age +",Salary is "+salary);

        sc.close();



    }


}