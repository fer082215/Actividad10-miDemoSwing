import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class miVentana extends JFrame {
    private JPanel miPanel;
    private JTextField cajaTextoNombre;
    private JButton botonSaludar;
    private JLabel lblNombre;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSuma;
    private JTextField txtSumaResult;
    private JLabel lblResultados;
    private JLabel lblOperaciones;
    private JButton btnResta;
    private JButton btnMultiplicacion;
    private JButton btnDivision;
    private JLabel lblTitulo;


    public miVentana() {
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = cajaTextoNombre.getText();
                JOptionPane.showMessageDialog(miPanel, "¡Hola, " +n + "! :)");
            }
        });

        //Color cuando el cursor pasa por las cajas de texto para ingresar los números
        //También color el cursor sale
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum1.setBackground(Color.PINK);
            }
                @Override
            public void mouseExited(MouseEvent e) {
                txtNum1.setBackground(Color.WHITE);
            }
        });
        txtNum2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum2.setBackground(Color.PINK);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                txtNum2.setBackground(Color.WHITE);
            }
        });

        //Botón para sumar
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Convertir los números ingresados (que son String) al tipo double
                //y almacenarlos en variables (a y b)
                try{
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double suma = a+b;
                txtSumaResult.setText("El resultado es: " + String.valueOf(suma));
                } catch (NumberFormatException ex)
                {
                    // Muestra un cuadro de diálogo si ocurre un error en la conversión
                    JOptionPane.showMessageDialog(miPanel,
                            "Ingrese números válidos para realizar la operación.",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //Botón para restar
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Convertir los números ingresados (que son String) al tipo double
                //y almacenarlos en variables (a y b)
                try{
                    double a = Double.parseDouble(txtNum1.getText());
                    double b = Double.parseDouble(txtNum2.getText());
                    double resta = a-b;
                    txtSumaResult.setText("El resultado es: " + String.valueOf(resta));
                } catch (NumberFormatException ex)
                {
                    // Muestra un cuadro de diálogo si ocurre un error en la conversión
                    JOptionPane.showMessageDialog(miPanel,
                            "Ingrese números válidos para realizar la operación.",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //Botón para multiplicar
        btnMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Convertir los números ingresados (que son String) al tipo double
                //y almacenarlos en variables (a y b)
                try{
                    double a = Double.parseDouble(txtNum1.getText());
                    double b = Double.parseDouble(txtNum2.getText());
                    double multiplicacion = a*b;
                    txtSumaResult.setText("El resultado es: " + String.valueOf(multiplicacion));
                } catch (NumberFormatException ex)
                {
                    // Muestra un cuadro de diálogo si ocurre un error en la conversión
                    JOptionPane.showMessageDialog(miPanel,
                            "Ingrese números válidos para realizar la operación.",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //Botón para dividir

        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Convertir los números ingresados (que son String) al tipo double
                //y almacenarlos en variables (a y b)
                try{
                    double a = Double.parseDouble(txtNum1.getText());
                    double b = Double.parseDouble(txtNum2.getText());
                    double division = a/b;
                    txtSumaResult.setText("El resultado es: " + String.valueOf(division));
                } catch (NumberFormatException ex)
                {
                    // Muestra un cuadro de diálogo si ocurre un error en la conversión
                    JOptionPane.showMessageDialog(miPanel,
                            "Ingrese números válidos para realizar la operación.",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        miVentana v = new miVentana(); //Crear objeto (ventana) de la clase miVentana que está en JFrame
        v.setContentPane(v.miPanel); //El contenedor (panel) que está dentro de la ventana
        v.setSize(500,500);//Metodo que recibe parametros enteros sobre el tamaño (pixeles)
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
