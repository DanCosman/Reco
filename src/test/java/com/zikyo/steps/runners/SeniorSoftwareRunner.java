package com.zikyo.steps.runners;

import cucumber.api.CucumberOptions;



    @CucumberOptions(
            monochrome = true,
            plugin =  {"rerun", "html:target/cucumber","json:target/jsonReports/RegisterTest.json"},
            glue = {
                    "com.zikyo"
            },
            features = {
                    "src/test/resources/features/SeniorSoftwareSteps.feature"
            }
    )
    public class SeniorSoftwareRunner {
    }


