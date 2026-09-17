import java.util.EnumMap;
import java.util.Map;

public class ReportGenerator {
    public void generate(ExpenseManager manager) {
        if (manager.getExpenses().isEmpty()) {
            System.out.println("No expenses are available for the report.");
            return;
        }

        double total = 0;
        Expense highest = manager.getExpenses().get(0);
        Map<Category, Double> categoryTotals = new EnumMap<>(Category.class);

        for (Expense expense : manager.getExpenses()) {
            total += expense.getAmount();

            if (expense.getAmount() > highest.getAmount()) {
                highest = expense;
            }

            double oldValue = categoryTotals.getOrDefault(expense.getCategory(), 0.0);
            categoryTotals.put(expense.getCategory(), oldValue + expense.getAmount());
        }

        System.out.println("Expense Report ");
        System.out.println("Total Expense: Rs." + total);

        System.out.println("\nCategory-wise Expense:");
        for (Map.Entry<Category, Double> entry : categoryTotals.entrySet()) {
            System.out.println(entry.getKey() + " : Rs." + entry.getValue());
        }

        System.out.println("\nHighest Expense:");
        System.out.println(highest);
    }
}
