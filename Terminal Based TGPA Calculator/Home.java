import java.util.Scanner;

public class Home{

    public void homepage(){

        Scanner at = new Scanner(System.in);

        System.out.println("");
        System.out.println("@ If you want to calculate your TGPA press 1.");
        System.out.println("@ If you want to see Help Section then press 2.");
        System.out.println("@ Else press any other no. to exit the \"TGPA Calculator Interface.\"");

        int num = at.nextInt();

        if(num==1){
            TGPA t = new TGPA();
		    t.tgpaCalculator();
        }

        else if(num==2){
            Help h = new Help();
            h.helpMe();
        }

        else{
            System.exit(0);
        }

        at.close();
    }
}