package test;

import org.testng.annotations.Test;
import pages.GoogleCloudPage;

public class StartPageTest extends CommonConditions {


@Test
    public void startingInitial(){
    GoogleCloudPage googleCloudPage = new GoogleCloudPage(driver);

    googleCloudPage.openPage();
    googleCloudPage.openSearchResultPage();
    }
}
