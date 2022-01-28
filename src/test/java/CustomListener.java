
import org.testng.ITestListener;
import org.testng.ITestResult;

import spicejet.Basepage.TestBase;

public class CustomListener extends TestBase implements ITestListener{
	
	

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("failed due to timeout");
		failed(result.getMethod().getMethodName());
	}
	

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Failed Test");
		failed(result.getMethod().getMethodName());
	}
}
