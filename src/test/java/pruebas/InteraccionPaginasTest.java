package pruebas;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pageobjects.PaginaCompras;
import pageobjects.PaginaPrincipal;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class InteraccionPaginasTest extends BaseTestSuite {
    //Punto 1 prueba windows open test
    @Test
    public void validarWindowsOpenTest() {

        //abrir URL
        chromeDriver.get("http://sahitest.com/demo/index.htm");
        //click en iframetestlink
        paginaPrincipal.ingresarIframeTest();

        //interaccion iframe derecho
        paginaIframe.swichFrameDerecho();
        //buscar el elemento window open test y dar click en el
        paginaIframe.getIframeDerechoInstance().clickWindowOpenTest();
        //situarnos en la pestaña
        ArrayList<String> tabs = new ArrayList<String>(chromeDriver.getWindowHandles());
        chromeDriver.switchTo().window(tabs.get(1));
        // comparar la url esperada con la url que nos da el test
        Assert.assertEquals("http://sahitest.com/demo/framesTest.htm", chromeDriver.getCurrentUrl().toString());

    }

    //punto 2 prueba pagina error 404
    @Test
    public void validadPaginaErrorPage() {
        //abrir URL
        chromeDriver.get("http://sahitest.com/demo/index.htm");
        //click en iframetestlink
        paginaPrincipal.ingresarIframeTest();
        //interaccion iframe derecho
        paginaIframe.swichFrameDerecho();
        //click en el elemento error page
        paginaIframe.getIframeDerechoInstance().clickErrorPage();
        // click en el elemento error404
        paginaIframe.getIframeDerechoInstance().clickError404();
        //comparar el texto obtenido
        Assert.assertEquals("Not Found", paginaIframe.getIframeDerechoInstance().textoError404());
    }

    //punto 3 prueba login exitoso
    @Test
    public void validarLoginExitoso() {
        //abrir url
        chromeDriver.get("http://sahitest.com/demo/training/login.htm");
        //diligenciar campos login
        paginaLogin.diligenciarDatosLogin();
        //click en el boton login
        paginaLogin.clickBotonLogin();
        Assert.assertEquals("http://sahitest.com/demo/training/books.htm",chromeDriver.getCurrentUrl().toString());
    }
    //punto 3  registro de usuario
    @Test
    public void diligenciarCamposFormularioRegistro() {
        // abrir url
        chromeDriver.get("http://sahitest.com/demo/training/login.htm");
        // se llama el metodo para dar click sobre el boton register
        paginaFormulario.clickBotonRegister();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //se llama el metodo para diligenciar el formulario
        paginaFormulario.diligenciarDatosFormulario();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // se llama el metodo para seleccionar opcion de genero
        paginaFormulario.clickSeleccionarGenero();
        // se llama metodo para dar click en aceptar terminos y condiciones
        paginaFormulario.clickAceptarTerminos();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // se llama al metodo que realiza click sobre el boton registrar
        paginaFormulario.clickBotonRegistrar();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //se llama el metodo para cerrar ventana de notificacion
        paginaFormulario.mensajeAlertaRegistroFull();
    }
    //punto 4 prueba canasta de compra
    @Test
    public void realizarCompra() {
        //abrir URL
        chromeDriver.get("http://sahitest.com/demo/training/login.htm");
        //se llaman los metodos
        paginaLogin.diligenciarDatosLogin();
        paginaLogin.clickBotonLogin();
        paginaCompras.limpiarCampos();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        paginaCompras.camposCantidadPreciosLibros();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        paginaCompras.botonCarrito();
        String subTotalLibroJava = paginaCompras.obtenerSubtotalLibroJava();
        String subTotalLibroRuby = paginaCompras.obtenerSubtotalLibroRuby();
        String subTotalLibroPython = paginaCompras.obtenerSubtotalLibroPython();

        //obtener y convertir el texto a entero
        int sumaTotalSubtotales = Integer.parseInt(subTotalLibroJava.substring(3)) + Integer.parseInt(subTotalLibroRuby.substring(3)) + Integer.parseInt(subTotalLibroPython.substring(3));
        System.out.println("estoy imprimiendo:" + paginaCompras.obtenerValorTotal());
        Assert.assertEquals(paginaCompras.obtenerValorTotal(), Integer.toString(sumaTotalSubtotales));
    }

    // punto 5 navegar por cada una de las opciones o links de la pagina principal
    @Test
    public void navegarPorlinksPaginaPrincipal() {
        //abrir url
        chromeDriver.get("http://sahitest.com/demo/index.htm");
        Set<String> listaDeLinks = paginaPrincipal.obtenerListaDelinks();
        listaDeLinks.stream().forEach(
                e -> {
                    paginaPrincipal.abrirLinks(e);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    chromeDriver.navigate().back();
                }
        );
        paginaPrincipal.formTestLink();
        chromeDriver.navigate().back();
        paginaPrincipal.abrirDelayPage();
        chromeDriver.navigate().back();
    }

}
