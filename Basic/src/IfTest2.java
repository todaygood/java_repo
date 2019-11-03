import java.util.Scanner;

public class IfTest2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a value:");
		
		int x = sc.nextInt();

		System.out.println("please input second value:");
		int y = sc.nextInt();
		
		if (x > y ){
			System.out.println("x>y");
		}
		else
			System.out.println("x<y");
		

		
	}
	
	
}