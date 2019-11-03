import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        System.out.println("https://blog.csdn.net/wxgxgp/article/details/79194360");

        HashMap<String,String> capability = new HashMap<String,String>();

        capability.put("England","London");
        capability.put("China", "Beijing");

        capability.putIfAbsent("America","USA");

        String old = capability.putIfAbsent("China","Shanghai");

        System.out.println(old);
        System.out.println(capability);

        capability.remove("China");
        System.out.println(capability);

        System.out.println("-----------entrySet iterator");
        Iterator itr = capability.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            String key = (String)entry.getKey();
            String value = (String)entry.getValue();
            System.out.println(key +"="+ value);
        }

        System.out.println("-----------keySet iterator");
        Iterator  iterator = capability.keySet().iterator();
        while (iterator.hasNext()){

            String key = (String )iterator.next();
            System.out.println(key + "=" + capability.get(key));
        }

        System.out.println("-----------replace function");
        capability.replace("China","Shanghai");
        System.out.println(capability);

    }
}
