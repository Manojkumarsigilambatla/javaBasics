package inheritance;

public class ClassB extends ClassA {

	public ClassB() {
		super("hello");
		System.out.println("This is ClassB constructor");
	}
//	public ClassB(String message)
//	{
//		System.out.println(message);
//	}

	public static void main(String[] args) {
		ClassB b = new ClassB();
	}
}
