package pruebas;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageobjects.*;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {
    public static WebDriver chromeDriver;
    public static PaginaPrincipal paginaPrincipal;
    public static PaginaIframe paginaIframe;
    public static PaginaLogin paginaLogin;
    public static PaginaFormulario paginaFormulario;
    public static PaginaCompras paginaCompras;

    private static void inicializarPagina(WebDriver driver) {
        paginaPrincipal = new PaginaPrincipal(driver);
    }

    private static void inicializarPaginaIframe(WebDriver driver) {
        paginaIframe = new PaginaIframe(driver);
    }

    private static void inicializarPaginaLogin(WebDriver driver) {
        paginaLogin = new PaginaLogin(driver);
    }

    private static void inicilizarPaginaFormulario(WebDriver driver) {
        paginaFormulario = new PaginaFormulario(driver);
    }

    private static void inicializarPaginaCompras(WebDriver driver) {
        paginaCompras = new PaginaCompras(driver);
    }

    @BeforeAll

    public static void abrirDriver() {

        //encontrar  archivo .exe  de chrome
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        // creamos opciones  sobre nuestro driver
        ChromeOptions options = new ChromeOptions();

        // nueva instancia de  chromedriver
        chromeDriver = new ChromeDriver(options);
        //definimos el tiempo de espera hasta que aceptemos un timeout
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        inicializarPagina(chromeDriver);
        inicializarPaginaIframe(chromeDriver);
        inicializarPaginaLogin(chromeDriver);
        inicilizarPaginaFormulario(chromeDriver);
        inicializarPaginaCompras(chromeDriver);

    }

    @AfterAll
    public static void cerrarDriver() {
    //cerrar ventana apagar driver
    chromeDriver.quit();
    }

}
