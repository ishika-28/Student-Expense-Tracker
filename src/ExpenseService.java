import java.util.ArrayList;

public class ExpenseService {
    private ExpenseManager manager;

    public ExpenseService(ExpenseManager manager) {
        this.manager = manager;
    }

    public void add(double amount, Category category, String date, String description) {
        Expense expense = new Expense(
            manager.getNextId(),
            amount,
            category,
            date,
            description
        );

        manager.addExpense(expense);
        System.out.println("Expense added successfully.");
    }

    public void showAll() {
        ArrayList<Expense> expenses = manager.getExpenses();

        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    public void searchCategory(Category category) {
        boolean found = false;

        for (Expense expense : manager.getExpenses()) {
            if (expense.getCategory() == category) {
                System.out.println(expense);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expense found in this category.");
        }
    }

    public void searchDate(String date) {
        boolean found = false;

        for (Expense expense : manager.getExpenses()) {
            if (expense.getDate().equals(date)) {
                System.out.println(expense);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expense found on this date.");
        }
    }

    public void delete(int id) {
        if (manager.deleteExpense(id)) {
            System.out.println("Expense deleted successfully.");
        } else {
            System.out.println("Expense ID not found.");
        }
    }
}
