USE BankDB;

UPDATE Loans l
JOIN Customers c
ON l.customer_id = c.customer_id
SET l.interest_rate = l.interest_rate - 1
WHERE c.age > 60;

SELECT
    l.loan_id,
    c.customer_name,
    c.age,
    l.interest_rate
FROM Loans l
JOIN Customers c
ON l.customer_id = c.customer_id;