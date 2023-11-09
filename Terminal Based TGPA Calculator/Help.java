import java.util.Scanner;

public class Help{

	public void helpMe(){
		System.out.println("");

		System.out.println("# How to use the \"TGPA Calculator Interface\":");
		System.out.println("---> First Enter your marks & credits after entering the \"Calculate my TGPA Interface\" and press enter, then our calculator will calculate your \"Absolute TGPA\" and it will display it on the screen");

		System.out.println("");

		System.out.println("# Disclaimer: ");
		System.out.println("---> (i) Our Calculator tells you your \"Absolute TGPA\", and Just like all other universities our university also uses \"Relative Grading\"");
		System.out.println("---> (ii) So, when your Final TGPA will be declared by the university at the time of result declaration, at that time it can even be more than the TGPA that our calculator told you, if the whole university performed bad with respect to you, as it's \"Relative Grading\"");
		System.out.println("---> (iii) And it can even be less than the TGPA which our calculator told you if whole university performed very well with respect to you.");

		System.out.println("");

		System.out.println("Do you want to calculate your TGPA now?");
		System.out.println("If \"Yes\" then press 1. else press any other number to exit the \"TGPA Calculator Interface.\"");

		Scanner at = new Scanner(System.in);
		int a1 = at.nextInt();

		if(a1==1){
			TGPA t2 = new TGPA();
			t2.tgpaCalculator();
		}
		
		else{
			System.exit(0);
		}

		at.close();
	}
}