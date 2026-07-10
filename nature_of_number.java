package Basic1_java;
import java.util.Scanner;

public class even_odd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:");
		int a = sc.nextInt();
		
		System.out.println("Enter b:");
		int b = sc.nextInt();
		
		if(a%2 ==0) {
			System.out.println(a+ "is even.");
		}else {
			System.out.println(a+ "is odd.");
		}
		
		if(b>0) {
			System.out.println(b+ "is positive.");
			}
		else if(b==0) {
			System.out.println(b+ "is Zero.");
		}
		else {
			System.out.println(b+ "is negative.");
		}
	}
}
