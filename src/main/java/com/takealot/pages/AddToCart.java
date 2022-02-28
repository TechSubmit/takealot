package com.takealot.pages;

import com.takealot.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class AddToCart extends Utility {
    public AddToCart() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='Add to Cart']")
    WebElement addToCart;
    public void addToCart(){
        String parentHandle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();

        for (String handle : allHandles) {
            if (!handle.equals(parentHandle)) {

                driver.switchTo().window(handle);
                moveToElementAndClick(addToCart);

                driver.close();
                break;
            }
        }

        driver.switchTo().window(parentHandle);
    }
}
