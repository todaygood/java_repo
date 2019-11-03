import java.io.*;

public class Streamer {

    public static void readByBufferedReader() throws IOException {
        File file = new File( "StudyJavaIO.iml");

        // 在字符流基础上用buffer流包装，也可以指定buffer的大小
        Reader reader = new BufferedReader( new FileReader(file),2*1024);
        char[] byteArray = new char[( int) file.length()];
        int size = reader.read( byteArray);
        System.out.println("----readByBufferedReader-----");
        System.out.println( "大小:" + size + ";内容:" + new String(byteArray));
        reader.close();
    }

    public static void readByBufferedInputStream() throws IOException {
        File file = new File( "StudyJavaIO.iml");
        byte[] byteArray = new byte[( int) file.length()];
        //可以在构造参数中传入buffer大小
        InputStream is = new BufferedInputStream( new FileInputStream(file),2*1024);
        int size = is.read( byteArray);

        System.out.println( "大小:" + size + ";内容:" + new String(byteArray));
        is.close();
    }


    public static void randomAccessFileWrite() throws IOException {
        // 创建一个RandomAccessFile对象
        RandomAccessFile file = new RandomAccessFile( "test_randomAccess.txt", "rw");
        // 通过seek方法来移动读写位置的指针
        file.seek(10);
        // 获取当前指针
        long pointerBegin = file.getFilePointer();
        // 从当前指针位置开始写
        file.write( "HELLO WORD".getBytes());
        long pointerEnd = file.getFilePointer();
        System. out.println( "pointerBegin:" + pointerBegin + "\n" + "pointerEnd:" + pointerEnd + "\n" );
        file.close();
    }


    public static void randomAccessFileRead() throws IOException {
        // 创建一个RandomAccessFile对象
        RandomAccessFile file = new RandomAccessFile( "StudyJavaIO.iml", "rw");
        // 通过seek方法来移动读写位置的指针
        file.seek(10);
        // 获取当前指针
        long pointerBegin = file.getFilePointer();
        // 从当前指针开始读
        byte[] contents = new byte[102];
        file.read( contents);
        long pointerEnd = file.getFilePointer();
        System. out.println( "pointerBegin:" + pointerBegin + "\n" + "pointerEnd:"
                + pointerEnd + "\n" + new String(contents));
        file.close();
    }

    public static void convertByteToChar() throws IOException{
        File file= new File( "test_charstream.txt");
        //获得一个字节流
        InputStream is= new FileInputStream( file);
        //把字节流转换为字符流，其实就是把字符流和字节流组合的结果。
        Reader reader= new InputStreamReader( is);
        char [] byteArray= new char[( int) file.length()];
        int size= reader.read( byteArray);
        System. out.println( "大小:"+size +";内容:" +new String(byteArray));
        is.close();
        reader.close();
    }


    public static void writeCharToFile() throws IOException{
        String hello= new String( "hello world,字符流!");
        File file= new File( "test_charstream.txt");
        //因为是用字符流来读媒介，所以对应的是Writer，又因为媒介对象是文件，所以用到子类是FileWriter
        Writer os= new FileWriter( file);
        os.write( hello);
        os.close();
    }


    public static void readCharFromFile() throws IOException{

        File file = new File("test_charstream.txt");
        Reader reader = new FileReader(file);

        char[] byteArray = new char [ (int)file.length()];

        int size = reader.read(byteArray);

        System.out.println("大小:"+size +";内容:"+ new String(byteArray));

        reader.close();
    }


    public static void readByteFromFile(String pathname) throws IOException {
        File file= new File( pathname);
        byte[] byteArray= new byte[( int) file.length()];

        //因为是用字节流来读媒介，所以对应的是InputStream
        //又因为媒介对象是文件，所以用到子类是FileInputStream
        InputStream is= new FileInputStream( file);
        int size= is.read( byteArray);
        System. out.println( "大小:"+size +";内容:" +new String(byteArray));
        is.close();
    }


    public static void writeByteToFile(String pathname) throws IOException {
        String hello= new String( "hello word,modify!");
        byte[] byteArray= hello.getBytes();  //字符串转化为数组

        File file= new File(pathname);

        //因为是用字节流来写媒介，所以对应的是OutputStream
        //又因为媒介对象是文件，所以用到子类是FileOutputStream
        OutputStream os= new FileOutputStream( file);
        os.write( byteArray);
        os.close();
    }

    public static void main(String[] args) throws IOException {

        try {
            writeByteToFile("test_bytestream.txt");
        }catch (IOException e ){
            e.printStackTrace();
        }

        try {
            readByteFromFile("test_bytestream.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            writeCharToFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        try{
            readCharFromFile();
        }catch (IOException e){

            e.printStackTrace();
        }

        try{
            convertByteToChar();
        }catch (IOException e){
            e.printStackTrace();
        }


        try {
            randomAccessFileRead();
        } catch (IOException e) {
            e.printStackTrace();
        }


        randomAccessFileWrite();

        readByBufferedInputStream();

        readByBufferedReader();
    }

}




