-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 08-06-2021 a las 07:29:09
-- Versión del servidor: 8.0.25-0ubuntu0.20.04.1
-- Versión de PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ukiku_bd`
--
CREATE DATABASE IF NOT EXISTS `ukiku_bd` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;
USE `ukiku_bd`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `Nombre` text CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Codigo` int NOT NULL,
  `Categoría` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Precio` double NOT NULL,
  `Stock` int NOT NULL,
  `Cif_proveedor` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`Nombre`, `Codigo`, `Categoría`, `Precio`, `Stock`, `Cif_proveedor`) VALUES
('Pantalla LG 40\"', 2, 'Televisores', 250, 125, '025361-3137'),
('Pantalla Samsung 60\"', 3, 'Televisores', 299, 200, '025361-3137'),
('Pantalla HP 23\"', 4, 'Televisores', 120, 50, '025361-3137'),
('Nevera GE', 5, 'Electrodomésticos', 190, 33, '076643-7248'),
('Nevera BOSCH', 6, 'Electrodomésticos', 400, 66, '076643-7248'),
('Nevera Samsung', 7, 'Electrodomésticos', 399, 99, '076643-7248'),
('Nevera Maytag', 8, 'Electrodomésticos', 199, 45, '076643-7248'),
('Horno - Balay', 9, 'Electrodomésticos', 329, 71, '148665-3403'),
('Horno - Teka', 10, 'Electrodomésticos', 229, 70, '148665-3403'),
('Horno - Zanussi', 11, 'Electrodomésticos', 380, 12, '148665-3403'),
('Horno - Taurus', 12, 'Electrodomésticos', 120, 30, '148665-3403'),
('Microondas - Samsung', 13, 'Electrodomésticos', 118, 100, '173944-2430'),
('Microondas - OK', 14, 'Electrodomésticos', 80, 40, '173944-2430'),
('Microondas - Whirlpool', 15, 'Electrodomésticos', 99, 35, '173944-2430'),
('Sofá-Cama Intex ', 17, 'Muebles', 70, 40, '256708-8766'),
('Sofá Velvet', 18, 'Muebles', 190, 6, '256708-8766'),
('Sofá Rubik', 19, 'Muebles', 720, 2, '256708-8766'),
('Sofá-Cama Komfortland', 20, 'Muebles', 200, 30, '256708-8766'),
('Sofá-House Tarrington', 21, 'Muebles', 1055, 5, '256708-8766'),
('Armario Habitdesign', 22, 'Muebles', 163, 21, '212533-7234'),
('Armario Claris ', 23, 'Muebles', 119, 8, '212533-7234'),
('Armario Keter', 24, 'Muebles', 60, 45, '212533-7234'),
('Armario Eurast', 25, 'Muebles', 545, 5, '212533-7234'),
('Armario SIK Kis', 26, 'Muebles', 30, 50, '212533-7234'),
('Albatros Silla', 27, 'Muebles', 32, 88, '169565-3798'),
('Aktive Silla', 28, 'Muebles', 27, 70, '169565-3798'),
('Garballa Silla', 29, 'Muebles', 210, 50, '169565-3798'),
('Silla Gaming Soleny', 30, 'Muebles', 350, 20, '169565-3798'),
('Silla Gaming RGB', 31, 'Muebles', 77777, 2, '169565-3798');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `Nombre` text CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Cif` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Dirección` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Teléfono` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`Nombre`, `Cif`, `Dirección`, `Teléfono`) VALUES
('Duis Associates', '025361-3137', '787-347 Vitae Ave', 622938536),
('Egestas Nunc Ltd', '039124-7798', '2507 Rutrum Rd.', 499310146),
('Volutpat Nunc Sit Corporation', '076643-7248', 'P.O. Box 436, 4882 Ornare. Road', 767042278),
('Auctor Ltd', '083639-9337', 'Ap #923-1213 Neque Av.', 230636527),
('Enim LLP', '085915-4585', '711-5453 Amet Rd.', 240089696),
('Donec Ltd', '108698-4729', '5872 Vestibulum. St.', 422855587),
('Aenean Sed Corporation', '116869-5722', '760-5277 Eu Rd.', 342664256),
('Egestas Consulting', '126771-7336', 'Ap #212-2010 In, Ave', 70057357),
('Proin Ltd', '128680-4586', '306-8130 Lobortis St.', 985055473),
('Placerat Company', '134272-1923', '3058 Vivamus Avenue', 124223506),
('Nascetur Ridiculus Inc.', '148665-3403', '5392 Vivamus Ave', 530242718),
('Curae; LLC', '158844-2861', '134-5812 Nec Road', 759369636),
('Donec LLP', '159666-7368', 'P.O. Box 646, 9194 Tellus Av.', 546704165),
('Nunc Quisque Ornare Foundation', '165792-2041', '4644 Luctus, Ave', 618272651),
('Risus Nulla Consulting', '169565-3798', 'P.O. Box 991, 285 A, Avenue', 324389214),
('Mauris PC', '172209-0121', 'P.O. Box 269, 9842 Nisi. Rd.', 695331617),
('Ante Dictum Limited', '173944-2430', '5122 Amet St.', 67218009),
('Felis Orci Adipiscing Foundation', '189321-0524', '7851 Justo. Rd.', 442699239),
('Ipsum Leo LLP', '204664-1789', 'P.O. Box 372, 6611 Et, Ave', 545100212),
('Vestibulum Ut LLC', '212330-4509', '744-7025 Et, Road', 182629224),
('Quisque Fringilla Euismod Institute', '212533-7234', 'P.O. Box 274, 5298 Ridiculus Av.', 211769478),
('Ornare Incorporated', '228416-8784', 'Ap #756-2535 Quisque Avenue', 17249037),
('Posuere Cubilia LLP', '235032-9112', '596-3041 A, Av.', 188865655),
('Sagittis Placerat Foundation', '239784-8322', 'P.O. Box 989, 6030 Dictum Road', 578375666),
('Curabitur Inc.', '256019-9776', '4545 Vivamus Avenue', 709766289),
('Orci In LLP', '256708-8766', '511-1066 Sagittis Rd.', 625772727),
('Sem Magna Inc.', '259375-5321', 'P.O. Box 842, 1311 Enim St.', 204823281),
('Aliquam Adipiscing Lobortis Industries', '265541-8495', '6103 Lacus. Street', 129234999),
('Penatibus Et Magnis Incorporated', '286587-8819', 'Ap #994-2994 Cum Av.', 254101013),
('Quisque Limited', '318689-5912', 'Ap #361-4001 Magna Av.', 274486643),
('Neque Nullam Consulting', '334898-3853', '3117 Nunc Avenue', 355921690),
('Amet Lorem Institute', '345682-2877', 'P.O. Box 789, 4898 Pellentesque Road', 635533462),
('Pede Blandit Foundation', '362126-7925', '447-9546 Ut Ave', 198157349),
('Ut Cursus Luctus Limited', '372916-3331', '7730 Arcu. Rd.', 635554385),
('Ut Molestie Associates', '375985-0807', 'Ap #782-3151 Eget, Av.', 871981624),
('Sagittis Institute', '377574-5429', '9241 Nec, Rd.', 290956610),
('Vel Sapien Imperdiet Inc.', '378530-1197', '820 Ipsum. Av.', 205301575),
('In Consulting', '386400-4019', 'Ap #240-6852 Magnis Road', 13523820),
('Tellus Non Magna Corp.', '393471-7574', 'Ap #112-6180 Nonummy St.', 147865828),
('Vestibulum Ante Ipsum LLP', '397462-0738', '5193 Dis Av.', 844057098),
('Et Magnis Company', '427170-0520', '6446 Sagittis Rd.', 398776794),
('Posuere Enim Nisl LLC', '438416-2873', '3510 Nec Street', 998244283),
('Luctus Consulting', '443179-6400', '7152 Eu, Rd.', 623402472),
('A Ultricies LLC', '462443-9248', 'P.O. Box 737, 3705 Aliquet. Street', 770564663),
('Mauris Ipsum Porta Ltd', '463265-1164', 'Ap #740-1022 Est, St.', 792547394),
('Cursus In Limited', '477647-0553', 'P.O. Box 905, 491 Sit Av.', 164225424),
('Tempus Limited', '513669-0772', 'Ap #629-4790 Vestibulum Rd.', 735039598),
('Morbi Neque Associates', '546100-9507', '546-9883 Cursus Rd.', 295597287),
('Integer Vitae Associates', '552823-9766', '7129 At, Av.', 789689918),
('Curabitur Sed Ltd', '556769-8591', '544 Nunc Av.', 320242986),
('Euismod Mauris Consulting', '587818-5668', '8213 Mauris Av.', 361417728),
('Ut Ipsum Ac Associates', '614601-1272', '507-9901 Mi. Rd.', 172624234),
('Integer Institute', '625312-6624', '7962 Phasellus St.', 883773270),
('Tristique Senectus Et LLP', '635467-9265', 'P.O. Box 807, 6460 Id Rd.', 545992360),
('Consequat Auctor Consulting', '643807-9755', '1623 Cras Road', 748441571),
('Maecenas Mi Felis Corporation', '645309-0380', '9363 Enim Ave', 281882016),
('In Magna Corporation', '655533-3944', '3534 Consectetuer Road', 238656530),
('Malesuada Fames Ac Limited', '666684-3492', '7462 Aliquam Street', 193913405),
('Mauris Erat LLP', '669397-2066', 'Ap #495-5243 Lorem St.', 731902865),
('Auctor Vitae Associates', '682956-9083', 'Ap #316-3046 Phasellus St.', 876628578),
('Donec Feugiat Metus Consulting', '695975-6500', '109-2239 Augue. St.', 290129463),
('Curae; Phasellus Corp.', '696006-9331', '887-5936 Et Ave', 122313762),
('Morbi Inc.', '714266-8008', 'P.O. Box 926, 6419 In Rd.', 111059808),
('Aliquam Eu Accumsan Inc.', '723400-5994', '411-7649 Sed, Av.', 505061155),
('Lobortis Ultrices Vivamus Company', '746705-5021', 'Ap #675-4170 Porttitor Av.', 581659199),
('Malesuada Fringilla Associates', '757613-2653', '197 Lobortis Av.', 271503761),
('Consequat Purus Maecenas Institute', '769356-4291', 'P.O. Box 624, 3220 Risus. St.', 656224913),
('Ac Consulting', '772191-6414', 'P.O. Box 667, 7645 A, Rd.', 518904964),
('Faucibus Ut Nulla PC', '772480-6901', '655-7548 Orci. St.', 926089858),
('Ante Institute', '774776-7825', '4556 Non Av.', 809374256),
('Nec Associates', '783939-4199', '2386 Adipiscing. Av.', 845677297),
('Pede Cras Vulputate Incorporated', '785571-5012', 'P.O. Box 405, 7505 Suspendisse Rd.', 205891400),
('Neque Sed Company', '807609-2504', 'Ap #640-7086 Tempor St.', 546389917),
('Ante LLP', '834858-7034', 'P.O. Box 285, 8742 Lectus St.', 75926386),
('Erat Vitae Risus Ltd', '852562-8825', '988-8059 Pellentesque Ave', 384285161),
('Aliquam Company', '853316-9119', '936-8558 Augue, Ave', 252916545),
('Id Mollis Institute', '862496-3719', 'P.O. Box 971, 2905 Enim Ave', 758116532),
('Tellus Inc.', '869856-3650', 'P.O. Box 335, 887 Et, Road', 557715721),
('Faucibus Id Libero Foundation', '875327-3914', '209-595 Lacus. St.', 320297788),
('Dolor Donec Fringilla Associates', '888644-6395', '156 Non Ave', 651626910),
('Proin Nisl Sem Consulting', '888733-2818', '383-9251 Nunc Rd.', 223937618),
('Dolor Quam Consulting', '899450-8128', 'P.O. Box 498, 2017 Dictum Avenue', 204722182),
('Sed Dictum Inc.', '905039-9725', '528-6647 Sagittis Av.', 206659419),
('Elementum Purus Accumsan Industries', '905308-5651', 'P.O. Box 655, 1553 Metus. Avenue', 405166131),
('Eu Tellus Phasellus Industries', '944089-9327', '610-6389 Molestie. Rd.', 488972006),
('Fusce Aliquam Associates', '948244-6896', 'Ap #341-4038 Aliquam Avenue', 255099814),
('Interdum Ligula Eu Corp.', '949869-9918', '570-7760 Ligula. Road', 468972262),
('Sed Corp.', '957682-6060', '4123 Placerat. Avenue', 352532692),
('Ut Lacus Nulla Foundation', '987395-3021', 'Ap #349-7940 Phasellus St.', 764359016),
('Pablo Escobilla SL', 'A - 79957323', 'AV. La Feria, 125', 656765847),
('Grupo Hermanos Primos', 'B - 10956410', 'C/ San Benjamín, 2', 900234567);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int NOT NULL,
  `Nombre` text CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Contraseña` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `Nombre`, `Contraseña`) VALUES
(1, 'admin', 'admin'),
(2, 'rene', 'rene'),
(5, 'a', 'a'),
(6, 'ximo', 'ximo'),
(7, 'vicent', 'vicent'),
(11, 'user1234', 'user1234'),
(12, 'user1', 'user1'),
(13, 'usuario1', 'usuario1'),
(14, 'andiamo', 'Eljefex3'),
(15, 'aa', 'Andiamo123'),
(16, 'Andiamo123', 'Andiamo123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`Codigo`),
  ADD KEY `Provee` (`Cif_proveedor`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`Cif`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `Codigo` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `Provee` FOREIGN KEY (`Cif_proveedor`) REFERENCES `proveedor` (`Cif`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
