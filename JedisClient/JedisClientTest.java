import redis.clients.jedis.Jedis;

public class JedisClientTest {

    public static void main(String[] args) throws Exception {
        Jedis jedis = new Jedis("192.168.172.129", 6379);
        //jedis.auth("password")
        System.out.println("Connected to Redis");
    }
}