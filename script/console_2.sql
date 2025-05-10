--creacion de la base de datos
CREATE DATABASE carStores ;
--creacion de las tablas
CREATE TABLE Local (
    Id_local SERIAL PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Direccion VARCHAR(200) NOT NULL
);

CREATE TABLE Empleado (
    Id_empleado SERIAL PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellido VARCHAR(100) NOT NULL,
    Id_local INT NOT NULL,
    FOREIGN KEY (Id_local) REFERENCES Local(Id_local)
);

CREATE TABLE Telefono_empleado (
    Id_telefono SERIAL PRIMARY KEY,
    Id_empleado INT NOT NULL,
    Telefono VARCHAR(20) NOT NULL,
    FOREIGN KEY (Id_empleado) REFERENCES Empleado(Id_empleado)
);

CREATE TABLE Modelo (
    Id_modelo SERIAL PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Ano INT NOT NULL,
    Costo DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Inventario (
    Id_inventario SERIAL PRIMARY KEY,
    Id_local INT NOT NULL,
    Id_modelo INT NOT NULL,
    cantidad INT NOT NULL,
    FOREIGN KEY (Id_local) REFERENCES Local(Id_local),
    FOREIGN KEY (Id_modelo) REFERENCES Modelo(Id_modelo),
    UNIQUE (Id_local, Id_modelo)
);

CREATE TABLE Venta (
    Id_venta SERIAL PRIMARY KEY,
    Id_modelo INT NOT NULL,
    Id_local INT NOT NULL,
    Id_empleado INT NOT NULL,
    Precio_venta DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (Id_modelo) REFERENCES Modelo(Id_modelo),
    FOREIGN KEY (Id_local) REFERENCES Local(Id_local),
    FOREIGN KEY (Id_empleado) REFERENCES Empleado(Id_empleado)
);

CREATE TABLE Telefono_tienda (
    Id_telefono SERIAL PRIMARY KEY,
    Id_local INT NOT NULL,
    Telefono VARCHAR(20) NOT NULL,
    FOREIGN KEY (Id_local) REFERENCES Local(Id_local)
);





