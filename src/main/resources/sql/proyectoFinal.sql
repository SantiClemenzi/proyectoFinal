CREATE DATABASE proyecto_final;

CREATE TABLE proyecto_final.cliente (
	cliente_id int NOT NULL AUTO_INCREMENT,
    dni int NOT NULL,
    nombre varchar(255) NOT NULL,
    apellido varchar(255),
    PRIMARY KEY (cliente_id)
);

CREATE TABLE proyecto_final.producto (
	producto_id int NOT NULL AUTO_INCREMENT,
    codigo int NOT NULL,
    descripcion varchar(255) NOT NULL,
    cantidad int,
    precio FLOAT(5, 2),
    PRIMARY KEY (producto_id)
);

CREATE TABLE proyecto_final.comprobante (
    comprobante_id int NOT NULL AUTO_INCREMENT,
    fecha datetime,
    cantidad int,
    total FLOAT(5, 2),
    cliente_id int,
    PRIMARY KEY (comprobante_id),
    CONSTRAINT FK_cliente FOREIGN KEY (cliente_id)
    REFERENCES cliente(cliente_id)
);
