public class ColonFor {

    public static void main(String[] args) {

        int i ;
        int j ;

        outer:for (i = 0; i < 5; i++) {
            for ( j = 0; j < 5; j++) {
                if (i == 3) {
                    continue outer;
                }
            }
        }
        //这个地方就是跳转标识,可用来标记地方 里层循环 continue直接跳出外层循环，继续执行外层循环

        System.out.println("i=" + i);


    }
}
