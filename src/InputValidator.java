import java.util.Scanner;

public class InputValidator {
    private Scanner scanner;

    public InputValidator(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getAmount() {
        while (true) {
            try {
                double amount = Double.parseDouble(scanner.nextLine());

                if (amount > 0) {
                    return amount;
                }

                System.out.print("Enter an amount greater than 0: ");
            } catch (Exception e) {
                System.out.print("Please enter a valid amount: ");
            }
        }
    }

    public String getText(String message) {
        while (true) {
            String value = scanner.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.print(message);
        }
    }

    public Category getCategory() {
        while (true) {
            String value = scanner.nextLine().trim();

            try {
                return Category.valueOf(value.toUpperCase());
            } catch (Exception e) {
                System.out.print("Invalid category. Try again: ");
            }
        }
    }

    public int getInteger() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("Please enter a valid number: ");
            }
        }
    }
}
