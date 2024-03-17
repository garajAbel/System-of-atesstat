import javax.swing.*;
import java.awt.*;
public class CollegeAttestat {
    private static JFrame frame = new JFrame("College attest");
    public CollegeAttestat(){
        JPanel panel = new JPanel();
        JLabel name1 = new JLabel("name of the student");
        JTextField name = new JTextField();
        JLabel res_ = new JLabel("balls of student");
        JTextField n1 = new JTextField();
        JTextField n2 = new JTextField();
        JTextField n3 = new JTextField();
        name.setPreferredSize(new Dimension(100,20));
        n1.setPreferredSize(new Dimension(100,20));
        n2.setPreferredSize(new Dimension(100,20));
        n3.setPreferredSize(new Dimension(100,20));
        JTextField res = new JTextField();
        res.setEditable(false);
        JLabel table = new JLabel("result:");
        res.setPreferredSize(new Dimension(100,20));
        JButton btn = new JButton("submit");
        JPanel panel2 = new JPanel();
        btn.addActionListener(e ->{
//            new Student();
            int n1_ = Integer.parseInt(n1.getText());
            int n2_ = Integer.parseInt(n2.getText());
            int n3_ = Integer.parseInt(n3.getText());
            Student student = new Student(name.getText(),n1_,n2_,n3_);
            int res2 = student.getAttestate();
            res.setText(res2 + "");
            JLabel result = new JLabel("name :" + name.getText() + " n1:" + n1_ + " n2:" + n2_ + " n3:" + n3_ + " H:" + res2);
            panel2.add(result);
            frame.validate();
            frame.repaint();
        });
        panel.add(name1);
        panel.add(name);
        panel.add(res_);
        panel.add(n1);
        panel.add(n2);
        panel.add(n3);
        panel.add(btn);
        panel.add(table);
        panel.add(res);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,1));
        frame.add(panel);
        frame.add(panel2);
        frame.setSize(400,200);
        frame.setVisible(true);
    }
}
