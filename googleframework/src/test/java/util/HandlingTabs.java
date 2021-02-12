package util;

import driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public interface HandlingTabs {
    WebDriver driver = DriverSingleton.getDriver();
    default void switchWindows(int windowNumber) {
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        int i = 1;
        while (iterator.hasNext() && i < 3) {
            driver.switchTo().window(String.valueOf(iterator.next()));
            System.out.println("Window title is " + driver.getTitle() + "size " + windows.size());
            if (i == windowNumber)
                break;
            i++;
        }
    }
    default void openNewWindow(){
        ((JavascriptExecutor)driver).executeScript("window.open();");
    }
}
