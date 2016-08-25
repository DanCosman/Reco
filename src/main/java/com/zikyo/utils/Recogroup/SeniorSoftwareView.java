package com.zikyo.utils.Recogroup;

import com.sdl.selenium.web.WebLocator;


/**
 * Created by Sica-sama on 8/12/2016.
 */
    public class SeniorSoftwareView {
    private WebLocator link = new WebLocator().setId("menu-item-231");

    public WebLocator getLinkS() {
        return linkS;
    }

    private WebLocator linkS = new WebLocator().setClasses("item isotope-item testing");
    private WebLocator nameF = new WebLocator().setName("your-name");
    private WebLocator emailF = new WebLocator().setName("your-email");
    private WebLocator contactN = new WebLocator().setName("your-number");
    private WebLocator additionalF = new WebLocator().setName("your-message");
    private WebLocator myUploadElement = new WebLocator("wpcf7-file");

    public void doAttach(){
        myUploadElement.sendKeys("D:\\Recogroup\\zikyoAutomation-master\\src\\test\\resources\\drivers\\cv Ionut Negreanu.pdf");
    }

    public WebLocator getLink() {
        return link;
    }



    public void setValues(String nameField, String emailTxt, String contactF, String additionalM) {
        nameF.sendKeys(nameField);
        emailF.sendKeys(emailTxt);
        contactN.sendKeys(contactF);
        additionalF.sendKeys(additionalM);
    }
}