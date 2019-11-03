package PingAn;
import redis.clients.jedis.Jedis;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        Jedis jedis = new Jedis("192.168.172.129", 6379);
        //jedis.auth("password")
        System.out.println("Connected to Redis");

        jedis.set("tutorial-name", "Redis tutorial");
        // Get the stored data and print it
        System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));


    }
}


