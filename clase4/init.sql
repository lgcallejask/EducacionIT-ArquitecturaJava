DROP SCHEMA `clase4`;

CREATE SCHEMA `clase4` ;

CREATE TABLE `clase4`.`users` (
                                  `id` INT(11) NOT NULL AUTO_INCREMENT,
                                  `nombre` VARCHAR(100) NULL,
                                  `apellido` VARCHAR(100) NULL,
                                  `pais` VARCHAR(150) NULL,
                                  `nro_serie` VARCHAR(100) NULL,
                                  PRIMARY KEY (`id`));
                                  
SET GLOBAL time_zone = '-3:00';