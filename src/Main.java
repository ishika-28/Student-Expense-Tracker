import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValidator input = new InputValidator(scanner);
        ExpenseManager manager = new ExpenseManager();
        ExpenseService service = new ExpenseService(manager);
        ReportGenerator report = new ReportGenerator();

        while (true) {
            System.out.println("\n==============================");
            System.out.println("       STUDENT EXPENSE TRACKER");
            System.out.println("==============================");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Search by Category");
            System.out.println("4. Search by Date");
            System.out.println("5. Delete Expense");
            System.out.println("6. Generate Report");
            System.out.println("7. Exit");
            System.out.println("==============================");
            System.out.print("Enter your choice: ");

            int choice = input.getInteger();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Add Expense ---");
                    System.out.print("Enter amount: ");
                    double amount = input.getAmount();

                    System.out.println("Categories: FOOD, TRAVEL, SHOPPING, EDUCATION, BILLS, OTHER");
                    System.out.print("Enter category: ");
                    Category category = input.getCategory();

                    System.out.print("Enter date (DD-MM-YYYY): ");
                    String date = input.getText("Date cannot be empty: ");

                    System.out.print("Enter description: ");
                    String description = input.getText("Description cannot be empty: ");

                    service.add(amount, category, date, description);
                    break;

                case 2:
                    System.out.println("\n--- All Expenses ---");
                    service.showAll();
                    break;

                case 3:
                    System.out.print("\nEnter category: ");
                    Category searchCategory = input.getCategory();
                    service.searchCategory(searchCategory);
                    break;

                case 4:
                    System.out.print("\nEnter date (DD-MM-YYYY): ");
                    String searchDate = input.getText("Date cannot be empty: ");
                    service.searchDate(searchDate);
                    break;

                case 5:
                    System.out.print("\nEnter expense ID to delete: ");
                    int id = input.getInteger();
                    service.delete(id);
                    break;

                case 6:
                    report.generate(manager);
                    break;

                case 7:
                    System.out.println("Thank you for using Student Expense Tracker!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
