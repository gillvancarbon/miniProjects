import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeEvaluator{
    public static void main(String[] args) {
        
        int grades[] = new int[6];
        Scanner scan = new Scanner(System.in);
        double average = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        
        //Display grades and calculate average
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scan.nextInt();
        }
        for (int grade : grades) {
            average += grade;
        }
        average /= grades.length;
        System.out.println("");
        System.out.println("Average: " + df.format(average));
       
        // Determine remark based on average
        if (average >= 90) {
            System.out.println("Remark: Excellent");
        } else if (average >= 85) {
            System.out.println("Remark: Very Good");
        } else if (average >= 80) {
            System.out.println("Remark: Good");
        } else if (average >= 75) {
            System.out.println("Remark: Passed");
        } else {
            System.out.println("Remark: Failed");
        } 
        scan.close();
    }
}
