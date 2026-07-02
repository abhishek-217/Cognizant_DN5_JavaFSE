DECLARE
    CURSOR due_loans IS
        SELECT c.CustomerID,
               c.Name,
               l.LoanID,
               l.EndDate
        FROM Loans l
        JOIN Customers c
        ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE+30;

BEGIN

    FOR loan_rec IN due_loans LOOP

        DBMS_OUTPUT.PUT_LINE(
        'Reminder: Customer '
        ||loan_rec.Name||
        ' (ID: '||loan_rec.CustomerID||
        ') your loan ID '
        ||loan_rec.LoanID||
        ' is due on '
        ||TO_CHAR(loan_rec.EndDate,'DD-MON-YYYY')
        );

    END LOOP;

END;
/