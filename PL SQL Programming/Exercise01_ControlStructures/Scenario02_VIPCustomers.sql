USE BankDB;

UPDATE Customers
SET IsVIP = TRUE
WHERE balance > 10000;

SELECT
    customer_id,
    customer_name,
    balance,
    IsVIP
FROM Customers;