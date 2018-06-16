package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        // Executed before @Test annotation
        System.out.println("onTestStart --> Test Name: " + iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("onTestSuccess --> Test Name: " + iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("onTestFailure --> Test Name: " + iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("onTestSkipped --> Test Name: " + iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        // Executed before <test> tag in xml file
        System.out.println("onStart --> Test tag Name: " + iTestContext.getName());
        ITestNGMethod methods[] = iTestContext.getAllTestMethods();
        System.out.println("This methods will be executed in this test tag:");
        for (ITestNGMethod method : methods) {
            System.out.println(method.getMethodName());
        }
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("onFinish --> Test tag Name: " + iTestContext.getName());
    }
}
