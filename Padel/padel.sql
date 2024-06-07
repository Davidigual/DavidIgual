create database padel;
use padel;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: padel
-- ------------------------------------------------------
-- Server version	8.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `jugadores`
--

DROP TABLE IF EXISTS `jugadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugadores` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellidos` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugadores`
--

LOCK TABLES `jugadores` WRITE;
/*!40000 ALTER TABLE `jugadores` DISABLE KEYS */;
INSERT INTO `jugadores` VALUES ('11111111','David','Igual'),('18435654G','Pedro','Porro'),('18456345J','Ale','Borja'),('18456789P','Antonio','Climent'),('1845965L','Paco','Lopez macarraña');
/*!40000 ALTER TABLE `jugadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partidos`
--

DROP TABLE IF EXISTS `partidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partidos` (
  `id_partido` int NOT NULL AUTO_INCREMENT,
  `equipos` varchar(200) DEFAULT NULL,
  `setsEquipo1` int DEFAULT NULL,
  `setsEquipo2` int DEFAULT NULL,
  PRIMARY KEY (`id_partido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partidos`
--

LOCK TABLES `partidos` WRITE;
/*!40000 ALTER TABLE `partidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `partidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pistas`
--

DROP TABLE IF EXISTS `pistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pistas` (
  `codigo_pistas` int NOT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo_pistas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pistas`
--

LOCK TABLES `pistas` WRITE;
/*!40000 ALTER TABLE `pistas` DISABLE KEYS */;
INSERT INTO `pistas` VALUES (1,'Rojo'),(2,'Verde'),(3,'Azul'),(4,'Naranja');
/*!40000 ALTER TABLE `pistas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas` (
  `id_reserva` int NOT NULL AUTO_INCREMENT,
  `fecha_reserva` date NOT NULL,
  `dni_jugador` varchar(9) DEFAULT NULL,
  `cod_pista` int NOT NULL,
  PRIMARY KEY (`id_reserva`,`fecha_reserva`,`cod_pista`),
  KEY `cod_pista` (`cod_pista`),
  CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`cod_pista`) REFERENCES `pistas` (`codigo_pistas`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
INSERT INTO `reservas` VALUES (1,'2024-06-03','18435244P',1),(2,'2024-06-04','18468949H',4),(4,'2024-06-03','18456598O',2),(5,'2024-06-03','18456987I',3),(6,'2024-06-03','18444555A',3);
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resultados`
--

DROP TABLE IF EXISTS `resultados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resultados` (
  `codigo_resultado` int NOT NULL AUTO_INCREMENT,
  `equipo_win` varchar(200) DEFAULT NULL,
  `fecha_resultado` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`codigo_resultado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resultados`
--

LOCK TABLES `resultados` WRITE;
/*!40000 ALTER TABLE `resultados` DISABLE KEYS */;
/*!40000 ALTER TABLE `resultados` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-04 15:44:47
