import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendDemo {
static ExtentReports reports;
static ExtentTest logger;

	//To make changes to find in git repo

	public static void main(String[] args) {
		String fileName=new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm'.html'").format(new Date());
		
		String path="C:\\Users\\mapkhome\\Desktop\\Extent Report\\sample1.html";
		reports =new ExtentReports(path);
		logger=reports.startTest("Login into Gmail");
		logger.log(LogStatus.INFO,"We have entered valid email Id");
		logger.log(LogStatus.INFO,"We have Entered valid password");
		logger.log(LogStatus.PASS,"Enter password");
		logger.log(LogStatus.PASS,"Click on Login");
		
		logger = reports.startTest("Remember Me");
		logger.log(LogStatus.INFO,"We have Entered valid email id");
		logger.log(LogStatus.PASS,"Enter email id");
		logger.log(LogStatus.INFO,"We have Entered valid password");
		logger.log(LogStatus.PASS,"Enter password");
		logger.log(LogStatus.FAIL,"Click on Remember Me");
		logger.log(LogStatus.FAIL,"Click on Login");
		
		reports.endTest(logger);
		reports.flush();
	}
}
