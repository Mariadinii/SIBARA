-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Bulan Mei 2019 pada 10.48
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubes_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_mahasiswa`
--

CREATE TABLE `data_mahasiswa` (
  `nama` varchar(25) NOT NULL,
  `nim` int(10) NOT NULL,
  `prodi` varchar(20) NOT NULL,
  `ttl` text NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `alamat` text NOT NULL,
  `kode_pos` int(5) NOT NULL,
  `telepon` varchar(13) NOT NULL,
  `tempat_tinggal` text NOT NULL,
  `agama` varchar(15) NOT NULL,
  `status` varchar(15) NOT NULL,
  `semester` int(2) NOT NULL,
  `ipk` float NOT NULL,
  `nama_ayah` varchar(25) NOT NULL,
  `kerja_ayah` varchar(25) NOT NULL,
  `gaji_ayah` int(11) NOT NULL,
  `nama_ibu` varchar(25) NOT NULL,
  `kerja_ibu` varchar(25) NOT NULL,
  `gaji_ibu` int(11) NOT NULL,
  `alamat_ortu` text NOT NULL,
  `kodepos_ortu` int(5) NOT NULL,
  `telpon_ortu` varchar(13) NOT NULL,
  `jumlah_anak` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_mahasiswa`
--

INSERT INTO `data_mahasiswa` (`nama`, `nim`, `prodi`, `ttl`, `jenis_kelamin`, `alamat`, `kode_pos`, `telepon`, `tempat_tinggal`, `agama`, `status`, `semester`, `ipk`, `nama_ayah`, `kerja_ayah`, `gaji_ayah`, `nama_ibu`, `kerja_ibu`, `gaji_ibu`, `alamat_ortu`, `kodepos_ortu`, `telpon_ortu`, `jumlah_anak`) VALUES
('Eka Adyana', 14117001, 'Teknik Informatika', 'Denpasar, 24 Maret 1999', 'Laki-Laki', 'Jl. Parasekan, Sukarame, Bandar Lampung', 35360, '085309357255', 'Jl. Parasekan, Sukarame, Bandar Lampung', 'Islam', 'Lajang', 4, 3.25, 'Budi Hartanto', 'Pegawai Swasta', 2000000, 'Hartanti', 'Ibu rumah tangga', 0, 'Jl. Parasekan, Sukarame, Bandar Lampung', 35360, '082133546710', 2),
('Rana Diastri', 14117002, 'Teknik Informatika', 'Lampung, 3 Januari 1999', 'Perempuan', 'Lampung', 35511, '089656765654', 'Airan', 'Islam', 'Lajang', 4, 3, 'Fffff', 'Pengusaha', 0, 'Hhhhh', 'IRT', 0, 'Lampung', 35511, '085243432156', 2),
('Hesti Retnosari', 14117006, 'Teknik Informatika', 'Rejomulyo, 31 Mei 1999', 'Perempuan', 'Rejomulyo, Palas', 35361, '085273269405', 'Hasan 1', 'Islam', 'Lajang', 4, 3, 'Rasman', 'Petani', 0, 'Rusmiati', 'IRT', 0, 'Rejomulyo, Palas', 35361, '085225566575', 4),
('Maria Andini', 14117041, 'Teknik Informatika', 'Lamsel, 2 Januari 2000', 'Perempuan', 'Lampung Selatan', 35561, '082145787656', 'Lampung', 'Kristen', 'Lajang', 4, 3, 'Cccccc', 'Pengusaha', 0, 'Dddddd', 'IRT', 0, 'Lampung Selatan', 35561, '089767876787', 2),
('Erawati', 14117070, 'Teknik Informatika', 'Lampung, 1 Januari 1999', 'Perempuan', 'Lampung Tengah', 35561, '085271567896', 'Hasan 1', 'Islam', 'Lajang', 4, 3, 'Aaaaa', 'Pengusaha', 0, 'Bbbbb', 'IRT', 0, 'Lampung Tengah', 35561, '085267755897', 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `info_beasiswa`
--

CREATE TABLE `info_beasiswa` (
  `kode` varchar(5) DEFAULT NULL,
  `nama_bea` varchar(50) NOT NULL,
  `tgl_buka` varchar(25) NOT NULL,
  `tgl_tutup` varchar(11) NOT NULL,
  `semester` varchar(11) NOT NULL,
  `ipk_min` float NOT NULL,
  `usia_max` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `info_beasiswa`
--

INSERT INTO `info_beasiswa` (`kode`, `nama_bea`, `tgl_buka`, `tgl_tutup`, `semester`, `ipk_min`, `usia_max`) VALUES
('', 'a', '2019-05- 02', '2019-05-10 ', '1 Semester', 3, 23),
('', 'a', '2019-05- 02', '2019-05-10 ', '1 Semester', 3, 23),
('', 'b', '2019-05- 02', '2019-05-10 ', '2 Semester', 3.2, 23),
('B01', 'lampung', '2019-05- 01', '2019-05-10 ', '2 Semester', 3.25, 23),
('111', 'Prov Lampung', '2019-05- 07', '2019-05-25 ', '1 Semester', 3, 25),
('222', 'Lampung Selatan', '2019-05- 09', '2019-05-28 ', '2 Semester', 3, 25),
('333', 'BI', '2019-05- 01', '2019-05-15 ', '1 Semester', 3, 25),
('444', 'PPN', '2019-05- 03', '2019-05-20 ', '1 Semester', 3, 25),
('555', 'Bidikmisi', '2019-05- 01', '2019-05-30 ', '1 Semester', 3, 25);

-- --------------------------------------------------------

--
-- Struktur dari tabel `penerima`
--

CREATE TABLE `penerima` (
  `nama` varchar(25) NOT NULL,
  `nim` int(11) NOT NULL,
  `nama_beasiswa` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penerima`
--

INSERT INTO `penerima` (`nama`, `nim`, `nama_beasiswa`) VALUES
('Hesti Retnosari', 14117006, 'Prov Lampung'),
('Maria Andini', 14117041, 'Lamsel'),
('Erawati', 14117006, 'Prov Lampung'),
('Rana Diastri', 14117002, 'BI'),
('dini', 14117077, 'bandar lampung'),
('dini', 12, 'lampung');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_login`
--

CREATE TABLE `tabel_login` (
  `id` int(3) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `usertype` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tabel_login`
--

INSERT INTO `tabel_login` (`id`, `username`, `password`, `usertype`) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'mahasiswa', 'mahasiswa', 'mahasiswa');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_mahasiswa`
--
ALTER TABLE `data_mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indeks untuk tabel `tabel_login`
--
ALTER TABLE `tabel_login`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
