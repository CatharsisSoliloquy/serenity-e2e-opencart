package com.opencart.ec.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {
    @Steps(shared = true)
    PageObject opencart;

    @Step("Navegar al sitio web")
    public void navigateTo(String url) {
        opencart.setDefaultBaseUrl(url);

        opencart.open();
    }


}
