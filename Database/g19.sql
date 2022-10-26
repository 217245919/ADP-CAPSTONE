-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 26, 2022 at 10:33 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `g19`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrator`
--

CREATE TABLE `administrator` (
  `id` bigint(20) NOT NULL,
  `admin_fname` varchar(255) DEFAULT NULL,
  `admin_id` varchar(255) DEFAULT NULL,
  `admin_sname` varchar(255) DEFAULT NULL,
  `booking_id` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `administrator`
--

INSERT INTO `administrator` (`id`, `admin_fname`, `admin_id`, `admin_sname`, `booking_id`) VALUES
(1, 'Keallan', '668eeac7-296f-493a-bbbc-ca8f6946a6ae', 'Saunders', '1254');

-- --------------------------------------------------------

--
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `id` bigint(20) NOT NULL,
  `booking_id` varchar(255) DEFAULT NULL,
  `branch_id` varchar(255) DEFAULT NULL,
  `customer_id` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`id`, `booking_id`, `branch_id`, `customer_id`, `date`, `time`) VALUES
(25, 'a8f18333-92b2-4ddb-aae1-23257561640c', '6400', '6', '2022-10-20', '12:51'),
(27, 'c4cd2c3e-0144-478c-8ae4-a598c52d2742', '3800', '7', '2022-10-20', '12:51');

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `id` bigint(20) NOT NULL,
  `car_colour` varchar(255) DEFAULT NULL,
  `car_model` varchar(255) DEFAULT NULL,
  `car_reg_id` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`id`, `car_colour`, `car_model`, `car_reg_id`) VALUES
(1, 'Blue', 'Mercedes c200 Sedan', 'c1e7998c-5cac-4d29-adb2-5660a897a4c4');

-- --------------------------------------------------------

--
-- Table structure for table `car_delivery`
--

CREATE TABLE `car_delivery` (
  `id` bigint(20) NOT NULL,
  `car_deliv_id` varchar(255) DEFAULT NULL,
  `customer_id` varchar(255) DEFAULT NULL,
  `delivbid` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `cleaner`
--

CREATE TABLE `cleaner` (
  `id` bigint(20) NOT NULL,
  `cleaner_fname` varchar(255) DEFAULT NULL,
  `cleaner_id` varchar(255) DEFAULT NULL,
  `cleaner_sname` varchar(255) DEFAULT NULL,
  `booking_id` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `carplate` varchar(255) DEFAULT NULL,
  `cellnr` int(11) DEFAULT NULL,
  `cus_id` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `address`, `carplate`, `cellnr`, `cus_id`, `firstname`, `lastname`) VALUES
(1, '3A 4th Avenue', 'CAA176409', 824051561, '1302aea9-d7c2-4c54-9aa1-dbcc1cf56ee7', 'Keallan', 'Saunders');

-- --------------------------------------------------------

--
-- Table structure for table `delivery_boy`
--

CREATE TABLE `delivery_boy` (
  `id` bigint(20) NOT NULL,
  `delivbcell_nr` varchar(255) DEFAULT NULL,
  `delivbfname` varchar(255) DEFAULT NULL,
  `delivbid` varchar(255) DEFAULT NULL,
  `delivbsname` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `id` bigint(20) NOT NULL,
  `branch_cellno` varchar(255) DEFAULT NULL,
  `branch_id` varchar(255) DEFAULT NULL,
  `branch_loca` varchar(255) DEFAULT NULL,
  `branch_name` varchar(255) DEFAULT NULL,
  `delivbid` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`id`, `branch_cellno`, `branch_id`, `branch_loca`, `branch_name`, `delivbid`) VALUES
(1, '0642926493', '47001', 'Bellville', 'WokeUp', '171'),
(2, '0787451129', '5200', 'Bellville', 'Dush', '172'),
(3, '0817662779', '3800', 'Retreat', 'StanceBoyz', '173');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `id` bigint(20) NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `payment_id` varchar(255) DEFAULT NULL,
  `total_amount` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

CREATE TABLE `services` (
  `id` bigint(20) NOT NULL,
  `cleaner_id` varchar(255) DEFAULT NULL,
  `customer_id` varchar(255) DEFAULT NULL,
  `services_id` varchar(255) DEFAULT NULL,
  `services_pkg` varchar(255) DEFAULT NULL,
  `total_amount` varchar(255) DEFAULT NULL,
  `upholstery_id` varchar(255) DEFAULT NULL,
  `wash_type_id` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `services`
--

INSERT INTO `services` (`id`, `cleaner_id`, `customer_id`, `services_id`, `services_pkg`, `total_amount`, `upholstery_id`, `wash_type_id`) VALUES
(1, 'K1021', '10', '7674cfa9-d71b-45fb-b26e-a1b027ab961e', 'Wash And Dry', '400', 'N/A', '636');

-- --------------------------------------------------------

--
-- Table structure for table `upholstery`
--

CREATE TABLE `upholstery` (
  `id` bigint(20) NOT NULL,
  `upholst_colour` varchar(255) DEFAULT NULL,
  `upholst_item` varchar(255) DEFAULT NULL,
  `upholst_material` varchar(255) DEFAULT NULL,
  `upholstery_id` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(64) NOT NULL,
  `role` varchar(45) NOT NULL,
  `enable` tinyint(4) DEFAULT NULL,
  `enabled` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `role`, `enable`, `enabled`) VALUES
(1, 'KeallanSaunders', '$2a$10$S.ryb2eYCMIPd8cTPO3wI.YblUPBqWrIT5NNs67Pia./.0Qo0zbRW', 'USER ROLE', 1, b'0'),
(2, 'lyle', '$2a$10$H2O6qEqllehszgskNcLG5ujIXx0FUuO1MeXGsRhaQ/yIiUJJnda9S', 'USER ROLE', 1, b'0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bookings`
--
ALTER TABLE `bookings`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `car_delivery`
--
ALTER TABLE `car_delivery`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cleaner`
--
ALTER TABLE `cleaner`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `delivery_boy`
--
ALTER TABLE `delivery_boy`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `services`
--
ALTER TABLE `services`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `upholstery`
--
ALTER TABLE `upholstery`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administrator`
--
ALTER TABLE `administrator`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `bookings`
--
ALTER TABLE `bookings`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `car`
--
ALTER TABLE `car`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `car_delivery`
--
ALTER TABLE `car_delivery`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `cleaner`
--
ALTER TABLE `cleaner`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `delivery_boy`
--
ALTER TABLE `delivery_boy`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `location`
--
ALTER TABLE `location`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `services`
--
ALTER TABLE `services`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `upholstery`
--
ALTER TABLE `upholstery`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
