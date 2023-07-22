

CREATE TABLE ticket (
    idTicket nvarchar(255) PRIMARY KEY,
    idClient nvarchar(255),
    idUser nvarchar(255),
    idProgramming nvarchar(255),
    idDestination nvarchar(255),
    
    description varchar(max),
    created_at datetime,
    travel_date datetime,
    departure_time time,
    money nvarchar(255),
    price decimal,
    state bit
)
GO

CREATE TABLE user (
    idUser nvarchar(255) PRIMARY KEY,
    first_name varchar(100) NOT NULL,
    last_name varchar(100),
    gender bit,
    email varchar(100) UNIQUE NOT NULL,
    username varchar(50) UNIQUE NOT NULL,
    password varchar(50) NOT NULL,
    created_at datetime
)
GO

CREATE TABLE client (
    idClient nvarchar(255) PRIMARY KEY,
    first_name nvarchar(255),
    last_name nvarchar(255),
    document_type nvarchar(255) NOT NULL,
    document_number int(15) UNIQUE NOT NULL,
    ruc int(11),
    business_name nvarchar(255),
    gender bit,
    telephone int(9) UNIQUE NOT NULL,
    address nvarchar(255)
)
GO

CREATE TABLE reserve (
  idReserve nvarchar(255),
  idClient nvarchar(255),
  reservation_number int,
  created_at datetime,
  reserved_time time,
  state bit,
  PRIMARY KEY (idReserve, idClient)
)
GO

CREATE TABLE reserveDetail (
  idReserveDetail nvarchar(255) PRIMARY KEY,
  idReserve nvarchar(255),
  idProgramming nvarchar(255),
  document int(15) UNIQUE NOT NULL,
  first_name nvarchar(255),
  last_name nvarchar(255),
  state bit
)
GO

CREATE TABLE programming (
    idProgramming nvarchar(255) PRIMARY KEY,
    idVehicle nvarchar(255),
    idOrigin nvarchar(255),
    idDestination nvarchar(255),
    seat_number int(2),
    date datetime,
    time time,
    cost decimal(10,2),
    state bit
)
GO

CREATE TABLE vehicle (
    idVehicle nvarchar(255) PRIMARY KEY,
    description varchar(max),
    plate nvarchar(255) UNIQUE NOT NULL,
    model nvarchar(255) UNIQUE NOT NULL,
    seat_numbers int(2),
    state bit
)
GO

CREATE TABLE origin (
  idOrigin nvarchar(255),
  city nvarchar(255) UNIQUE NOT NULL
)
GO

CREATE TABLE destination (
  idDestination nvarchar(255),
  city nvarchar(255) UNIQUE NOT NULL
)
GO

CREATE TABLE price (
  idPrice nvarchar(255),
  idOrigin nvarchar(255),
  idDestination nvarchar(255),
  price decimal(10,2)
)
GO

ALTER TABLE ticket ADD FOREIGN KEY (idClient) REFERENCES client (idClient)
GO

ALTER TABLE reserve ADD FOREIGN KEY (idClient) REFERENCES client (idClient)
GO

ALTER TABLE ticket ADD FOREIGN KEY (idUser) REFERENCES user (idUser)
GO

ALTER TABLE reserveDetail ADD FOREIGN KEY (idProgramming) REFERENCES programming (idProgramming)
GO

ALTER TABLE reserveDetail ADD FOREIGN KEY (idReserve) REFERENCES reserve (idReserve)
GO

ALTER TABLE programming ADD FOREIGN KEY (idVehicle) REFERENCES vehicle (idVehicle)
GO

ALTER TABLE programming ADD FOREIGN KEY (idDestination) REFERENCES destination (idDestination)
GO

ALTER TABLE ticket ADD FOREIGN KEY (idDestination) REFERENCES destination (idDestination)
GO

ALTER TABLE programming ADD FOREIGN KEY (idOrigin) REFERENCES origin (idOrigin)
GO

ALTER TABLE price ADD FOREIGN KEY (idOrigin) REFERENCES origin (idOrigin)
GO

ALTER TABLE price ADD FOREIGN KEY (idDestination) REFERENCES destination (idDestination)
GO

ALTER TABLE ticket ADD FOREIGN KEY (idProgramming) REFERENCES programming (idProgramming)
GO
