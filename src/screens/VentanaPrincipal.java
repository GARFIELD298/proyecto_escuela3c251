package screens;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {
    public JDesktopPane deskop; // Escritorio dentre del Frame
    private JMenuBar jMenuBar;
    private JMenu jMenuAlumnos;
    private JMenu jMenuCarreras;
    private JMenuItem jMenuItemInsertar;
    private JMenuItem jMenuItemVerAlumnos;
    private JMenuItem jMenuItemInsertarCarreras;
    private JMenuItem jMenuItemVerCarreras;

    public VentanaPrincipal(String title) {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();

    }

    private void initComponents() {
        deskop = new JDesktopPane();
        this.add(deskop);
        //Barra de menu
        jMenuBar = new JMenuBar();
        this.add(jMenuBar);
        //Menu Alumnos
        jMenuAlumnos = new JMenu();
        jMenuAlumnos.setText("Alumnos");
        //Menu Item Insertar
        jMenuItemInsertar = new JMenuItem();
        jMenuItemInsertar.setText("Insertar...");
        //Elemento para ver alumnos
        jMenuItemVerAlumnos = new JMenuItem();
        jMenuItemVerAlumnos.setText("Ver todos los alumnos...");

        //Menu carreras
        jMenuCarreras = new JMenu();
        jMenuCarreras.setText("Carreras");
        //Elementos de menu: Ver Carreras
        jMenuItemVerCarreras = new JMenuItem();
        jMenuItemVerCarreras.setText("Ver todas las Carreras...");
        //Elemento para insertar carreras
        jMenuItemInsertarCarreras = new JMenuItem();
        jMenuItemInsertarCarreras.setText("Insertar Carrera..");





        //Agregar menuItem a menu
        jMenuAlumnos.add(jMenuItemInsertar);
        jMenuAlumnos.add(jMenuItemVerAlumnos);
        jMenuBar.add(jMenuAlumnos);
        //Agregar menu de carreras al menUBar
        jMenuCarreras.add(jMenuItemVerCarreras);
        jMenuCarreras.add(jMenuItemInsertarCarreras);
        jMenuBar.add(jMenuCarreras);

        this.setJMenuBar(jMenuBar);
        pack();
        
        
    }
}
