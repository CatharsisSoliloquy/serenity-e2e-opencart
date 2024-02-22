package com.opencart.ec.steps.purchase;

import com.opencart.ec.pages.store.StorePage;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ui.Select;
import net.thucydides.core.annotations.Step;

public class PurchaseStep extends StorePage {

    @Step("Agregar Producto 1")
    public void addProduct1() {
        product1.click();
    }

    @Step("Agregar Producto 2")
    public void addProduct2() {
        product2.click();
    }

    @Step("Mostrar Carrito")
    public void showCart() {
        btnShowCart.click();
    }

    @Step("Entrar a Carrito")
    public void enterCart() {
        btnEnterCart.click();
    }

    @Step("Entrar a Checkout")
    public void enterCheckout() {
        btnEnterCheckout.click();
    }

    @Step("Elegir seguir como invitado")
    public void clickRadioCheckout() {
        radioGuestCheckout.click();
    }

    @Step("Continuar a detalles de facturacion")
    public void continueBullingDetails() {
        btnContinueNewCostumer.click();
    }

    @Step("Ingresar nombre")
    public void typeFirstname(String firstname) {
        fistNameInput.sendKeys(firstname);
    }

    @Step("Ingresar apellido")
    public void typeLastname(String lastname) {
        lastNameInput.sendKeys(lastname);
    }

    @Step("Ingresar correo")
    public void typeEmail(String email) {
        emailText.sendKeys(email);
    }

    @Step("Ingresar numero de telefono")
    public void typeTelephone(String number) {
        telephoneInput.sendKeys(number);
    }

    @Step("Ingresar direccion")
    public void typeAddress(String address) {
        addressInput.sendKeys(address);
    }

    @Step("Ingresar ciudad")
    public void typeCity(String city) {
        cityInput.sendKeys(city);
    }

    @Step("Ingresar codigo postal")
    public void typePostCode(String postcode) {
        postCodeInput.sendKeys(postcode);
    }

    @Step("Seleccionar país")
    public void selectCountry() {
        countrySelect.click();
    }

    @Step("Seleccionar opcion país")
    public void selectOptionCountry() {
        optionSelect.click();
    }

    @Step("Seleccionar region")
    public void selectRegion() {
        regionSelect.click();
    }

    @Step("Seleccionar opcion region")
    public void selectOptionRegion() {
        regionOption.click();
    }

    @Step("Continuar al metodo de entrega")
    public void continueDeliveryData() {
        btnContinueForm.click();
    }

    @Step("Continuar al metodo de pago")
    public void continuePaymentMethodDelivery() {
        btnContinuePaymentMethodDelivery.click();
    }

    @Step("Aceptar terminos y condiciones")
    public void acceptTermsConditions() {
        checkboxTermConditions.click();
    }

    @Step("Continuar a confirmar orden")
    public void continueConfirmOrder() {
        btnContinuePaymentMethod.click();
    }

    @Step("Confirmar orden")
    public void confirmOrder() {
        btnConfirmOrder.click();
    }

}
