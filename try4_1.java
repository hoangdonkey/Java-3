import java.util.Scanner;

public class try4_1 {
	public static void main(String[] args) {
		int age, assets, loanAmt, profession, gender;
		String name;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:\n");
		name = input.nextLine();

		System.out.println("Enter your age:\n");
		age = Integer.parseInt(input.nextLine());

		System.out.println("Enter your gender(1:M / 2:F):\n");
		gender = Integer.parseInt(input.nextLine());

		System.out.println("Enter your profession (1: Self-Employed/ 2: Professional):\n");
		profession = Integer.parseInt(input.nextLine());

		System.out.println("Enter your personal assets($):\n");
		assets = Integer.parseInt(input.nextLine());

		if (age < 16) {
			loanAmt = 0;
		}
		else if (age >= 16 && age <= 25) {
			if(assets > 25000) {
				if (profession == 1) {
					loanAmt = 10000;		
				}
				else {
					loanAmt = 15000;
				}
			}
			else {
				loanAmt = 0;
			}
		}
		else if (age <= 40 && age >= 26) {
			if (gender == 'F') {
				loanAmt = 30000;
			}
			else if (assets >= 40000) {
				loanAmt = 25000;
			}
			else {
				loanAmt = 0;
			}
		}
		else if (age <= 60 && age >= 40) {
			if (assets > 50000) {
				loanAmt = 40000;
			}
			else {
				loanAmt = 0;
			}
		}
		else {
			if (assets > 25000) {
				if (profession == 1) {
					loanAmt = 35000 - age * 100;
				}
				else {
					loanAmt = 25000 - age * 100;
				}
			}
			else {
				loanAmt = 0;
			}
		}

		if (loanAmt == 0) {
			System.out.println("You are not eigible to loan");
		}
		else {
			System.out.println("Eligible loan amount: " + loanAmt);
		}
	}
}