
--
-- Database: `shubham_capg`
--

-- --------------------------------------------------------

--
-- Table structure for table `book_master`
--

CREATE TABLE `book_master` (
  `Book_Code` int(10) NOT NULL,
  `Book_Name` varchar(250) NOT NULL,
  `Book_pub_year` int(11) DEFAULT NULL,
  `Book_pub_author` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=hp8;

--
-- Dumping data for table `book_master`
--

INSERT INTO `book_master` (`Book_Code`, `Book_Name`, `Book_pub_year`, `Book_pub_author`) VALUES
(101, 'A_Book', 2010, 'A_Book_Author'),
(102, 'B_Book', 2005, 'B_Book_Author'),
(103, 'C_Book', 2005, 'C_Book_Author'),
(104, 'D_Book', 2006, 'D_Book_Author'),
(105, 'E_Book', 2008, 'E_Book_Author'),
(106, 'F_Book', 2007, 'F_Book_Author'),
(107, 'G_Book', 2018, 'G_Book_Author'),
(108, 'H_Book', 2009, 'H_Book_Author');

-- --------------------------------------------------------

--
-- Table structure for table `book_transactions`
--

CREATE TABLE `book_transactions` (
  `Book_Code` int(11) NOT NULL,
  `Student_code` int(11) DEFAULT NULL,
  `Staff_code` int(11) DEFAULT NULL,
  `Book_Issue_date` date NOT NULL,
  `Book_expected_return_date` date NOT NULL,
  `Book_actual_return_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=hp8;

--
-- Dumping data for table `book_transactions`
--

INSERT INTO `book_transactions` (`Book_Code`, `Student_code`, `Staff_code`, `Book_Issue_date`, `Book_expected_return_date`, `Book_actual_return_date`) VALUES
(101, 1, 100, '2019-05-14', '2019-05-14', '2019-05-14'),
(102, 2, 102, '2019-05-14', '2019-04-14', '2019-05-12'),
(103, 3, 105, '2019-05-14', '2019-05-14', '2019-05-14'),
(104, 4, 101, '2019-05-14', '2019-05-14', '2019-05-14'),
(105, 5, 104, '2019-05-14', '2019-05-14', '2019-05-14'),
(106, 6, 103, '2019-05-14', '2019-05-14', '2019-05-14'),
(107, 7, 106, '2019-05-14', '2019-05-14', '2019-05-14'),
(108, 8, 107, '2019-05-14', '2019-05-14', '2019-05-14');

-- --------------------------------------------------------

--
-- Table structure for table `department_master`
--

CREATE TABLE `department_master` (
  `Dept_Code` int(2) NOT NULL,
  `Dept_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=hp8;

--
-- Dumping data for table `department_master`
--

INSERT INTO `department_master` (`Dept_Code`, `Dept_name`) VALUES
(1, 'HR'),
(2, 'HR'),
(3, 'Admin'),
(4, 'Admin'),
(5, 'Developer');

-- --------------------------------------------------------

--
-- Table structure for table `designation_master`
--

CREATE TABLE `designation_master` (
  `Design_code` int(3) NOT NULL,
  `Design_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=hp8;

--
-- Dumping data for table `designation_master`
--

INSERT INTO `designation_master` (`Design_code`, `Design_name`) VALUES
(1, 'UI'),
(2, 'Test'),
(3, 'Front-End'),
(4, 'Database'),
(5, 'Back-End');

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE `emp` (
  `Empno` int(4) NOT NULL,
  `Ename` varchar(10) NOT NULL,
  `job` varchar(9) DEFAULT NULL,
  `mgr` int(4) DEFAULT NULL,
  `Hiredate` date DEFAULT NULL,
  `Sal` int(7) DEFAULT NULL,
  `Comm` int(7) DEFAULT NULL,
  `Deptno` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=hp8;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`Empno`, `Ename`, `job`, `mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) VALUES
(1, 'Antariksh', 'SD', 14, '2019-03-14', 5000000, 2581, 12),
(2, 'Deepak', 'SD', 14, '2019-03-14', 5000000, 2581, 12),
(3, 'Deepak', 'SD(Amazon', 14, '2019-03-06', 75000, 1458, 5),
(4, 'A_Emp', 'BackEnd', 1, '2018-09-23', 56455, 123, 12),
(5, 'B_Emp', 'Testor', 4, '2018-09-23', 56455, 123, 12),
(6, 'C_Emp', 'UI', 3, '2018-09-23', 56455, 123, 12),
(7, 'D_Emp', 'Design', 2, '2018-09-23', 56455, 123, 12);

-- --------------------------------------------------------

--
-- Table structure for table `staff_master`
--

CREATE TABLE `staff_master` (
  `Staff_code` int(8) NOT NULL,
  `Staff_Name` varchar(50) NOT NULL,
  `Design_code` int(11) DEFAULT NULL,
  `Dept_code` int(11) DEFAULT NULL,
  `HireDate` date DEFAULT NULL,
  `Staff_dob` date DEFAULT NULL,
  `Staff_address` varchar(240) DEFAULT NULL,
  `Mgr_code` int(8) DEFAULT NULL,
  `Staff_sal` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=hp8;

--
-- Dumping data for table `staff_master`
--

INSERT INTO `staff_master` (`Staff_code`, `Staff_Name`, `Design_code`, `Dept_code`, `HireDate`, `Staff_dob`, `Staff_address`, `Mgr_code`, `Staff_sal`) VALUES
(100, 'A_Staff', 1, 101, '2019-03-20', '1996-05-13', 'Jalandhar', 43, 54000),
(101, 'B_Staff', 1, 101, '2018-02-19', '1997-01-25', 'Jalandhar', 43, 54000),
(102, 'C_Staff', 1, 102, '2018-02-19', '1997-01-25', 'Jalandhar', 43, 54000),
(103, 'D_Staff', 1, 4, '2016-04-14', '1996-03-19', 'Phagwara', 14, 54446),
(104, 'E_Staff', 2, 5, '2016-04-14', '1996-03-19', 'Phagwara', 14, 54446),
(105, 'F_Staff', 3, 6, '2016-04-14', '1996-03-19', 'Jalandhar', 15, 64446);

-- --------------------------------------------------------

--
-- Table structure for table `student_marks`
--

CREATE TABLE `student_marks` (
  `Student_Code` int(6) NOT NULL,
  `Student_Year` int(11) NOT NULL,
  `Subject1` int(3) DEFAULT NULL,
  `Subject2` int(3) DEFAULT NULL,
  `Subject3` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=hp8;

--
-- Dumping data for table `student_marks`
--

INSERT INTO `student_marks` (`Student_Code`, `Student_Year`, `Subject1`, `Subject2`, `Subject3`) VALUES
(1, 2016, 85, 67, 90),
(2, 2016, 90, 65, 78),
(3, 2017, 70, 67, 34),
(4, 2019, 89, 56, 78),
(5, 2015, 94, 87, 98);

-- --------------------------------------------------------

--
-- Table structure for table `student_master`
--

CREATE TABLE `student_master` (
  `Student_Code` int(6) NOT NULL,
  `Student_name` varchar(50) NOT NULL,
  `Dept_Code` int(2) DEFAULT NULL,
  `Student_dob` date DEFAULT NULL,
  `Student_Address` varchar(240) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=hp8;

--
-- Dumping data for table `student_master`
--

INSERT INTO `student_master` (`Student_Code`, `Student_name`, `Dept_Code`, `Student_dob`, `Student_Address`) VALUES
(1, 'A_Student', 1, '1997-08-13', 'Phagwara'),
(2, 'B_Student', 2, '1997-09-13', 'Jalandhar'),
(3, 'C_Student', 1, '1997-10-15', 'Phagwara'),
(4, 'D_Student', 3, '1995-12-13', 'Jalandhar'),
(5, 'E_Student', 5, '1996-09-22', 'Phagwara');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book_master`
--
ALTER TABLE `book_master`
  ADD PRIMARY KEY (`Book_Code`);

--
-- Indexes for table `book_transactions`
--
ALTER TABLE `book_transactions`
  ADD PRIMARY KEY (`Book_Code`),
  ADD UNIQUE KEY `Student_code` (`Student_code`);

--
-- Indexes for table `department_master`
--
ALTER TABLE `department_master`
  ADD PRIMARY KEY (`Dept_Code`);

--
-- Indexes for table `designation_master`
--
ALTER TABLE `designation_master`
  ADD PRIMARY KEY (`Design_code`);

--
-- Indexes for table `emp`
--
ALTER TABLE `emp`
  ADD PRIMARY KEY (`Empno`);

--
-- Indexes for table `staff_master`
--
ALTER TABLE `staff_master`
  ADD PRIMARY KEY (`Staff_code`);

--
-- Indexes for table `student_marks`
--
ALTER TABLE `student_marks`
  ADD PRIMARY KEY (`Student_Code`);

--
-- Indexes for table `student_master`
--
ALTER TABLE `student_master`
  ADD PRIMARY KEY (`Student_Code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book_master`
--
ALTER TABLE `book_master`
  MODIFY `Book_Code` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=112;

--
-- AUTO_INCREMENT for table `book_transactions`
--
ALTER TABLE `book_transactions`
  MODIFY `Book_Code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT for table `emp`
--
ALTER TABLE `emp`
  MODIFY `Empno` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `staff_master`
--
ALTER TABLE `staff_master`
  MODIFY `Staff_code` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

