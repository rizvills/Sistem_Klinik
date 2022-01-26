-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 26 Jan 2022 pada 08.26
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `klinik`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `apoteker`
--

CREATE TABLE `apoteker` (
  `ID` int(5) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Code_Apoteker` char(3) NOT NULL,
  `Jam_Kerja` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `apoteker`
--

INSERT INTO `apoteker` (`ID`, `Nama`, `Code_Apoteker`, `Jam_Kerja`) VALUES
(92387, 'Deminar Dwi', 'DDI', '08.01-16.00'),
(95674, 'Ryan Dwi Prasetyo', 'RDP', '16.01-00.00'),
(99011, 'Rania Anjani Septi', 'RAS', '00.01-08.00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dokter`
--

CREATE TABLE `dokter` (
  `ID` int(5) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Code_Dokter` char(3) NOT NULL,
  `Jam_Kerja` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dokter`
--

INSERT INTO `dokter` (`ID`, `Nama`, `Code_Dokter`, `Jam_Kerja`) VALUES
(12345, 'Muhammad Abraham', 'MAB', '00.01-08.00'),
(45678, 'Aziz Nurdin Cahyo', 'ANC', '08.01-16.00'),
(89078, 'Senoaji Dwi Pratama', 'SDP', '16.01-00.00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE `pasien` (
  `Nama` varchar(50) NOT NULL,
  `Jenis_Kelamin` varchar(20) NOT NULL,
  `Tanggal_Lahir` date NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `Nomor_HP` varchar(20) NOT NULL,
  `Keluhan` varchar(50) NOT NULL,
  `Riwayat_Penyakit` varchar(50) NOT NULL,
  `Suhu_Tubuh` int(11) NOT NULL,
  `Tekanan_Darah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`Nama`, `Jenis_Kelamin`, `Tanggal_Lahir`, `Alamat`, `Nomor_HP`, `Keluhan`, `Riwayat_Penyakit`, `Suhu_Tubuh`, `Tekanan_Darah`) VALUES
('Dista Nurdiana', 'Perempuan', '2001-06-17', 'Solo', '081696553267', 'Pusing', 'Asma', 38, 105),
('Rianda Khusuma', 'Laki-Laki', '2000-06-04', 'Pekanbaru', '086659236547', 'anosmia', 'asma', 37, 106),
('Rizki Atria', 'Laki-Laki', '2001-08-25', 'Banjaran', '081394617663', 'mual', 'mag', 36, 109),
('Ghilman Muhammad', 'Laki-Laki', '2001-05-04', 'Subang', '081655993652', 'Pusing', 'Asma', 37, 120);

-- --------------------------------------------------------

--
-- Struktur dari tabel `resepsionis`
--

CREATE TABLE `resepsionis` (
  `ID` int(5) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Code_Resepsionis` char(3) NOT NULL,
  `Jam_Kerja` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `resepsionis`
--

INSERT INTO `resepsionis` (`ID`, `Nama`, `Code_Resepsionis`, `Jam_Kerja`) VALUES
(87888, 'Ghaffaruddin Mahud', 'GMD', '00.01-08.00'),
(88888, 'Habibi Zayan', 'HZN', '16.01-00.00'),
(90999, 'Hakim Tahiyyah', 'HTH', '08.01-16.00');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `apoteker`
--
ALTER TABLE `apoteker`
  ADD PRIMARY KEY (`ID`);

--
-- Indeks untuk tabel `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`ID`);

--
-- Indeks untuk tabel `resepsionis`
--
ALTER TABLE `resepsionis`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `apoteker`
--
ALTER TABLE `apoteker`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=99012;

--
-- AUTO_INCREMENT untuk tabel `dokter`
--
ALTER TABLE `dokter`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=89079;

--
-- AUTO_INCREMENT untuk tabel `resepsionis`
--
ALTER TABLE `resepsionis`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=91000;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
