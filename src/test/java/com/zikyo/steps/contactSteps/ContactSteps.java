package com.zikyo.steps.contactSteps;

import com.sdl.selenium.web.form.TextArea;
import com.zikyo.utils.Recogroup.ContactView;
import cucumber.api.java.en.And;


public class ContactSteps {
        private ContactView contactView =  new ContactView();

    @And("^I type into message field$")
    public void iTypeIntoCaptchaField()  {
        TextArea field = new TextArea().setName("your-message");
        contactView.setValue("hapte cooll");
    }}

