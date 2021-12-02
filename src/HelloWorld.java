import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HelloWorld {
    private JButton halloButton;
    private JPanel mainPanel;
    private JTextField nameField;
    private JLabel anweisungLabel;
    private JCheckBox informalCheckBox;

    public HelloWorld() {
        halloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean informell = informalCheckBox.isSelected();
                if (!informell){
                    ausgabe("Yo, ");
                } else {
                    ausgabe("Herzlich Willkommen, ");
                }
            }
        });
        nameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Color mintgruen = Color.decode("#ade3d1");
                nameField.setBackground(mintgruen);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                nameField.setBackground(null);
            }
        });
        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean informell = informalCheckBox.isSelected();
                if (!informell){
                    ausgabe("Yo, ");
                } else {
                    ausgabe("Herzlich Willkommen, ");
                }            }
        });
    }

    private void ausgabe(String floskel){
        String name = nameField.getText();
        System.out.println(name);
//                JOptionPane.showMessageDialog(halloButton, "Herzlich Willkommen!");
        JOptionPane.showMessageDialog(halloButton, floskel + name);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
