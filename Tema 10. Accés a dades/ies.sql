-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: mysql-server
-- Temps de generació: 12-05-2021 a les 11:23:31
-- Versió del servidor: 8.0.19
-- Versió de PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de dades: `ies`
--

-- --------------------------------------------------------

--
-- Estructura de la taula `Alumnes`
--

CREATE TABLE `Alumnes` (
  `NIA` int NOT NULL,
  `NOM` varchar(20) NOT NULL,
  `COGNOM` varchar(20) NOT NULL,
  `CORREU` varchar(50) NOT NULL,
  `TELEFON` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Bolcament de dades per a la taula `Alumnes`
--

INSERT INTO `Alumnes` (`NIA`, `NOM`, `COGNOM`, `CORREU`, `TELEFON`) VALUES
(12378945, 'Saoro', 'Bolta', 'saoro.bolta@gmail.com', 986532741),
(36925814, 'Edgar', 'Rodriguez', 'edgar.rodriguez@gmail.com', 789987456),
(45612398, 'Joan', 'Pons', 'joan.pons@gmail.com', 13446987),
(74185296, 'Joan', 'Molina', 'joan.molina@gmail.com', 963852741),
(78913451, 'Ruben', 'Romera', 'ruben.romera@gmail.com', 65498731),
(78945632, 'Ivan', 'Pipo', 'ivan.pipo@gmail.com', 123951789),
(95135746, 'Jordi', 'Garcia', 'jordi.garcia@gmail.com', 753951471);

-- --------------------------------------------------------

--
-- Estructura de la taula `Assignatures`
--

CREATE TABLE `Assignatures` (
  `CODIC` int NOT NULL,
  `NOM` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish2_ci NOT NULL,
  `DESCRIPCIO` varchar(50) NOT NULL,
  `ABREVIATURA` varchar(20) NOT NULL,
  `HORES` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Bolcament de dades per a la taula `Assignatures`
--

INSERT INTO `Assignatures` (`CODIC`, `NOM`, `DESCRIPCIO`, `ABREVIATURA`, `HORES`) VALUES
(1, 'Base de Dades', 'MySQL, PhpMyAdmin', 'BD', 192),
(2, 'Sistemes Informatics', 'Reds, Seguritat Informatica', 'SI', 192),
(3, 'Programació', 'Java', 'PG', 256),
(4, 'Entorns de Desenvolupament', 'GIT, WindowBuilder', 'ED', 96),
(5, 'Formació i Orentació Laboral', 'Contracter, Prevenció de Riscos', 'FOL', 96),
(6, 'LLenguatge de Marques i Sistemes de Gestió de Informació', 'HTML i CSS, PHP', 'LMSGI', 128);

-- --------------------------------------------------------

--
-- Estructura de la taula `Resultats`
--

CREATE TABLE `Resultats` (
  `NOTA` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Índexs per a les taules bolcades
--

--
-- Índexs per a la taula `Alumnes`
--
ALTER TABLE `Alumnes`
  ADD PRIMARY KEY (`NIA`);

--
-- Índexs per a la taula `Assignatures`
--
ALTER TABLE `Assignatures`
  ADD PRIMARY KEY (`CODIC`);

--
-- Índexs per a la taula `Resultats`
--
ALTER TABLE `Resultats`
  ADD PRIMARY KEY (`NOTA`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
