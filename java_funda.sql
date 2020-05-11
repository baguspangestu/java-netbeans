-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2020 at 08:50 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_funda`
--

-- --------------------------------------------------------

--
-- Table structure for table `bukutelepon`
--

CREATE TABLE `bukutelepon` (
  `id` int(10) UNSIGNED NOT NULL,
  `nama` varchar(20) NOT NULL,
  `jeniskelamin` varchar(10) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `telepon` varchar(20) DEFAULT NULL,
  `handphone` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bukutelepon`
--

INSERT INTO `bukutelepon` (`id`, `nama`, `jeniskelamin`, `alamat`, `telepon`, `handphone`) VALUES
(1, 'Bagus Pangestu', 'Laki-Laki', 'Pringsewu', '072940394766', '085840394766'),
(2, 'Ahsantu Dhoni', 'Laki-Laki', 'Pringsewu', '072765566356', '082765566356'),
(3, 'Andi Pria Septama', 'Laki-Laki', 'Pringsewu', '072177777777', '085888888888'),
(4, 'Anggi Windriyani', 'Perempuan', 'Pringsewu', '077777777777', '087777777777'),
(5, 'Anisa Assholeha', 'Perempuan', 'Pringsewu', '078888888888', '088888888888'),
(6, 'Dwi Shela Wijiyas P', 'Perempuan', 'Lampung', '071111111111', '081111111111'),
(7, 'Gendri Juliyanto', 'Laki-Laki', 'Tanggamus', '072145437666', '082145437666'),
(8, 'Irvanudin', 'Laki-Laki', 'Pringsewu', '071234567890', '085213456789'),
(9, 'Kentas Adi Saputra', 'Laki-Laki', 'Bandung Baru', '072355555555', '082355555555'),
(10, 'Nurhaliza', 'Perempuan', 'Lampung', '072222222222', '082222222222'),
(11, 'Pasadena Adilla P P', 'Perempuan', 'Tanggamus', '070000000000', '080000000000'),
(12, 'Reffi Amalia', 'Perempuan', 'Pesawaran', '073333333333', '083333333333'),
(13, 'Rian Irawan', 'Laki-Laki', 'Pesawaran', '072344444444', '085622222222'),
(14, 'Roni Nur Ramadhani', 'Laki-Laki', 'Sukoharjo', '075299999999', '082599999999'),
(15, 'Sardi', 'Laki-Laki', 'Sukoharjo', '071122334455', '081122334455'),
(16, 'Sheli Yana', 'Perempuan', 'Pringsewu', '074444444444', '084444444444'),
(17, 'Sinta Ayu Parwati', 'Perempuan', 'Lampung', '075555555555', '085555555555'),
(18, 'Tri Wahyuni', 'Perempuan', 'Lampung', '076666666666', '086666666666'),
(19, 'Ulfa Dwi Rutmana', 'Perempuan', 'Lampung', '079988776655', '089988776655'),
(20, 'Ummi Amiqoh', 'Perempuan', 'Lampung', '070000998877', '080000998877'),
(21, 'Vitari Mala Wangiah', 'Perempuan', 'Lampung', '073443344334', '083443344334');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bukutelepon`
--
ALTER TABLE `bukutelepon`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bukutelepon`
--
ALTER TABLE `bukutelepon`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
