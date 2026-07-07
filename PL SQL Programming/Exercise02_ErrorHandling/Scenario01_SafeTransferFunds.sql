USE BankDB;

DELIMITER $$

CREATE PROCEDURE SafeTransferFunds(
    IN fromAccount INT,
    IN toAccount INT,
    IN transferAmount DECIMAL(10,2)
)

BEGIN

    DECLARE currentBalance DECIMAL(10,2);

    START TRANSACTION;

    SELECT balance
    INTO currentBalance
    FROM Accounts
    WHERE account_id = fromAccount;

    IF currentBalance >= transferAmount THEN

        UPDATE Accounts
        SET balance = balance - transferAmount
        WHERE account_id = fromAccount;

        UPDATE Accounts
        SET balance = balance + transferAmount
        WHERE account_id = toAccount;

        COMMIT;

        SELECT 'Transfer Successful' AS Message;

    ELSE

        ROLLBACK;

        SELECT 'Insufficient Balance' AS Message;

    END IF;

END $$

DELIMITER ;