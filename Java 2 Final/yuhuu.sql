-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2016 at 12:32 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `yuhuu`
--

-- --------------------------------------------------------

--
-- Table structure for table `yuhuu`
--

CREATE TABLE `yuhuu` (
  `usernameyuhuu` varchar(30) NOT NULL,
  `ipaddress` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `yuhuu`
--

INSERT INTO `yuhuu` (`usernameyuhuu`, `ipaddress`) VALUES
('asda', '/192.168.1.104:1321'),
('cxzxczx', '/192.168.1.104:1000'),
('Elijoo', '/192.168.1.104:1000'),
('Elisa', '/192.168.1.104:1321'),
('Jonatan', '/192.168.1.104:1321'),
('Jooo', '/192.168.1.104:1321'),
('tasd', '/192.168.1.104:1321');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `yuhuu`
--
ALTER TABLE `yuhuu`
  ADD PRIMARY KEY (`usernameyuhuu`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
