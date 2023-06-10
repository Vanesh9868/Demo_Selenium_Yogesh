package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {

	public static ExtentReports extent;

	public static ExtentReports getReports() {
		String path = System.getProperty("user.dir") + "\\Report\\ExtentReport.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setTheme(Theme.STANDARD);
		report.config().setDocumentTitle("Automation report");
		report.config().setReportName("WebAutomation");
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Project ", "WebAutomation");
		extent.setSystemInfo("QA ", "Yogesh Shinde");
		extent.setSystemInfo("OS ", "Windows");
		return extent;
		
	}

}
