import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JLabel lb_nombre;
    private JTextField tf_nombre;
    private JPasswordField tf_contra;
    private JLabel lb_contra;
    private JButton OKButton;
    private JButton borrarButton;
    public JPanel panel;

    public Form1() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = "Alisson";
                String contra = "1234";
                if (tf_contra.getText().equals(contra)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
                }else{
                    JOptionPane.showMessageDialog(null,"La contraseña es incorrecta");
                }
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf_contra.setText("");
                tf_nombre.setText("");
            }
        });
    }
}
