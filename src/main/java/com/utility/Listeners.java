package com.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {

	ExtentReports extent = ExtentReportGenerator.getReports();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {
		TestUtils.test = extent.createTest(result.getClass().getName() + "==" + result.getMethod().getMethodName());
		extentTest.set(TestUtils.test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		TestUtils.test.log(Status.PASS, "Test Case Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TestUtils.test.log(Status.FAIL, "Test Case Fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		TestUtils.test.log(Status.SKIP, "Test Case Skip");

	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
