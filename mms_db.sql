-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 28, 2024 at 02:18 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mms_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`id`, `nama`, `email`, `password`) VALUES
(1, 'Yusril Mubaroq', 'yusrilmubaroq21@gmail.com', 'yusril210502'),
(2, 'Arista Aisyah Fitri', 'aisyahfitri24@gmail.com', 'aisyah24'),
(3, 'yusril', 'yusril21@gmail.com', 'yusril21');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id` int(11) NOT NULL,
  `nrk` varchar(50) NOT NULL,
  `nama_karyawan` varchar(50) NOT NULL,
  `line` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id`, `nrk`, `nama_karyawan`, `line`) VALUES
(1, 'K00124', 'Arista Aisyah Fitri', 'Main Assy'),
(2, 'K00125', 'Dea Fajrin', 'Sub Welding'),
(3, 'K00126', 'Yusril Mubaroq', 'Metal Finish'),
(4, 'K00127', 'Umi Habibah', 'setting');

-- --------------------------------------------------------

--
-- Table structure for table `mekanik`
--

CREATE TABLE `mekanik` (
  `id` int(11) NOT NULL,
  `nrm` varchar(50) NOT NULL,
  `nama_mekanik` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mekanik`
--

INSERT INTO `mekanik` (`id`, `nrm`, `nama_mekanik`) VALUES
(1, 'M0001', 'Ripal Aldi'),
(2, 'M0002', 'Bayu Ardi'),
(3, 'M0003', 'Kira Rio'),
(4, 'M0004', 'Wawan'),
(5, 'M0005', 'Dea');

-- --------------------------------------------------------

--
-- Table structure for table `mesin`
--

CREATE TABLE `mesin` (
  `id` int(11) NOT NULL,
  `kode_mesin` varchar(50) NOT NULL,
  `nama_mesin` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mesin`
--

INSERT INTO `mesin` (`id`, `kode_mesin`, `nama_mesin`) VALUES
(1, 'WE0021', 'Spot Welding'),
(2, 'SPT09', 'MIG Weld'),
(3, 'SMCH66', 'Sealer Machine'),
(4, 'TTC988', 'Bor');

-- --------------------------------------------------------

--
-- Table structure for table `perbaikan`
--

CREATE TABLE `perbaikan` (
  `id` int(11) NOT NULL,
  `nama_mesin` varchar(50) NOT NULL,
  `nama_mekanik` varchar(50) NOT NULL,
  `nama_karyawan` varchar(50) NOT NULL,
  `problem` varchar(100) NOT NULL,
  `problem_solving` varchar(100) NOT NULL,
  `problem_clear` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `perbaikan`
--

INSERT INTO `perbaikan` (`id`, `nama_mesin`, `nama_mekanik`, `nama_karyawan`, `problem`, `problem_solving`, `problem_clear`) VALUES
(1, 'Spot Welding', 'Bayu Ardi', 'Dea Fajrin', 'Kabel Rusak', 'Ganti Kabel baru', 'Kabel kembali terkoneksi'),
(2, 'Spot Welding', 'Bayu Ardi', 'Arista Aisyah Fitri', 'Wire Mig Putus', 'Ganti Wire', 'Wire Mig bisa berfungsi kembali');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mekanik`
--
ALTER TABLE `mekanik`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mesin`
--
ALTER TABLE `mesin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `perbaikan`
--
ALTER TABLE `perbaikan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `akun`
--
ALTER TABLE `akun`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `karyawan`
--
ALTER TABLE `karyawan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `mekanik`
--
ALTER TABLE `mekanik`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `mesin`
--
ALTER TABLE `mesin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `perbaikan`
--
ALTER TABLE `perbaikan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `perbaikan`
--
ALTER TABLE `perbaikan`
  ADD CONSTRAINT `perbaikan_ibfk_1` FOREIGN KEY (`id`) REFERENCES `mesin` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
