package PingAn;


import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Http2Example {
    final static OkHttpClient client = new OkHttpClient.Builder().build();
    public static void main(String[] args) {
        Request request = new Request.Builder()
                .url("https://blog.fliaping.com")
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(JSON.toJSONString(response.protocol()));
            System.out.println(response.headers().toString());
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}