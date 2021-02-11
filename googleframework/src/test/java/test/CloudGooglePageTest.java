package test;

import driver.CommonConditions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleCloudPage;

public class CloudGooglePageTest extends CommonConditions {



    @Test

	public void startCloudGooglePage(){

		GoogleCloudPage googleCloudPage = new GoogleCloudPage();
		googleCloudPage.openPage()
				.openSearchResultPage();
		Assert.assertEquals("Cloud Computing Services  |  Google Cloud",driver.getTitle(),"equals");
	}
}
