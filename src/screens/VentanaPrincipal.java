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
    private JMenuItem jMenuItemInsertar;

    public VentanaPrincipal() {
        initComponents();

    }

    private void initComponents() {
        deskop = new JDesktopPane();
        this.add(deskop);
        jMenuBar = new JMenuBar();
        this.add(jMenuBar);
        jMenuAlumnos = new JMenu();
        jMenuAlumnos.setText("Alumnos");
        jMenuItemInsertar = new JMenuItem();
        jMenuItemInsertar.setText("Insertar");
        jMenuAlumnos.add(jMenuItemInsertar);
        jMenuBar.add(jMenuAlumnos);
        this.setJMenuBar(jMenuBar);
        pack();
    }
}
