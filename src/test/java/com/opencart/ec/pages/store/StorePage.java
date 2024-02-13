package com.opencart.ec.pages.store;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class StorePage extends PageObject {
    @FindBy(xpath = "//button[@onclick=\"cart.add('43');\"]")
    protected WebElementFacade product1;

    @FindBy(xpath = "//button[@onclick=\"cart.add('40');\"]")
    protected WebElementFacade product2;

    @FindBy(xpath = "//button[@data-toggle='dropdown' and @data-loading-text='Loading...' ]")
    protected WebElementFacade btnShowCart;

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=checkout/cart']")
    protected WebElementFacade btnEnterCart;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    protected WebElementFacade btnEnterCheckout;

    @FindBy(xpath = "//input[@type='radio' and @name='account' and @value='guest']")
    protected WebElementFacade radioGuestCheckout;

    @FindBy(xpath = "//input[@type='button' and @class='btn btn-primary' and @value='Continue' and @id='button-account']")
    protected WebElementFacade btnContinueNewCostumer;

    @FindBy(xpath = "//input[@type='text' and @name='firstname']")
    protected WebElementFacade fistNameInput;

    @FindBy(xpath = "//input[@type='text' and @name='lastname']")
    protected WebElementFacade lastNameInput;

    @FindBy(id = "input-payment-email")
    protected WebElementFacade emailText;

    @FindBy(xpath = "//input[@type='text' and @name='telephone' and @id='input-payment-telephone']")
    protected WebElementFacade telephoneInput;

    @FindBy(xpath = "//input[@type='text' and @name='address_1' and @id='input-payment-address-1']")
    protected WebElementFacade addressInput;

    @FindBy(xpath = "//input[@type='text' and @name='city' and @id='input-payment-city']")
    protected WebElementFacade cityInput;

    @FindBy(xpath = "//input[@type='text' and @name='postcode' and @id='input-payment-postcode']")
    protected WebElementFacade postCodeInput;

    @FindBy(xpath = "//select[@name='country_id' and @id='input-payment-country']")
    protected WebElementFacade countrySelect;

    @FindBy(xpath = "//option[@value='1' and text() = 'Afghanistan']")
    protected WebElementFacade optionSelect;

    @FindBy(xpath = "//select[@name='zone_id']")
    protected WebElementFacade regionSelect;

    @FindBy(xpath = "//option[@value='1' and text() = 'Badakhshan']")
    protected WebElementFacade regionOption;

    @FindBy(xpath = "//input[@type='button' and @id='button-guest']")
    protected WebElementFacade btnContinueForm;


    @FindBy(xpath = "//input[@type='button' and @class='btn btn-primary' and @value='Continue' and @id='button-shipping-method']")
    protected WebElementFacade btnContinuePaymentMethodDelivery;

    @FindBy(xpath = "//input[@name='agree' and @type = 'checkbox']")
    protected WebElementFacade checkboxTermConditions;

    @FindBy(xpath = "//input[@type='button' and @class='btn btn-primary' and @value='Continue' and @id='button-payment-method']")
    protected WebElementFacade btnContinuePaymentMethod;

    @FindBy(xpath = "//input[@type='button' and @class='btn btn-primary' and @value='Confirm Order' and @id='button-confirm']")
    protected WebElementFacade btnConfirmOrder;


}
