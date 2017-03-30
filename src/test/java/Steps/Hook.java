package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest(){
        System.out.println("Opening the browser: MOCK\n");

        //Passing a dummy WebDriver instance
        base.stepInfo = "Firefox driver";
    }

    @After
    public  void tearDownTest(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Scenario \"" + scenario.getName() + "\" has failed");
        }
    }
}
