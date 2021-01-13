package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaIframe {
    // encontrar el Iframe derecho
    @FindBy(xpath = "//body/div[@id='another']/iframe[1]")
    private WebElement iframeDerecho;
    private IframeDerecho iframeDerechoInstance;
    private WebDriver driver;

    //ubicarnos en el iframe derecho
    public void swichFrameDerecho() {
        this.driver.switchTo().frame(iframeDerecho);
    }

    //inicializar los elementos de esa clase
    public PaginaIframe(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        iframeDerechoInstance = new IframeDerecho(driver);
    }

    public IframeDerecho getIframeDerechoInstance() {
        return iframeDerechoInstance;
    }


}


