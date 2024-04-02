package com.listner;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.util.Utility;

public class MyListner implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Utility.takeScreenShot(result.getTestName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			Utility.takeScreenShot(result.getTestName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
