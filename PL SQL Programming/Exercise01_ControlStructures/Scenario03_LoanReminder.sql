USE BankDB;

SELECT
    c.customer_name,
    l.loan_id,
    l.due_date,
    CONCAT(
        'Reminder: Dear ',
        c.customer_name,
        ', your loan (ID ',
        l.loan_id,
        ') is due on ',
        DATE_FORMAT(l.due_date,'%d-%m-%Y')
    ) AS Reminder_Message
FROM Customers c
JOIN Loans l
ON c.customer_id = l.customer_id
WHERE l.due_date
BETWEEN CURDATE()
AND DATE_ADD(CURDATE(),INTERVAL 30 DAY);