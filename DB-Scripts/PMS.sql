-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 23, 2018 at 02:06 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `PMS`
--

-- --------------------------------------------------------

--
-- Table structure for table `Allowance`
--

CREATE TABLE `Allowance` (
  `idAllowance` int(11) NOT NULL,
  `Type` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Allowance_has_Employees`
--

CREATE TABLE `Allowance_has_Employees` (
  `idAllowance` int(11) NOT NULL,
  `idEmployees` int(11) NOT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `Allowance_has_Employeescol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Answers`
--

CREATE TABLE `Answers` (
  `idAnswers` int(11) NOT NULL,
  `A1` varchar(45) DEFAULT NULL,
  `A2` varchar(45) DEFAULT NULL,
  `A3` varchar(45) DEFAULT NULL,
  `idLogin` int(11) NOT NULL,
  `idSecurityQuestion` int(11) NOT NULL,
  `isDelete` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Attendence`
--

CREATE TABLE `Attendence` (
  `idAttendence` int(11) NOT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `Intime` varchar(45) DEFAULT NULL,
  `Outtime` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idEmployees` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `CashBook`
--

CREATE TABLE `CashBook` (
  `idCashBook` int(11) NOT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `Income` double DEFAULT NULL,
  `Expence` double DEFAULT NULL,
  `CreatedBy` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Customer`
--

CREATE TABLE `Customer` (
  `idCustomer` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Contact1` varchar(45) DEFAULT NULL,
  `Address1` varchar(45) DEFAULT NULL,
  `Address2` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `CustomerReturn`
--

CREATE TABLE `CustomerReturn` (
  `idCustomerReturn` int(11) NOT NULL,
  `ReturnDate` varchar(45) DEFAULT NULL,
  `ReturnTime` varchar(45) DEFAULT NULL,
  `ReturnReson` varchar(45) DEFAULT NULL,
  `QTY` varchar(45) DEFAULT NULL,
  `ReturnTerm` varchar(45) DEFAULT NULL,
  `idInvoiceItems` int(11) NOT NULL,
  `idCustomer` int(11) NOT NULL,
  `idInvoice` int(11) NOT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `CreatedBy` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Customer_has_Invoice`
--

CREATE TABLE `Customer_has_Invoice` (
  `idCustomer` int(11) NOT NULL,
  `idInvoice` int(11) NOT NULL,
  `idRecord` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Deductions`
--

CREATE TABLE `Deductions` (
  `idDeductions` int(11) NOT NULL,
  `Type` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `EmployeeContactDetails`
--

CREATE TABLE `EmployeeContactDetails` (
  `idEmployeeContactDetails` int(11) NOT NULL,
  `Contact1` varchar(45) DEFAULT NULL,
  `Contact2` varchar(45) DEFAULT NULL,
  `emailAddress` varchar(45) DEFAULT NULL,
  `idEmployees` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Employees`
--

CREATE TABLE `Employees` (
  `idEmployees` int(11) NOT NULL,
  `EmployeeNIC` varchar(45) DEFAULT NULL,
  `EmployeName` varchar(200) DEFAULT NULL,
  `EmployeeContactNo` varchar(45) DEFAULT NULL,
  `EmployeesAddress1` varchar(45) DEFAULT NULL,
  `EmployeeAddress2` varchar(45) DEFAULT NULL,
  `EmployeeCity` varchar(45) DEFAULT NULL,
  `EmployeeETF` varchar(45) DEFAULT NULL,
  `EmployeeEPF` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `BasicSalary` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Employees_has_Deductions`
--

CREATE TABLE `Employees_has_Deductions` (
  `idEmployees` int(11) NOT NULL,
  `idDeductions` int(11) NOT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  `Employees_has_Deductionscol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Employees_has_JOBRoals`
--

CREATE TABLE `Employees_has_JOBRoals` (
  `idEmployees` int(11) NOT NULL,
  `JOBRoals` int(11) NOT NULL,
  `Id` int(11) NOT NULL,
  `isDelete` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `GRNHasExess`
--

CREATE TABLE `GRNHasExess` (
  `idGRNHasExess` int(11) NOT NULL,
  `ExessDate` varchar(45) DEFAULT NULL,
  `ExessAmount` varchar(45) DEFAULT NULL,
  `idRawGrn` int(11) NOT NULL,
  `isDelete` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Invoice`
--

CREATE TABLE `Invoice` (
  `idInvoice` int(11) NOT NULL,
  `InvoiceNo` varchar(45) DEFAULT NULL,
  `InvoiceDate` varchar(45) DEFAULT NULL,
  `Subtotal` double DEFAULT NULL,
  `Discount` double DEFAULT NULL,
  `NetTotal` double DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `CreatedBy` varchar(45) DEFAULT NULL,
  `InvoiceStatus` varchar(45) DEFAULT NULL,
  `InvoiceTime` varchar(45) DEFAULT NULL,
  `PaymentType` varchar(20) DEFAULT NULL,
  `PromoCode` varchar(20) DEFAULT NULL,
  `InvoiceType` varchar(45) DEFAULT NULL,
  `ServiceNameForPrint` varchar(200) DEFAULT NULL,
  `ServiceQTY` double DEFAULT NULL,
  `ServiceUnitTotal` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `InvoiceCancel`
--

CREATE TABLE `InvoiceCancel` (
  `idInvoiceCance` int(11) NOT NULL,
  `CancelDate` varchar(45) DEFAULT NULL,
  `CancelTime` varchar(45) DEFAULT NULL,
  `Reson` varchar(45) DEFAULT NULL,
  `CreatedBy` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idInvoice` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `InvoiceHasCreditCard`
--

CREATE TABLE `InvoiceHasCreditCard` (
  `idInvoiceHasCreditCard` int(11) NOT NULL,
  `Last4Digits` varchar(45) DEFAULT NULL,
  `PaidAmount` double DEFAULT NULL,
  `idInvoice` int(11) NOT NULL,
  `isDelete` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `InvoiceItems`
--

CREATE TABLE `InvoiceItems` (
  `idInvoiceItems` int(11) NOT NULL,
  `Qty` double DEFAULT NULL,
  `UnitPrice` double DEFAULT NULL,
  `NetTotalItem` double DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idInvoice` int(11) NOT NULL,
  `idRawItems` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `InvoicePayment`
--

CREATE TABLE `InvoicePayment` (
  `idInvoicePayment` int(11) NOT NULL,
  `PaymentDate` varchar(45) DEFAULT NULL,
  `PaymentType` varchar(45) DEFAULT NULL,
  `PaymentAmount` double DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idCustomer` int(11) NOT NULL,
  `idInvoice` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `InvoicePaymentInfo`
--

CREATE TABLE `InvoicePaymentInfo` (
  `idInvoicePaymentInfo` int(11) NOT NULL,
  `CashTenderd` varchar(45) DEFAULT NULL,
  `CashBalance` varchar(45) DEFAULT NULL,
  `CustromerPerviusBalance` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idInvoice` int(11) NOT NULL,
  `TotalWithBalance` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ItemCatagory`
--

CREATE TABLE `ItemCatagory` (
  `idRowItemCatagory` int(11) NOT NULL,
  `CatagoryName` varchar(45) DEFAULT NULL,
  `CatagoryCode` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `CatoType` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Items`
--

CREATE TABLE `Items` (
  `idRawItems` int(11) NOT NULL,
  `idRowItemCatagory` int(11) NOT NULL,
  `ItemName` varchar(45) DEFAULT NULL,
  `ItemsUnitPrice` double DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `isRaw` varchar(45) DEFAULT NULL,
  `isService` varchar(45) DEFAULT NULL,
  `ItemsSellingPrice` double DEFAULT NULL,
  `ItemsCode` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `JOBRoals`
--

CREATE TABLE `JOBRoals` (
  `idJOBRoals` int(11) NOT NULL,
  `JOBCODE` varchar(45) DEFAULT NULL,
  `RoleName` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Login`
--

CREATE TABLE `Login` (
  `idLogin` int(11) NOT NULL,
  `UserName` varchar(45) DEFAULT NULL,
  `PassWord` varchar(45) DEFAULT NULL,
  `Privilage` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idEmployees` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `OrderItems`
--

CREATE TABLE `OrderItems` (
  `idOrderItems` int(11) NOT NULL,
  `Qty` double DEFAULT NULL,
  `UnitPrice` double DEFAULT NULL,
  `NetTotalOrdersItem` double DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idOrders` int(11) NOT NULL,
  `idRawItems` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Orders`
--

CREATE TABLE `Orders` (
  `idOrders` int(11) NOT NULL,
  `OrderNo` varchar(45) DEFAULT NULL,
  `OrderDate` varchar(45) DEFAULT NULL,
  `RecorrectionDate` varchar(45) DEFAULT NULL,
  `DeliveryDate` varchar(45) DEFAULT NULL,
  `OrderTotal` double DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `Advance` double DEFAULT NULL,
  `idCustomer` int(11) NOT NULL,
  `GOVOrderNo` varchar(45) DEFAULT NULL,
  `AcceptedBY` varchar(45) DEFAULT NULL,
  `ServiceNameForPrint` varchar(450) DEFAULT NULL,
  `OrderQty` double DEFAULT NULL,
  `UnitPriceForOrder` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `OrderStatus`
--

CREATE TABLE `OrderStatus` (
  `idOrderStatus` int(11) NOT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `idOrders` int(11) NOT NULL,
  `isDelete` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

CREATE TABLE `payments` (
  `idpayments` int(11) NOT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  `idEmployees` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Promotion`
--

CREATE TABLE `Promotion` (
  `idPromotion` int(11) NOT NULL,
  `PromotionCode` varchar(45) DEFAULT NULL,
  `PromoStartDate` varchar(45) DEFAULT NULL,
  `PromoEndDate` varchar(45) DEFAULT NULL,
  `DiscountAmountPresent` double DEFAULT NULL,
  `DiscountAmountRS` double DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `MaxDiscountAmount` varchar(45) DEFAULT NULL,
  `PromotionDuration` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `PromotionItems`
--

CREATE TABLE `PromotionItems` (
  `idPromotionItems` int(11) NOT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idPromotion` int(11) NOT NULL,
  `idRawItems` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Quatations`
--

CREATE TABLE `Quatations` (
  `idOrders` int(11) NOT NULL,
  `QuatationNo` varchar(45) DEFAULT NULL,
  `QuatationDate` varchar(45) DEFAULT NULL,
  `QuatationTotal` double DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `Advance` double DEFAULT NULL,
  `idCustomer` int(11) NOT NULL,
  `CreatedBy` varchar(45) DEFAULT NULL,
  `ServiceNameForPrint` varchar(450) DEFAULT NULL,
  `QuatationQty` double DEFAULT NULL,
  `UnitPriceForOrder` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `QuattionItems`
--

CREATE TABLE `QuattionItems` (
  `idOrderItems` int(11) NOT NULL,
  `Qty` double DEFAULT NULL,
  `UnitPrice` double DEFAULT NULL,
  `NetTotalOrdersItem` double DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idOrders` int(11) NOT NULL,
  `idRawItems` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `RawGrn`
--

CREATE TABLE `RawGrn` (
  `idRawGrn` int(11) NOT NULL,
  `RawGrnNo` varchar(45) DEFAULT NULL,
  `RawGrnDate` varchar(45) DEFAULT NULL,
  `SubTotal` double DEFAULT NULL,
  `NetTotal` double DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idSupplier` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `RawItemInfo`
--

CREATE TABLE `RawItemInfo` (
  `idRawItemInfo` int(11) NOT NULL,
  `MinQTY` varchar(45) DEFAULT NULL,
  `idRawItems` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `RawItemStock`
--

CREATE TABLE `RawItemStock` (
  `idStock` int(11) NOT NULL,
  `QTY` double DEFAULT NULL,
  `Unit` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idRawItems` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `RowGrnItem`
--

CREATE TABLE `RowGrnItem` (
  `idRowGrnItem` int(11) NOT NULL,
  `RowItemQty` double DEFAULT NULL,
  `GrossPrice` double DEFAULT NULL,
  `RowItemTotal` double DEFAULT NULL,
  `RowGrnItemUnit` varchar(45) DEFAULT NULL,
  `idRawGrn` int(11) NOT NULL,
  `idRawItems` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `RowItemGrnPayment`
--

CREATE TABLE `RowItemGrnPayment` (
  `idRowItemGrnPayment` int(11) NOT NULL,
  `RowItemGrnPayDate` varchar(45) DEFAULT NULL,
  `RowItemGrnPayAmount` double DEFAULT NULL,
  `RowItemGrnPayType` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idSupplier` int(11) NOT NULL,
  `idRawItemGrn` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Salary`
--

CREATE TABLE `Salary` (
  `idSalary` int(11) NOT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `TotalAllowance` double DEFAULT NULL,
  `TotalDeductions` double DEFAULT NULL,
  `Etf` double DEFAULT NULL,
  `Epf` double DEFAULT NULL,
  `TotalPayments` double DEFAULT NULL,
  `BasicSalary` double DEFAULT NULL,
  `NetTotal` double DEFAULT NULL,
  `idEmployees` int(11) NOT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `ServiceCharge` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `SecurityQuestion`
--

CREATE TABLE `SecurityQuestion` (
  `idSecurityQuestion` int(11) NOT NULL,
  `Q1` varchar(45) DEFAULT NULL,
  `Q2` varchar(45) DEFAULT NULL,
  `Q3` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `StockOutgoing`
--

CREATE TABLE `StockOutgoing` (
  `StockOutgoing` int(11) NOT NULL,
  `QTY` double DEFAULT NULL,
  `Unit` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idRawItems` int(11) NOT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `CreatedBY` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Supplier`
--

CREATE TABLE `Supplier` (
  `idSupplier` int(11) NOT NULL,
  `SupplierName` varchar(45) DEFAULT NULL,
  `ContactNo1` varchar(45) DEFAULT NULL,
  `ContactNo2` varchar(45) DEFAULT NULL,
  `Address1` varchar(45) DEFAULT NULL,
  `Address2` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `SupplierReturn`
--

CREATE TABLE `SupplierReturn` (
  `idSupplierReturn` int(11) NOT NULL,
  `ReturnDate` varchar(45) DEFAULT NULL,
  `QTY` double DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL,
  `idSupplier` int(11) NOT NULL,
  `idRowGrnItem` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `SupReturnTerms`
--

CREATE TABLE `SupReturnTerms` (
  `idSupReturnTerms` int(11) NOT NULL,
  `idSupplierReturn` int(11) NOT NULL,
  `ReturnTerm` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `TMPEmployees_has_JOBRoals`
--

CREATE TABLE `TMPEmployees_has_JOBRoals` (
  `idEmployees` int(11) NOT NULL,
  `JOBRoals` int(11) NOT NULL,
  `Id` int(11) NOT NULL,
  `StartDate` varchar(45) DEFAULT NULL,
  `EndDate` varchar(45) DEFAULT NULL,
  `isDelete` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Allowance`
--
ALTER TABLE `Allowance`
  ADD PRIMARY KEY (`idAllowance`);

--
-- Indexes for table `Allowance_has_Employees`
--
ALTER TABLE `Allowance_has_Employees`
  ADD PRIMARY KEY (`Allowance_has_Employeescol`),
  ADD KEY `fk_Allowance_has_Employees_Employees1_idx` (`idEmployees`),
  ADD KEY `fk_Allowance_has_Employees_Allowance1_idx` (`idAllowance`);

--
-- Indexes for table `Answers`
--
ALTER TABLE `Answers`
  ADD PRIMARY KEY (`idAnswers`),
  ADD KEY `fk_Answers_Login1_idx` (`idLogin`),
  ADD KEY `fk_Answers_SecurityQuestion1_idx` (`idSecurityQuestion`);

--
-- Indexes for table `Attendence`
--
ALTER TABLE `Attendence`
  ADD PRIMARY KEY (`idAttendence`),
  ADD KEY `fk_Attendence_Employees1_idx` (`idEmployees`);

--
-- Indexes for table `CashBook`
--
ALTER TABLE `CashBook`
  ADD PRIMARY KEY (`idCashBook`);

--
-- Indexes for table `Customer`
--
ALTER TABLE `Customer`
  ADD PRIMARY KEY (`idCustomer`);

--
-- Indexes for table `CustomerReturn`
--
ALTER TABLE `CustomerReturn`
  ADD PRIMARY KEY (`idCustomerReturn`),
  ADD KEY `fk_CustomerReturn_InvoiceItems1_idx` (`idInvoiceItems`),
  ADD KEY `fk_CustomerReturn_Customer1_idx` (`idCustomer`),
  ADD KEY `fk_CustomerReturn_Invoice1_idx` (`idInvoice`);

--
-- Indexes for table `Customer_has_Invoice`
--
ALTER TABLE `Customer_has_Invoice`
  ADD PRIMARY KEY (`idRecord`),
  ADD KEY `fk_Customer_has_Invoice_Invoice1_idx` (`idInvoice`),
  ADD KEY `fk_Customer_has_Invoice_Customer1_idx` (`idCustomer`);

--
-- Indexes for table `Deductions`
--
ALTER TABLE `Deductions`
  ADD PRIMARY KEY (`idDeductions`);

--
-- Indexes for table `EmployeeContactDetails`
--
ALTER TABLE `EmployeeContactDetails`
  ADD PRIMARY KEY (`idEmployeeContactDetails`),
  ADD KEY `fk_EmployeeContactDetails_Employees1_idx` (`idEmployees`);

--
-- Indexes for table `Employees`
--
ALTER TABLE `Employees`
  ADD PRIMARY KEY (`idEmployees`);

--
-- Indexes for table `Employees_has_Deductions`
--
ALTER TABLE `Employees_has_Deductions`
  ADD PRIMARY KEY (`Employees_has_Deductionscol`),
  ADD KEY `fk_Employees_has_Deductions_Deductions1_idx` (`idDeductions`),
  ADD KEY `fk_Employees_has_Deductions_Employees1_idx` (`idEmployees`);

--
-- Indexes for table `Employees_has_JOBRoals`
--
ALTER TABLE `Employees_has_JOBRoals`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_Employees_has_JOBRoals_JOBRoals1_idx` (`JOBRoals`),
  ADD KEY `fk_Employees_has_JOBRoals_Employees1_idx` (`idEmployees`);

--
-- Indexes for table `GRNHasExess`
--
ALTER TABLE `GRNHasExess`
  ADD PRIMARY KEY (`idGRNHasExess`),
  ADD KEY `fk_GRNHasExess_RawGrn1_idx` (`idRawGrn`);

--
-- Indexes for table `Invoice`
--
ALTER TABLE `Invoice`
  ADD PRIMARY KEY (`idInvoice`);

--
-- Indexes for table `InvoiceCancel`
--
ALTER TABLE `InvoiceCancel`
  ADD PRIMARY KEY (`idInvoiceCance`),
  ADD KEY `fk_InvoiceCancel_Invoice1_idx` (`idInvoice`);

--
-- Indexes for table `InvoiceHasCreditCard`
--
ALTER TABLE `InvoiceHasCreditCard`
  ADD PRIMARY KEY (`idInvoiceHasCreditCard`),
  ADD KEY `fk_InvoiceHasCreditCard_Invoice1_idx` (`idInvoice`);

--
-- Indexes for table `InvoiceItems`
--
ALTER TABLE `InvoiceItems`
  ADD PRIMARY KEY (`idInvoiceItems`),
  ADD KEY `fk_InvoiceItems_Invoice1_idx` (`idInvoice`),
  ADD KEY `fk_InvoiceItems_RawItems1_idx` (`idRawItems`);

--
-- Indexes for table `InvoicePayment`
--
ALTER TABLE `InvoicePayment`
  ADD PRIMARY KEY (`idInvoicePayment`),
  ADD KEY `fk_InvoicePayment_Customer1_idx` (`idCustomer`),
  ADD KEY `fk_InvoicePayment_Invoice1_idx` (`idInvoice`);

--
-- Indexes for table `InvoicePaymentInfo`
--
ALTER TABLE `InvoicePaymentInfo`
  ADD PRIMARY KEY (`idInvoicePaymentInfo`),
  ADD KEY `fk_InvoicePaymentInfo_Invoice1_idx` (`idInvoice`);

--
-- Indexes for table `ItemCatagory`
--
ALTER TABLE `ItemCatagory`
  ADD PRIMARY KEY (`idRowItemCatagory`);

--
-- Indexes for table `Items`
--
ALTER TABLE `Items`
  ADD PRIMARY KEY (`idRawItems`),
  ADD KEY `fk_RawItems_RowItemCatagory1_idx` (`idRowItemCatagory`);

--
-- Indexes for table `JOBRoals`
--
ALTER TABLE `JOBRoals`
  ADD PRIMARY KEY (`idJOBRoals`);

--
-- Indexes for table `Login`
--
ALTER TABLE `Login`
  ADD PRIMARY KEY (`idLogin`),
  ADD KEY `fk_Login_Employees_idx` (`idEmployees`);

--
-- Indexes for table `OrderItems`
--
ALTER TABLE `OrderItems`
  ADD PRIMARY KEY (`idOrderItems`),
  ADD KEY `fk_OrderItems_Orders1_idx` (`idOrders`),
  ADD KEY `fk_OrderItems_RawItems1_idx` (`idRawItems`);

--
-- Indexes for table `Orders`
--
ALTER TABLE `Orders`
  ADD PRIMARY KEY (`idOrders`),
  ADD KEY `fk_Orders_Customer1_idx` (`idCustomer`);

--
-- Indexes for table `OrderStatus`
--
ALTER TABLE `OrderStatus`
  ADD PRIMARY KEY (`idOrderStatus`),
  ADD KEY `fk_OrderStatus_Orders1_idx` (`idOrders`);

--
-- Indexes for table `payments`
--
ALTER TABLE `payments`
  ADD PRIMARY KEY (`idpayments`),
  ADD KEY `fk_payments_Employees1_idx` (`idEmployees`);

--
-- Indexes for table `Promotion`
--
ALTER TABLE `Promotion`
  ADD PRIMARY KEY (`idPromotion`);

--
-- Indexes for table `PromotionItems`
--
ALTER TABLE `PromotionItems`
  ADD PRIMARY KEY (`idPromotionItems`),
  ADD KEY `fk_PromotionItems_Promotion1_idx` (`idPromotion`),
  ADD KEY `fk_PromotionItems_RawItems1_idx` (`idRawItems`);

--
-- Indexes for table `Quatations`
--
ALTER TABLE `Quatations`
  ADD PRIMARY KEY (`idOrders`),
  ADD KEY `fk_Orders_Customer1_idx` (`idCustomer`);

--
-- Indexes for table `QuattionItems`
--
ALTER TABLE `QuattionItems`
  ADD PRIMARY KEY (`idOrderItems`),
  ADD KEY `fk_OrderItems_Orders1_idx` (`idOrders`),
  ADD KEY `fk_OrderItems_RawItems1_idx` (`idRawItems`);

--
-- Indexes for table `RawGrn`
--
ALTER TABLE `RawGrn`
  ADD PRIMARY KEY (`idRawGrn`),
  ADD KEY `fk_RawItemGrn_Supplier1_idx` (`idSupplier`);

--
-- Indexes for table `RawItemInfo`
--
ALTER TABLE `RawItemInfo`
  ADD PRIMARY KEY (`idRawItemInfo`),
  ADD KEY `fk_RawItemInfo_RawItems1_idx` (`idRawItems`);

--
-- Indexes for table `RawItemStock`
--
ALTER TABLE `RawItemStock`
  ADD PRIMARY KEY (`idStock`),
  ADD KEY `fk_Stock_RawItems1_idx` (`idRawItems`);

--
-- Indexes for table `RowGrnItem`
--
ALTER TABLE `RowGrnItem`
  ADD PRIMARY KEY (`idRowGrnItem`),
  ADD KEY `fk_RowGrnItem_RawGrn1_idx` (`idRawGrn`),
  ADD KEY `fk_RowGrnItem_RawItems1_idx` (`idRawItems`);

--
-- Indexes for table `RowItemGrnPayment`
--
ALTER TABLE `RowItemGrnPayment`
  ADD PRIMARY KEY (`idRowItemGrnPayment`),
  ADD KEY `fk_RowItemGrnPayment_Supplier1_idx` (`idSupplier`),
  ADD KEY `fk_RowItemGrnPayment_RawItemGrn1_idx` (`idRawItemGrn`);

--
-- Indexes for table `Salary`
--
ALTER TABLE `Salary`
  ADD PRIMARY KEY (`idSalary`),
  ADD KEY `fk_Salary_Employees1_idx` (`idEmployees`);

--
-- Indexes for table `SecurityQuestion`
--
ALTER TABLE `SecurityQuestion`
  ADD PRIMARY KEY (`idSecurityQuestion`);

--
-- Indexes for table `StockOutgoing`
--
ALTER TABLE `StockOutgoing`
  ADD PRIMARY KEY (`StockOutgoing`),
  ADD KEY `fk_RawStockOutgoing_RawItems1_idx` (`idRawItems`);

--
-- Indexes for table `Supplier`
--
ALTER TABLE `Supplier`
  ADD PRIMARY KEY (`idSupplier`);

--
-- Indexes for table `SupplierReturn`
--
ALTER TABLE `SupplierReturn`
  ADD PRIMARY KEY (`idSupplierReturn`),
  ADD KEY `fk_SupplierTReturn_Supplier1_idx` (`idSupplier`),
  ADD KEY `fk_SupplierTReturn_RowGrnItem1_idx` (`idRowGrnItem`);

--
-- Indexes for table `SupReturnTerms`
--
ALTER TABLE `SupReturnTerms`
  ADD PRIMARY KEY (`idSupReturnTerms`),
  ADD KEY `fk_SupReturnTerms_SupplierReturn1_idx` (`idSupplierReturn`);

--
-- Indexes for table `TMPEmployees_has_JOBRoals`
--
ALTER TABLE `TMPEmployees_has_JOBRoals`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_Employees_has_JOBRoals_JOBRoals1_idx` (`JOBRoals`),
  ADD KEY `fk_Employees_has_JOBRoals_Employees1_idx` (`idEmployees`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Allowance`
--
ALTER TABLE `Allowance`
  MODIFY `idAllowance` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `Allowance_has_Employees`
--
ALTER TABLE `Allowance_has_Employees`
  MODIFY `Allowance_has_Employeescol` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `Answers`
--
ALTER TABLE `Answers`
  MODIFY `idAnswers` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `Attendence`
--
ALTER TABLE `Attendence`
  MODIFY `idAttendence` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `CashBook`
--
ALTER TABLE `CashBook`
  MODIFY `idCashBook` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT for table `Customer`
--
ALTER TABLE `Customer`
  MODIFY `idCustomer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `CustomerReturn`
--
ALTER TABLE `CustomerReturn`
  MODIFY `idCustomerReturn` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `Customer_has_Invoice`
--
ALTER TABLE `Customer_has_Invoice`
  MODIFY `idRecord` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `Deductions`
--
ALTER TABLE `Deductions`
  MODIFY `idDeductions` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `EmployeeContactDetails`
--
ALTER TABLE `EmployeeContactDetails`
  MODIFY `idEmployeeContactDetails` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `Employees`
--
ALTER TABLE `Employees`
  MODIFY `idEmployees` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `Employees_has_Deductions`
--
ALTER TABLE `Employees_has_Deductions`
  MODIFY `Employees_has_Deductionscol` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `Employees_has_JOBRoals`
--
ALTER TABLE `Employees_has_JOBRoals`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `GRNHasExess`
--
ALTER TABLE `GRNHasExess`
  MODIFY `idGRNHasExess` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT for table `Invoice`
--
ALTER TABLE `Invoice`
  MODIFY `idInvoice` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `InvoiceCancel`
--
ALTER TABLE `InvoiceCancel`
  MODIFY `idInvoiceCance` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `InvoiceHasCreditCard`
--
ALTER TABLE `InvoiceHasCreditCard`
  MODIFY `idInvoiceHasCreditCard` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `InvoiceItems`
--
ALTER TABLE `InvoiceItems`
  MODIFY `idInvoiceItems` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `InvoicePayment`
--
ALTER TABLE `InvoicePayment`
  MODIFY `idInvoicePayment` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `InvoicePaymentInfo`
--
ALTER TABLE `InvoicePaymentInfo`
  MODIFY `idInvoicePaymentInfo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `ItemCatagory`
--
ALTER TABLE `ItemCatagory`
  MODIFY `idRowItemCatagory` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `Items`
--
ALTER TABLE `Items`
  MODIFY `idRawItems` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `JOBRoals`
--
ALTER TABLE `JOBRoals`
  MODIFY `idJOBRoals` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `Login`
--
ALTER TABLE `Login`
  MODIFY `idLogin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `OrderItems`
--
ALTER TABLE `OrderItems`
  MODIFY `idOrderItems` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `Orders`
--
ALTER TABLE `Orders`
  MODIFY `idOrders` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `OrderStatus`
--
ALTER TABLE `OrderStatus`
  MODIFY `idOrderStatus` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `payments`
--
ALTER TABLE `payments`
  MODIFY `idpayments` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `Promotion`
--
ALTER TABLE `Promotion`
  MODIFY `idPromotion` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `PromotionItems`
--
ALTER TABLE `PromotionItems`
  MODIFY `idPromotionItems` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `Quatations`
--
ALTER TABLE `Quatations`
  MODIFY `idOrders` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `QuattionItems`
--
ALTER TABLE `QuattionItems`
  MODIFY `idOrderItems` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `RawGrn`
--
ALTER TABLE `RawGrn`
  MODIFY `idRawGrn` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT for table `RawItemInfo`
--
ALTER TABLE `RawItemInfo`
  MODIFY `idRawItemInfo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `RawItemStock`
--
ALTER TABLE `RawItemStock`
  MODIFY `idStock` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `RowGrnItem`
--
ALTER TABLE `RowGrnItem`
  MODIFY `idRowGrnItem` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `RowItemGrnPayment`
--
ALTER TABLE `RowItemGrnPayment`
  MODIFY `idRowItemGrnPayment` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `Salary`
--
ALTER TABLE `Salary`
  MODIFY `idSalary` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `SecurityQuestion`
--
ALTER TABLE `SecurityQuestion`
  MODIFY `idSecurityQuestion` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `StockOutgoing`
--
ALTER TABLE `StockOutgoing`
  MODIFY `StockOutgoing` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `Supplier`
--
ALTER TABLE `Supplier`
  MODIFY `idSupplier` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `SupplierReturn`
--
ALTER TABLE `SupplierReturn`
  MODIFY `idSupplierReturn` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `SupReturnTerms`
--
ALTER TABLE `SupReturnTerms`
  MODIFY `idSupReturnTerms` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `TMPEmployees_has_JOBRoals`
--
ALTER TABLE `TMPEmployees_has_JOBRoals`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `Allowance_has_Employees`
--
ALTER TABLE `Allowance_has_Employees`
  ADD CONSTRAINT `fk_Allowance_has_Employees_Allowance1` FOREIGN KEY (`idAllowance`) REFERENCES `Allowance` (`idAllowance`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Allowance_has_Employees_Employees1` FOREIGN KEY (`idEmployees`) REFERENCES `Employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Answers`
--
ALTER TABLE `Answers`
  ADD CONSTRAINT `fk_Answers_Login1` FOREIGN KEY (`idLogin`) REFERENCES `Login` (`idLogin`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Answers_SecurityQuestion1` FOREIGN KEY (`idSecurityQuestion`) REFERENCES `SecurityQuestion` (`idSecurityQuestion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Attendence`
--
ALTER TABLE `Attendence`
  ADD CONSTRAINT `fk_Attendence_Employees1` FOREIGN KEY (`idEmployees`) REFERENCES `Employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `CustomerReturn`
--
ALTER TABLE `CustomerReturn`
  ADD CONSTRAINT `fk_CustomerReturn_Customer1` FOREIGN KEY (`idCustomer`) REFERENCES `Customer` (`idCustomer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_CustomerReturn_Invoice1` FOREIGN KEY (`idInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_CustomerReturn_InvoiceItems1` FOREIGN KEY (`idInvoiceItems`) REFERENCES `InvoiceItems` (`idInvoiceItems`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Customer_has_Invoice`
--
ALTER TABLE `Customer_has_Invoice`
  ADD CONSTRAINT `fk_Customer_has_Invoice_Customer1` FOREIGN KEY (`idCustomer`) REFERENCES `Customer` (`idCustomer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Customer_has_Invoice_Invoice1` FOREIGN KEY (`idInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `EmployeeContactDetails`
--
ALTER TABLE `EmployeeContactDetails`
  ADD CONSTRAINT `fk_EmployeeContactDetails_Employees1` FOREIGN KEY (`idEmployees`) REFERENCES `Employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Employees_has_Deductions`
--
ALTER TABLE `Employees_has_Deductions`
  ADD CONSTRAINT `fk_Employees_has_Deductions_Deductions1` FOREIGN KEY (`idDeductions`) REFERENCES `Deductions` (`idDeductions`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Employees_has_Deductions_Employees1` FOREIGN KEY (`idEmployees`) REFERENCES `Employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Employees_has_JOBRoals`
--
ALTER TABLE `Employees_has_JOBRoals`
  ADD CONSTRAINT `fk_Employees_has_JOBRoals_Employees1` FOREIGN KEY (`idEmployees`) REFERENCES `Employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Employees_has_JOBRoals_JOBRoals1` FOREIGN KEY (`JOBRoals`) REFERENCES `JOBRoals` (`idJOBRoals`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `GRNHasExess`
--
ALTER TABLE `GRNHasExess`
  ADD CONSTRAINT `fk_GRNHasExess_RawGrn1` FOREIGN KEY (`idRawGrn`) REFERENCES `RawGrn` (`idRawGrn`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `InvoiceCancel`
--
ALTER TABLE `InvoiceCancel`
  ADD CONSTRAINT `fk_InvoiceCancel_Invoice1` FOREIGN KEY (`idInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `InvoiceHasCreditCard`
--
ALTER TABLE `InvoiceHasCreditCard`
  ADD CONSTRAINT `fk_InvoiceHasCreditCard_Invoice1` FOREIGN KEY (`idInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `InvoiceItems`
--
ALTER TABLE `InvoiceItems`
  ADD CONSTRAINT `fk_InvoiceItems_Invoice1` FOREIGN KEY (`idInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_InvoiceItems_RawItems1` FOREIGN KEY (`idRawItems`) REFERENCES `Items` (`idRawItems`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `InvoicePayment`
--
ALTER TABLE `InvoicePayment`
  ADD CONSTRAINT `fk_InvoicePayment_Customer1` FOREIGN KEY (`idCustomer`) REFERENCES `Customer` (`idCustomer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_InvoicePayment_Invoice1` FOREIGN KEY (`idInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `InvoicePaymentInfo`
--
ALTER TABLE `InvoicePaymentInfo`
  ADD CONSTRAINT `fk_InvoicePaymentInfo_Invoice1` FOREIGN KEY (`idInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Items`
--
ALTER TABLE `Items`
  ADD CONSTRAINT `fk_RawItems_RowItemCatagory1` FOREIGN KEY (`idRowItemCatagory`) REFERENCES `ItemCatagory` (`idRowItemCatagory`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Login`
--
ALTER TABLE `Login`
  ADD CONSTRAINT `fk_Login_Employees` FOREIGN KEY (`idEmployees`) REFERENCES `Employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `OrderItems`
--
ALTER TABLE `OrderItems`
  ADD CONSTRAINT `fk_OrderItems_Orders1` FOREIGN KEY (`idOrders`) REFERENCES `Orders` (`idOrders`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_OrderItems_RawItems1` FOREIGN KEY (`idRawItems`) REFERENCES `Items` (`idRawItems`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Orders`
--
ALTER TABLE `Orders`
  ADD CONSTRAINT `fk_Orders_Customer1` FOREIGN KEY (`idCustomer`) REFERENCES `Customer` (`idCustomer`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `OrderStatus`
--
ALTER TABLE `OrderStatus`
  ADD CONSTRAINT `fk_OrderStatus_Orders1` FOREIGN KEY (`idOrders`) REFERENCES `Orders` (`idOrders`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `payments`
--
ALTER TABLE `payments`
  ADD CONSTRAINT `fk_payments_Employees1` FOREIGN KEY (`idEmployees`) REFERENCES `Employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `PromotionItems`
--
ALTER TABLE `PromotionItems`
  ADD CONSTRAINT `fk_PromotionItems_Promotion1` FOREIGN KEY (`idPromotion`) REFERENCES `Promotion` (`idPromotion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_PromotionItems_RawItems1` FOREIGN KEY (`idRawItems`) REFERENCES `Items` (`idRawItems`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Quatations`
--
ALTER TABLE `Quatations`
  ADD CONSTRAINT `fk_Orders_Customer10` FOREIGN KEY (`idCustomer`) REFERENCES `Customer` (`idCustomer`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `QuattionItems`
--
ALTER TABLE `QuattionItems`
  ADD CONSTRAINT `fk_OrderItems_Orders10` FOREIGN KEY (`idOrders`) REFERENCES `Quatations` (`idOrders`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_OrderItems_RawItems10` FOREIGN KEY (`idRawItems`) REFERENCES `Items` (`idRawItems`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `RawGrn`
--
ALTER TABLE `RawGrn`
  ADD CONSTRAINT `fk_RawItemGrn_Supplier1` FOREIGN KEY (`idSupplier`) REFERENCES `Supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `RawItemInfo`
--
ALTER TABLE `RawItemInfo`
  ADD CONSTRAINT `fk_RawItemInfo_RawItems1` FOREIGN KEY (`idRawItems`) REFERENCES `Items` (`idRawItems`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `RawItemStock`
--
ALTER TABLE `RawItemStock`
  ADD CONSTRAINT `fk_Stock_RawItems1` FOREIGN KEY (`idRawItems`) REFERENCES `Items` (`idRawItems`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `RowGrnItem`
--
ALTER TABLE `RowGrnItem`
  ADD CONSTRAINT `fk_RowGrnItem_RawGrn1` FOREIGN KEY (`idRawGrn`) REFERENCES `RawGrn` (`idRawGrn`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_RowGrnItem_RawItems1` FOREIGN KEY (`idRawItems`) REFERENCES `Items` (`idRawItems`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `RowItemGrnPayment`
--
ALTER TABLE `RowItemGrnPayment`
  ADD CONSTRAINT `fk_RowItemGrnPayment_RawItemGrn1` FOREIGN KEY (`idRawItemGrn`) REFERENCES `RawGrn` (`idRawGrn`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_RowItemGrnPayment_Supplier1` FOREIGN KEY (`idSupplier`) REFERENCES `Supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Salary`
--
ALTER TABLE `Salary`
  ADD CONSTRAINT `fk_Salary_Employees1` FOREIGN KEY (`idEmployees`) REFERENCES `Employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `StockOutgoing`
--
ALTER TABLE `StockOutgoing`
  ADD CONSTRAINT `fk_RawStockOutgoing_RawItems1` FOREIGN KEY (`idRawItems`) REFERENCES `Items` (`idRawItems`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `SupplierReturn`
--
ALTER TABLE `SupplierReturn`
  ADD CONSTRAINT `fk_SupplierTReturn_RowGrnItem1` FOREIGN KEY (`idRowGrnItem`) REFERENCES `RowGrnItem` (`idRowGrnItem`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_SupplierTReturn_Supplier1` FOREIGN KEY (`idSupplier`) REFERENCES `Supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `SupReturnTerms`
--
ALTER TABLE `SupReturnTerms`
  ADD CONSTRAINT `fk_SupReturnTerms_SupplierReturn1` FOREIGN KEY (`idSupplierReturn`) REFERENCES `SupplierReturn` (`idSupplierReturn`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `TMPEmployees_has_JOBRoals`
--
ALTER TABLE `TMPEmployees_has_JOBRoals`
  ADD CONSTRAINT `fk_Employees_has_JOBRoals_Employees10` FOREIGN KEY (`idEmployees`) REFERENCES `Employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Employees_has_JOBRoals_JOBRoals10` FOREIGN KEY (`JOBRoals`) REFERENCES `JOBRoals` (`idJOBRoals`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
