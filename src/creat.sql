CREATE SCHEMA `integrationdb` ;

CREATE TABLE `integrationdb`.`admin_info` (
  `aId` INT NOT NULL,
  `aName` VARCHAR(45) NULL,
  `aSex` VARCHAR(10) NULL,
  `aTel` VARCHAR(45) NULL,
  `aPhoNum` VARCHAR(45) NULL,
  `aAddr` VARCHAR(45) NULL,
  `aLimit` INT NULL,
  `aDate` DATE NULL,
  PRIMARY KEY (`aId`));
