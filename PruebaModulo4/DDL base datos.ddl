-- Generado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   en:        2020-06-30 22:13:40 CLT
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



DROP TABLE cargoempl CASCADE CONSTRAINTS;

DROP TABLE cliente CASCADE CONSTRAINTS;

DROP TABLE empleado CASCADE CONSTRAINTS;

DROP TABLE estadoemp CASCADE CONSTRAINTS;

DROP TABLE estadosol CASCADE CONSTRAINTS;

DROP TABLE pagosol CASCADE CONSTRAINTS;

DROP TABLE solicitud CASCADE CONSTRAINTS;

CREATE TABLE cargoempl (
    idcargoe   INTEGER NOT NULL,
    nombcargo  VARCHAR2(50 CHAR)
);

ALTER TABLE cargoempl ADD CONSTRAINT cargoempl_pk PRIMARY KEY ( idcargoe );

CREATE TABLE cliente (
    idcliente           INTEGER NOT NULL,
    rutcliente          VARCHAR2(10 CHAR),
    nombrecliente       VARCHAR2(100 CHAR),
    direccioncliente    VARCHAR2(100 CHAR),
    comunacliente       VARCHAR2(100 CHAR),
    actividadeconomica  VARCHAR2(100 CHAR),
    nombrecontacto      VARCHAR2(100 CHAR),
    mailcontacto        VARCHAR2(150 CHAR)
);

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( idcliente );

CREATE TABLE empleado (
    idempleado           INTEGER NOT NULL,
    rutempleado          VARCHAR2(100 CHAR),
    nombreempleado       VARCHAR2(100 CHAR),
    mailempleado         VARCHAR2(150 CHAR),
    fechacontratacion    DATE,
    estadoemp_idestadoe  INTEGER NOT NULL,
    cargoempl_idcargoe   INTEGER NOT NULL
);

ALTER TABLE empleado ADD CONSTRAINT empleado_pk PRIMARY KEY ( idempleado );

CREATE TABLE estadoemp (
    idestadoe   INTEGER NOT NULL,
    nombestado  VARCHAR2(50 CHAR)
);

ALTER TABLE estadoemp ADD CONSTRAINT estadoemp_pk PRIMARY KEY ( idestadoe );

CREATE TABLE estadosol (
    idestadosol  INTEGER NOT NULL,
    nombsol      VARCHAR2(50 CHAR)
);

ALTER TABLE estadosol ADD CONSTRAINT estadosol_pk PRIMARY KEY ( idestadosol );

CREATE TABLE pagosol (
    idpago    INTEGER NOT NULL,
    nombpago  VARCHAR2(50 CHAR)
);

ALTER TABLE pagosol ADD CONSTRAINT pagosol_pk PRIMARY KEY ( idpago );

CREATE TABLE solicitud (
    idsolicitud            INTEGER NOT NULL,
    fechasolic             DATE,
    direccionsol           VARCHAR2(100 CHAR),
    comunasol              VARCHAR2(100 CHAR),
    estadosol_idestadosol  INTEGER NOT NULL,
    pagosol_idpago         INTEGER NOT NULL,
    empleado_idempleado    INTEGER NOT NULL,
    cliente_idcliente      INTEGER NOT NULL,
    fechavisita            DATE
);

ALTER TABLE solicitud ADD CONSTRAINT solicitud_pk PRIMARY KEY ( idsolicitud );

ALTER TABLE empleado
    ADD CONSTRAINT empleado_cargoempl_fk FOREIGN KEY ( cargoempl_idcargoe )
        REFERENCES cargoempl ( idcargoe );

ALTER TABLE empleado
    ADD CONSTRAINT empleado_estadoemp_fk FOREIGN KEY ( estadoemp_idestadoe )
        REFERENCES estadoemp ( idestadoe );

ALTER TABLE solicitud
    ADD CONSTRAINT solicitud_cliente_fk FOREIGN KEY ( cliente_idcliente )
        REFERENCES cliente ( idcliente );

ALTER TABLE solicitud
    ADD CONSTRAINT solicitud_empleado_fk FOREIGN KEY ( empleado_idempleado )
        REFERENCES empleado ( idempleado );

ALTER TABLE solicitud
    ADD CONSTRAINT solicitud_estadosol_fk FOREIGN KEY ( estadosol_idestadosol )
        REFERENCES estadosol ( idestadosol );

ALTER TABLE solicitud
    ADD CONSTRAINT solicitud_pagosol_fk FOREIGN KEY ( pagosol_idpago )
        REFERENCES pagosol ( idpago );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             7
-- CREATE INDEX                             0
-- ALTER TABLE                             13
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
