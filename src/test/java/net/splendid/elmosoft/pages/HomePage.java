package net.splendid.elmosoft.pages;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;
import net.elmosoft.splendid.driver.page.Page;
import net.elmosoft.splendid.driver.page.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class HomePage extends Page {

    @FindBy(xpath= "//button[contains(text(), 'Open Menu')]")
    private BrowserElement rightGamburgerMenu;

    @FindBy(xpath= "//button[contains(text(), 'Add to cart')]")
    private List<BrowserElement> addToCartBtn;

    @FindBy(xpath = "//a[@class='shopping_cart_link']/span[@class='shopping_cart_badge']")
    private BrowserElement cartIcon;

    @FindBy( id = "logout_sidebar_link")
    private BrowserElement logoutSitebar;


    public HomePage clickByAddToCartBtn(int index){
        addToCartBtn.get(index).click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public CartPage clickByCartIcon(){
        cartIcon.click();
        return PageFactory.initElements(driver, CartPage.class);
    }
    public Boolean isHomePageOpened(){
        return rightGamburgerMenu.isExists();
    }

    public HomePage clickByRightGamburgerMenu(){
        rightGamburgerMenu.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public LoginPage clickByLogoutBtn(){
        clickByLogoutBtn();
        return PageFactory.initElements(driver, LoginPage.class);
    }

    @Override
    public void checkPage() {

    }

    @Override
    public void waitForPageIsLoaded() {

    }
}





