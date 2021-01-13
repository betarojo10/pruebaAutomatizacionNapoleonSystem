package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaLogin {

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement botonRegistro;
    //encontrar el elemento Usuario
    @FindBy(xpath = "//input[@name='user']")
    private WebElement campoUsuario;
    // encontrar el elemento contraseña
    @FindBy(xpath = "//tbody/tr[2]/td[2]/input[1]")
    private WebElement campoContrasena;
    // encontrar el elemento boton login
    @FindBy(xpath = "//tbody/tr[3]/td[2]/input[1]")
    private WebElement botonLogin;



    public void diligenciarDatosLogin(){
        campoUsuario.sendKeys("test");
        campoContrasena.sendKeys("secret");

    }
    public void clickBotonLogin(){
        botonLogin.click();
    }

    public PaginaLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
