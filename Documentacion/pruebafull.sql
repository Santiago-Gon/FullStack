-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-01-2025 a las 16:02:51
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pruebafull`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjetas`
--

CREATE TABLE `tarjetas` (
  `ID` int(16) NOT NULL,
  `Titular` varchar(100) NOT NULL,
  `Fecha_Ven` date NOT NULL,
  `Tipo_Tarjeta` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transacciones`
--

CREATE TABLE `transacciones` (
  `ID` int(10) NOT NULL,
  `Estado` int(15) NOT NULL,
  `Saldo` int(10) NOT NULL,
  `ID_Tarejta` int(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transaccion_productos`
--

CREATE TABLE `transaccion_productos` (
  `ID` int(10) NOT NULL,
  `ID_Transaccion` int(10) NOT NULL,
  `ID_Producto` int(10) NOT NULL,
  `Precio` int(10) NOT NULL,
  `Nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tarjetas`
--
ALTER TABLE `tarjetas`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `transacciones`
--
ALTER TABLE `transacciones`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_Transacciones_Tarjeta` (`ID_Tarejta`);

--
-- Indices de la tabla `transaccion_productos`
--
ALTER TABLE `transaccion_productos`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_Transacciones_Productos` (`ID_Transaccion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `transaccion_productos`
--
ALTER TABLE `transaccion_productos`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `transacciones`
--
ALTER TABLE `transacciones`
  ADD CONSTRAINT `FK_Transacciones_Tarjeta` FOREIGN KEY (`ID_Tarejta`) REFERENCES `tarjetas` (`ID`);

--
-- Filtros para la tabla `transaccion_productos`
--
ALTER TABLE `transaccion_productos`
  ADD CONSTRAINT `FK_Transacciones_Productos` FOREIGN KEY (`ID_Transaccion`) REFERENCES `transacciones` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
