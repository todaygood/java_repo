
import  java.lang.Math;

public class Generate_Random{

    public static void main(String[] args) {
        int max = 10;
        int min = 3;

        /* Math 类中的 random 方法返回一个 [0.0, 1.0) 区间的 double 值 */
        double random_factor;
        random_factor = Math.random();


        int randomWithMathRandom = (int) ( random_factor * (max - min) + min);


        System.out.println("random factor is " + random_factor+
                "\nrandom is " + randomWithMathRandom);

    }
}