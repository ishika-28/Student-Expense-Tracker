import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses;
    private FileManager fileManager;

    public ExpenseManager() {
        fileManager = new FileManager();
        expenses = fileManager.load();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        fileManager.save(expenses);
    }

    public boolean deleteExpense(int id) {
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getId() == id) {
                expenses.remove(i);
                fileManager.save(expenses);
                return true;
            }
        }

        return false;
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public int getNextId() {
        int id = 0;

        for (Expense expense : expenses) {
            if (expense.getId() > id) {
                id = expense.getId();
            }
        }

        return id + 1;
    }
}
