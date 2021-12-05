import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenrechnerView {
    private JTextField anzeigeField;
    private JButton nullbutton;
    private JButton einsbutton;
    private JButton zweibutton;
    private JButton dreibutton;
    private JButton vierbutton;
    private JButton fuenfbutton;
    private JButton sechsbutton;
    private JButton siebenbutton;
    private JButton achtbutton;
    private JButton neunbutton;
    private JPanel rechnerPanel;
    private JButton geteiltbutton;
    private JButton wurzelbutton;
    private JButton gleichbutton;
    private JButton clearbutton;
    private JButton malbutton;
    private JButton minusbutton;
    private JButton plusbutton;

    public TaschenrechnerView() {
        TaschenrechnerModel model = new TaschenrechnerModel();

        nullbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erweitereAnzeige("0");
            }
        });

        einsbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erweitereAnzeige("1");
            }
        });

        zweibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erweitereAnzeige("2");
            }
        });

        dreibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erweitereAnzeige("3");
            }
        });

        vierbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erweitereAnzeige("4");
            }
        });

        fuenfbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erweitereAnzeige("5");
            }
        });

        sechsbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erweitereAnzeige("6");
            }
        });

        siebenbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erweitereAnzeige("7");
            }
        });

        achtbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erweitereAnzeige("8");
            }
        });

        neunbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erweitereAnzeige("9");
            }
        });

        plusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeigeField.getText()));
                model.setOperator("+");
                anzeigeField.setText("");
            }
        });

        minusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeigeField.getText()));
                model.setOperator("-");
                anzeigeField.setText("");;
            }
        });

        malbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeigeField.getText()));
                model.setOperator("*");
                anzeigeField.setText("");;
            }
        });

        geteiltbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeigeField.getText()));
                model.setOperator("/");
                anzeigeField.setText("");;
            }
        });

        wurzelbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeigeField.getText()));
                model.setOperator("wurzel");
                anzeigeField.setText(Double.toString(model.getErgebnis()));;
            }
        });

        gleichbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setZweiterOperand(Integer.parseInt(anzeigeField.getText()));
                anzeigeField.setText(Integer.toString((int)model.getErgebnis()));
            }
        });

        clearbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeField.setText("");
                model.setErsterOperand(0);
                model.setZweiterOperand(0);
                model.zurücksetzen();
            }
        });
    }

    public void erweitereAnzeige(String zahl){
        anzeigeField.setText(anzeigeField.getText() + zahl);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("TaschenrechnerView");
        frame.setContentPane(new TaschenrechnerView().rechnerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
