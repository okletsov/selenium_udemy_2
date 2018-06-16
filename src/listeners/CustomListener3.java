package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener {

    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("Before suite starts");
    }

    @Override
    public void onFinish(ISuite iSuite) {
        System.out.println("After suite completes");
    }
}
