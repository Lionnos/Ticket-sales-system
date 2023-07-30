create database dbVentaBoletos;

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


create table Tvehicle (
    idVehicle varchar(12) not null,
    description text null,
    plate varchar(7) unique not null,
    model varchar(50) unique not null,
    seat_numbers tinyint not null, -- numero de asientos de vehiculo
    state bit default 1 not null,

    primary key (idVehicle)
);


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


-- Inserciones
INSERT INTO Tclient (idClient, first_name, last_name, document_type, document_number, ruc, business_name, gender, telephone, address)
VALUES
('1a2b3c4d-5e6l', 'John', 'Doe', 'DNI', 12345678901, NULL, NULL, 1, 123456789, '123 Main St'),
('2m3n4o5p-6q7r', 'Jane', 'Smith', 'Passport', 98765432109, NULL, NULL, 0, 987654321, '456 Elm St'),
('3a4b5c6d-7e8f', 'Michael', 'Johnson', 'DNI', 56789012345, NULL, NULL, 1, 567890123, '789 Oak St'),
('4o5p6q7r-8s9t', 'Emily', 'Brown', 'Passport', 65432109876, NULL, NULL, 0, 654321098, '101 Pine St'),
('5d6e7f8g-9h0i', 'David', 'Lee', 'DNI', 98765432100, 12345678901, 'ABC Corp', 1, 987654322, '222 Maple St');


select * from Tclient