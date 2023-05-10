import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class busquedaBinaria extends JFrame {


    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton empezarButton;
    private JTextArea textArea1;

    private busqueda b;

    public busquedaBinaria(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        b = new busqueda();


        empezarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(b.calcularTiempo());
            }
        });
    }
}