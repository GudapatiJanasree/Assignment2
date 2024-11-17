package Assignment2;

public class CallingStaticAndNonStatic {
	public static void main(String[] args) {
		System.out.println(StaticAndNonStatic.staticVariable);
		StaticAndNonStatic.staticMethod();
		StaticAndNonStatic obj= new StaticAndNonStatic();
		System.out.println(obj.nonstaticVariable);
		obj.nonStaticMethod();
		
	}

}
