package automation.implementation.submit_registration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void init(){
        System.out.println("init");
    }

    @AfterTest
    public void destroy(){
        System.out.println("destroy");
    }








}
