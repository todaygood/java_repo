import java.io.*;

public class MyTest2 {
    private static int counter = 0;
    public static void main(String args[]) throws IOException {
        long start = System.currentTimeMillis();
        Runnable work = new Runnable() {
            public void run() {
                try {
                    FileInputStream fis = new FileInputStream("/opt/1.test");
                    byte buf[] = new byte[1024];
                    int cnt = 0;
                    int n;
                    int size = 0;
                   
                    while ((n = fis.read(buf)) != -1) {
                        size +=n;
                        if(size>=1024*100*1024) {
                            break;
                        }
                       
                    }
                    fis.close();

                    synchronized (MyTest2.class) {
                        MyTest2.counter++;
                        if (counter == 10) {
                            MyTest2.class.notifyAll();
                        }

                    }
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        };

        for(int i=0; i<10; i++ ) {
            new Thread(work).start();
        }
        synchronized(MyTest2.class) {
            while(counter != 10) {
                try {
                    MyTest2.class.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }   
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }
}
