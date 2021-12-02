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

    public TaschenrechnerView() {
        TaschenrechnerModel model = new TaschenrechnerModel()

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
