import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        // Predefined exchange rates (to USD)
        double usdToEur = 0.93;
        double usdToGbp = 0.79;
        double usdToInr = 83.42;
        double usdToJpy = 151.65;
        
        Scanner scanner = new Scanner(System.in);
        
        // Display menu
        System.out.println("Simple Currency Converter");
        System.out.println("1. USD to EUR (Euro)");
        System.out.println("2. USD to GBP (Pound)");
        System.out.println("3. USD to INR (Rupee)");
        System.out.println("4. USD to JPY (Yen)");
        System.out.println("5. EUR to USD");
        System.out.println("6. GBP to USD");
        System.out.println("7. INR to USD");
        System.out.println("8. JPY to USD");
        
        // Get user choice
        System.out.print("\nEnter your choice (1-8): ");
        int choice = scanner.nextInt();
        
        // Get amount to convert
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();
        
        // Convert and display result
        switch(choice) {
            case 1 -> System.out.printf("%.2f USD = %.2f EUR", amount, amount * usdToEur);
            case 2 -> System.out.printf("%.2f USD = %.2f GBP", amount, amount * usdToGbp);
            case 3 -> System.out.printf("%.2f USD = %.2f INR", amount, amount * usdToInr);
            case 4 -> System.out.printf("%.2f USD = %.2f JPY", amount, amount * usdToJpy);
            case 5 -> System.out.printf("%.2f EUR = %.2f USD", amount, amount / usdToEur);
            case 6 -> System.out.printf("%.2f GBP = %.2f USD", amount, amount / usdToGbp);
            case 7 -> System.out.printf("%.2f INR = %.2f USD", amount, amount / usdToInr);
            case 8 -> System.out.printf("%.2f JPY = %.2f USD", amount, amount / usdToJpy);
            default -> System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}
