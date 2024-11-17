package Assignment2;
import java.util.*;
public class DtatTypes {
	
 public static void data() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter integer data");
	int a=sc.nextInt();
	System.out.println("enter float data");
	float b=sc.nextFloat();
	System.out.println("enter double data");
	 double c=sc.nextDouble();
	 System.out.println("string data");
	 sc.nextLine();
	 
	 String d=sc.nextLine();
	 System.out.println("byte data");
	 byte e=sc.nextByte();
	 System.out.println("short data");
	 short f=sc.nextShort();
	 System.out.println("char data");
	 char g=sc.next().charAt(0);
	 System.out.println("long data");
	 long h=sc.nextLong();
	 System.out.println("integer data "+a);
	 System.out.println("float data "+b);
	 System.out.println("float data "+c);
	 System.out.println("string data "+d);
	 System.out.println("byte data "+e);
	 System.out.println("short data "+f);
	 System.out.println("char data "+g);
	 System.out.println("lonb data "+h);

 }
 public static void main(String[] args) {
	 
	 data();
	
	 

 }
}
