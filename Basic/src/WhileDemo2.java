


public class WhileDemo2 {

     public static void main(String[] args) {

        String[] testString = {"hello","world!"};

        for (String a: testString)
            System.out.println(a);


        for (int i=0 ; i< 5; i++){
            try {
                System.out.println("i=" + i);
                Thread.sleep(1000);
            } catch (InterruptedException ie)
            {
                Thread.currentThread().interrupt();
            }
        }

    }



}
