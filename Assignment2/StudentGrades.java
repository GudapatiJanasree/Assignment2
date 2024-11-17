package Assignment2;
import java.util.*;
public class StudentGrades {
	public static void Grading() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter student marks(max marks=100)");
		int marks=sc.nextInt();
		/* A grade - Excellent
 - B grade - Good
 - C grade - Medium
 - D grade - Fail
*/
		if(marks>=80) {
			System.out.println("A grade - Excellent");
		}
		else if(marks<80 || marks>=60) {
			System.out.println("B grade - Good");
		}
		else if(marks<60||marks>=35) {
			System.out.println("C grade - Medium");
		}
		else {
			System.out.println("D grade - Fail");
		}
	}
	public static void main(String[] args) {
		
		Grading();
	}

}
