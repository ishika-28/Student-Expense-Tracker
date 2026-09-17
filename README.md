# Student-Expense-Tracker

A simple Java program for students to track daily spending.

## Overview

It’s a console-based tool. Record expenses, manage them, search by category or date, and generate basic reports.

## Features

1. Add an expense.
2. View the list.
3. Filter by category or date.
4. Delete entries.
5. Generate a report.
6. Save everything to CSV.
7. Validate input so garbage doesn’t get in.

## Technologies Used

Java. 
Object-oriented design. 
File handling. 
CSV storage. 
Git and GitHub.

Project Structure

## Student-Expense-Tracker/

├── src/
│ ├── Main.java
│ ├── Category.java
│ ├── Expense.java
│ ├── ExpenseManager.java
│ ├── ExpenseService.java
│ ├── FileManager.java
│ ├── InputValidator.java
│ └── ReportGenerator.java
│
├── data/
│ └── expenses.csv
│
├── README.md
└── statement.md

## How to Run

Install JDK 17 or later, Open the project in any Java-supported IDE or editor. Compile all files. Run Main.java. Follow the on-screen menu.

## Main Modules

Expense Management handles adding, viewing, and deleting records. Search and Filtering lets you look up expenses by category or date. Report Generation calculates totals, breaks down spending by category, and flags the highest single expense.

## Data Storage

Records live in `data/expenses.csv`. The app reads from it and writes back to it.

## Input Validation

The app rejects invalid entries: amounts must be greater than zero, categories have to be valid, descriptions can’t be blank, and menu choices must be real numbers.

## Testing
Add various expenses, then view them. Try searching with different categories and dates. Test deletion and report generation to make sure nothing breaks.

## Future Improvements

- A GUI would help. 
- Monthly and yearly reports. 
- Budget limits. Charts for spending patterns. 
- Maybe a database instead of CSV.
