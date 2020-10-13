import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlarmClock {
    private JSpinner s1;
    private JSpinner s2;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;
    private JLabel l1;
    private JLabel l2;
    private JPanel Content;
    private JButton b2;
    private JButton b3;

    public AlarmClock() {
        createUIComponents();
    }
    private void createUIComponents() {
        JFrame f = new JFrame();
        f.setTitle("Set Alarm");
        f.setSize(300, 400);
        Content = new JPanel();
        Content.setBounds(100, 100, 300, 400);
        Content.setBackground(new Color(204, 255, 204));
        l1 = new JLabel("hr: ");
        l1.setBounds(50, 90, 50, 30);
        // s1=new JSpinner();
        SpinnerModel value = new SpinnerNumberModel(0, 0, 23, 1);
        s1 = new JSpinner(value);
        s1.setBounds(50, 120, 50, 30);
        t1 = new JTextField("");
        t1.setBounds(50, 70, 50, 18);
        t1.setEditable(false);
        l2 = new JLabel("min: ");
        l2.setBounds(200, 90, 50, 30);
        // s2=new JSpinner();
        SpinnerModel va = new SpinnerNumberModel(0, 0, 59, 1);
        s2 = new JSpinner(va);
        s2.setBounds(200, 120, 50, 30);
        t2 = new JTextField("");
        t2.setBounds(200, 70, 50, 18);
        t2.setEditable(false);
        b1 = new JButton("Set hr");
        b1.setBounds(35, 170, 80, 20);
        b2 = new JButton("Set min");
        b2.setBounds(185, 170, 80, 20);
        b3 = new JButton("More");
        b3.setBounds(113, 250, 70, 20);

        Content.add(l1);
        Content.add(l2);
        Content.add(t1);
        Content.add(t2);
        Content.add(s1);
        Content.add(s2);
        Content.add(b1);
        Content.add(b2);
        Content.add(b3);
        f.setContentPane(Content);
        f.setLayout(null);
        f.setVisible(true);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText(s1.getValue().toString());
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2.setText(s2.getValue().toString());
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleAudioPlayer.vain();

            }
        });

    }}




