package net.splendid.elmosoft.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import net.elmosoft.splendid.service.runner.SuiteListener;
import net.elmosoft.splendid.test.BaseSplendidTest;
import net.splendid.elmosoft.pages.CartPage;
import net.splendid.elmosoft.pages.HomePage;
import net.splendid.elmosoft.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

@Listeners({SuiteListener.class, HTMLReporter.class})
@Epic("Smoke Tests")
@Feature("Login")
@Guice

public class AddintToCart extends BaseSplendidTest {
    @Test
    public void verifyAddingToCart() {
        LoginPage login = new LoginPage();
        login.openPage().checkPage();
        login.dologin("standard_user", "secret_sauce");

        HomePage home = new HomePage();
        home.clickByAddToCartBtn(0);
        Boolean resultChosen =  home.clickByCartIcon().isProductChoosen();
        Assert.assertTrue(resultChosen, "Product is not choosen!");
    }
}
