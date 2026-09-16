# Student-Expense-Tracker

A simple Java-based application for tracking and managing student expenses.

## Overview

Student Expense Tracker is a console-based Java application designed to help students record their daily expenses and keep track of their spending.

The project provides basic expense management, searching, filtering, deletion, and report generation features.

## Features

- Add a new expense
- View all recorded expenses
- Search expenses by category
- Search expenses by date
- Delete an expense
- Generate a spending report
- Store expense records in a CSV file
- Validate user input

## Technologies Used

- Java
- Object-Oriented Programming
- File Handling
- CSV Data Storage
- Git and GitHub

## Project Structure

Student-Expense-Tracker/
├── src/
│   ├── Main.java
│   ├── Category.java
│   ├── Expense.java
│   ├── ExpenseManager.java
│   ├── ExpenseService.java
│   ├── FileManager.java
│   ├── InputValidator.java
│   └── ReportGenerator.java
│
├── data/
│   └── expenses.csv
│
├── README.md
├── statement.md
└── .gitignore

## How to Run

1. Install JDK 17 or later.
2. Open the project in a Java-supported environment.
3. Compile the Java files.
4. Run Main.java.
5. Use the menu shown in the console to manage expenses.

## Main Modules

### 1. Expense Management

Allows the user to add, view, and delete expense records.

### 2. Search and Filtering

Allows expenses to be searched using category or date.

### 3. Report Generation

Calculates total expenses, category-wise spending, and the highest expense.

## Data Storage

Expense records are stored in:

data/expenses.csv

The file is used to save and load expense information.

## Input Validation

The application checks user inputs such as:

- Positive expense amount
- Valid category
- Non-empty description
- Valid integer choices

## Testing

The application can be tested by adding different expenses, viewing them, searching by category or date, deleting records, and generating reports.

## Future Improvements

- Add a graphical user interface
- Add monthly and yearly reports
- Add budget limits
- Add charts for spending analysis
- Add database support

