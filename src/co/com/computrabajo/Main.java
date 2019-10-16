package co.com.computrabajo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static WebDriver driver;

    public static void main(String[] args) {
        navegarPagina("https://www.computrabajo.com.co");
        verificarHomePage();
        registrarUsuario("Pedro",
                "Perez",
                "omar.navarro@hotmail.com",
                "test1234",
                "QA Automation",
                "Bolivar");
        verificarPaginaDatosPersonales();
        navegarPaginaPrincipal();
        verificarLigaUsuario("Pedro", "Perez");
    }

    private static void navegarPagina(String url) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    private static void verificarHomePage() {
        //encontrar todos estos elementos
//        logoComputrabajo: class=“logo_home"
//        linkLogin: id=“logintoggle"
//        botonIngresarHojaVida: xpath = “//a[@class = ‘submit_n']”

        //verificar que esten desplegaod sne la pantalla
    }

    private static void registrarUsuario(String nombre,
                                         String apellido,
                                         String correo,
                                         String password,
                                         String puesto,
                                         String depto) {

        //entontar este elemento
//        HomePage:
//        botonIngresarHojaVida: xpath = “//a[@class = ‘submit_n’]”

        //darle click

        //encontrar todos estos elementos
//        RegisterPage:
//        campoNombre: id=“AccessModel_Name"
//        campoApellido: id=“AccessModel_SurName”
//        campoCorreo: id=“AccessModel_Email"
//        campoContrasena: id=“AccessModel_Password”
//        campoPuestoTrabajo: id=“AccessModel_Cargo”
//        campoDepartamento: linkText = “Seleccione un departamento”
//        botonUnirse: id=“sbStep1”

        //rellenar el formulario y dar click al boton de Unirse

        



    }

    private static void verificarPaginaDatosPersonales() {
    }

    private static void navegarPaginaPrincipal() {
    }

    private static void verificarLigaUsuario(String nombre,
                                             String apellido) {
    }
}
