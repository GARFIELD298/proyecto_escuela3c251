import screens.VentanaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal("Proyecto Escuela 3C25");
        ventanaPrincipal.setSize(500, 500);
        ventanaPrincipal.setVisible(true);
    }
}