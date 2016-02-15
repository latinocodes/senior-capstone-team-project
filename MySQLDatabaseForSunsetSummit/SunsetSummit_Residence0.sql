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
-- Table structure for table `Residence`
--

DROP TABLE IF EXISTS `Residence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Residence` (
  `ResidenceId` int(10) NOT NULL,
  `LeaseId` int(10) NOT NULL,
  `TenantId` int(10) NOT NULL,
  `MMRentCost` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ResidenceId`),
  KEY `FK_Res_One` (`LeaseId`),
  KEY `FK_Res_Two` (`TenantId`),
  CONSTRAINT `FK_Res_One` FOREIGN KEY (`LeaseId`) REFERENCES `Lease` (`LeaseId`),
  CONSTRAINT `FK_Res_Two` FOREIGN KEY (`TenantId`) REFERENCES `Lease` (`TenantId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Residence`
--

LOCK TABLES `Residence` WRITE;
/*!40000 ALTER TABLE `Residence` DISABLE KEYS */;
INSERT INTO `Residence` VALUES (1,1,1,'10,000.00'),(2,2,2,'1,233.00'),(3,3,3,'1,250.00'),(4,4,4,'1,800.00'),(5,5,5,'1,900.00'),(6,6,6,'1,900.00'),(7,7,7,'1,245.00'),(8,8,8,'1,245.00'),(9,9,9,'1,245.00'),(10,10,10,'1,245.00'),(11,11,11,'1,245.00'),(12,12,12,'1,245.00'),(1345,1345,1345,'1235');
/*!40000 ALTER TABLE `Residence` ENABLE KEYS */;
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
