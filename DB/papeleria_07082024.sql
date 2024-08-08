-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 08-08-2024 a las 05:17:19
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `papeleria`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerVentasPorMes` (IN `p_anio` INT, IN `p_mes` INT)   BEGIN
    SELECT 
        DATE_FORMAT(vt.Fecha, '%Y-%m') AS Mes,
        SUM(vt.Total) AS TotalVentas
    FROM 
        Venta_Trabajador vt
    WHERE 
        YEAR(vt.Fecha) = p_anio AND MONTH(vt.Fecha) = p_mes
    GROUP BY 
        DATE_FORMAT(vt.Fecha, '%Y-%m')
    ORDER BY 
        DATE_FORMAT(vt.Fecha, '%Y-%m');
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `RegistrarProducto` (`p_Nombre` VARCHAR(50), `p_Tipo` VARCHAR(50), `p_Cantidad_Disponible` FLOAT(10,2), `p_Precio` FLOAT(10,2), `p_IDGerente` INT(5))   BEGIN
    INSERT INTO Producto (Nombre, Tipo, Cantidad_Disponible, Precio, IDGerente)
    VALUES (p_Nombre, p_Tipo, p_Cantidad_Disponible, p_Precio, p_IDGerente);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `RegistrarProveedor` (`p_Proveedor` VARCHAR(50), `p_Calle` VARCHAR(50), `p_Numero` VARCHAR(10), `p_Colonia` VARCHAR(30), `p_CP` INT, `p_Correo` VARCHAR(50), `p_Telefono` VARCHAR(20))   BEGIN
    INSERT INTO Proveedor (Proveedor, Calle, Numero, Colonia, CP, Correo, Telefono)
    VALUES (p_Proveedor, p_Calle, p_Numero, p_Colonia, p_CP, p_Correo, p_Telefono);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `RegistrarRol` (`p_Rol` VARCHAR(50), `p_Descripcion` TEXT)   BEGIN
    INSERT INTO Rol (Rol, Descripcion)
    VALUES (p_Rol, p_Descripcion);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `RegistrarTrabajador` (`p_Nombre` VARCHAR(50), `p_AP` VARCHAR(50), `p_AM` VARCHAR(50), `p_Calle` VARCHAR(50), `p_Numero` VARCHAR(20), `p_Colonia` VARCHAR(30), `p_CP` INT(10), `p_Correo` VARCHAR(50), `p_Telefono` VARCHAR(20), `p_Usuario` VARCHAR(60), `p_Contrasenia` VARCHAR(120), `p_IDRol` INT(5))   BEGIN
    INSERT INTO Trabajador (Nombre, AP, AM, Calle, Numero, Colonia, CP, Correo, Telefono, Usuario, Contrasenia, IDRol)
    VALUES (p_Nombre, p_AP, p_AM, p_Calle, p_Numero, p_Colonia, p_CP, p_Correo, p_Telefono, p_Usuario, p_Contrasenia, p_IDRol);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `RegistrarVenta` (`p_Nombre` VARCHAR(60), `p_CantidadP` INT(10))   BEGIN
    DECLARE v_Subtotal FLOAT(10,2);
    DECLARE p_Precio_Unitario FLOAT(10,2);

    SET p_Precio_Unitario = (SELECT Precio FROM Producto P WHERE p_Nombre = P.Nombre); 
    SET v_Subtotal = CalcularSubtotal(p_CantidadP, p_Precio_Unitario);

    INSERT INTO Venta (Nombre, Precio_Unitario, Subtotal, CantidadP)
    VALUES (p_Nombre, p_Precio_Unitario, v_Subtotal, p_CantidadP);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `RegistrarVentaProducto` (`p_IDProducto` INT(5), `p_IDVenta` INT(5))   BEGIN
    INSERT INTO Venta_Producto (IDProducto, IDVenta)
    VALUES (p_IDProducto, p_IDVenta);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `RegistrarVentaTrabajador` (`p_Total` FLOAT(10,2), `p_IDVendedor` INT(5), `p_IDVenta` INT(5))   BEGIN
    INSERT INTO Venta_Trabajador (Fecha, Total, IDVendedor, IDVenta)
    VALUES (CURDATE(), p_Total, p_IDVendedor, p_IDVenta);
END$$

--
-- Funciones
--
CREATE DEFINER=`root`@`localhost` FUNCTION `CalcularSubtotal` (`p_CantidadP` INT(10), `p_Precio_Unitario` FLOAT(10,2)) RETURNS FLOAT  BEGIN
    DECLARE v_Subtotal FLOAT(10,2);
    
    SET v_Subtotal = p_CantidadP * p_Precio_Unitario;
    
    RETURN v_Subtotal;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `masvendido`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `masvendido` (
`IDVendedor` int(5)
,`Nombre` varchar(50)
,`AP` varchar(50)
,`AM` varchar(50)
,`TotalVendido` double(19,2)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `MasVendidos`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `MasVendidos` (
`IDProducto` int(5)
,`Nombre` varchar(150)
,`CantidadVendida` decimal(32,0)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `MenosVendidos`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `MenosVendidos` (
`IDProducto` int(5)
,`Nombre` varchar(150)
,`CantidadVendida` decimal(32,0)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Producto`
--

CREATE TABLE `Producto` (
  `IDProducto` int(5) NOT NULL,
  `Nombre` varchar(150) NOT NULL,
  `Tipo` varchar(50) NOT NULL,
  `Cantidad_Disponible` float(10,2) NOT NULL,
  `Precio` float(10,2) NOT NULL,
  `IDGerente` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Proveedor`
--

CREATE TABLE `Proveedor` (
  `IDGerente` int(5) NOT NULL,
  `Proveedor` varchar(150) NOT NULL,
  `Calle` varchar(50) NOT NULL,
  `Numero` varchar(10) NOT NULL,
  `Colonia` varchar(30) NOT NULL,
  `CP` int(10) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Telefono` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `Proveedor`
--

INSERT INTO `Proveedor` (`IDGerente`, `Proveedor`, `Calle`, `Numero`, `Colonia`, `CP`, `Correo`, `Telefono`) VALUES
(1, 'Papelería Lumen', 'El Carmen', '15', '17 Oriente', 72530, 'ventaspapel@lumen.com', '22-2237-1029');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Rol`
--

CREATE TABLE `Rol` (
  `IdRol` int(5) NOT NULL,
  `Rol` varchar(60) NOT NULL,
  `Descripcion` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `Rol`
--

INSERT INTO `Rol` (`IdRol`, `Rol`, `Descripcion`) VALUES
(1, 'Administrador', 'Este rol contiene permisos de eliminar, insertar, actualizar y ver en el sistema. Cuidado al asignar este rol.'),
(2, 'Vendedor', 'Este usuario tiene accesos restringidos.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Trabajador`
--

CREATE TABLE `Trabajador` (
  `IDVendedor` int(5) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `AP` varchar(50) NOT NULL,
  `AM` varchar(50) NOT NULL,
  `Calle` varchar(50) NOT NULL,
  `Numero` varchar(20) NOT NULL,
  `Colonia` varchar(30) NOT NULL,
  `CP` int(10) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `Usuario` varchar(60) NOT NULL,
  `IdRol` int(5) DEFAULT NULL,
  `Contrasenia` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `Trabajador`
--

INSERT INTO `Trabajador` (`IDVendedor`, `Nombre`, `AP`, `AM`, `Calle`, `Numero`, `Colonia`, `CP`, `Correo`, `Telefono`, `Usuario`, `IdRol`, `Contrasenia`) VALUES
(1, 'Administrador', 'Admin', 'Admin', 'Admin', 'Admin', 'Admin', 0, 'Admin', 'Admin', 'adminsistema', 1, 'adminsistema123'),
(2, 'Ernesto', 'Garcia', 'Nolazco', 'Calle1', 'Numero1', 'Colonia1', 0, 'ernesto.garcia@gmail.com', '123456789', 'garcia45nolazco', 2, 'ernesto1234'),
(3, 'Rodrigo', 'Sosa', 'Romero', 'Calle1', 'Numero1', 'Colonia1', 0, 'rodrigo.sosa@gmail.com', '123456789', 'romero63sosa', 2, 'rodrigo123'),
(4, 'Elizabeth', 'Maravillas', 'Tzompantzi', 'Calle1', 'Numero1', 'Colonia1', 0, 'elizabeth.maravillas@gmail.com', '123456789', 'maravillas16eli', 2, 'elizabeth123'),
(5, 'Rosaisela', 'Perez', 'Morales', 'Calle1', 'Numero1', 'Colonia1', 0, 'rosaisela.perez@gmail.com', '123456789', 'perez74morales', 2, 'rosaisela123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Venta`
--

CREATE TABLE `Venta` (
  `IDVenta` int(5) NOT NULL,
  `Nombre` varchar(200) NOT NULL,
  `Precio_Unitario` float(10,2) NOT NULL,
  `Subtotal` float(10,2) NOT NULL,
  `CantidadP` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Venta_Producto`
--

CREATE TABLE `Venta_Producto` (
  `ID_VPRO` int(5) NOT NULL,
  `IDProducto` int(5) NOT NULL,
  `IDVenta` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Disparadores `Venta_Producto`
--
DELIMITER $$
CREATE TRIGGER `ActualizarStock` AFTER INSERT ON `Venta_Producto` FOR EACH ROW BEGIN
    UPDATE Producto
    SET Cantidad_Disponible = Cantidad_Disponible - (SELECT CantidadP FROM Venta WHERE IDVenta = NEW.IDVenta)
    WHERE IDProducto = NEW.IDProducto;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Venta_Trabajador`
--

CREATE TABLE `Venta_Trabajador` (
  `ID_VT` int(5) NOT NULL,
  `Fecha` date NOT NULL,
  `Total` float(10,2) NOT NULL,
  `IDVendedor` int(5) NOT NULL,
  `IDVenta` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura para la vista `masvendido`
--
DROP TABLE IF EXISTS `masvendido`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `masvendido`  AS SELECT `t`.`IDVendedor` AS `IDVendedor`, `t`.`Nombre` AS `Nombre`, `t`.`AP` AS `AP`, `t`.`AM` AS `AM`, sum(`vt`.`Total`) AS `TotalVendido` FROM ((`Trabajador` `t` join `Venta_Trabajador` `vt` on(`t`.`IDVendedor` = `vt`.`IDVendedor`)) join `Venta` `v` on(`vt`.`IDVenta` = `v`.`IDVenta`)) GROUP BY `t`.`IDVendedor`, `t`.`Nombre`, `t`.`AP`, `t`.`AM` ORDER BY sum(`vt`.`Total`) DESC LIMIT 0, 3 ;

-- --------------------------------------------------------

--
-- Estructura para la vista `MasVendidos`
--
DROP TABLE IF EXISTS `MasVendidos`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `MasVendidos`  AS SELECT `p`.`IDProducto` AS `IDProducto`, `p`.`Nombre` AS `Nombre`, sum(`v`.`CantidadP`) AS `CantidadVendida` FROM ((`Producto` `p` join `Venta_Producto` `vp` on(`p`.`IDProducto` = `vp`.`IDProducto`)) join `Venta` `v` on(`vp`.`IDVenta` = `v`.`IDVenta`)) GROUP BY `p`.`IDProducto`, `p`.`Nombre` ORDER BY sum(`v`.`CantidadP`) DESC LIMIT 0, 4 ;

-- --------------------------------------------------------

--
-- Estructura para la vista `MenosVendidos`
--
DROP TABLE IF EXISTS `MenosVendidos`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `MenosVendidos`  AS SELECT `p`.`IDProducto` AS `IDProducto`, `p`.`Nombre` AS `Nombre`, ifnull(sum(`v`.`CantidadP`),0) AS `CantidadVendida` FROM ((`Producto` `p` left join `Venta_Producto` `vp` on(`p`.`IDProducto` = `vp`.`IDProducto`)) left join `Venta` `v` on(`vp`.`IDVenta` = `v`.`IDVenta`)) GROUP BY `p`.`IDProducto`, `p`.`Nombre` ORDER BY ifnull(sum(`v`.`CantidadP`),0) ASC LIMIT 0, 4 ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD PRIMARY KEY (`IDProducto`),
  ADD KEY `IDGerente` (`IDGerente`);

--
-- Indices de la tabla `Proveedor`
--
ALTER TABLE `Proveedor`
  ADD PRIMARY KEY (`IDGerente`);

--
-- Indices de la tabla `Rol`
--
ALTER TABLE `Rol`
  ADD PRIMARY KEY (`IdRol`);

--
-- Indices de la tabla `Trabajador`
--
ALTER TABLE `Trabajador`
  ADD PRIMARY KEY (`IDVendedor`),
  ADD UNIQUE KEY `IDVendedor` (`Usuario`),
  ADD KEY `IdRol` (`IdRol`);

--
-- Indices de la tabla `Venta`
--
ALTER TABLE `Venta`
  ADD PRIMARY KEY (`IDVenta`);

--
-- Indices de la tabla `Venta_Producto`
--
ALTER TABLE `Venta_Producto`
  ADD PRIMARY KEY (`ID_VPRO`),
  ADD KEY `IDProducto` (`IDProducto`),
  ADD KEY `IDVenta` (`IDVenta`);

--
-- Indices de la tabla `Venta_Trabajador`
--
ALTER TABLE `Venta_Trabajador`
  ADD PRIMARY KEY (`ID_VT`),
  ADD KEY `IDVendedor` (`IDVendedor`),
  ADD KEY `IDVenta` (`IDVenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Producto`
--
ALTER TABLE `Producto`
  MODIFY `IDProducto` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Proveedor`
--
ALTER TABLE `Proveedor`
  MODIFY `IDGerente` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `Rol`
--
ALTER TABLE `Rol`
  MODIFY `IdRol` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `Trabajador`
--
ALTER TABLE `Trabajador`
  MODIFY `IDVendedor` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `Venta`
--
ALTER TABLE `Venta`
  MODIFY `IDVenta` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Venta_Producto`
--
ALTER TABLE `Venta_Producto`
  MODIFY `ID_VPRO` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Venta_Trabajador`
--
ALTER TABLE `Venta_Trabajador`
  MODIFY `ID_VT` int(5) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD CONSTRAINT `Producto_ibfk_1` FOREIGN KEY (`IDGerente`) REFERENCES `Proveedor` (`IDGerente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Trabajador`
--
ALTER TABLE `Trabajador`
  ADD CONSTRAINT `Trabajador_ibfk_1` FOREIGN KEY (`IdRol`) REFERENCES `Rol` (`IdRol`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Venta_Producto`
--
ALTER TABLE `Venta_Producto`
  ADD CONSTRAINT `Venta_Producto_ibfk_1` FOREIGN KEY (`IDProducto`) REFERENCES `Producto` (`IDProducto`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Venta_Producto_ibfk_2` FOREIGN KEY (`IDVenta`) REFERENCES `Venta` (`IDVenta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Venta_Trabajador`
--
ALTER TABLE `Venta_Trabajador`
  ADD CONSTRAINT `Venta_Trabajador_ibfk_1` FOREIGN KEY (`IDVendedor`) REFERENCES `Trabajador` (`IDVendedor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Venta_Trabajador_ibfk_2` FOREIGN KEY (`IDVenta`) REFERENCES `Venta` (`IDVenta`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
