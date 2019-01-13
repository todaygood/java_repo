
import java.util.* ;
import java.text.* ; 

public class DateDemo { 

    public static void main(String args[]){

        //初始化Date对象
        Date date = new Date() ;
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //使用 toString()函数显示时间
        System.out.println(date.toString());

        System.out.println("Now time is:"+ft.format(date));

    
        try {
            Thread.sleep(1000*3);
        } catch (Exception e ) {

            System.out.println("Got exception");
        }
        

        System.out.println(new Date()+"\n");

        Calendar c1 = Calendar.getInstance();
        c1.set(2009,6,12);
        int year = c1.get(Calendar.YEAR);

        System.out.println(year);

        c1.set(Calendar.YEAR,2018);
        year = c1.get(Calendar.YEAR);
        System.out.println(year);
    }
}
