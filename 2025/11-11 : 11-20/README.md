# 📅 November 11, 2025 to November 20, 2025

These prompts were made through DeepSeek. The goal of this is to furthur practice OOP as by the looks of it, the basic syntax is taken care of.

## Legend
| Symbol | Meaning | Comment |
|--------|---------|---------|
| ✅ | Accomplished | Able to create a good code by myself |
| 🚧 | Accomplished But... | Created the code but can be further improved |
| ❌ | Not Completed | Not able to create a code within the deadline |

## 🐍 Python
1. Intermediate: Bank Account System ❌
- Create a BankAccount class with private attributes for account number, holder name, and balance. Implement methods for: deposit(amount), withdraw(amount) (should prevent overdrafts), get_balance() (returns formatted balance), transfer(amount, target_account). Add a class variable to track the total number of accounts created. Create multiple accounts and demonstrate deposits, withdrawals, and transfers between accounts.

2. High-Intermediate: Library Management with Inheritance ❌
- Create a base class LibraryItem with attributes title, item_id, is_checked_out, and methods check_out(), return_item(). Create two subclasses: Book (adds author, page_count), DVD (adds director, duration_minutes). Create a Library class that maintains a collection of LibraryItem objects. It should have methods to: Add new items, Search items by title/author/director, Display all available items, Get statistics (total items, checked out count). Demonstrate polymorphism by treating all items as LibraryItem objects in the library collection.

## 🟣 Kotlin
3. Intermediate: Smart Home System with Sealed Classes ❌
- Create a sealed class SmartDevice with properties name and isEnabled. Create subclasses: Light (adds brightnessLevel), Thermostat (adds currentTemperature, targetTemperature), SecurityCamera (adds isRecording), Each subclass should have methods turnOn() and turnOff() that update the device state. Create a SmartHome class that manages a list of SmartDevice objects and can: Turn all devices on/off, Find devices by type, Get devices that are currently on

4. High-Intermediate: E-commerce System with Interfaces ❌
- Create interfaces: Discountable with method applyDiscount(percentage: Double), Shippable with properties weight and shippingCost. Create an abstract class Product with properties name, price, and quantity. Create concrete classes: PhysicalProduct (inherits from Product, implements Shippable and Discountable), DigitalProduct (inherits from Product, implements Discountable only), Bundle (contains multiple Product objects, implements Discountable). Create a ShoppingCart class that can add products, calculate total cost (including shipping where applicable), and apply discounts to eligible items.

## 🗄️ MySQL
5. Intermediate: University Database Design ❌
- Design a database for a university with tables: students (student_id, name, enrollment_date), courses (course_id, title, credits), enrollments (enrollment_id, student_id, course_id, grade). Write queries to: Find all students enrolled in a specific course, Calculate the average grade for each course, Find students who are taking more than 3 courses, List all courses with the number of enrolled students

6. High-Intermediate: Employee Hierarchy System ❌
- Create tables: employees (employee_id, name, position, department, salary), reporting_structure (manager_id, employee_id). Write queries to: Find all direct reports for a specific manager, Calculate the total salary cost for each department, Find employees who earn more than their manager (self-join), List the management chain/hierarchy for a specific employee (who reports to whom up to the top)

## 📊 Pandas + NumPy + Matplotlib
7. Intermediate: Student Gradebook System ❌ 
- Create a Gradebook class that uses Pandas DataFrames to manage student data. The class should: Initialize with columns: student_id, name, math, science, english. Have methods to: Add new students, Update grades for specific subjects, Calculate each student's average grade, Add a column for grade status (Pass/Fail based on average >= 60), Display students who are failing, Use NumPy to calculate class statistics (mean, median, std dev)

8 . High-Intermediate: Sales Analytics Dashboard ❌
- Create a SalesAnalyzer class that processes sales data with columns: date, product_category, sales_amount, region. The class should: Load data from a CSV file into a DataFrame. Have methods to: Get monthly sales trends using time series analysis, Compare sales across regions and categories, Identify top-performing products, Calculate growth rates month-over-month. Use Matplotlib to generate: Monthly sales line chart, Sales by category pie chart, Regional comparison bar chart, Implement method chaining for fluid data processing

## 🧩 LeetCode
9. [Two Sums](https://leetcode.com/problems/two-sum/description/) ❌
- Using Python and Kotlin solve the problem
