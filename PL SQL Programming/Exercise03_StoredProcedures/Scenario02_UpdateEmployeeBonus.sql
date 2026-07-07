USE BankDB;

DELIMITER $$

CREATE PROCEDURE UpdateEmployeeBonus(

    IN dept VARCHAR(50),

    IN bonusPercent DECIMAL(5,2)

)

BEGIN

    UPDATE Employees

    SET salary = salary +
                 (salary * bonusPercent / 100)

    WHERE department = dept;

    SELECT CONCAT(
        'Bonus Updated for Department: ',
        dept
    ) AS Message;

END $$

DELIMITER ;