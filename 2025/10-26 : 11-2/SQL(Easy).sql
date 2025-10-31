CREATE DATABASE inventory;
USE inventory;

CREATE TABLE Orders (
ORDER_ID INT KEY NOT NULL,
CUSTOMER_NAME VARCHAR(50) NOT NULL,
ORDER_DATE DATE NOT NULL,
TOTAL_AMOUNT FLOAT(2) NOT NULL);

INSERT INTO Orders VALUES
(1, 'Alice', '2025-10-01', 120.50),
(2, 'Bob', '2025-10-02', 80.00),
(3, 'Alice', '2025-10-05', 200.00),
(4, 'Bob', '2025-10-07', 150.00),
(5, 'Charlie', '2025-10-10', 75.00);

SELECT * FROM orders;

SELECT customer_name, SUM(total_amount) AS total_sales FROM orders GROUP BY customer_name;
