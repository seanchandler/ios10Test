package com.ex;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class AppTest extends TestBase {

    @Test
    public void helloTest() throws Exception {
        IOSElement helloButton = ((IOSElement) driver.findElement(MobileBy.name("Click Me")));
        assertThat(helloButton.getText(), is(equalTo("Click Me")));
        helloButton.click();
        IOSElement alert = ((IOSElement) driver.findElement(MobileBy.name("Alert")));
        assertThat(alert.isDisplayed(), is(true));
        assertThat(alert.getText(), is(equalTo("Alert")));
    }
}
