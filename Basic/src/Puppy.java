
public class Puppy { 
    int puppyAge;
    public Puppy (String name){

        System.out.println("Puppy:"+name);
    }

    public void setAge (int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("Dog's age is "+ puppyAge);

        return puppyAge;

    }

    public static void main(String []args){

        Puppy myPuppy = new Puppy ("John");
        System.out.println("class has initialized");

        myPuppy.setAge(60);
        myPuppy.getAge();

        System.out.println("puppyAge in class is " + myPuppy.puppyAge);

    }



}