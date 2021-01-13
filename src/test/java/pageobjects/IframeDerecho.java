package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframeDerecho {
    //encontrar el link windows open test
    @FindBy(xpath = "//a[contains(text(),'Window Open Test')]")
    private WebElement linkWindowsOpentest;
    //encontrar el elemento Error page
    @FindBy(xpath = "//a[contains(text(),'Error Pages')]")
    private WebElement linkErrorPage;
    //encontrar el elemento error404
    @FindBy(xpath = "//a[contains(text(),'404 Page')]")
    private  WebElement linkError404;
    //encontrar el texto requerido
    @FindBy(xpath = "//h1[contains(text(),'Not Found')]")
    private WebElement textoError;

    //inicializar el driver
    public IframeDerecho(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //click al elemento encontrado windows open test
    public void clickWindowOpenTest() {
        linkWindowsOpentest.click();
    }
    //click al elemento encontrado error page
    public void clickErrorPage(){
        linkErrorPage.click();
    }
    // click al elemento 404
    public void clickError404(){
        linkError404.click();
    }
    //retornar texto error 404
    public String textoError404(){
        return textoError.getText();

    }



}
