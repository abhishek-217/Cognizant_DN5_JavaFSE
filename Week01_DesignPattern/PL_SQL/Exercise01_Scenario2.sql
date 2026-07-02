SET SERVEROUTPUT ON;

DECLARE

CURSOR customer_cursor IS
SELECT CustomerID, Name, Balance
FROM Customers;

v_customerid NUMBER;
v_name VARCHAR2(100);
v_balance NUMBER;

BEGIN

OPEN customer_cursor;

LOOP

FETCH customer_cursor
INTO v_customerid,v_name,v_balance;

EXIT WHEN customer_cursor%NOTFOUND;

IF v_balance > 1200 THEN

DBMS_OUTPUT.PUT_LINE(
v_name || ' promoted to VIP'
);

END IF;

END LOOP;

CLOSE customer_cursor;

END;
