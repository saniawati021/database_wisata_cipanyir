-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 14, 2022 at 11:54 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_cipanyir`
--

-- --------------------------------------------------------

--
-- Table structure for table `cipanyir_wisata`
--

CREATE TABLE `cipanyir_wisata` (
  `id_tempat_wisata` int(11) NOT NULL,
  `nama_tempat_wisata` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_telepon` varchar(13) NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cipanyir_wisata`
--

INSERT INTO `cipanyir_wisata` (`id_tempat_wisata`, `nama_tempat_wisata`, `alamat`, `no_telepon`, `keterangan`) VALUES
(210721, 'Cipanyir', 'Jl.Sindangsari Rt.02 Rw.08', '089651841560', 'Buka 24 Jam');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cipanyir_wisata`
--
ALTER TABLE `cipanyir_wisata`
  ADD PRIMARY KEY (`id_tempat_wisata`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
