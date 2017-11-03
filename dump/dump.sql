-- MySQL dump 10.13  Distrib 5.7.19, for Win64 (x86_64)
--
-- Host: localhost    Database: tweets
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `tweettable`
--

DROP TABLE IF EXISTS `tweettable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tweettable` (
  `tekst` varchar(150) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tweettable`
--

LOCK TABLES `tweettable` WRITE;
/*!40000 ALTER TABLE `tweettable` DISABLE KEYS */;
INSERT INTO `tweettable` VALUES ('Hey Twitter, im the 45th President of the United States of America, Washington, DC DC ',57),('MAKE AMERICA GREAT AGAIN!',58),('...There is also something appropriate about keeping him in the home of the horrible crime he committed. Should move fast. DEATH PENALTY!',59),('The United States will be immediately implementing much tougher Extreme Vetting Procedures. The safety of our citizens comes first!',60),('Obama is, without question, the WORST EVER president. I predict he will now do something really bad and totally stupid to show manhood!',61),('This election is a total sham and a travesty. We are not a democracy!',62),('I have never seen a thin person drinking Diet Coke.',63),('Robert Pattinson should not take back Kristen Stewart. She cheated on him like a dog & will do it again--just watch. He can do much better!',64),('Everyone knows I am right that Robert Pattinson should dump Kristen Stewart. In a couple of years, he will thank me. Be smart, Robert.',65),('After Friday’s Twilight release, I hope Robert Pattinson will not be seen in public with Kristen--she will cheat on him again!',66),('Climate change is a hoax.',67),('Twitter rocks.',68),('Simply the best',69);
/*!40000 ALTER TABLE `tweettable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-03 11:52:42
