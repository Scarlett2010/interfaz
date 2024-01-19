import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datos extends JFrame{
    private JPanel panel1;
    private JTextField txtval1;
    private JTextField txtval2;
    private JButton cerrarButton;
    private JButton unionButton;
    private JButton saludoButton;
    private JLabel textval2;
    private JButton limpiar;
    private JTextField resultado;
    private JButton letras;
    private JTextField union1;

    public datos(){
        super("Operaciones");
        setContentPane(panel1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtval1.setText(" ");
                txtval2.setText(" ");
            }
        });
        unionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double val1 = Double.parseDouble(txtval1.getText());
                    double val2 = Double.parseDouble(txtval2.getText());
                    double recibe_resultado = val1 + val2;
                    resultado.setText(Double.toString(recibe_resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"Error: Ingresa un número válido");
                }
            }
        });

        letras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtval1.getText() + txtval2.getText();
                union1.setText(union);
            }
        });

    }
}
