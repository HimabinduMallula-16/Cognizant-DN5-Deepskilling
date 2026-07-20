CREATE DATABASE ormlearn;
USE ormlearn;
CREATE TABLE country(
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);
INSERT INTO country VALUES ('IN','India');
INSERT INTO country VALUES ('US','United States of America');

SELECT * FROM country;

CREATE DATABASE querymethodsdb;
USE querymethodsdb;
CREATE TABLE country(
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);
INSERT INTO country VALUES ('IN','India');

INSERT INTO country VALUES ('US','United States of America');

INSERT INTO country VALUES ('AU','Australia');

INSERT INTO country VALUES ('ZA','South Africa');

INSERT INTO country VALUES ('LU','Luxembourg');

INSERT INTO country VALUES ('GS','South Georgia and the South Sandwich Islands');

INSERT INTO country VALUES ('SS','South Sudan');

INSERT INTO country VALUES ('BV','Bouvet Island');

INSERT INTO country VALUES ('TF','French Southern Territories');

INSERT INTO country VALUES ('UM','United States Minor Outlying Islands');

INSERT INTO country VALUES ('DJ','Djibouti');

INSERT INTO country VALUES ('GP','Guadeloupe');

INSERT INTO country VALUES ('ZM','Zambia');

INSERT INTO country VALUES ('ZW','Zimbabwe');

CREATE TABLE stock(
    st_id INT PRIMARY KEY AUTO_INCREMENT,
    st_code VARCHAR(10),
    st_date DATE,
    st_open DECIMAL(10,2),
    st_close DECIMAL(10,2),
    st_volume BIGINT
);

INSERT INTO stock(st_code,st_date,st_open,st_close,st_volume) VALUES
('FB','2019-09-03',184.00,182.39,9779400),
('FB','2019-09-04',184.65,187.14,11308000),
('FB','2019-09-05',188.53,190.90,13876700),

('GOOGL','2019-04-22',1236.67,1253.76,954200),
('GOOGL','2019-04-23',1256.64,1270.59,1593400),
('GOOGL','2019-04-24',1270.59,1260.05,1169800),

('NFLX','2018-12-24',242.00,233.88,9547600),
('NFLX','2018-12-21',263.83,246.39,21397600),
('NFLX','2018-12-26',233.92,253.67,14402700);


CREATE DATABASE payrolldb;

USE payrolldb;

CREATE TABLE department(
    dp_id INT PRIMARY KEY,
    dp_name VARCHAR(45)
);

CREATE TABLE employee(
    em_id INT PRIMARY KEY,
    em_name VARCHAR(45),
    em_salary DECIMAL(10,2),
    em_permanent BOOLEAN,
    em_date_of_birth DATE,
    em_dp_id INT,
    FOREIGN KEY(em_dp_id) REFERENCES department(dp_id)
);

CREATE TABLE skill(
    sk_id INT PRIMARY KEY,
    sk_name VARCHAR(45)
);

CREATE TABLE employee_skill(
    es_id INT PRIMARY KEY,
    es_em_id INT,
    es_sk_id INT,
    FOREIGN KEY(es_em_id) REFERENCES employee(em_id),
    FOREIGN KEY(es_sk_id) REFERENCES skill(sk_id)
);

INSERT INTO department VALUES
(1,'HR'),
(2,'Development'),
(3,'Testing');

INSERT INTO employee VALUES
(1,'Rahul',50000,TRUE,'2000-04-12',2),
(2,'Anjali',45000,TRUE,'1999-08-20',1),
(3,'Rohit',60000,FALSE,'1998-11-15',2);

INSERT INTO skill VALUES
(1,'Java'),
(2,'Spring Boot'),
(3,'SQL'),
(4,'Python');

INSERT INTO employee_skill VALUES
(1,1,1),
(2,1,2),
(3,2,3),
(4,3,1),
(5,3,4);

SELECT * FROM department;

SELECT * FROM employee;

SELECT * FROM skill;

SELECT * FROM employee_skill;