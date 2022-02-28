package com.takealot.pages;

import com.takealot.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "firstname")
    WebElement firstName;
    @FindBy(id="surname")
    WebElement lastName;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "email2")
    WebElement retypeEmail;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "password2")
    WebElement retryPassword;
    @FindBy(id = "telno1")
    WebElement mobileNumber;
    @FindBy(id = "newsletter_music")
    WebElement musicCheckBox;
    @FindBy(id="newsletter_fashion")
    WebElement fashionCheckBox;
    @FindBy(id="newsletter_toys")
    WebElement toysCheckBox;
    @FindBy(xpath = "//input[@name='registerButton']")
    WebElement registerButton;
    //@FindBy(xpath = "//div[@id='welcome']/h3")
    @FindBy(xpath = "//div[@id='welcome']/h3[contains(text(),'Welcome to the TAKEALOT.com family!')]")
    WebElement welcomeText;
    public void enterFirstName(String name){
        sendTextToElement(firstName,name);
    }
    public void enterLastName(String surname){
        sendTextToElement(lastName,surname);
    }
    public void   enterEmail(int length){
        String s=getRandomString(length);
        sendTextToElement(email,s+"@gmail.com");
        sendTextToElement(retypeEmail,s+"@gmail.com");
    }
    public void enterPassWord(String pwd){
        sendTextToElement(password,pwd);
        sendTextToElement(retryPassword,pwd);
    }
    public void mobileNumber(int length){
        String s="07"+getRandomMobileNumber(length);
        sendTextToElement(mobileNumber,s);
    }
    public void clickOnMusicCheckBox(){
        clickOnElement(musicCheckBox);
    }
    public void clickOnFashionCheckBox(){
        clickOnElement(fashionCheckBox);
    }
    public void clickOnToysCheckBox(){
        clickOnElement(toysCheckBox);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String welcomeMessageDisplay()  {

        String actualMsg=welcomeText.getText();
        return actualMsg;
    }
}
