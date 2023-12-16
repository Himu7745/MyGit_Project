package inheritencedemo;

public class Overloading {
	
	
public void logIn() {
System.out.println("login without parameter");	
}
public void logIn ( int password) {
	System.out.println("login with ");
}
public void logIn(String email) {
	System.out.println("login with email");
}
public void logIn ( int number1,int number2) {
	System.out.println("double number");
}
}
