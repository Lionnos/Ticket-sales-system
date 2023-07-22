create database dbBoletos_HenryLeon;

create table user (
    idUser varchar(36) not null,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    gender bit not null,
    email varchar(100) unique not null,
    username varchar(50) unique not null,
    password varchar(50) not null,
    created_at datetime not null,

    primary key (idUser)
);


create table client (
    idClient varchar(36) not null,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    document_type varchar(50) not null,
    document_number int(15) unique not null,
    ruc int(11) null,
    business_name varchar(100) null, -- nombre de negocio
    gender bit not null,
    telephone int(9) unique not null,
    address varchar(100) null, --direccion

    primary key (idClient)
);


create table vehicle (
    idVehicle varchar(6) not null,
    description varchar(max) null,
    plate varchar(7) unique not null,
    model varchar(50) unique not null,
    seat_numbers int(2) not null, -- numero de asientos de vehiculo
    state bit default 1 not null,

    primary key (idVehicle)
);


create table programming (
    idProgramming varchar(6) not null,
    idVehicle varchar(6) not null,
    origin varchar(50) not null, --ciudad de origen
    destination varchar(50) not null, --ciudad destino
    programming_date date not null,
    programming_hour time not null,
    total_cost decimal(100,2) not null,
    state bit default 1 not null,

    primary key (idProgramming),
    foreign key (idVehicle) references vehicle(idVehicle)
);


create table ticket (
    idTicket varchar(12) not null,
    idUser varchar(36) not null,
    idClient varchar(36) not null,
    idProgramming varchar(6) not null,
    description varchar(max),
    destination varchar(50) not null,
    seat_number int(2) not null, --numero de asiento
    created_at datetime not null, --fecha de registro
    travel_date datetime not null, --fecha de viaje
    departure_time time not null, --hora de salida
    money_type varchar(50) not null, --tipo de moneda
    price decimal(10,2) not null, --precio
    state bit default 1 not null, --estado del boleto

    primary key (idTicket),
    foreign Key (idUser) references user(idUser),
    foreign Key (idClient) references client(idClient),
    foreign Key (idProgramming) references programming(idProgramming)
);