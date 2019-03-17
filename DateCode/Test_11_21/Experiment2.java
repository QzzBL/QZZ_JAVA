/**
 * @ClassName Test1
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/21 14:12
 * @Title 愿上苍有好生之德
 * @Description:
 **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Experiment2 extends JFrame{

    JFrame jf = new JFrame("计算");
    JTextField jtf_1 = new JTextField(15);
    JTextField jtf_2 = new JTextField(15);
    JTextField jtf_3 = new JTextField(15);
    JButton jb_1 = new JButton("+");
    JButton jb_2 = new JButton("-");
    JButton jb_3 = new JButton("*");
    JButton jb_4 = new JButton("/");
    int result = 0;
    public Experiment2() {
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setSize(400, 300);
        jf.setLayout(new FlowLayout());
        jtf_1.setFont(new Font("楷体", Font.PLAIN,45));
        jtf_2.setFont(new Font("楷体", Font.PLAIN,45));
        jtf_3.setFont(new Font("楷体", Font.PLAIN,45));
        jb_1.setFont(new Font("楷体", Font.PLAIN,45));
        jb_2.setFont(new Font("楷体", Font.PLAIN,45));
        jb_3.setFont(new Font("楷体", Font.PLAIN,45));
        jb_4.setFont(new Font("楷体", Font.PLAIN,45));
        jb_1.setBorderPainted(false);
        jb_2.setBorderPainted(false);
        jb_3.setBorderPainted(false);
        jb_4.setBorderPainted(false);
        jf.add(jtf_1);
        jf.add(jtf_2);
        jf.add(jtf_3);
        jf.add(jb_1);
        jf.add(jb_2);
        jf.add(jb_3);
        jf.add(jb_4);
        jb_1.addActionListener(add);
        jb_2.addActionListener(sub);
        jb_3.addActionListener(mul);
        jb_4.addActionListener(div);
    }
    public ActionListener add = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int value1 = Integer.parseInt(jtf_1.getText().trim());
            int value2 = Integer.parseInt(jtf_2.getText().trim());
            jtf_3.setText(String.valueOf(value1+value2));
        }
    };
    public ActionListener sub = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int value1 = Integer.parseInt(jtf_1.getText().trim());
            int value2 = Integer.parseInt(jtf_2.getText().trim());
            jtf_3.setText(String.valueOf(value1-value2));
        }
    };
    public ActionListener mul = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int value1 = Integer.parseInt(jtf_1.getText().trim());
            int value2 = Integer.parseInt(jtf_2.getText().trim());
            jtf_3.setText(String.valueOf(value1*value2));
        }
    };
    public ActionListener div = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int value1 = Integer.parseInt(jtf_1.getText().trim());
            int value2 = Integer.parseInt(jtf_2.getText().trim());
            jtf_3.setText(String.valueOf(value1/value2));
        }
    };
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        new Experiment2();
    }

}

