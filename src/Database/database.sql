create database dbVentaBoletos;

use dbVentaBoletos;

--TABLA PARA USUARIOS
create table Tuser (
    idUser varchar(12) not null,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    gender bit not null,
    email varchar(100) unique not null,
    username varchar(50) unique not null,
    password varchar(50) not null,
    created_at datetime not null,

    primary key (idUser)
);

--TABLA PARA CLIENTES
create table Tclient (
    idClient varchar(12) not null,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    document_type varchar(50) not null,
    document_number bigint unique not null,  --size 15
    ruc bigint null, --size 11
    business_name varchar(100) null, -- nombre de negocio
    gender bit not null,
    telephone int unique not null, --size 9
    address varchar(100) null, --direccion

    primary key (idClient)
);

--TABLA PARA VEHICULOS
create table Tvehicle (
    idVehicle varchar(12) not null,
    description text null,
    plate varchar(7) unique not null,
    model varchar(50) not null,
    seat_numbers tinyint not null, -- numero de asientos de vehiculo
    state bit default 1 not null,

    primary key (idVehicle)
);

--TABLA DE PROGRAMACION SEGUN EL VEHICULO
create table Tprogramming (
    idProgramming varchar(12) not null,
    idVehicle varchar(12) not null,
    origin varchar(50) not null, --ciudad de origen
    destination varchar(50) not null, --ciudad destino
    programming_date date not null,
    programming_hour time not null,
    total_cost decimal(5,2) null,
    state bit default 1 not null,

    primary key (idProgramming),
    foreign key (idVehicle) references Tvehicle(idVehicle)
);

--TABLA PARA USUARIOS
create table Tticket (
    idTicket varchar(12) not null,
    idUser varchar(12) not null,
    idClient varchar(12) not null,
    idProgramming varchar(12) not null,
    description text null,
    destination varchar(50) not null,
    seat_number tinyint not null, --numero de asiento
    created_at date not null, --fecha de registro
    travel_date date not null, --fecha de viaje
    departure_time time not null, --hora de salida
    money_type varchar(50) not null, --tipo de moneda
    price decimal(5,2) not null, --precio
    state bit default 1 not null, --estado del boleto

    primary key (idTicket),
    foreign Key (idUser) references Tuser(idUser),
    foreign Key (idClient) references Tclient(idClient),
    foreign Key (idProgramming) references Tprogramming(idProgramming)
);

-- INSERTANDO USUARIO PARA REALIZAR LAS PRUEBAS
INSERT INTO Tuser (idUser, first_name, last_name, gender, email, username, password, created_at)
VALUES ('ea41c2ff614f', 'Henry', 'Leon', 1, 'Ghreengate@gmail.com', 'Lionos', '@1001@', '2023-07-30 12:34:56');

-- PARA MOSTRAR TODAS LAS TABLAS
select * from Tclient
SELECT * from Tvehicle
select * from Tuser
select * from Tprogramming
select * from Tticket