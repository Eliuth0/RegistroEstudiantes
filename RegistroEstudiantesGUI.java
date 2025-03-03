import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// Interfaz gráfica
class RegistroEstudiantesGUI {
    public RegistroEstudiantesGUI() {
        JFrame frame = new JFrame("Registro de Estudiantes");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField();
        JLabel lblEdad = new JLabel("Edad:");
        JTextField txtEdad = new JTextField();
        JLabel lblCalificacion = new JLabel("Calificación:");
        JTextField txtCalificacion = new JTextField();
        JButton btnRegistrar = new JButton("Registrar");
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        frame.add(lblNombre);
        frame.add(txtNombre);
        frame.add(lblEdad);
        frame.add(txtEdad);
        frame.add(lblCalificacion);
        frame.add(txtCalificacion);
        frame.add(btnRegistrar);
        frame.add(new JScrollPane(txtResultado));

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = txtNombre.getText();
                    int edad = Integer.parseInt(txtEdad.getText());
                    double calificacion = Double.parseDouble(txtCalificacion.getText());
                    Estudiante estudiante = new Estudiante(nombre, edad, calificacion);
                    txtResultado.setText(estudiante.toString());
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Error: Ingresa valores numéricos válidos para edad y calificación.");
                } catch (IllegalArgumentException ex) {
                    txtResultado.setText("Error: " + ex.getMessage());
                }
            }
        });

        frame.setVisible(true);
    }
}