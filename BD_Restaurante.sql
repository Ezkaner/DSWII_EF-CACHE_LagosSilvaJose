CREATE DATABASE BD_Restaurante;
USE BD_Restaurante;


CREATE TABLE Cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    fechanacimiento DATE
);


CREATE TABLE Menu (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion TEXT,
    precio DECIMAL(10, 2)
);


CREATE TABLE Producto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion TEXT
);


CREATE TABLE Reserva (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion TEXT
);


CREATE TABLE Vendedor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion TEXT
);

INSERT INTO Cliente (nombre, direccion, telefono, fechanacimiento) VALUES
('Juan Pérez', 'Av. Principal 123', '987654321', '1985-07-15'),
('Ana García', 'Calle Falsa 456', '912345678', '1990-05-10'),
('Luis Mendoza', 'Av. Las Flores 789', '921234567', '1978-03-09'),
('María López', 'Jr. Los Cedros 101', '934567890', '1992-12-12'),
('Carlos Ruiz', 'Jr. Lima 202', '923456789', '1995-01-15'),
('Sofía Torres', 'Av. La Paz 303', '911223344', '1988-06-30'),
('Jorge Valdez', 'Jr. San Martín 404', '922233344', '1982-11-20'),
('Patricia Díaz', 'Av. Las Palmeras 505', '931234567', '1993-08-25');


INSERT INTO Menu (nombre, descripcion, precio) VALUES
('Desayuno Continental', 'Café, jugo, tostadas y huevos revueltos', 15.00),
('Almuerzo Ejecutivo', 'Sopa, plato principal, bebida y postre', 25.00),
('Cena Ligera', 'Ensalada, sopa y jugo natural', 20.00),
('Hamburguesa Completa', 'Hamburguesa con papas fritas y bebida', 18.00),
('Pizza Familiar', 'Pizza grande con 3 ingredientes a elección', 30.00),
('Sándwich de Pollo', 'Sándwich de pollo con papas fritas y refresco', 12.00),
('Pastel de Chocolate', 'Pastel de chocolate con salsa de vainilla', 10.00),
('Ensalada César', 'Lechuga, pollo, crutones, queso parmesano', 14.00);


INSERT INTO Producto (nombre, descripcion) VALUES
('Laptop HP', 'Laptop HP 14 pulgadas, 8GB RAM, 256GB SSD'),
('Celular Samsung', 'Celular Samsung Galaxy S20, 128GB'),
('Televisor LG', 'Televisor LG 50 pulgadas, 4K UHD'),
('Tablet iPad', 'Tablet iPad 10.2 pulgadas, 64GB'),
('Cámara Canon', 'Cámara Canon DSLR con lente de 18-55mm'),
('Impresora Epson', 'Impresora Epson multifuncional'),
('Monitor Dell', 'Monitor Dell 24 pulgadas Full HD'),
('Teclado Logitech', 'Teclado mecánico Logitech RGB');


INSERT INTO Reserva (nombre, descripcion) VALUES
('Reserva Desayuno', 'Reserva para desayuno continental en mesa 5'),
('Reserva Almuerzo', 'Reserva para almuerzo ejecutivo en terraza'),
('Reserva Cena', 'Reserva para cena ligera en salón VIP'),
('Reserva Fiesta', 'Reserva para fiesta de cumpleaños, salón principal'),
('Reserva Conferencia', 'Reserva para conferencia empresarial, auditorio'),
('Reserva Reunión', 'Reserva para reunión familiar, salón privado'),
('Reserva Evento Corporativo', 'Reserva para evento corporativo, salón grande'),
('Reserva Cena Romántica', 'Reserva para cena romántica, balcón con vista');


INSERT INTO Vendedor (nombre, descripcion) VALUES
('Pedro López', 'Vendedor de tecnología y electrónica'),
('Ana Torres', 'Vendedora de ropa y accesorios'),
('Luis González', 'Vendedor de electrodomésticos'),
('Laura Mendoza', 'Vendedora de muebles para el hogar'),
('Carlos Díaz', 'Vendedor de productos de cocina'),
('Verónica Ramírez', 'Vendedora de productos de belleza'),
('Fernando Ruiz', 'Vendedor de artículos deportivos'),
('Patricia García', 'Vendedora de juguetes y juegos para niños');
