CREATE TABLE `backend_spring_foundation`.`tb_activity`
(
    `id`              bigint(32) NOT NULL AUTO_INCREMENT COMMENT 'activity primary key',
    `activity_title`  varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  NOT NULL DEFAULT '' COMMENT 'activity title',
    `user_id`         bigint(32) NOT NULL DEFAULT 1 COMMENT 'user id, primary key of user table',
    `description`     text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'activity description',
    `invitation_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  NOT NULL DEFAULT '' COMMENT 'invitation code',
    `cover_url`       varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'cover url',
    `status`          tinyint(2) NOT NULL DEFAULT -1 COMMENT 'activity status',
    `create_at`       datetime(0) NOT NULL COMMENT 'create datetime',
    `update_at`       datetime(0) NOT NULL COMMENT 'update datetime',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;