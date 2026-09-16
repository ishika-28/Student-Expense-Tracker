public class Expense {
    private int id;
    private double amount;
    private Category category;
    private String date;
    private String description;

    public Expense(int id, double amount, Category category, String date, String description) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String toCSV() {
        return id + "," + amount + "," + category + "," + date + "," + description;
    }

    public static Expense fromCSV(String line) {
        String[] parts = line.split(",", -1);

        if (parts.length < 5) {
            return null;
        }

        try {
            int id = Integer.parseInt(parts[0]);
            double amount = Double.parseDouble(parts[1]);
            Category category = Category.valueOf(parts[2].toUpperCase());
            return new Expense(id, amount, category, parts[3], parts[4]);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return id + " | Rs." + amount + " | " + category +
               " | " + date + " | " + description;
    }
}
