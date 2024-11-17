package Assignment2;
import java.util.*;
public class Factorial {
	public static void fact() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n to find the factorial");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		fact();
	}
}
