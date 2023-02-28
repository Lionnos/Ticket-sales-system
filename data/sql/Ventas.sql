CREATE DATABASE SISTEMA_PASAJES

USE SISTEMA_PASAJES

CREATE TABLE CLIENTE(
    cliente_ID VARCHAR(15) PRIMARY KEY, --CLIENT-0001
    cliente_DNI INT NOT NULL CHECK(cliente_DNI like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')unique,--8
    cliente_nombre VARCHAR(20) NOT NULL,
    cliente_apellido VARCHAR(40) NOT NULL,
    cliente_direccion VARCHAR(50),
    cliente_celular INT NOT NULL CHECK(cliente_celular like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')unique --9
);

CREATE TABLE USUARIO (
    usuario_ID VARCHAR(36) PRIMARY KEY,
    usuario_nombre VARCHAR(20) NOT NULL,
    usuario_apellido VARCHAR(40) NOT NULL,
    usuario_cargo VARCHAR(50) NOT NULL,
    usuario_telefono INT NOT NULL CHECK(usuario_telefono like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')unique --9
);

CREATE TABLE RESERVA (
    reserva_ID VARCHAR(15) PRIMARY KEY, --RESERVE-0001
    reserva_destino VARCHAR(40) NOT NULL,
    reserva_lugar VARCHAR(40) NOT NULL,
    reserva_fecha DATE NOT NULL,
    reserva_hora TIME NOT NULL,
    reserva_asiento INT NOT NULL,
    reserva_disponible BIT,
    cliente_ID VARCHAR(15) NULL, --FK
    usuario_ID VARCHAR(36) NOT NULL, --FK

    -- llave foranea (FK)
    FOREIGN KEY(cliente_ID) REFERENCES CLIENTE(cliente_ID),
    FOREIGN KEY(usuario_ID) REFERENCES USUARIO(usuario_ID)
);

CREATE TABLE TIPO_PAGO (
    pago_ID VARCHAR(15) PRIMARY KEY, -- PAY-0001
    pago_efectivo MONEY,
    pago_tarjeta MONEY,
    pago_movil MONEY
);


CREATE TABLE VEHICULO(
    vehiculo_placa CHAR(18) PRIMARY KEY, --PLACA
    vehiculo_marca CHAR(18) NOT NULL,
    vehiculo_disponibilidad VARCHAR(30) NOT NULL,
    vehiculo_color VARCHAR(18) 
);

CREATE Table VENTA (
    venta_ID VARCHAR(15) PRIMARY KEY, --SALE-0001
    venta_destino VARCHAR(50) NOT NULL,
    venta_fecha DATE NOT NULL,
    usuario_ID VARCHAR(36) NOT NULL, --FK
    cliente_ID VARCHAR(15) NOT NULL, --FK
    pago_ID VARCHAR(15) NOT NULL, --FK
    vehiculo_placa CHAR(18) NOT NULL, --FK

    -- llave foranea (FK)
    FOREIGN KEY(usuario_ID) REFERENCES USUARIO(usuario_ID),
    FOREIGN KEY(cliente_ID) REFERENCES CLIENTE(cliente_ID),
    FOREIGN KEY(pago_ID) REFERENCES TIPO_PAGO(pago_ID),
    FOREIGN KEY(vehiculo_placa) REFERENCES VEHICULO(vehiculo_placa)
);

CREATE TABLE VIAJE (
    viaje_ID VARCHAR(15) PRIMARY KEY,--TRIP-0001
    viaje_fecha DATE NOT NULL,
    viaje_hora TIME NOT NULL,
    viaje_destino VARCHAR(50) NOT NULL,
    vehiculo_placa CHAR(18) NOT NULL, -- FK

    -- llave foranea (FK)
    FOREIGN KEY(vehiculo_placa) REFERENCES VEHICULO(vehiculo_placa)
);

CREATE TABLE BOLETA( 
    boleta_ID VARCHAR(15) PRIMARY KEY,--TICKET-0001
    boleta_precio MONEY NOT NULL,
    boleta_asiento INT NOT NULL,
    venta_ID VARCHAR(15) NOT NULL, -- FK
    viaje_ID VARCHAR(15) NOT NULL, -- FK

    -- llave foranea (FK)
    FOREIGN KEY(venta_ID) REFERENCES VENTA(venta_ID),
    FOREIGN KEY(viaje_ID) REFERENCES VIAJE(viaje_ID)
);


--Insertar Vehiculo
INSERT INTO VEHICULO (vehiculo_placa, vehiculo_marca, vehiculo_disponibilidad, vehiculo_color)
VALUES ('ABC-321','TOYOTA','Disponible','Negro');