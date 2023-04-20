package org.example.util;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onFinish(ITestContext context) {
        // do nothing club
    }

    @Override
    public void onStart(ITestContext context) {
        // do nothing club
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // do nothing club
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // do nothing club
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // do nothing club
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // do nothing club
    }

}
