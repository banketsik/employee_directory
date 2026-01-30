CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `first_name` varchar(45) DEFAULT NULL,
                            `last_name` varchar(45) DEFAULT NULL,
                            `email` varchar(45) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES
                           (1,'Leslie','Andrews','leslie@gmail.com'),
                           (2,'Emma','Roberts','emma@gmail.com'),
                           (3,'Chad','Riad','c_riad@outlook.com'),
                           (4,'Riyad','Ahbudi','ahbudi_riad@icloud.com'),
                           (5,'Harry','Potter','harry@yahoo.com'),
                           (6, 'Ronald','Weasley', 'rbw@outlook.com');
