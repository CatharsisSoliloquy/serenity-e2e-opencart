package com.opencart.ec.definitions;

import com.opencart.ec.steps.purchase.PurchaseStep;
import com.opencart.ec.steps.validations.ValidationStep;
import com.opencart.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class PurchaseDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    PurchaseStep purchase;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("que el usuario está en la página de inicio de OpenCart")
    public void userNavigateTo() {
        url.navigateTo("http://opencart.abstracta.us/");
    }

    @When("el usuario agrega dos productos al carrito")
    public void userAddProducts() {
        purchase.addProduct1();
        purchase.addProduct2();
        purchase.showCart();
        purchase.enterCart();
    }

    @Then("puede verificar los productos en el carrito e ir al checkout")
    public void webShowCart() {
        Assert.assertTrue(validate.h2IsVisible());
        purchase.enterCheckout();
    }

    @When("completa el checkout con todos los pasos y datos necesarios")
    public void completeCheckout() {
        purchase.clickRadioCheckout();
        purchase.continueBullingDetails();
        purchase.typeFirstname("Josue");
        purchase.typeLastname("Sangucho");
        purchase.typeEmail("example@example.com");
        purchase.typeTelephone("0987654321");
        purchase.typeAddress("12 de octubre");
        purchase.typeCity("Quito");
        purchase.typePostCode("0000");
        purchase.selectCountry();
        purchase.selectOptionCountry();
        purchase.selectRegion();
        purchase.selectOptionRegion();
        purchase.continueDeliveryData();
        purchase.continuePaymentMethodDelivery();
        purchase.acceptTermsConditions();
        purchase.continueConfirmOrder();
        purchase.confirmOrder();
    }

    @Then("puede ver el mensaje ¡Tu pedido ha sido realizado!")
    public void confirmSuccessfulPurchaseFlow() {
        Assert.assertTrue(validate.h1IsVisible());
    }
}
