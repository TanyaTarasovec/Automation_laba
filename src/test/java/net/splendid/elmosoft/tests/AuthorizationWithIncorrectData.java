package net.splendid.elmosoft.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import net.elmosoft.splendid.service.runner.SuiteListener;
import net.elmosoft.splendid.test.BaseSplendidTest;
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

public class AuthorizationWithIncorrectData extends BaseSplendidTest {

    @Test
    public void verifyValidCread() {
        LoginPage login = new LoginPage();
        login.openPage().checkPage();
        Boolean resultAuthorization = login.dologin("standard_user", "111222333 ").isHomePageOpened();
        Assert.assertTrue(resultAuthorization, "Home page is not opened");

    }
}