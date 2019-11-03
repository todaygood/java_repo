

//字符串截取与拆分
public class StringCutAndSplit {
    public static void main(String args[]){
        String str = "How to cut and split strings"; //定义字符串

        System.out.println("字符串为："+str);

        int length = str.length(); //获取字符串长度，保存到变量中
        System.out.println("字符串长度为："+length);


        /***1、substring()方法截取出第一个单词和最后一个单词***/
        //首先配合indexOf()和lastIndexOf()方法找到第一个单词和最后一个单词前后空格的索引号
        //第一个单词的左范围索引为0，最后一个单词的右范围索引为length-1


        int firstIndex = str.indexOf(' '); //找到第一个空格所在位置
        int lastIndex = str.lastIndexOf(' '); //找到最后一个空格所在位置
        System.out.println("第一个空格的索引号为："+firstIndex);
        System.out.println("最后一个空格的索引号为："+lastIndex);



        //利用substring()方法根据第一个和最后一个单词的索引范围截取出第一个和最后一个单词
        String firstWord = str.substring(0,firstIndex); //截取出第一个单词
        String lastWord = str.substring(lastIndex+1,length);//截取出最后一个单词
        System.out.println("第一个单词为："+firstWord);
        System.out.println("最后一个单词为："+lastWord);


        /***1、split()方法拆分出所有单词***/
        String stringArray[] = str.split(" ");  //根据空格要求拆分出所有单词保存到字符串数组中
        System.out.println("拆分之后的各个词汇为："); //输出提示信息


        for(int i = 0;i<stringArray.length;i++){
            System.out.print(stringArray[i]+" ");
        }
    }
}