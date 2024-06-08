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

-- Data exporting was unselected.

-- Dumping structure for table javasikar.ciri_minat_bakat
CREATE TABLE IF NOT EXISTS `ciri_minat_bakat` (
  `kode_ciri` int NOT NULL AUTO_INCREMENT,
  `pertanyaan` text NOT NULL,
  PRIMARY KEY (`kode_ciri`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Data exporting was unselected.

-- Dumping structure for table javasikar.hasil
CREATE TABLE IF NOT EXISTS `hasil` (
  `id_user` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `id_kecerdasan_minat` int DEFAULT NULL,
  `kecocokan` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Data exporting was unselected.

-- Dumping structure for table javasikar.jawaban_user
CREATE TABLE IF NOT EXISTS `jawaban_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) DEFAULT NULL,
  `kode_ciri` int DEFAULT NULL,
  `jawaban` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `kode_ciri` (`kode_ciri`),
  CONSTRAINT `jawaban_user_ibfk_2` FOREIGN KEY (`kode_ciri`) REFERENCES `ciri_minat_bakat` (`kode_ciri`),
  CONSTRAINT `jawaban_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=347 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Data exporting was unselected.

-- Dumping structure for table javasikar.jurusan
CREATE TABLE IF NOT EXISTS `jurusan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_kecerdasan` int DEFAULT NULL,
  `nama_jurusan` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_kecerdasan` (`id_kecerdasan`),
  CONSTRAINT `jurusan_ibfk_1` FOREIGN KEY (`id_kecerdasan`) REFERENCES `kecerdasan_minat` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Data exporting was unselected.

-- Dumping structure for table javasikar.kecerdasan_minat
CREATE TABLE IF NOT EXISTS `kecerdasan_minat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nama_kecerdasan` varchar(50) NOT NULL,
  `deskripsi` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Data exporting was unselected.

-- Dumping structure for table javasikar.orang
CREATE TABLE IF NOT EXISTS `orang` (
  `id` varchar(11) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `level` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Data exporting was unselected.

-- Dumping structure for table javasikar.users
CREATE TABLE IF NOT EXISTS `users` (
  `id_user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `nama_sekolah` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(50) DEFAULT NULL,
  `kelas` varchar(50) DEFAULT NULL,
  `jurusan` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Data exporting was unselected.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
