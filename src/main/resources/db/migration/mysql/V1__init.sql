-- CREATE TABLE
CREATE TABLE `saints` (
	`id` bigint(20) NOT NULL,
	`name` varchar(150) NOT NULL,
	`nickname` varchar(150) NOT NULL,
	`birthday` datetime NOT NULL,
	`history` text NOT NULL,
	`image` varchar(255) NOT NULL,
	`altImage` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ADD PRIMARY KEY
ALTER TABLE `saints`
	ADD PRIMARY KEY(`id`);
-- ADD AUTO_INCREMENT
ALTER TABLE `saints`
	MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;