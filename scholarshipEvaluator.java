import java.util.Scanner;

public class scholarshipEvaluator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int yearLevel;
		double gpa;
		boolean isScholar;
		double baseRate = 0;
		double supportFee = 0;
		double honorDiscount = 0;
		double tuitionFee = 0;
		String yearLabel = null;
		
		System.out.println("==TUITION EVALUATOR==");
		System.out.println("---------------------");
		
		System.out.print("Enter your year level(1-3): ");
		yearLevel = scanner.nextInt();
		
		System.out.print("Enter your GPA(1.0 - 4.0): ");
		gpa = scanner.nextDouble();
		
		System.out.print("Are you a Scholar?(true/false): ");
		isScholar = scanner.nextBoolean();
		
		switch (yearLevel) {
		case 1:
			yearLabel = "Freshman";
			baseRate = 1000;
			break;
			
		case 2:
			yearLabel = "Sophomore";
			baseRate = 1200;
			break;
		
		case 3:
			yearLabel = "Junior";
			baseRate = 1500;
			break;
			
		default:
			System.out.println("");
			System.out.println(">>Invalid year level<<");
			return;
		}
		
		if (gpa >= 3.5 && gpa <= 4.0) {
			if (isScholar) {
				honorDiscount += baseRate * 0.30;
				
			} else {
				honorDiscount += baseRate * 0.10;
				
			}
		} else {
			if (gpa < 2.0 && gpa >= 1.0) {
				supportFee = 100;
				
			} else {
				supportFee = 0;
			}
		}
		
		tuitionFee = baseRate + supportFee - honorDiscount;
		
		System.out.println("");
		System.out.println("Year Lvl: " + yearLabel);
		System.out.println("GPA: " + gpa);
		System.out.println("Scholar: " + isScholar);
		System.out.println("");
		System.out.println("==Tuition Summary==");
		System.out.println("Year Lvl: " + yearLabel);
		System.out.println("Base Rate: " + baseRate);
		System.out.println("Academic Support Fee: " + supportFee);
		System.out.println("Honor Discount: " + honorDiscount);
		System.out.println("----------------");
		System.out.println("Total Tuition: " + tuitionFee);
		
		scanner.close();
	}
}
