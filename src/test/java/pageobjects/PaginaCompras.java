package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PaginaCompras {
    private WebDriver driver;
    //encontrar el campo core java
    @FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
    private WebElement campoPrecioCoreJava;
    // encontrar el campo ruby
    @FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
    private WebElement campoPrecioRuby;
    //encontrar el campo paython
    @FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
    private WebElement campoPrecioPython;

    //encontrar el elemento precio libro core java
    @FindBy(xpath = "//td[contains(text(),'Rs. 300')]")
    private WebElement precioCoreJava;
    // encontrar el elemento precio libro ruby for rails
    @FindBy(xpath = "//td[contains(text(),'Rs. 200')]")
    private WebElement precioRuby;
    //encontrar el elemento python
    @FindBy(xpath = "//td[contains(text(),'Rs. 350')]")
    private WebElement precioPython;
    //encontrar el elemento boton añadir carrito
    @FindBy(xpath = "//body/center[1]/form[1]/div[1]/input[1]")
    private WebElement botonAnadirCarrito;
    //encontrar el elemento clear o borrar campos
    @FindBy(xpath = "//body/center[1]/form[1]/div[1]/input[2]")
    private WebElement botonClear;

    // encontrar el elemento valor total
    @FindBy(xpath = "//input[@id='total']")
    private WebElement valorTotal;
    // encontrar el elemento valor total libro core java
    @FindBy(xpath = "//td[contains(text(),'Rs.600')]")
    private WebElement valorTotalLibroJava;
    // encontrar el elemento valor total libro ruby
    @FindBy(xpath = "//td[contains(text(),'Rs.1000')]")
    private WebElement valorTotalLibroRuby;
    // encontrar el elemento valor total libro Python
    @FindBy(xpath = "//td[contains(text(),'Rs.700')]")
    private WebElement valorTotalLibroPython;


    public void camposCantidadPreciosLibros() {
        campoPrecioCoreJava.sendKeys("2");
        campoPrecioRuby.sendKeys("5");
        campoPrecioPython.sendKeys("2");
    }

    public void limpiarCampos() {
        botonClear.click();
    }

    public void botonCarrito() {
        botonAnadirCarrito.click();
    }

    public PaginaCompras(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public String obtenerSubtotalLibroJava() {
        return valorTotalLibroJava.getText();
    }
    public String obtenerSubtotalLibroRuby() {
        return valorTotalLibroRuby.getText();

    }

    public String obtenerSubtotalLibroPython() {
        return valorTotalLibroPython.getText();
    }

    public String obtenerValorTotal() {
        return valorTotal.getAttribute("value");
    }
}




