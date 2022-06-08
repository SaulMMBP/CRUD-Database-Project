CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `employee` VALUES 
	(1,'Javier','Marcos','javier@gmail.com'),
	(2,'Hernan','Vaugh','hervaugn@hotmail.com'),
	(3,'Adrián','Gómez','adgom@yahoo.com'),
	(4,'Yajaira','Perez','yaja@hotmail.com'),
	(5,'Juan','Vega','juan@gmail.com');

