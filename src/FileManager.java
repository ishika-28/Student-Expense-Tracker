import java.io.*;
import java.util.ArrayList;

public class FileManager {
    private final String fileName = "data/expenses.csv";

    public void save(ArrayList<Expense> expenses) {
        try {
            File file = new File(fileName);
            File parent = file.getParentFile();

            if (parent != null) {
                parent.mkdirs();
            }

            PrintWriter writer = new PrintWriter(new FileWriter(file));

            for (Expense expense : expenses) {
                writer.println(expense.toCSV());
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Could not save expenses.");
        }
    }

    public ArrayList<Expense> load() {
        ArrayList<Expense> expenses = new ArrayList<>();
        File file = new File(fileName);

        if (!file.exists()) {
            return expenses;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                Expense expense = Expense.fromCSV(line);

                if (expense != null) {
                    expenses.add(expense);
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Could not read saved expenses.");
        }

        return expenses;
    }
}
