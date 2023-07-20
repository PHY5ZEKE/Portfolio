-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2022 at 03:29 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `odfs_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `category_list`
--

CREATE TABLE `category_list` (
  `id` int(30) NOT NULL,
  `name` text NOT NULL,
  `description` text NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 1,
  `delete_flag` tinyint(1) NOT NULL DEFAULT 0,
  `date_created` datetime NOT NULL DEFAULT current_timestamp(),
  `date_updated` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category_list`
--

INSERT INTO `category_list` (`id`, `name`, `description`, `status`, `delete_flag`, `date_created`, `date_updated`) VALUES
(1, 'Food', 'Topic about Food and Eatery around universities.', 1, 0, '2022-05-16 10:02:41', '2022-11-18 00:47:31'),
(2, 'Housing', 'No dorm? Topics that tackle dormitories, condo and lodging for students to rent or buy.', 1, 0, '2022-05-16 10:03:27', '2022-11-18 00:48:02'),
(3, 'Entertainment', 'Entertainment zones found around near universities.', 1, 0, '2022-05-16 10:03:48', '2022-11-16 20:25:25'),
(4, 'School Supplies', 'Of course, places where you can buy your school supplies.', 1, 0, '2022-05-16 10:04:11', '2022-11-18 00:48:21'),
(5, 'Misc', 'Off topic threads!', 1, 0, '2022-05-16 10:04:54', '2022-11-18 00:48:28');

-- --------------------------------------------------------

--
-- Table structure for table `comment_list`
--

CREATE TABLE `comment_list` (
  `id` int(30) NOT NULL,
  `user_id` int(30) NOT NULL,
  `post_id` int(30) NOT NULL,
  `comment` text NOT NULL,
  `date_created` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `comment_list`
--

INSERT INTO `comment_list` (`id`, `user_id`, `post_id`, `comment`, `date_created`) VALUES
(10, 6, 14, '<p>My bad guys im actually <b><i>gay.</i></b></p>', '2022-11-17 23:20:59'),
(12, 7, 22, 'Damn what the fuck!?', '2022-11-18 23:49:35'),
(13, 6, 22, '<p>yes</p>', '2022-11-19 00:22:38');

-- --------------------------------------------------------

--
-- Table structure for table `post_list`
--

CREATE TABLE `post_list` (
  `id` int(30) NOT NULL,
  `user_id` int(30) NOT NULL,
  `category_id` int(30) NOT NULL,
  `title` text NOT NULL,
  `location` text NOT NULL,
  `content` text NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 0,
  `delete_flag` tinyint(1) NOT NULL DEFAULT 0,
  `date_created` datetime NOT NULL DEFAULT current_timestamp(),
  `date_updated` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `post_list`
--

INSERT INTO `post_list` (`id`, `user_id`, `category_id`, `title`, `location`, `content`, `status`, `delete_flag`, `date_created`, `date_updated`) VALUES
(1, 7, 1, 'Sample Topic Title', '', '<p style=\"margin-right: 0px; margin-bottom: 15px; margin-left: 0px; padding: 0px; text-align: justify; color: rgb(0, 0, 0); font-family: \"Open Sans\", Arial, sans-serif; font-size: 14px;\">Test</p><p style=\"margin-right: 0px; margin-bottom: 15px; margin-left: 0px; padding: 0px; text-align: justify; color: rgb(0, 0, 0); font-family: \"Open Sans\", Arial, sans-serif; font-size: 14px;\">Test</p>', 1, 0, '2022-05-16 11:13:02', '2022-11-18 23:52:44'),
(14, 6, 1, 'Where do I go?', '', '<p>Food near ust please.<br><br><img src=\"https://i.imgur.com/THCQKAj.jpeg\" style=\"width: 1216px;\"><br></p>', 1, 0, '2022-11-17 23:20:39', '2022-11-18 01:43:53'),
(15, 6, 1, 'Jakob', '', '<p>Hes yummy</p>', 0, 0, '2022-11-18 01:31:01', '2022-11-18 01:31:17'),
(16, 6, 2, 'ASDasd', '', '<p>asdasd</p>', 1, 0, '2022-11-18 01:31:39', '2022-11-18 01:31:39'),
(17, 6, 5, 'asdasdasdasdasd', '', '<p>asdasd</p>', 1, 0, '2022-11-18 01:31:46', '2022-11-18 01:31:46'),
(18, 6, 2, 'asdasdasdas', '', '<p>asdasdas</p>', 1, 0, '2022-11-18 01:31:53', '2022-11-18 01:31:53'),
(19, 6, 2, 'gay', '', '<p>gay</p>', 1, 0, '2022-11-18 23:00:01', '2022-11-18 23:00:16'),
(20, 6, 1, 'gay', 'gays', '<p>asd</p>', 1, 0, '2022-11-18 23:02:11', '2022-11-18 23:02:11'),
(21, 6, 2, 'Dorm for sale 2500', '1080, Don Quijote, Sampaloc Manila', '<p><b>DORM! </b><br><br>2500 per month<br>elec + water bill separate <br>free of niggas</p>', 1, 0, '2022-11-18 23:20:53', '2022-11-18 23:24:44'),
(22, 6, 1, 'HOT MAN FOR SALE: 100000000000 PHP', 'Dos Castilas, Sampaloc, Manila', '<p>HOT MAN SPOTTED&nbsp;<br>Named: Ezequiel Gonzalez<br><br><br><img src=\"https://media.discordapp.net/attachments/1033308782182289408/1033313654151581736/Dorm_4-9.jpg?width=503&amp;height=670\" style=\"width: 25%;\"><br>&nbsp;</p>', 1, 0, '2022-11-18 23:47:14', '2022-11-18 23:48:03');

-- --------------------------------------------------------

--
-- Table structure for table `system_info`
--

CREATE TABLE `system_info` (
  `id` int(30) NOT NULL,
  `meta_field` text NOT NULL,
  `meta_value` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `system_info`
--

INSERT INTO `system_info` (`id`, `meta_field`, `meta_value`) VALUES
(1, 'name', 'Univenture'),
(6, 'short_name', 'Univenture'),
(11, 'logo', 'uploads/logo.png'),
(13, 'user_avatar', 'uploads/user_avatar.jpg'),
(14, 'cover', 'uploads/cover.png?v=1652665183');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(50) NOT NULL,
  `firstname` varchar(250) NOT NULL,
  `middlename` text DEFAULT NULL,
  `lastname` varchar(250) NOT NULL,
  `username` text NOT NULL,
  `password` text NOT NULL,
  `avatar` text DEFAULT NULL,
  `last_login` datetime DEFAULT NULL,
  `type` tinyint(1) NOT NULL DEFAULT 0,
  `date_added` datetime NOT NULL DEFAULT current_timestamp(),
  `date_updated` datetime DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='2';

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `firstname`, `middlename`, `lastname`, `username`, `password`, `avatar`, `last_login`, `type`, `date_added`, `date_updated`) VALUES
(4, 'Mark', 'D', 'Cooper', 'mcooper', 'c7162ff89c647f444fcaa5c635dac8c3', 'uploads/avatars/4.png?v=1652667135', NULL, 2, '2022-05-16 10:12:15', '2022-05-16 13:44:49'),
(5, 'John', 'D', 'Smith', 'jsmith', '1254737c076cf867dc53d60a0364f38e', NULL, NULL, 2, '2022-05-16 14:19:03', '2022-05-16 14:19:03'),
(6, 'Rico', 'N', 'Nieto', 'RN2', '827ccb0eea8a706c4c34a16891f84e7b', NULL, NULL, 2, '2022-11-16 20:08:36', '2022-11-18 01:59:56'),
(7, 'Zeke', '', 'Gonzalez', 'Zeke', '81dc9bdb52d04dc20036dbd8313ed055', NULL, NULL, 2, '2022-11-18 23:49:09', '2022-11-18 23:49:09'),
(8, 'Zeke', '', 'Gonzalez', 'Nigga', '81dc9bdb52d04dc20036dbd8313ed055', NULL, NULL, 2, '2022-11-18 23:56:18', '2022-11-18 23:56:18');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category_list`
--
ALTER TABLE `category_list`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comment_list`
--
ALTER TABLE `comment_list`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `post_id` (`post_id`);

--
-- Indexes for table `post_list`
--
ALTER TABLE `post_list`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `category_id` (`category_id`);

--
-- Indexes for table `system_info`
--
ALTER TABLE `system_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category_list`
--
ALTER TABLE `category_list`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `comment_list`
--
ALTER TABLE `comment_list`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `post_list`
--
ALTER TABLE `post_list`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `system_info`
--
ALTER TABLE `system_info`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `comment_list`
--
ALTER TABLE `comment_list`
  ADD CONSTRAINT `post_id_fk_cl` FOREIGN KEY (`post_id`) REFERENCES `post_list` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `user_id_fk_cl` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `post_list`
--
ALTER TABLE `post_list`
  ADD CONSTRAINT `category_id_fk_tl` FOREIGN KEY (`category_id`) REFERENCES `category_list` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `user_id_fk_tl` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
