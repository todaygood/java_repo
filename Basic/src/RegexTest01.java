

import java.util.Scanner;



public class RegexTest01{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please input email:");
		
		String email = sc.nextLine();
		
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";

		boolean flag = email.matches(regex);
		
		System.out.println("flag:"+flag);
		
				
	}
	
}