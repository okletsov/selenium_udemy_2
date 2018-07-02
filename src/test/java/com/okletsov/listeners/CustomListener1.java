package com.okletsov.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        // Runs before every method in Test Class
        System.out.println("beforeInvocation: " + iTestResult.getTestClass().getName() + "-> " + iInvokedMethod.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        // Runs after every method in Test Class
        System.out.println("afterInvocation: " + iTestResult.getTestClass().getName() + "-> " + iInvokedMethod.getTestMethod().getMethodName());
    }
}
