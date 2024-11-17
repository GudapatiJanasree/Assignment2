package Assignment2;
import java.util.*;
public class Reverse {
	public static void printlogic() {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter n value");
		int n=sc.nextInt();
		int rev=0;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		System.out.print(rev);
	}
public static void main(String[] args) {
	printlogic();
}
}
