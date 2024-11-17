package Assignment2;

import java.util.Arrays;

public class SubstringOfArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8};
	int b[]=Arrays.copyOfRange(a, 0, 5);
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+",");
	}
}
}
