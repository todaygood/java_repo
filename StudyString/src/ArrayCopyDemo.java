public class ArrayCopyDemo {

    public static void main(String[] args){

        char [] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};

        char [] copyTo= new char[7];

        System.arraycopy(copyFrom,2,copyTo,0,3);
        copyTo[3]='\0';

        System.out.println(copyTo);
    }
}
