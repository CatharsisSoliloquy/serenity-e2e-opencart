package com.opencart.ec.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ValidationPage extends PageObject {

    @FindBy(xpath = "//h2[text()='What would you like to do next?']")
    protected WebElementFacade lbl_opencart;

    @FindBy(xpath = "//h1[text()='Your order has been placed!']")
    protected WebElementFacade lbl_successfulOrder;

}
