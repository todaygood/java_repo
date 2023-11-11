package com.darrenchan.thread;

public class TestThread {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    while (true) {

                    }
                }
            }).start();
        }
        while(true){

        }
    }
}

/*
作者：DarrenChan陈驰
        链接：https://www.zhihu.com/question/23474039/answer/269526476
        来源：知乎
        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
*/