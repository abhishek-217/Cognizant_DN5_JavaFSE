-- Exercise 1 : Control Structures
-- Scenario 1 : Apply discount for customers above age 60

DECLARE

CURSOR customer_cursor IS
SELECT CustomerID,
       FLOOR(MONTHS_BETWEEN(SYSDATE,DOB)/12) Age
FROM Customers;

v_customerid NUMBER;
v_age NUMBER;

BEGIN

OPEN customer_cursor;

LOOP

FETCH customer_cursor
INTO v_customerid,v_age;

EXIT WHEN customer_cursor%NOTFOUND;

DBMS_OUTPUT.PUT_LINE(
'Customer '
||v_customerid||
' Age = '||
v_age
);

IF v_age>60 THEN

UPDATE Loans
SET InterestRate=InterestRate-1
WHERE CustomerID=v_customerid;

DBMS_OUTPUT.PUT_LINE(
'Discount Applied'
);

END IF;

END LOOP;

CLOSE customer_cursor;

COMMIT;

END;
/