package Assignment2;
import java.util.*;
public class ValuesBetweenTheRange {
	public static void range() {
		/*WAP to print all values between given range which are divisible by 7 & not divisible by 5.
 Ex.: range is 1 to 40
 O/P: 7, 14, 21, 28, ...*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int rng=sc.nextInt();
		for(int i=1;i<=rng;i++) {
			if(i%7==0 && i%5!=0) {
				System.out.print(i+",");
			}
		}
		
	}
	public static void main(String[] args) {
		range();
	}

}
