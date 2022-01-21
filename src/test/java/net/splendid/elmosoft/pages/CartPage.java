package net.splendid.elmosoft.pages;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;
import net.elmosoft.splendid.driver.page.Page;
import net.elmosoft.splendid.driver.page.PageFactory;

public class CartPage extends Page {

    @FindBy(xpath= "//div[contains(text(), 'Sauce Labs Backpack')]")
    private BrowserElement product;

    @FindBy(id="remove-sauce-labs-backpack")
    private BrowserElement removeBtn;

    @FindBy(xpath= "//div[@class= 'cart_item_label']")
    private BrowserElement cartItemLabel;

    @FindBy(xpath= "//button[@class= 'btn btn_action btn_medium checkout_button']")
    private BrowserElement mediumCheckoutBtn;

    public  Boolean isProductChoosen(){
        return product.isExists();
    }
    public Boolean isCartItemLabelExist(){
        return cartItemLabel.isExists();
    }

    public CartPage clickByRemove(){
        removeBtn.click();
        return PageFactory.initElements(driver, CartPage.class);
    }



    @Override
    public void checkPage() {

    }

    @Override
    public void waitForPageIsLoaded() {

    }
}