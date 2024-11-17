package Assignment2;

public class MethodWithAndWithOutReturnType {
	public static void methodWithoutReturn() {
		System.out.print("method Without Return type");
	}
	
	public static int methodWithReturnType() {
		
	
	int a=10;
	int b =20;
	int c=a+b;
	return c;
	}
	
	public static void main(String[] args) {
		methodWithoutReturn();
		System.out.println();
		System.out.println(methodWithReturnType());
		
	}
}
