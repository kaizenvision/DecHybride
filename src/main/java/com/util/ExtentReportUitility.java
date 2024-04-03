package com.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.hybrid.BaseClass;

public class ExtentReportUitility extends BaseClass {
	
	public static ExtentReports extentReports;
	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentTest logger;
	
	public static void initExtentReport() {
		extentReports = new ExtentReports();
		extentSparkReporter = new ExtentSparkReporter(projectPath+"\\extentreports\\bankreport.html");
		extentReports.attachReporter(extentSparkReporter);
	}
	
	public static void generateReport() {
		extentReports.flush();
	}
	
	public static ExtentTest createReport(String testName) {
		return  extentReports.createTest(testName);
	}

}
