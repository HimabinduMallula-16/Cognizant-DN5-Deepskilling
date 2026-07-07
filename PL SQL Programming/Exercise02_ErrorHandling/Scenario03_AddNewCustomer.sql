USE BankDB;

DELIMITER $$

CREATE PROCEDURE AddNewCustomer(

    IN id INT,

    IN cname VARCHAR(100),

    IN ageValue INT,

    IN bal DECIMAL(10,2)

)

BEGIN

    IF EXISTS

    (

        SELECT *

        FROM Customers

        WHERE customer_id=id

    )

    THEN

        SELECT 'Customer Already Exists'
        AS Message;

    ELSE

        INSERT INTO Customers

        VALUES

        (

            id,

            cname,

            ageValue,

            bal,

            FALSE

        );

        SELECT 'Customer Added Successfully'
        AS Message;

    END IF;

END $$

DELIMITER ;