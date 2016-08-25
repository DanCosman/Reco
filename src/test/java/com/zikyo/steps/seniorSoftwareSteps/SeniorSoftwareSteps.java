package com.zikyo.steps.seniorSoftwareSteps;

import com.zikyo.utils.Recogroup.SeniorSoftwareView;
import cucumber.api.java.en.And;


public class SeniorSoftwareSteps {
    private SeniorSoftwareView  seniorsoftwareview  = new SeniorSoftwareView();

    @And("^I click on link with text Latest  Vacancies$")
    public void iClickOnLinkWithTextLatestVacancies() {
        seniorsoftwareview.getLink().click();
    }




    @And("^I click on link with text Senior Software Developer in Test$")
        public void iClickOnLinkWithTextSeniorSoftwareDeveloperInTest()  {
            seniorsoftwareview.getLinkS().click();
        }


    @And("^I fill in the fields for applying for a job \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iFillInTheFieldsForApplyingForAJob(String nameField, String emailTxt, String contactF, String additionalM)  {
        seniorsoftwareview.setValues(nameField, emailTxt, contactF,additionalM);
    }

    @And("^I choose file for attach your cv$")
    public void iChooseFileForAttachYourCv() {
       seniorsoftwareview.doAttach();

    }
}



