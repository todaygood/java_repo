
import java.io.*;


public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    //Employee的构造类
    public Employee(String name){
        this.name = name;
    }

    public void empAge(int empAge){
        age = empAge;
    }

    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("名字：" + name);
        System.out.println("年龄: " + age );
        System.out.println("职位: " + designation);
        System.out.println("薪水：" + salary);
    }

    public static void main(String []args){

        Employee empOne = new Employee("John");
        Employee empTwo = new Employee("Mary");

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(200.35);
        empOne.printEmployee();

        System.out.println("-------");

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(100.01);
        empTwo.printEmployee();
    }

}













