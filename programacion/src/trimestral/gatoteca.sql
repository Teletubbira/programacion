CREATE DATABASE GATOTECA;
USE GATOTECA;

CREATE TABLE raza (idraza INT PRIMARY KEY, nombre VARCHAR(45), pelo VARCHAR(20), color VARCHAR (20));

CREATE TABLE gato (idgato INT PRIMARY KEY, id_raza INT, nombre VARCHAR (45) NOT NULL, sexo CHAR BINARY NOT NULL, fecha_nacimiento DATE,
					CONSTRAINT FK_RAZA FOREIGN KEY (id_raza) REFERENCES raza(idraza));

CREATE TABLE cliente (idCliente INT PRIMARY KEY,nombre VARCHAR(45) NOT NULL, apellido_p VARCHAR(45) NOT NULL, apellido_s VARCHAR(45));

CREATE TABLE acogida (idAcogida INT PRIMARY KEY, idCliente INT NOT NULL, idGato INT NOT NULL, fecha DATE , 
						CONSTRAINT FK_cliente FOREIGN KEY (idCliente) REFERENCES cliente (idCliente),
                        CONSTRAINT FK_gato FOREIGN KEY (idgato) REFERENCES gato (idgato));
                        
CREATE TABLE producto (idProducto INT PRIMARY KEY, nombre VARCHAR(45) NOT NULL, precio DECIMAL(4,2) NOT NULL, tipo VARCHAR(45));

CREATE TABLE factura (idFactura INT PRIMARY KEY, idCliente INT NOT NULL, idProducto INT NOT NULL, 
						CONSTRAINT FK_cliente FOREIGN KEY (idCliente) REFERENCES cliente (idCliente),
                        CONSTRAINT FK_producto FOREIGN KEY (idProducto) REFERENCES producto (idProducto));
CREATE TABLE factura (idFactura INT PRIMARY KEY, idCliente INT NOT NULL, idProducto INT NOT NULL, 
						CONSTRAINT FK_clientef FOREIGN KEY (idCliente) REFERENCES cliente (idCliente), 
                        CONSTRAINT FK_producto FOREIGN KEY (idProducto) REFERENCES producto (idProducto));

INSERT INTO raza VALUES (1, 'comun', 'corto', 'negro');
INSERT INTO raza VALUES (2, 'siames', 'corto', 'marron');
INSERT INTO raza VALUES (3, 'persa', 'largo', 'blanco');


INSERT INTO gato VALUES (1, 2, 'frida', 'f', '2000-10-10');
INSERT INTO gato VALUES (2, 3, 'misifu', 'm', '2010-10-10');
INSERT INTO gato VALUES (3, 1,'diva', 'f', '2020-10-10');

INSERT INTO cliente VALUES (1, 'Carlos', 'Garcia', 'Gomez');
INSERT INTO cliente VALUES (2, 'Juan', 'Serrano', 'Gutierrez');
INSERT INTO cliente VALUES (3, 'Maria', 'Cifuentes', 'Ramirez');

INSERT INTO acogida VALUES (1, 2, 2, '2011-10-10');
INSERT INTO acogida VALUES (2, 2, 3, '2020-10-10');
INSERT INTO acogida VALUES (3, 3, 1, '2001-10-10');

INSERT INTO producto VALUES (1, 'libro', 12.5, 'libreria');
INSERT INTO producto VALUES (2, 'cafe', 0.8, 'bebida');
INSERT INTO producto VALUES (3, 'arbol', 29.99, 'accesorio');

INSERT INTO factura VALUES (1, 1, 3);
INSERT INTO factura VALUES (2, 2, 2);
INSERT INTO factura VALUES (3, 3, 1);

SELECT * FROM gatoteca.producto;

UPDATE producto SET precio = precio - precio * 0.3 WHERE tipo != 'bebida';
UPDATE gato SET nombre = 'mishi' WHERE nombre = 'diva';

DELETE FROM factura WHERE idproducto = 3; -- producto defectuoso, arbol

SELECT nombre from gato WHERE nombre like 'm%'; -- nombre de gato que empiece por m
SELECT DISTINCT idCliente FROM factura; -- clientes que han comprado
SELECT nombre, precio from producto WHERE precio BETWEEN 5 AND 15; -- productos entre 5-15
SELECT nombre, fecha_nacimiento FROM gato ORDER BY fecha_nacimiento DESC;