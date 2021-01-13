package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaFormulario {
    private WebDriver driver;

    //encontrar elemento registrar
    @FindBy(linkText = "Register")
    private WebElement registerBoton;
    // encontrar el elemento usuario
    @FindBy(xpath = "//input[@id='uid']")
    private WebElement userName;
    // encontrar el elemento campo contraseña
    @FindBy(xpath = "//input[@id='pid']")
    private WebElement campoPassword;
    // encontrar el campo repetir contraseña
    @FindBy(xpath = "//input[@id='pid2']")
    private WebElement campoRepetirContrasena;
    // encontrar elemento genero masculino
    @FindBy(xpath = "//tbody/tr[4]/td[2]/input[1]")
    private WebElement generoMasculino;
    // encontrar elemento genero femenino
    @FindBy(xpath = "//tbody/tr[4]/td[2]/input[2]")
    private WebElement generoFemenino;
    // encontrar elemento direccion
    @FindBy(xpath = "//textarea[@id='taid']")
    private WebElement direccion;
    @FindBy(xpath = "//textarea[@id='btaid']")
    private WebElement direccionEnvio;
    // encontrar elemento menu desplegable estado
    @FindBy(xpath = "//tbody/tr[7]/td[2]/select[1]")
    private WebElement estadoCiudad;
    // encontrar elemento terminos y condiciones
    @FindBy(xpath = "//input[@name='agree']")
    private WebElement aceptarTerminos;
    //encontrar elemento boton registrar
    @FindBy(xpath = "//input[@value='Register']")
    private WebElement botonRegistrar;
    // encontrar elemento regresar al login
    @FindBy(xpath = "//a[contains(text(),'Go back to login')]")
    private WebElement regresarLogin;

    public void clickBotonRegister() {
        registerBoton.click();
    }

    public void diligenciarDatosFormulario() {
        userName.sendKeys("andres mauricio");
        campoPassword.sendKeys("aaaaaa");
        campoRepetirContrasena.sendKeys("aaaaaa");
        direccion.sendKeys("calle 1 carrera 2 tangamantapio");
        direccionEnvio.sendKeys("calle  1 tangamantapio");

    }
    public void clickSeleccionarGenero() {
        generoMasculino.click();
    }
    public void clickAceptarTerminos() {
        aceptarTerminos.click();
    }

    public void clickBotonRegistrar() {
        botonRegistrar.click();
    }

    public void mensajeAlertaRegistroFull() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public PaginaFormulario(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


}
