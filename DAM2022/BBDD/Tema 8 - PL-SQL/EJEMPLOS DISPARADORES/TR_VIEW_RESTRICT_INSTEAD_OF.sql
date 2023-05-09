-- INSTEAD OF Triggers:
-- Los INSTEAD OF Triggers proporcionan una manera transparente de 
-- modificar vistas que no deben ser modificadas directamente 
-- a través de sentencias DML (INSERT, UPDATE y DELETE). 
-- Estos Triggers son llamados INSTEAD OF Triggers, ya que, 
-- a diferencia de otros tipos, Oracle dispara el Trigger en lugar 
-- de ejecutar la sentencia de activación.
-- Puede escribir sentencias INSERT, UPDATE y DELETE en vistas 
-- y el INSTEAD OF Trigger se dispara para actualizar las tablas 
-- subyacentes de manera apropiada. 
-- Los INSTEAD OF Triggers se activan por cada fila de la vista modificada.

/*
Creamos la vista: dept_vw que nos muestra el nombre y código de 
cada departamento de la empresa, dicha vista posee el campo virtual: en_uso 
que nos dice si dicho departamento tiene empleados trabajando en él. 
Nota: Esta vista permite la modificación de los datos de la 
tabla base (departments) a través de ella.
*/
---
CREATE OR REPLACE VIEW dept_vw (
    cod_dept,
    nomb_dept,
    en_uso
) AS
    SELECT
        department_id,
        name,
        CASE
            WHEN 0 < (SELECT nvl(COUNT(*), 0) FROM employee e
                WHERE e.department_id = d.department_id ) THEN 'S'
            ELSE 'N'
        END 
    FROM department d;
/*Creamos la vista: dept_vw que nos muestra el nombre y código de cada departamento de la empresa, dicha vista posee el campo virtual: en_uso que nos dice si dicho departamento tiene empleados trabajando en él. Nota: Esta vista permite la modificación de los datos de la tabla base (departments) a través de ella.*/

---
/*Consultamos la vista.*/
SELECT
    *
FROM
    dept_vw; 

---

/*
Creamos un Trigger que impida eliminar datos de la tabla department 
a través de la vista: dept_vw
*/
CREATE OR REPLACE TRIGGER tr_dept_secure INSTEAD OF
    DELETE ON dept_vw
BEGIN
    raise_application_error(-20023, 'Esta operación no es permitida, contacte el Administrador!.');
END tr_dept_secure;
/

---
 /* Tratamos de eliminar el departamento 10 a través de la vista: dept_vw. */
DELETE FROM dept_vw
WHERE
    cod_dept = 10;