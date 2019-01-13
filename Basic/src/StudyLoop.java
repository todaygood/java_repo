
public class StudyLoop {

    public static void main(String []args){


 /*
        int x = 10;

        do{

            System.out.println("value of x: " + x );
            x++;
            System.out.print("\n");

        }while (x<20);

    }
*/

/* study break in loop
    int []numbers = {10,20,30,40,50};
    for ( int x : numbers){
        System.out.print(x);
        System.out.print(",");
        if(x == 30 )
            break;
    }
*/

 
    int []numbers = {10,20,30,40,50};
    for ( int x : numbers){
        if(x == 30 )
            continue;
        
        System.out.print(x);
        System.out.print(",");
        /*  
        //continue 语句不应该这么写
        if(x == 30 )
            continue;   

        */
    }

    System.out.println();
    int i = 0 ;
    for (i=1; i<10; i++){
        System.out.println("i= "+ i );
    }

    System.out.print("\n");
    String [] names = {"James","Tom","Mary"};

    for (String name: names){
        System.out.print(name);
        System.out.print(",");
    }
    }

}


