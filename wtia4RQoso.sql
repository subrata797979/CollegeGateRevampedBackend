-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 13, 2022 at 05:10 AM
-- Server version: 8.0.13-4
-- PHP Version: 7.2.24-0ubuntu0.18.04.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wtia4RQoso`
--

-- --------------------------------------------------------

--
-- Table structure for table `college`
--

CREATE TABLE `college` (
  `college_id` int(11) NOT NULL,
  `name` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `address` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `website` varchar(60) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `university` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `college`
--

INSERT INTO `college` (`college_id`, `name`, `address`, `email`, `website`, `university`, `phone`) VALUES
(1, 'BARRACKPORE RASTRAGURU SURENDR', '85, Middle Road & 6, Riverside Road, Kolkata 700120', 'brsc1953@gmail.com', 'www.brsnc.in', 'WEST BENGAL STATE UNIVERSITY', '033 2592 0603'),
(2, 'Rishi Bankim Chandra College', 'East Kantalpara,  Naihati, North 24 Parganas,  West Bengal, PIN- 743165', 'contact@rbccollege.ac.in', 'www.rbccollege.ac.in', 'WEST BENGAL STATE UNIVERSITY', '(91) (33) 25812099'),
(3, 'Surendranath College', '24/2, Mahatma Gandhi Road, Kolkata – 700009', 'principal@surendranathcollege.ac.in', 'http://www.suredranathcollege.ac.in', 'University of Calcutta', '2354 3876');

-- --------------------------------------------------------

--
-- Table structure for table `college_subject`
--

CREATE TABLE `college_subject` (
  `college_reference_id` int(11) NOT NULL,
  `subject` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `marks` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `college_subject`
--

INSERT INTO `college_subject` (`college_reference_id`, `subject`, `marks`) VALUES
(1, 'a', 70),
(1, 'b', 60),
(1, 'c', 50),
(2, 'a', 60),
(2, 'b', 50),
(2, 'c', 40),
(3, 'a', 80),
(3, 'b', 70),
(3, 'c', 60);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `college_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `username`, `email`, `password`, `college_id`) VALUES
(2, 'subu', 'subrata797979@gmail.com', '1', 1),
(1, 'demo', 'demo@gmail.com', '1', 3),
(3, 'demo3', 'demo3@gmail.com', '3', NULL),
(4, 'demo4', 'demo4@gmail.com', '4', NULL),
(5, 'demo5', 'demo5@gmail.com', '5', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `college`
--
ALTER TABLE `college`
  ADD PRIMARY KEY (`college_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `college`
--
ALTER TABLE `college`
  MODIFY `college_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
