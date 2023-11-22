package Proyecto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import javax.swing.*;

public class Interfaz extends JFrame {

    private final JPanel principal;
    private final JPanel encabezado;
    private final JLabel titulo;
    private final JPanel pie;
    private final JPanel cuerpo;
    private final JTextField textoDescifrado;
    private final JLabel indicacionDescifrado;
    private final JTextField entrada;
    private final JLabel indicacionCifrado;
    private final JButton vaciar;
    private final JButton cifrador;
    private final JScrollPane jScrollPane1;
    private final JTextArea salida;
    private final JLabel indicacionCifradoFinal;

    public Interfaz() {
        principal = new JPanel();
        encabezado = new JPanel();
        titulo = new JLabel();
        pie = new JPanel();
        cuerpo = new JPanel();
        textoDescifrado = new JTextField();
        indicacionDescifrado = new JLabel();
        entrada = new JTextField();
        indicacionCifrado = new JLabel();
        vaciar = new JButton();
        cifrador = new JButton();
        jScrollPane1 = new JScrollPane();
        salida = new JTextArea();
        indicacionCifradoFinal = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("RSA a Manuela");
        setResizable(false);

        principal.setBackground(new Color(52, 73, 94)); // Dark Blue

        encabezado.setBackground(new Color(44, 62, 80)); // Darker Gray

        titulo.setFont(new Font("Arial", Font.BOLD, 36)); // Cambié la fuente
        titulo.setForeground(new Color(255, 255, 255)); // White
        titulo.setText("RSA a Manuela");

        GroupLayout encabezadoLayout = new GroupLayout(encabezado);
        encabezado.setLayout(encabezadoLayout);
        encabezadoLayout.setHorizontalGroup(
            encabezadoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(encabezadoLayout.createSequentialGroup()
                    .addGap(357, 357, 357)
                    .addComponent(titulo)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        encabezadoLayout.setVerticalGroup(
            encabezadoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(encabezadoLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(titulo)
                    .addContainerGap(17, Short.MAX_VALUE))
        );

        pie.setBackground(new Color(44, 62, 80)); // Darker Gray

        GroupLayout pieLayout = new GroupLayout(pie);
        pie.setLayout(pieLayout);
        pieLayout.setHorizontalGroup(
            pieLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
        );
        pieLayout.setVerticalGroup(
            pieLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 57, Short.MAX_VALUE)
        );

        cuerpo.setBackground(new Color(149, 165, 166)); // Silver

        textoDescifrado.setEditable(false);
        textoDescifrado.setBackground(new Color(236, 240, 241)); // Lighter Silver
        textoDescifrado.setFont(new Font("Courier New", Font.PLAIN, 18)); // Cambié la fuente
        textoDescifrado.setForeground(new Color(52, 73, 94)); // Dark Blue
        textoDescifrado.setBorder(null);

        indicacionDescifrado.setFont(new Font("Arial", Font.PLAIN, 24)); // Cambié la fuente
        indicacionDescifrado.setForeground(new Color(255, 255, 255)); // White
        indicacionDescifrado.setText("Descifrado");

        entrada.setBackground(new Color(236, 240, 241)); // Lighter Silver
        entrada.setFont(new Font("Courier New", Font.PLAIN, 18)); // Cambié la fuente
        entrada.setForeground(new Color(52, 73, 94)); // Dark Blue
        entrada.setBorder(null);
        entrada.setSelectedTextColor(new Color(52, 73, 94)); // Dark Blue
        entrada.setSelectionColor(new Color(44, 62, 80)); // Darker Gray

        indicacionCifrado.setFont(new Font("Arial", Font.PLAIN, 24)); // Cambié la fuente
        indicacionCifrado.setForeground(new Color(255, 255, 255)); // White
        indicacionCifrado.setText("Texto a cifrar");

        vaciar.setBackground(new Color(63, 81, 181)); // Cambia el color de fondo a azul
        vaciar.setFont(new Font("Arial", Font.BOLD, 18));
        vaciar.setForeground(Color.BLACK); // Cambia el color de la letra a blanco
        vaciar.setText("Borrar");
        vaciar.setBorder(BorderFactory.createRaisedBevelBorder());
        vaciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                vaciarActionPerformed(evt);
            }
        });

        cifrador.setBackground(new Color(63, 81, 181)); // Cambia el color de fondo a azul
        cifrador.setFont(new Font("Arial", Font.BOLD, 18));
        cifrador.setForeground(Color.BLACK); // Cambia el color de la letra a blanco
        cifrador.setText("Cifrar");
        cifrador.setBorder(BorderFactory.createRaisedBevelBorder());
        cifrador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cifradorActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        salida.setEditable(false);
        salida.setBackground(new Color(236, 240, 241)); // Lighter Silver
        salida.setFont(new Font("Courier New", Font.PLAIN, 18)); // Cambié la fuente
        salida.setForeground(new Color(52, 73, 94)); // Dark Blue
        salida.setBorder(null);
        jScrollPane1.setViewportView(salida);

        indicacionCifradoFinal.setFont(new Font("Arial", Font.PLAIN, 24)); // Cambié la fuente
        indicacionCifradoFinal.setForeground(new Color(255, 255, 255)); // White
        indicacionCifradoFinal.setText("Cifrado");

        GroupLayout cuerpoLayout = new GroupLayout(cuerpo);
        cuerpo.setLayout(cuerpoLayout);
        cuerpoLayout.setHorizontalGroup(
            cuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(cuerpoLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addGroup(cuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(cuerpoLayout.createSequentialGroup()
                            .addComponent(indicacionCifradoFinal)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, cuerpoLayout.createSequentialGroup()
                            .addGroup(cuerpoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING)
                                .addGroup(cuerpoLayout.createSequentialGroup()
                                    .addGroup(cuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(entrada, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(indicacionCifrado))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                    .addGroup(cuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(textoDescifrado, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(indicacionDescifrado))))
                            .addGap(63, 63, 63))))
                .addGroup(cuerpoLayout.createSequentialGroup()
                    .addGap(264, 264, 264)
                    .addComponent(cifrador, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                    .addGap(62, 62, 62)
                    .addComponent(vaciar, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cuerpoLayout.setVerticalGroup(
            cuerpoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(cuerpoLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(cuerpoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(indicacionCifrado)
                        .addComponent(indicacionDescifrado))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(cuerpoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(entrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoDescifrado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(indicacionCifradoFinal)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                    .addGroup(cuerpoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cifrador)
                        .addComponent(vaciar))
                    .addGap(22, 22, 22))
        );

        GroupLayout principalLayout = new GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(principalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(encabezado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pie, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(cuerpo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        principalLayout.setVerticalGroup(principalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(encabezado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuerpo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(principal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(principal, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void cifradorActionPerformed(ActionEvent evt) {
        try {
            String mensaje = entrada.getText();
            RSA rsa = new RSA(1024);

            // Generar números primos y claves
            rsa.generarPrimos();
            rsa.generarClaves();

            // Cifrar el mensaje
            BigInteger[] mensajeCifrado = rsa.cifrar(mensaje);

            // Generar texto a partir de los números cifrados
            StringBuilder textoCifrado = new StringBuilder();
            for (BigInteger num : mensajeCifrado) {
                textoCifrado.append(num).append(" ");
            }

            String formattedText = textoCifrado.toString();
            StringBuilder finalText = new StringBuilder();
            int charsPerLine = 75;

            for (int i = 0; i < formattedText.length(); i += charsPerLine) {
                finalText.append(formattedText, i, Math.min(formattedText.length(), i + charsPerLine)).append("\n");
            }

            salida.setText("");
            salida.setText(finalText.toString());

            // Descifrar el mensaje cifrado
            String mensajeDescifrado = rsa.descifrar(mensajeCifrado);

            // Mostrar el mensaje descifrado
            textoDescifrado.setText("");
            textoDescifrado.setText(mensajeDescifrado);
        } catch (Exception e) {
            String mensajeError = "Se produjo un error al cifrar/descifrar el mensaje.\nDetalles: " + e.getMessage();
            JOptionPane.showMessageDialog(this, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void vaciarActionPerformed(ActionEvent evt) {
        entrada.setText("");
        salida.setText("");
        textoDescifrado.setText("");
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            new Interfaz().setVisible(true);
        });
    }
}
