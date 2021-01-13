package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PaginaPrincipal {
    @FindBy(xpath = "//a[contains(text(),'IFrames Test')]")
    public WebElement linkIframeTest;

    @FindBy(xpath = "//a[contains(text(),'Link Test')]")
    public WebElement linkTest;

    @FindBy(xpath = "//a[contains(text(),'Form Test')]")
    public WebElement formTest;

    @FindBy(xpath = "//a[contains(text(),'Table Test')]")
    public WebElement tableTest;

    @FindBy(xpath = "//a[contains(text(),'Select Test')]")
    public WebElement selectTest;

    @FindBy(linkText = "Frames Test")
    public WebElement framesTest;

    @FindBy(xpath = "//a[contains(text(),'IFrames Test')]")
    public WebElement iframeTest;

    @FindBy(xpath = "//a[contains(text(),'ShadowRoot Test')]")
    public WebElement shadowRootTest;

    @FindBy(linkText = "Window Open Test")
    public WebElement windowsOpenTest;

    @FindBy(xpath = "//a[contains(text(),'Window Open Test With Title')]")
    public WebElement windowsOpenTestTitle;

    @FindBy(xpath = "//a[contains(text(),'Show Modal Test')]")
    public WebElement showModalTest;

    @FindBy(xpath = "//a[contains(text(),'Span and Div Page')]")
    public WebElement spanAndDivPage;

    @FindBy(xpath = "//a[contains(text(),'Element On Top Test')]")
    public WebElement elementOnTopTest;

    @FindBy(xpath = "//a[contains(text(),'TakePageScreenshot Test')]")
    public WebElement takePageScreenshotTest;

    @FindBy(xpath = "//a[contains(text(),'Label Page')]")
    public WebElement labelPage;

    @FindBy(xpath = "//a[contains(text(),'Headings Test')]")
    public WebElement headingsTest;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/a[6]")
    public WebElement visibleTest;

    @FindBy(xpath = "//a[contains(text(),'Strict Visible Test')]")
    public WebElement strictVisibleTest;

    @FindBy(xpath = "//a[contains(text(),'Contain Test')]")
    public WebElement containTest;

    @FindBy(xpath = "//a[contains(text(),'React Test')]")
    public WebElement reactTest;

    @FindBy(xpath = "//a[contains(text(),'Alert Test')]")
    public WebElement alertTest;

    @FindBy(xpath = "//a[contains(text(),'Confirm Page')]")
    public WebElement confirmPage;

    @FindBy(xpath = "//a[contains(text(),'Prompt Page')]")
    public WebElement promptPage;

    @FindBy(xpath = "//a[contains(text(),'Js Popup')]")
    public WebElement jsPopup;

    @FindBy(xpath = "//a[contains(text(),'Save As Test')]")
    public WebElement saveAsTest;

    @FindBy(xpath = "//a[contains(text(),'File Upload Test')]")
    public WebElement fileUploadTest;

    @FindBy(xpath = "//a[contains(text(),'Break Frames')]")
    public WebElement breakFrames;

    @FindBy(xpath = "//a[@id='open-self']")
    public WebElement openSelf;

    @FindBy(xpath = "//a[contains(text(),'Close Self')]")
    public WebElement closeSelf;
    @FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
    public WebElement botonCloseSelf;
    @FindBy(xpath = "//a[contains(text(),'Blank Page')]")
    public WebElement blankPage;
    @FindBy(xpath = "//tbody/tr[1]/td[4]/a[5]")
    public WebElement differentDomains;
    @FindBy(xpath = "//a[contains(text(),'Different Domains External')]")
    public WebElement differentExternal;
    @FindBy(xpath = "//a[contains(text(),'Iframe Different Domains')]")
    public WebElement iframeDifferentDomains;
    @FindBy(xpath = "//a[contains(text(),'OnBeforeUnload')]")
    public WebElement onBeforeUnload;
    @FindBy(xpath = "//a[contains(text(),'Error Pages')]")
    public WebElement errorPages;
    @FindBy(xpath = "//tbody/tr[1]/td[4]/a[10]")
    public WebElement response;
    @FindBy(xpath = "//a[contains(text(),'Delayed Load page')]")
    public WebElement delayedLoadPage;
    @FindBy(xpath = "//a[contains(text(),'IFrame via doc write')]")
    public WebElement iframeViaDocWrite;
    @FindBy(xpath = "//a[contains(text(),'Head request with 204 Response')]")
    public WebElement headResponse;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]")
    public WebElement clickPage;
    @FindBy(xpath = "//a[contains(text(),'Combo Clicks Page')]")
    public WebElement comboClicksPage;
    @FindBy(xpath = "//a[contains(text(),'Mouse over')]")
    public WebElement mouseOver;
    @FindBy(xpath = "//a[contains(text(),'Key Press')]")
    public WebElement keyPress;
    @FindBy(xpath = "//a[contains(text(),'Drag Drop Test')]")
    public WebElement dragDropTest;
    @FindBy(xpath = "//a[contains(text(),'Drag Drop DataTransfer')]")
    public WebElement dragDatatransfer;
    @FindBy(xpath = "//a[contains(text(),'Wait For Condition')]")
    public WebElement waitForCondition;
    @FindBy(xpath = "//a[contains(text(),'Clear Timeout All')]")
    public WebElement climeTimeout;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/a[9]")
    public WebElement google;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/a[9]")
    public WebElement httpgoogle;
    @FindBy(xpath = "//a[contains(text(),'Temp test')]")
    public WebElement tempTest;
    @FindBy(xpath = "//a[contains(text(),'Timer')]")
    public WebElement timer;
    @FindBy(xpath = "//a[contains(text(),'Performance')]")
    public WebElement performance;
    @FindBy(xpath = "//a[contains(text(),'Responsive Page')]")
    public WebElement responsivePage;
    @FindBy(xpath = "//a[contains(text(),'Silverlight')]")
    public WebElement silverlight;

    private Map<String, WebElement> elementos;
    private WebDriver driver;


    public void ingresarIframeTest() {
        linkIframeTest.click();
    }

    public PaginaPrincipal(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        elementos = new HashMap<>();
        elementos.put("linkTest", linkTest);
        elementos.put("tableTest", tableTest);
        elementos.put("selectTest", selectTest);
        elementos.put("framesTest", framesTest);
        elementos.put("iframeTest", iframeTest);
        elementos.put("shadowRootTest", shadowRootTest);
        elementos.put("showModalTest", showModalTest);
        elementos.put("spanAndDivPage", spanAndDivPage);
        elementos.put("elementOnTopTest", elementOnTopTest);
        elementos.put("takePageScreenshotTest", takePageScreenshotTest);
        elementos.put("labelPage", labelPage);
        elementos.put("headingsTest", headingsTest);
        elementos.put("visibleTest", visibleTest);
        elementos.put("strictVisibleTest", strictVisibleTest);
        elementos.put("containTest", containTest);
        elementos.put("reactTest", reactTest);
        elementos.put("alertTest", alertTest);
        elementos.put("confirmPage", confirmPage);
        elementos.put("promptPage", promptPage);
        elementos.put("jsPopup", jsPopup);
        elementos.put("saveAsTest", saveAsTest);
        elementos.put("fileUploadTest", fileUploadTest);
        elementos.put("blankPage", blankPage);
        elementos.put("differentDomains", differentDomains);
        elementos.put("differentExternal", differentExternal);
        elementos.put("iframeDifferentDomains", iframeDifferentDomains);
        elementos.put("onBeforeUnload", onBeforeUnload);
        elementos.put("errorPages", errorPages);
        elementos.put("iframeViaDocWrite", iframeViaDocWrite);
        elementos.put("headResponse", headResponse);
        elementos.put("clickPage", clickPage);
        elementos.put("comboClicksPage", comboClicksPage);
        elementos.put("mouseOver", mouseOver);
        elementos.put("keyPress", keyPress);
        elementos.put("dragDropTest", dragDropTest);
        elementos.put("dragDatatransfer", dragDatatransfer);
        elementos.put("waitForCondition", waitForCondition);
        elementos.put("climeTimeout", climeTimeout);
        elementos.put("google", google);
        elementos.put("httpgoogle", httpgoogle);
        elementos.put("tempTest", tempTest);
        elementos.put("timer", timer);
        elementos.put("performance", performance);
        elementos.put("responsivePage", responsivePage);
        elementos.put("silverlight", silverlight);

    }
    public void formTestLink (){
        formTest.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void abrirDelayPage(){
        delayedLoadPage.click();

    }

    public void abrirLinks(String nombreLink) {
        elementos.get(nombreLink).click();
    }
    public Set<String> obtenerListaDelinks() {
        return elementos.keySet();
    }

}
