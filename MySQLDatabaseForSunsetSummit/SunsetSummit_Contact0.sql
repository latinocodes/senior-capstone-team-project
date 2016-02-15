-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: localhost    Database: SunsetSummit
-- ------------------------------------------------------
-- Server version	5.7.10

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Contact`
--

DROP TABLE IF EXISTS `Contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Contact` (
  `ContactId` int(10) NOT NULL,
  `Lname` varchar(45) DEFAULT NULL,
  `Fname` varchar(45) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `Street` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `State` varchar(2) DEFAULT NULL,
  `Zip` int(5) DEFAULT NULL,
  `Phone` varchar(15) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `SpecialNeeds` varchar(45) DEFAULT NULL,
  `AptNum` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ContactId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Contact`
--

LOCK TABLES `Contact` WRITE;
/*!40000 ALTER TABLE `Contact` DISABLE KEYS */;
INSERT INTO `Contact` VALUES (1,'Lara','Jose','1988-10-02','1452 48TH ST','North Bergen','NJ',7047,'201-918-8919','joselara02@outlook.com','none','1'),(2,'Lara','Vanessa','1988-10-16','1234 Main STREET','Santa Monica','CA',90403,'555-129-3918','vlara@gmail.com','none','1'),(3,'Ramos','Marlon','1990-01-23','1234 Main STREET','Santa Monica','CA',90403,'301-999-0039','marlon@gmail.com','none','122'),(4,'Santana','Angel','1992-01-23','1234 Main STREET','Santa Monica','CA',90403,'617-238-9912','a.santana@gmail.com','none','1C'),(5,'Dominguez','Ivan','1981-12-11','1234 Main STREET','Santa Monica','CA',90403,'323-123-9934','none@gmail.com','none','10'),(6,'Rodriguez','Pepe','1981-12-11','1234 Main STREET','Santa Monica','CA',90403,'323-123-9934','none@gmail.com','none','123'),(7,'Dominguez','Adolfo','1988-12-12','1234 Main STREET','Santa Monica','CA',90403,'201-910-9939','dominguez@gmail.com','none','3B'),(8,'Pedro','John','1988-12-12','1234 Main STREET','Santa Monica','CA',90403,'201-910-9939','dominguez@gmail.com','none','3C'),(9,'Perez','Amanda','1988-12-12','1234 Main STREET','Santa Monica','CA',90403,'201-910-9939','dominguez@gmail.com','none','3C'),(10,'Aramayo','Isaac','1988-12-12','1234 Main STREET','Santa Monica','CA',90403,'201-910-9939','dominguez@gmail.com','none','3C'),(11,'Aramayo','Marco','1988-12-12','1234 Main STREET','Santa Monica','CA',90403,'201-910-9939','maramayo@gmail.com','none','3C'),(12,'Aramayo','Richie','1988-12-12','1215 San Jose','Kerny','NJ',20031,'201-910-9939','maramayo@gmail.com','none','134'),(1345,'Roman','Karen','1988-12-13','111 61ST ST','West New York','NJ',7093,'646-123-7737','n.joe@gmail.com','none','13');
/*!40000 ALTER TABLE `Contact` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-02-15 17:00:50
