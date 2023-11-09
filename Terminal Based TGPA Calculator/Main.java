import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		try {
			Home hey = new Home();
			hey.homepage();
		} 
		catch (InputMismatchException e) {
			System.out.println(""); 
			System.out.println("!!! You have entered a invalid input, run the program again and this time try entering all the values as numeric only."); 
			System.out.println(""); 
		} 
	}
}