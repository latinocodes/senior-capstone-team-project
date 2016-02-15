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
INSERT INTO `Contact` VALUES (2,'Lara','Isaac','2013-05-18','1452 48TH ST','North Bergen','NJ',7047,'201-918-8919','none@none.com','none',NULL),(10,'Aramayo','Vanessa','1988-10-16','4602 Park Ave','Weehawken','NJ',7086,'551-226-2247','vlara@gmail.com','none',NULL),(13,'Aramayo','Vanessa','1988-01-21','4602 Park Ave','Weehaken','NJ',7086,'551-226-2247','vlara@gmail.com','none',NULL),(20,'Ramos','Marlon','1980-10-01','156 Main Ave','Los Angeles','CA',19391,'310-400-1004','rramos@gmail.com','none',NULL),(111,'Peralta','Chichi','1980-10-11','123 48th ','Union City','NJ',7087,'201-918-8919','joselara02@outlook.com','none',NULL),(122,'Gonzalez','Pepe','1992-12-12','1234 main Ave','Union','NJ',10299,'201-918-3891','mala@mia.com','none',NULL),(1001,'Aramayo','Marco','1955-12-10','1234 Main STREET','Santa Monica','CA',90403,'201-989-1992','none@none.com','none','12');
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

-- Dump completed on 2016-02-10 23:47:35
