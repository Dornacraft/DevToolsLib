CREATE TABLE IF NOT EXISTS `dc_player`
(
    `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `uuid` VARCHAR(36) NOT NULL UNIQUE,
    `name` VARCHAR(50) NOT NULL,
    `first_login` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `last_login` DATETIME DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS `dc_item`
(
    `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `server_name` VARCHAR(50) NOT NULL,
    `item` JSON NOT NULL,
    `fk_owner_uuid` VARCHAR(36) NOT NULL,
    CONSTRAINT `fk_owner_uuid`
        FOREIGN KEY (`fk_owner_uuid`)
        REFERENCES `dc_player` (`uuid`)
        ON UPDATE RESTRICT
        ON DELETE CASCADE
) ENGINE=InnoDB;
