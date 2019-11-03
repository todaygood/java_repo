import java.io.*;

public class FileDemo {




    public static  void main(String[] args){
        File file = new File("test_charstream.txt");

        boolean fileExists = file.exists();
        System.out.println(fileExists);

        File file2 = new File( "./fatherDir/subDir");
        boolean dirCreated = file2.mkdir();
        System.out.println( dirCreated);


        File file3 = new File( "./fatherDir/subDir2");
        boolean dirCreated2 = file3.mkdirs();
        System.out.println( dirCreated2);

        File file4= new File( "test_charstream.txt");
        long length = file4.length();

        System.out.println(length);

        boolean isRenamed = file4.renameTo( new File("./test2.txt"));

        boolean isDeleted = file4.delete();

        System.out.println("Renamed:" +isRenamed +"\n isDeleted:" + isDeleted);

        File file5= new File( "./fatherDir/subDir");

        boolean isDirectory = file5.isDirectory();
        //列出文件名
        String[] fileNames = file5.list();
        //列出目录
        File[] files = file4.listFiles();

        System.out.println("isDirectory:" + isDirectory );
        System.out.println("fileNames:" + fileNames);
        for (int i =0 ; i< files.length; i++){
            System.out.println("files:" + files[i].getName());
        }

    }
}
