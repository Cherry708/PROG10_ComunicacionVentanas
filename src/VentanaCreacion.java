import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaCreacion extends JDialog{
    private JPanel pnlCreacion;
    private JButton btnCrearPersonaje;
    private JTextField txtNombrePersonaje;
    private JLabel lblNombrePersonaje;

    public VentanaCreacion(ArrayList<String> listaPersonajes){
        setTitle("Ventana Creación Personajes");
        setContentPane(pnlCreacion);
        setBounds(100,100,400,100);
        setVisible(true);

        btnCrearPersonaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                listaPersonajes.add(txtNombrePersonaje.getText());
                JOptionPane.showMessageDialog(null, "Personaje "+
                        txtNombrePersonaje.getText()+" creado correctamente");
            }
        });
    }

}
