package com.takealot.pages;

import com.takealot.utility.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class HomePage extends Utility {
    ////button[@class="button cookies-banner-module_dismiss-button_24Z98"]
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='button cookies-banner-module_dismiss-button_24Z98']")
    WebElement cookies;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @FindBy(xpath = "//input[@class='search-field ']")
    WebElement searchField;
    @FindBy(id = "_undefined")
    WebElement searchByBrand;
    @FindBy(xpath = "//button[@class='button search-btn search-icon']")
    WebElement searchIcon;
    @FindBy(xpath = "//li[@class='filter-facet-module_filter-item_3bvm8']/label[@class='checkbox grid-x align-middle ' ]")
    WebElement garminCheckBox;

    @FindBy(xpath = "//div[@class='grid-container search-listings-module_search-listings_2Lw_d']//div[@class='cell small-3']//div//a/h4")
    List<WebElement> allGarminProduct;
    @FindBy(xpath = "//i[@class='add-to-cart-icon']")
    List<WebElement> allAddToCartLink;
    @FindBy(xpath = "//a[contains(text(),'here')]")
    WebElement hereLink;
    @FindBy(xpath = "//div[@class='mini-cart mini-cart-module_mini-cart_3_CNC']//button")
    WebElement basketTab;

    @FindBy(xpath = "//p[@class='cart-summary-module_cart-summary-item-count_3jkNC']//span")
    WebElement totalItemInCart;



    public void selectGarminProduct(String item) {
        boolean trigger = true;
        while (trigger) {
            try {
                List<WebElement> productList = allGarminProduct;
                for (WebElement product : productList) {
                    if (product.getText().contains(item)) {
                        System.out.println(product.getText());
                        moveToElementAndClick(product);
                        trigger = false;
                        break;
                    }
                }
                if (!trigger) {
                    break;
                }

            } catch (StaleElementReferenceException e) {
            }
        }
    }

    public void clickOnHereLink() {
        clickOnElement(hereLink);
    }

    public void clickOnSearchIcon() {
        clickOnElement(searchIcon);
    }

    public void sendTextOnBrandSearchField() {
        sendTextToElement(searchByBrand, "Garmin");
    }

    public void tickTheGarmin() {
        clickOnElement(garminCheckBox);
    }

    public void acceptCookies() {
        clickOnElement(cookies);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);

    }
    public void enterOnSearchField(String str) {
        sendTextToElement(searchField, str);
    }
public void clickOnBasketTab(){
        clickOnElement(basketTab);
}
public String getTotlNoOfItem(){
   return totalItemInCart.getText();
}

}
