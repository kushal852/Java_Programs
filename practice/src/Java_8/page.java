package Java_8;

@FunctionalInterface
public interface page {
	
	public void greet();// A interface which has one abstract method is called functional interface
	
	// From java 8  functional interface can have multiple static and default methods
	public static void static_method() {
	}
	
	default void default_method() {
		
	}

}
