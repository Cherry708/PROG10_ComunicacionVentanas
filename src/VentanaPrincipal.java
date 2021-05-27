import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

public class VentanaPrincipal {
    private JPanel pnlPrincipal;
    private JButton btnCrearPersonaje;
    private JList lstPersonajes;

    private JDialog ventanaCreacion;

    private ArrayList<String> listaPersonajes;

    public VentanaPrincipal(){
        listaPersonajes = new ArrayList<>();

        DefaultListModel modelo = new DefaultListModel();
        for (String personaje : listaPersonajes){
            modelo.addElement(personaje);
        }
        lstPersonajes.setModel(modelo);

        btnCrearPersonaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ventanaCreacion = new VentanaCreacion(listaPersonajes);
            }
        });

        lstPersonajes.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                DefaultListModel modelo = new DefaultListModel();
                for(String personaje : listaPersonajes){
                    modelo.addElement(personaje);
                }
                lstPersonajes.setModel(modelo);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana Principal");
        frame.setContentPane(new VentanaPrincipal().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,400,100);
        frame.setVisible(true);
    }
}
