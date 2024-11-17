package Assignment2;

public class countofRepeatedCharacters {
/* ) WAP to find freq. count of repeated characters in an array. 
ch = ['a', 'c', 'a', 't', 'g', ' '] 
O/P:   a: 2,  c: 1,  t: 1, g: 1 
(skip space character)*/
	public static void main(String[] args) {
	char[] ch= {'a','c','a','t','g',' '};
	
	for(int i=0;i<ch.length;i++) {
		int count=1;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
			}
			if(ch[i+1]!=ch[i]) {
			System.out.print(ch[i]+":"+count+" ");
		}
	}
	

	}
}}
