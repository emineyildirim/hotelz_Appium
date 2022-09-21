package appiumClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;



public class OtelTask {



    @Test
    public void otel() throws InterruptedException, MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        desiredCapabilities.setCapability(MobileCapabilityType.APP,
                "C:\\Users\\gokha\\IdeaProjects\\MobileTask\\src\\App\\Otelz.apk");

        //desiredCapabilities.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
       // desiredCapabilities.setCapability("appActivity", "com.google.android.apps.nexuslauncher.NexusLauncherActivity");

        //noReset
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        //appium server url
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(3000);

        driver.findElement(By.id("com.otelz.mobil:id/tvSearchHome")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.otelz.mobil.search:id/constraintRecentSearch")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.otelz.mobil:id/layoutCheckInDate")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@text='22']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@text='23']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.otelz.mobil:id/relativeBtnChooseDate")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.otelz.mobil:id/llSearchHome")).click();
        Thread.sleep(3000);
        WebElement otelIsmi = driver.findElement(By.id("com.otelz.mobil:id/textView21"));
        System.out.println(otelIsmi.getText());
        Thread.sleep(3000);
        WebElement fiyat = driver.findElement(By.id("com.otelz.mobil:id/tvFinalPrice"));
        System.out.println(fiyat.getText());
        Thread.sleep(3000);

        fiyat.click();
        Thread.sleep(3000);
        WebElement actualOtelIsmi = driver.findElement(By.id("com.otelz.mobil:id/tvFacilityDetailName"));
        System.out.println(actualOtelIsmi.getText());
        Thread.sleep(3000);
        WebElement actualFiyat = driver.findElement(By.id("com.otelz.mobil:id/tv_best_price_total_price_value"));
        System.out.println(actualFiyat.getText());
        Thread.sleep(3000);
        //assertEquals(otelIsmi.getText(),actualOtelIsmi.getText());
        //assertEquals(fiyat,actualFiyat);

        driver.findElement(By.id("com.otelz.mobil:id/btnChooseRoom")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.otelz.mobil:id/tvPersonCount")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.otelz.mobil:id/btnMakeReservation")).click();
        Thread.sleep(3000);
        //enter your information by logging in
        Actions action = new Actions(driver);
        WebElement name = driver.findElement(By.cssSelector("android.widget.EditText"));
        Thread.sleep(3000);

        name.click();
        Thread.sleep(2000);
        name.sendKeys("emine");
        Thread.sleep(2000);

        WebElement soyadi = driver.findElement(By.id("com.otelz.mobil:id/tvPersonalInfoSurname"));
        Thread.sleep(2000);
        soyadi.click();
        Thread.sleep(2000);
        soyadi.sendKeys("yildirim");

        WebElement email = driver.findElement(By.id("com.otelz.mobil:id/tvPersonalInfoMail"));
        Thread.sleep(2000);
        email.click();
        Thread.sleep(2000);
        email.sendKeys("emineyildirim.te@gmail.com");
        Thread.sleep(2000);

















































    }


}
