import java.util.Scanner;
import java.text.DecimalFormat;

public class TGPA {

	public void tellTGPA(double aa[], double bb[]) {
		int m1 = aa.length;
		double credit_sum = 0;
		double multiple_sum = 0;

		double cgpa_per_sub[] = new double[m1];

		for (int i = 0; i < m1; i++) {
			credit_sum = credit_sum + bb[i];
		}

		for (int j = 0; j < m1; j++) {
			double temp1 = Math.floor(aa[j] / 9);
			cgpa_per_sub[j] = temp1;
		}

		for (int k = 0; k < m1; k++) {
			double temp2 = cgpa_per_sub[k] * bb[k];
			multiple_sum = multiple_sum + temp2;
		}

		double tgpa = multiple_sum / credit_sum;
		if(tgpa>=10){
			tgpa=10;
		}
		DecimalFormat df = new DecimalFormat(".00");
		System.out.println("");
		System.out.println("# Your TGPA is: " + df.format(tgpa));
		System.out.println("");
	}

	public void tgpaCalculator() {

		int invalid = 0;

		Scanner at = new Scanner(System.in);

		System.out.println("");
		System.out.println("# Note: Input for \"No. of subjects:\" should be in the range 1-10, where 1 & 10 are included in the range.");
		System.out.print("* Enter the no. of subjects: ");
		int n = at.nextInt();

		if (n > 0 && n<=10) {
			double marks[] = new double[n];
			double credits[] = new double[n];

			System.out.println("");
			System.out.println("* Now enter marks of all the subjects in order out of 100: ");
			for (int i = 0; i < n; i++) {
				double a = at.nextDouble();
				if (a >= 0 && a <= 100) {
					marks[i] = a;
				}
				else {
					invalid = 1;
					break;
				}
			}

			if (invalid == 1) {
				System.out.println("");
				System.out.println("@ Invalid Input, Marks should be in the range of 0 to 100.");
				System.out.println("# Do you want to Calculate your TGPA again with valid intputs?");
				System.out.println("If \"Yes\" press 1. otherwise press any other number to exit the \"TGPA Calculator Interface\".");

				int m = at.nextInt();

				if (m == 1) {
					TGPA tt = new TGPA();
					tt.tgpaCalculator();
				}
				else {
					System.exit(0);
				}
			}

			System.out.println("");
			System.out.println("* Now enter credits of all the subjects in the same order in which you entered marks: ");
			
			for (int i = 0; i < n; i++) {
				double b = at.nextDouble();
				if (b > 0 && b <= 5) {
					credits[i] = b;
				} 
				else {
					invalid = 1;
					break;
				}
			}

			if (invalid == 1) {
				System.out.println("");
				System.out.println("@ Invalid credit input, credit should be in the range 1 to 5, 1 & 5 are included in the range.");
				System.out.println("# Do you want to Calculate your TGPA again with valid credit data intputs?");
				System.out.println("If \"Yes\" press 1. otherwise press any other number to exit the \"TGPA Calculator Interface\".");

				int l = at.nextInt();

				if (l == 1) {
					TGPA tt = new TGPA();
					tt.tgpaCalculator();
				} else {
					System.exit(0);
				}
			}

			TGPA t1 = new TGPA();
			t1.tellTGPA(marks, credits);
		}

		else {
			System.out.println("");
			System.out.println("@ Give a Input in the range of 1-10 for \"Number of Subjects\". ");
			System.out.println("---> Note: For the above given range for \"Number of Subjects\" 1 and 10 are included. ");
			System.out.println("");
		}

		at.close();
	}}
