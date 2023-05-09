/*
DROP TABLE auditoria_empleados;

CREATE TABLE auditoria_empleados (
    cod_empleado_ant     NUMBER(4, 0),
    apellido_ant         VARCHAR2(15),
    nombre_ant           VARCHAR2(15),
    cod_departamento_ant NUMBER(2, 0),
    salario_ant          NUMBER(7, 2),
    cod_empleado_new     NUMBER(4, 0),
    apellido_new         VARCHAR2(15),
    nombre_new           VARCHAR2(15),
    cod_departamento_new NUMBER(2, 0),
    salario_new          NUMBER(7, 2),
    usuario              VARCHAR2(20),
    fecha                TIMESTAMP
);
*/

-- Cláusula WHEN
-- sólo es válida para disparadores con nivel de fila. 
-- Si está presente, el cuerpo del disparador sólo se 
-- ejecutará para las filas que cumplan la condición 
-- especificada en la cláusula.

CREATE OR REPLACE TRIGGER tr_ejemplo_when BEFORE
    INSERT OR UPDATE OF salary ON employee
    FOR EACH ROW
    WHEN ( new.job_id <> 672 ) -- PRESIDENT
BEGIN
    INSERT INTO auditoria_empleados VALUES (
        :old.employee_id,
        :old.last_name,
        :old.first_name,
        :old.department_id,
        :old.salary,
        :new.employee_id,
        :new.last_name,
        :new.first_name,
        :new.department_id,
        :new.salary,
        user,
        sysdate
    );

END tr_ejemplo_when;
/

-- Esto último es equivalente a:

/*
CREATE OR REPLACE TRIGGER tr_ejemplo_when BEFORE 
	INSERT OR UPDATE OF salary ON employee 
	FOR EACH ROW
BEGIN
  IF :new.job_id <> 672 THEN
    -- Cuerpo del disparador
  END IF;
END tr_ejemplo_when;
*/

