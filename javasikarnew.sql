-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for javasikar
CREATE DATABASE IF NOT EXISTS `javasikar` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `javasikar`;

-- Dumping structure for table javasikar.aturan
CREATE TABLE IF NOT EXISTS `aturan` (
  `kode_aturan` varchar(11) NOT NULL,
  `jika` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `maka` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`kode_aturan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table javasikar.aturan: ~9 rows (approximately)
INSERT IGNORE INTO `aturan` (`kode_aturan`, `jika`, `maka`) VALUES
	('A01', 'C1,C2,C3,C4,C5', '1'),
	('A02', 'C6,C7,C8,C9,C10', '2'),
	('A03', 'C11,C12,C13,C14,C15', '3'),
	('A04', 'C16,C17,C18,C19,C20', '4'),
	('A05', 'C21,C22,C23,C24,C25', '5'),
	('A06', 'C26,C27,C28,C29,C30', '6'),
	('A07', 'C31,C32,C33,C34,C35', '7'),
	('A08', 'C36,C37,C38,C39,C40', '8'),
	('A09', 'C41,C42,C43,C44,C45', '9');

-- Dumping structure for table javasikar.ciri_minat_bakat
CREATE TABLE IF NOT EXISTS `ciri_minat_bakat` (
  `kode_ciri` int NOT NULL AUTO_INCREMENT,
  `pertanyaan` text NOT NULL,
  PRIMARY KEY (`kode_ciri`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table javasikar.ciri_minat_bakat: ~30 rows (approximately)
INSERT IGNORE INTO `ciri_minat_bakat` (`kode_ciri`, `pertanyaan`) VALUES
	(1, 'Apakah Anda menyukai berbicara dan bercerita?'),
	(2, 'Apakah Anda suka mengutarakan atau bertukar ide dengan orang lain ataupun berdebat?'),
	(3, 'Apakah Anda senang menulis karangan atau segala hal yang berbentuk tulisan?'),
	(4, 'Apakah Anda menyukai pelajaran bahasa daripada matematika dan ilmu alam?'),
	(5, 'Apakah Anda menyukai permainan olah kata, seperti berpantun, bermain teka-teki, puisi, dll?'),
	(6, 'Apakah Anda menyukai ilmu sains atau matematika?'),
	(7, 'Apakah Anda lebih tertarik pada permainan yang mengandalkan strategi dan mengasah cara berpikir, contohnya permainan catur, maze, dll?'),
	(8, 'Apakah Anda senang bermain komputer dan tertarik untuk mengetahui bagaimana komputer bekerja?'),
	(9, 'Jika sesuatu rusak dan tidak berfungsi, apakah Anda akan melihat bagian-bagiannya dan mencari tahu bagaimana cara kerjanya?'),
	(10, 'Apakah Anda suka berpikir melalui masalah dengan hati-hati, mempertimbangkan segala konsekuensinya?'),
	(11, 'Apakah Anda menyukai pelajaran geografi daripada matematika?'),
	(12, 'Apakah Anda, ketika membaca majalah, lebih suka melihat gambar-gambarnya daripada membaca teksnya?'),
	(13, 'Apakah Anda memiliki ingatan yang tinggi pada gambar, grafik, dan bagan?'),
	(14, 'Apakah Anda memiliki daya ingat yang tinggi pada tempat, jalan, walaupun belum terlalu sering mengunjunginya?'),
	(15, 'Apakah Anda memiliki ingatan yang mudah saat mengenali wajah dibandingkan mengingat nama seseorang?'),
	(16, 'Apakah olahraga merupakan suatu hobi bagi Anda?'),
	(17, 'Apakah Anda lebih banyak bergerak saat belajar?'),
	(18, 'Apakah Anda lebih suka beraktivitas di alam bebas atau diluar ruangan?'),
	(19, 'Apakah Anda lebih memilih praktek langsung saat belajar sesuatu?'),
	(20, 'Apakah Anda tidak dapat duduk diam dalam waktu yang lama?'),
	(21, 'Apakah Anda memiliki hobi bernyanyi atau mendengarkan musik?'),
	(22, 'Apakah Anda suka mendengarkan musik sambil belajar atau sambil membaca buku?'),
	(23, 'Apakah Anda bisa memainkan salah satu alat musik dengan baik?'),
	(24, 'Apakah Anda menikmati berbagai macam gaya musik?'),
	(25, 'Apabila Anda mendengarkan suatu karya musik satu atau dua kali, dapatkah Anda menyanyikannya kembali dengan cukup baik?'),
	(26, 'Apakah Anda suka untuk mengajar orang lain tentang hal-hal yang dipelajari?'),
	(27, 'Apakah Anda tidak segan menawarkan atau memberikan bantuan saat orang lain kesusahan?'),
	(28, 'Apakah Anda mudah bergaul dan bersosialisasi dengan orang sekitar?'),
	(29, 'Apakah Anda senang terlibat dalam kegiatan sosial yang berkaitan dengan organisasi sekolah atau lingkungan tempat tinggal?'),
	(30, 'Apakah orang sering menunjuk Anda sebagai pemimpin?');

-- Dumping structure for table javasikar.jawaban_user
CREATE TABLE IF NOT EXISTS `jawaban_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) DEFAULT NULL,
  `kode_ciri` int DEFAULT NULL,
  `jawaban` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `kode_ciri` (`kode_ciri`),
  CONSTRAINT `jawaban_user_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `orang` (`id`),
  CONSTRAINT `jawaban_user_ibfk_2` FOREIGN KEY (`kode_ciri`) REFERENCES `ciri_minat_bakat` (`kode_ciri`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table javasikar.jawaban_user: ~0 rows (approximately)

-- Dumping structure for table javasikar.jurusan
CREATE TABLE IF NOT EXISTS `jurusan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_kecerdasan` int DEFAULT NULL,
  `nama_jurusan` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_kecerdasan` (`id_kecerdasan`),
  CONSTRAINT `jurusan_ibfk_1` FOREIGN KEY (`id_kecerdasan`) REFERENCES `kecerdasan_minat` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table javasikar.jurusan: ~49 rows (approximately)
INSERT IGNORE INTO `jurusan` (`id`, `id_kecerdasan`, `nama_jurusan`) VALUES
	(1, 1, 'Pariwisata'),
	(2, 1, 'Ilmu Komunikasi'),
	(3, 1, 'Bahasa dan Sastra'),
	(4, 1, 'Ilmu Hubungan Internasional'),
	(5, 1, 'Ilmu Hukum'),
	(6, 1, 'Ilmu Politik'),
	(7, 1, 'Ilmu Perpustakaan'),
	(8, 2, 'Statistika'),
	(9, 2, 'Administrasi Negara'),
	(10, 2, 'Akuntansi'),
	(11, 2, 'Ilmu Ekonomi'),
	(12, 2, 'Teknik Penerbangan'),
	(13, 2, 'Pendidikan Matematika'),
	(14, 2, 'Ilmu Fisika'),
	(15, 2, 'Ilmu Kimia'),
	(16, 2, 'Teknik Informatika'),
	(17, 2, 'Sistem Informasi'),
	(18, 2, 'Manajemen Logistik'),
	(19, 3, 'Desain Komunikasi Visual'),
	(20, 3, 'Teknik Arsitektur'),
	(21, 3, 'Teknik Sipil'),
	(22, 3, 'Seni Rupa'),
	(23, 4, 'Seni Tari'),
	(24, 4, 'Pendidikan Jasmani, Kesehatan, dan Rekreasi (PJKR)'),
	(25, 4, 'Ilmu Keolahragaan'),
	(26, 4, 'Manajemen Event'),
	(27, 5, 'Seni Musik'),
	(28, 5, 'Seni Teater'),
	(29, 6, 'Ilmu Sosiologi'),
	(30, 6, 'Pendidikan Guru Pendidikan Anak Usia Dini (PGPAUD)'),
	(31, 6, 'Pendidikan Guru Sekolah Dasar (PGSD)'),
	(32, 6, 'Kedokteran'),
	(33, 6, 'Ilmu Keperawatan'),
	(34, 6, 'Fakultas Kesehatan Masyarakat'),
	(35, 6, 'Ilmu Gizi'),
	(36, 6, 'Antropologi'),
	(37, 6, 'Pendidikan'),
	(38, 7, 'Ilmu Agama'),
	(39, 7, 'Psikologi'),
	(40, 7, 'Administrasi Niaga'),
	(41, 8, 'Kedokteran Hewan'),
	(42, 8, 'Fakultas Perikanan'),
	(43, 8, 'Fakultas Peternakan'),
	(44, 8, 'Ilmu Biologi'),
	(45, 8, 'Fakultas Pertanian'),
	(46, 8, 'Fakultas Kehutanan'),
	(47, 9, 'Ilmu Filsafat'),
	(48, 9, 'Ilmu Sejarah'),
	(51, 1, 'testa');

-- Dumping structure for table javasikar.kecerdasan_minat
CREATE TABLE IF NOT EXISTS `kecerdasan_minat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nama_kecerdasan` varchar(50) NOT NULL,
  `deskripsi` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table javasikar.kecerdasan_minat: ~10 rows (approximately)
INSERT IGNORE INTO `kecerdasan_minat` (`id`, `nama_kecerdasan`, `deskripsi`) VALUES
	(1, 'Kecerdasan Linguistic-Verbal', 'Kecerdasan ini mencakup kemampuan dalam bahasa, baik lisan maupun tulisan.'),
	(2, 'Kecerdasan Logika-Matematik', 'Kecerdasan ini berkaitan dengan pemecahan masalah, logika, dan matematika.'),
	(3, 'Kecerdasan Spasial-Visual', 'Kecerdasan ini berkaitan dengan kemampuan visualisasi dan pemahaman terhadap ruang dan bentuk.'),
	(4, 'Kecerdasan Kinetik', 'Kecerdasan ini mencakup kemampuan motorik dan fisik.'),
	(5, 'Kecerdasan Ritmik-Musik', 'Kecerdasan ini berkaitan dengan kepekaan terhadap musik, ritme, dan melodi.'),
	(6, 'Kecerdasan Interpersonal', 'Kecerdasan ini berkaitan dengan kemampuan dalam berinteraksi dan memahami orang lain.'),
	(7, 'Kecerdasan Intrapersonal', 'Kecerdasan ini berkaitan dengan pemahaman dan pengendalian diri sendiri.'),
	(8, 'Kecerdasan Naturalis', 'Kecerdasan ini berkaitan dengan pemahaman dan keterlibatan dengan alam.'),
	(9, 'Kecerdasan Eksistensial', 'Kecerdasan ini berkaitan dengan pertanyaan-pertanyaan tentang makna hidup, eksistensi, dan tujuan hidup.'),
	(10, 'testa', 'testa');

-- Dumping structure for table javasikar.orang
CREATE TABLE IF NOT EXISTS `orang` (
  `id` varchar(11) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `level` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table javasikar.orang: ~2 rows (approximately)
INSERT IGNORE INTO `orang` (`id`, `nama`, `username`, `password`, `level`) VALUES
	('SPK001', 'Super Admin', 'admin', 'admin', 'Admin'),
	('SPK002', 'Super User', 'user', 'user', 'User');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
