package com.zohocrm.qa.testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listclass implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The test has succeeded");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("The test has failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("The test has started");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("The test has finished");
		
	}
	

}
