package com.zikyo.utils.Recogroup;

import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.TextArea;

/**
 * Created by Sica-sama on 8/9/2016.
 */
public class ContactView extends WebLocator {
  private TextArea field = new TextArea().setName("your-message");

    public void setValue(String messageF){
       field.sendKeys(messageF);

    }
}
