package automation.implementation.submit_registration;

import com.ua.learning.project.model.Page;
import com.ua.learning.project.model.entity.SubmitRegistrationForm;
import com.ua.learning.project.model.menu.ABCMenu;
import com.ua.learning.project.model.menu.CDIMenu;
import com.ua.learning.project.model.menu.MainMenu;
import com.ua.learning.project.model.pages.LoginPage;
import org.testng.annotations.Test;

public class SubmitRegistrationTest extends BaseTest {


    String loginPageURL = "http://www.google.com.ua";

    @Test
    public void loginSystem() {
        LoginPage loginPage = new LoginPage();
        loginPage.openWindow(loginPageURL);
    }

    @Test
    public void checkThatAllMenuSelected() {
        Page main = new MainMenu();
        Page abc = new ABCMenu();
        Page cdi = new CDIMenu();
        main.selectMenu();
        abc.selectMenu();
        cdi.selectMenu();
    }

    @Test
    public void checkABCMenuSelected() {

        ABCMenu abcMenu = new ABCMenu();
        abcMenu.selectMenu();
    }

    @Test
    public void registrationForm() {
        SubmitRegistrationForm submitRegistrationForm = new SubmitRegistrationForm();
        submitRegistrationForm.setFirstName("Pinar");

        submitRegistrationForm.setLastName("Ture");

        submitRegistrationForm.setBirthday("3rd of Nov");

        submitRegistrationForm.setAge(30);

        System.out.println("RegistrationForm(firstname=" + submitRegistrationForm.getFirstName() +
                ",Last Name=" + submitRegistrationForm.getLastName() +
                ",Birthday=" + submitRegistrationForm.getBirthday() +
        ",Age=" + submitRegistrationForm.getAge() +")");
    }




}
