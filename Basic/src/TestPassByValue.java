public class TestPassByValue {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 2;
 
    System.out.println("before swap: num1=" +
                        num1 + ",num2= " + num2);
 
    // 调用swap方法
    swap(num1, num2);
    System.out.println("after swap: num1= " +
                       num1 + ",num2= " + num2);
  }
  /** 交换两个变量的方法 */
  public static void swap(int n1, int n2) {
    System.out.println("\t enter swap ");
    System.out.println("\t\t before swap: n1= " + n1
                         + ",n2= " + n2);
    // 交换 n1 与 n2的值
    int temp = n1;
    n1 = n2;
    n2 = temp;
 
    System.out.println("\t\t after swap: n1= " + n1
                         + ",n2= " + n2);
  }
}