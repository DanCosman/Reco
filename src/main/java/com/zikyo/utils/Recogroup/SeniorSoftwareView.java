package com.zikyo.utils.Recogroup;

import com.sdl.selenium.web.WebLocator;
import org.apache.xpath.operations.String;

/**
 * Created by Sica-sama on 8/12/2016.
 */
    public class SeniorSoftwareView  extends WebLocator {
    private WebLocator link = new WebLocator().setId("menu-item-231");
    private WebLocator linkS = new WebLocator().setClasses("item isotope-item testing");
    private WebLocator nameF = new WebLocator().setName("your-name");
    private WebLocator emailF = new WebLocator().setName("your-email");



    public void setValues(String name, String emailTxt){
        
        emailF.sendKeys("emailTxt");
    }
    public WebLocator getLink() {
        return link;
    }


    public WebLocator getLinkS() {
        return linkS;
    }

}