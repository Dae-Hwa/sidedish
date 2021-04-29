-- -----------------------------------------------------
-- Table `sidedish`.`sidedish_category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sidedish`.`sidedish_category`;

CREATE TABLE IF NOT EXISTS `sidedish`.`sidedish_category`
(
    `id`      INT         NOT NULL AUTO_INCREMENT,
    `name`    VARCHAR(45) NULL,
    `is_best` BOOLEAN     NULL,
    PRIMARY KEY (`id`)
);


-- -----------------------------------------------------
-- Table `sidedish`.`sidedish`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sidedish`.`sidedish`;

CREATE TABLE IF NOT EXISTS `sidedish`.`sidedish`
(
    `id`                   INT          NOT NULL AUTO_INCREMENT,
    `sidedish_category_id` INT          NOT NULL,
    `name`                 VARCHAR(45)  NULL,
    `description`          VARCHAR(200) NULL,
    `normal_price`          INT          NULL,
    `sale_price`            INT          NULL,
    `stock`                INT          NULL,
    PRIMARY KEY (`id`),
    INDEX `fk_sidedish_sidedish_category_idx` (`sidedish_category_id` ASC),
    CONSTRAINT `fk_sidedish_sidedish_category`
        FOREIGN KEY (`sidedish_category_id`)
            REFERENCES `sidedish`.`sidedish_category` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
;


-- -----------------------------------------------------
-- Table `sidedish`.`image`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sidedish`.`image`;

CREATE TABLE IF NOT EXISTS `sidedish`.`image`
(
    `id`  INT         NOT NULL AUTO_INCREMENT,
    `url` VARCHAR(45) NOT NULL,
    `description` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `url_UNIQUE` (`url` ASC)
)
;


-- -----------------------------------------------------
-- Table `sidedish`.`sidedish_image`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sidedish`.`sidedish_image`;

CREATE TABLE IF NOT EXISTS `sidedish`.`sidedish_image`
(
    `sidedish_id` INT         NOT NULL,
    `image_id`    INT         NOT NULL,
    `name`        VARCHAR(45) NULL,
    PRIMARY KEY (`sidedish_id`),
    INDEX `fk_sidedish_image_sidedish1_idx` (`sidedish_id` ASC),
    INDEX `fk_sidedish_image_image1_idx` (`image_id` ASC),
    CONSTRAINT `fk_sidedish_image_sidedish1`
        FOREIGN KEY (`sidedish_id`)
            REFERENCES `sidedish`.`sidedish` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_sidedish_image_image1`
        FOREIGN KEY (`image_id`)
            REFERENCES `sidedish`.`image` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
;


-- -----------------------------------------------------
-- Table `sidedish`.`sidedish_thumb_image`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sidedish`.`sidedish_thumb_image`;

CREATE TABLE IF NOT EXISTS `sidedish`.`sidedish_thumb_image`
(
    `sidedish_id` INT NOT NULL,
    `image_id`    INT NOT NULL,
    PRIMARY KEY (`image_id`, `sidedish_id`),
    INDEX `fk_sidedish_thumb_image_sidedish1_idx` (`sidedish_id` ASC),
    INDEX `fk_sidedish_thumb_image_image1_idx` (`image_id` ASC),
    CONSTRAINT `fk_sidedish_thumb_image_sidedish1`
        FOREIGN KEY (`sidedish_id`)
            REFERENCES `sidedish`.`sidedish` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_sidedish_thumb_image_image1`
        FOREIGN KEY (`image_id`)
            REFERENCES `sidedish`.`image` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
;


-- -----------------------------------------------------
-- Table `sidedish`.`sidedish_delivery`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sidedish`.`sidedish_delivery`;

CREATE TABLE IF NOT EXISTS `sidedish`.`sidedish_delivery`
(
    `sidedish_id`       INT     NOT NULL,
    `delivery_price`    INT     NULL,
    PRIMARY KEY (`sidedish_id`),
    CONSTRAINT `fk_sidedish_delivery_sidedish1`
        FOREIGN KEY (`sidedish_id`)
            REFERENCES `sidedish`.`sidedish` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
;


-- -----------------------------------------------------
-- Table `sidedish`.`sidedish_delivery_type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sidedish`.`sidedish_delivery_type`;

CREATE TABLE IF NOT EXISTS `sidedish`.`sidedish_delivery_type`
(
    `sidedish_id` INT NOT NULL,
    `name` VARCHAR(45) NOT NULL,
    INDEX `fk_sidedish_delivery_type_sidedish_delivery1_idx` (`sidedish_id` ASC),
    PRIMARY KEY (`sidedish_id`, `name`),
    CONSTRAINT `fk_sidedish_delivery_type_sidedish_delivery1`
        FOREIGN KEY (`sidedish_id`)
            REFERENCES `sidedish`.`sidedish_delivery` (`sidedish_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);


-- -----------------------------------------------------
-- Table `sidedish`.`sidedish_badge`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sidedish`.`sidedish_badge`;

CREATE TABLE IF NOT EXISTS `sidedish`.`sidedish_badge`
(
    `id`          INT         NOT NULL AUTO_INCREMENT,
    `name`        VARCHAR(45) NULL,
    `sidedish_id` INT         NOT NULL,
    PRIMARY KEY (`id`),
    INDEX `fk_sidedish_badge_sidedish1_idx` (`sidedish_id` ASC),
    CONSTRAINT `fk_sidedish_badge_sidedish1`
        FOREIGN KEY (`sidedish_id`)
            REFERENCES `sidedish`.`sidedish` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
;


-- -----------------------------------------------------
-- Table `sidedish`.`sidedish_delivery_day`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sidedish`.`sidedish_delivery_day`;

CREATE TABLE IF NOT EXISTS `sidedish`.`sidedish_delivery_day`
(
    `sidedish_id` INT NOT NULL,
    `monday` BOOLEAN NOT NULL DEFAULT 0,
    `tuesday` BOOLEAN NOT NULL DEFAULT 0,
    `wednesday` BOOLEAN NOT NULL DEFAULT 0,
    `thursday` BOOLEAN NOT NULL DEFAULT 0,
    `friday` BOOLEAN NOT NULL DEFAULT 0,
    `saturday` BOOLEAN NOT NULL DEFAULT 0,
    `sunday` BOOLEAN NOT NULL DEFAULT 0,
    PRIMARY KEY (`sidedish_id`),
    CONSTRAINT `fk_sidedish_delivery_day_sidedish_delivery1`
        FOREIGN KEY (`sidedish_id`)
            REFERENCES `sidedish`.`sidedish_delivery` (`sidedish_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);
