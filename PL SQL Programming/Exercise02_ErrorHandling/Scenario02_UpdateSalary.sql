USE BankDB;

DELIMITER $$

CREATE PROCEDURE UpdateSalary(

    IN empID INT,

    IN percentage DECIMAL(5,2)

)

BEGIN

    IF EXISTS
    (
        SELECT *
        FROM Employees
        WHERE employee_id = empID
    )

    THEN

        UPDATE Employees

        SET salary =
        salary +
        (salary * percentage / 100)

        WHERE employee_id = empID;

        SELECT 'Salary Updated Successfully'
        AS Message;

    ELSE

        SELECT 'Employee ID Not Found'
        AS Message;

    END IF;

END $$

DELIMITER ;