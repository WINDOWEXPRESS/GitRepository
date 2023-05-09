CREATE TABLE log_history (
    employee_id   NUMBER(4, 0),
    start_date    DATE,
    end_date      DATE,
    job_id        NUMBER(3, 0),
    department_id NUMBER(2, 0)
);
/*
Creamos el Trigger: tr_log_history, el cual restringe a todos usuarios 
(excepto system y sys) el privilegio de modificar los datos de la 
tabla log_history. Este Trigger cabe en la clasificación de 
Trigger de sentencia y BEFORE Trigger
*/
CREATE OR REPLACE TRIGGER tr_log_history BEFORE
    INSERT OR UPDATE OR DELETE ON log_history
BEGIN
    IF user NOT IN ( 'SYSTEM', 'SYS' ) THEN
        raise_application_error(-20001, 'Esta tabla no debe ser modificada bajo ninguna circunstancia');
    END IF;
END tr_log_history;
/
---
/*
Conectados con emple, probamos el Trigger: tr_log_history tratando 
de insertar un nuevo registro a la tabla: log_history.
*/
INSERT INTO log_history (
    employee_id,
    start_date,
    end_date,
    job_id,
    department_id
) VALUES (
    101,
    add_months(sysdate, - 18),
    sysdate,
    'IT_PROG',
    100
);
-- resta 18 meses a fecha actual.

---
ALTER TRIGGER tr_log_history DISABLE; -- deshabilita el Trigger
---
DROP TRIGGER tr_log_history; -- elimina el Trigger
---