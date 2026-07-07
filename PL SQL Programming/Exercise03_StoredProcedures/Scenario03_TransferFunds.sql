USE BankDB;

DELIMITER $$

CREATE PROCEDURE TransferFunds(

    IN fromAccount INT,

    IN toAccount INT,

    IN amount DECIMAL(10,2)

)

BEGIN

    DECLARE availableBalance DECIMAL(10,2);

    START TRANSACTION;

    SELECT balance

    INTO availableBalance

    FROM Accounts

    WHERE account_id = fromAccount;

    IF availableBalance >= amount THEN

        UPDATE Accounts

        SET balance = balance - amount

        WHERE account_id = fromAccount;

        UPDATE Accounts

        SET balance = balance + amount

        WHERE account_id = toAccount;

        COMMIT;

        SELECT 'Transfer Completed Successfully'
        AS Message;

    ELSE

        ROLLBACK;

        SELECT 'Transfer Failed - Insufficient Balance'
        AS Message;

    END IF;

END $$

DELIMITER ;