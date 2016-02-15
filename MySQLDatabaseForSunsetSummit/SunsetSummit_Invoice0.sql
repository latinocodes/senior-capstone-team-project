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
-- Table structure for table `Invoice`
--

DROP TABLE IF EXISTS `Invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Invoice` (
  `InvoiceId` int(10) NOT NULL,
  `LeaseId` int(10) NOT NULL,
  `TenantId` int(10) NOT NULL,
  `ResidenceId` int(10) NOT NULL,
  `BillDueDate` date DEFAULT NULL,
  `BillPaidDate` date DEFAULT NULL,
  `FirstNtc` date DEFAULT NULL,
  `LastNtc` date DEFAULT NULL,
  PRIMARY KEY (`InvoiceId`,`ResidenceId`,`LeaseId`,`TenantId`),
  KEY `ResidenceId` (`ResidenceId`),
  KEY `LeaseId` (`LeaseId`),
  KEY `TenantId` (`TenantId`),
  CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`ResidenceId`) REFERENCES `Residence` (`ResidenceId`),
  CONSTRAINT `invoice_ibfk_2` FOREIGN KEY (`LeaseId`) REFERENCES `Residence` (`LeaseId`),
  CONSTRAINT `invoice_ibfk_3` FOREIGN KEY (`TenantId`) REFERENCES `Residence` (`TenantId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Invoice`
--

LOCK TABLES `Invoice` WRITE;
/*!40000 ALTER TABLE `Invoice` DISABLE KEYS */;
INSERT INTO `Invoice` VALUES (1,1,1,1,'2016-02-01','2016-02-15',NULL,NULL),(2,2,2,2,'2016-12-01','2016-02-15',NULL,NULL),(3,3,3,3,'2015-02-12',NULL,NULL,NULL),(4,4,4,4,'2015-12-01','2016-02-15','2016-02-15',NULL),(5,5,5,5,'2015-01-10',NULL,NULL,NULL),(6,6,6,6,'2015-01-10',NULL,NULL,NULL),(7,7,7,7,'2015-12-22',NULL,NULL,NULL),(8,8,8,8,'2015-12-22',NULL,NULL,NULL),(9,9,9,9,'2015-12-22',NULL,NULL,NULL),(10,10,10,10,'2015-12-22',NULL,NULL,NULL),(11,11,11,11,'2015-12-22',NULL,NULL,NULL),(12,12,12,12,'2015-12-22',NULL,NULL,'2016-02-15'),(1345,1345,1345,1345,'2016-01-12','2016-02-15','2016-02-15','2016-02-15');
/*!40000 ALTER TABLE `Invoice` ENABLE KEYS */;
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
