USE BankDB;

DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()

BEGIN

    UPDATE Accounts

    SET balance = balance + (balance * 0.01)

    WHERE account_type = 'Savings';

    SELECT 'Monthly Interest Applied Successfully'
    AS Message;

END $$

DELIMITER ;