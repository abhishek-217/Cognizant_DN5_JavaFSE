-- Exercise 3: Stored Procedures

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
    v_interest_rate NUMBER := 0.01;

BEGIN

    UPDATE Accounts
    SET Balance = Balance + (Balance * v_interest_rate)
    WHERE AccountType = 'Savings';

    DBMS_OUTPUT.PUT_LINE(
    'Monthly interest processed successfully');

EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(
        'Error: ' || SQLERRM);

END;
/

--EXEC ProcessMonthlyInterest;
--
--SELECT *
--FROM Accounts;