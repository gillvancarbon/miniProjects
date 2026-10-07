import java.util.Scanner;

public class shippingFeeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total Amount: ");
        double totalAmount = input.nextDouble();

        double shippingFee = (totalAmount > 1000) ? 0 : 100;

        System.out.println("Shipping Fee: " + shippingFee);

        input.close();
    }    
}
