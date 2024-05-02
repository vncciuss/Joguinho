package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Janela extends JFrame {
    private JTextArea textArea = new JTextArea();
    private PrintWriter terminalWriter;

    public Janela() {
        setTitle("EcoUtopia");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.BLACK);


        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        textArea.setCaretColor(Color.WHITE);
        textArea.setFont(new Font("Courier New", Font.PLAIN, 14));
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        panel.add(scrollPane, BorderLayout.CENTER);

        JTextField barraDeTexto = new JTextField();
        barraDeTexto.setBackground(Color.WHITE);
        barraDeTexto.setForeground(Color.BLACK);
        barraDeTexto.setCaretColor(Color.BLACK);
        barraDeTexto.setFont(new Font("Courier New", Font.PLAIN, 16));
        barraDeTexto.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.GRAY));

        barraDeTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoDigitado = barraDeTexto.getText();
                enviarParaTerminal(textoDigitado);
                barraDeTexto.setText("");
            }
        });

        panel.add(barraDeTexto, BorderLayout.SOUTH);
        add(panel);

        PrintStream terminalStream = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                textArea.append(String.valueOf((char) b));
                textArea.setCaretPosition(textArea.getDocument().getLength());
            }
        });
        System.setOut(terminalStream);

        try {
            PipedOutputStream pipeOut = new PipedOutputStream();
            terminalWriter = new PrintWriter(pipeOut, true);
            System.setIn(new PipedInputStream(pipeOut));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void enviarParaTerminal(String texto) {
        terminalWriter.println(texto);
        textArea.append(texto + "\n");
    }
}
