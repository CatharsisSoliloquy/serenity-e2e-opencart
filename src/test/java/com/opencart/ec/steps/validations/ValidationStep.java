package com.opencart.ec.steps.validations;

import com.opencart.ec.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Validar que se visualice el carrito con los productos")
    public Boolean h2IsVisible(){
        return lbl_opencart.isDisplayed();
    }

    @Step("Validar que la orden ah sido exitosa")
    public Boolean h1IsVisible(){
        return lbl_successfulOrder.isDisplayed();
    }


}
