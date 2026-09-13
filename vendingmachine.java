import java.text.DecimalFormat;
import java.util.*;

public class vendingmachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        // Array of items available in the vending machine
        String[] items = {
            "Soda", 
            "Chips", 
            "Juice", 
            "Candy", 
            "Water", 
            "Crackers", 
            "Gum", 
            "Cookies", 
            "Nuts", 
            "Fruit Snacks"
        };

        //Prices for each item in dollars
        double[] prices = {
            1.50, 
            1.00, 
            1.20, 
            0.80, 
            0.90, 
            1.10, 
            0.50, 
            1.30, 
            1.40, 
            0.70
        };

        String cart = "";
        double total = 0;
        double payment = 0;
        
        // Displaying the vending machine items and their prices
        System.out.println("VENDING MACHINE");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - $" + prices[i]);
        }
        System.out.println("________________");
        System.out.println("Enter (0) to checkout.");

        while (true) {
            // Prompting the user to select an item
            System.out.print("Select an item (1-10): ");
            int choice = scan.nextInt();

            //  Checks if user entered a valid selection and displays the selected item and its price
            if (choice == 0) {
                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty.");
                    continue;
                } else {
                    System.out.print("Your total is: $" + deci.format(total) + ". Please enter payment amount: ");
                    payment = scan.nextDouble();
                    
                    if (payment < total) {
                        System.out.println("Insufficient payment.");
                        continue;
                    } else {
                        payment -= total;
                        System.out.println("---CART---");
                        System.out.print(cart);
                        System.out.println("---RECEIPT---");
                        System.out.println("Total: " + "$" + deci.format(total));
                        System.out.println("Change: " + "$" + deci.format(payment));
                        break;
                    }
                }

            } else if (choice < 1 || choice > 10) {
                System.out.println("Item not found.");
            } else {
                cart += items[choice - 1] + " : " + prices[choice - 1] + "\n";
                total += prices[choice - 1];
            }
            scan.close();
        }    
    }
}
