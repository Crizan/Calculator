/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing_2;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author krijan
 */
public class Calculator_UI extends JFrame {

    JTextField tf = new JTextField();

    JTextField tf1 = new JTextField();
    JLabel ta = new JLabel("Ans: ");

    Calculator_UI() {
        UI();
    }

    public void UI() {
        setSize(286, 350);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");
        head();
        down();
    }

    void head() {
        tf.setBounds(20, 10, 230, 40);
        ta.setBounds(10, 56, 60, 20);
        tf1.setBounds(40, 50, 210, 40);
        add(tf);
        add(ta);
        add(tf1);
    }

    String addition(String a) {

        String[] parts = a.split("\\+");
        double numm[] = new double[9];
        double num = 0;
        for (int i = 0; i < parts.length; i++) {
            numm[i] = Double.parseDouble(parts[i].replaceAll("\\s", ""));
        }
        for (int i = 0; i < parts.length; i++) {
            num = num + numm[i];
        }
        System.out.println(num);
        String num1 = String.valueOf(num);
        return num1;
    }

    void addition(String[] parts) {
        try {

            for (int j = 0; j < parts.length; j++) {
                System.out.println("parts[" + j + "] =" + parts[j]);
                if (parts[j].indexOf("-") != -1) {
                    parts[j] = subt(parts[j]);
                }
                if (parts[j].indexOf("*") != -1) {
                    parts[j] = mul(parts[j]);
                }
                if (parts[j].indexOf("/") != -1) {
                    parts[j] = div(parts[j]);
                }
            }
            double numm[] = new double[9];
            double num = 0;
            for (int i = 0; i < parts.length; i++) {
                numm[i] = Double.parseDouble(parts[i].replaceAll("\\s", ""));
            }
            for (int i = 0; i < parts.length; i++) {
                num = num + numm[i];
            }
            System.out.println(num);
            tf1.setText(String.valueOf(num));

        } catch (NumberFormatException ex) {
            System.out.println(ex);
            tf1.setText("Error");
        }
    }

    String subt(String a) {

        String[] parts = a.split("\\-");
        if (parts[0].length() == 0) {
            parts[0] = "0";
        }

        double numm[] = new double[9];

        for (int i = 0; i < parts.length; i++) {
            numm[i] = Double.parseDouble(parts[i].replaceAll("\\s", ""));
        }

        double num = numm[0];
        for (int i = 1; i < parts.length; i++) {
            num = num - numm[i];
        }
        System.out.println(num);
        String num1 = String.valueOf(num);
        return num1;
    }

    void subt(String[] parts) {
        try {
            if (parts[0].length() == 0) {
                parts[0] = "0";
            }
            for (int j = 0; j < parts.length; j++) {
                System.out.println("parts[" + j + "] =" + parts[j]);

                if (parts[j].indexOf("+") != -1) {
                    int a=1/0;
                }
                
                if (parts[j].indexOf("*") != -1) {
                    parts[j] = mul(parts[j]);
                }

                if (parts[j].indexOf("/") != -1) {
                    parts[j] = div(parts[j]);
                }

            }
            double numm[] = new double[9];

            for (int i = 0; i < parts.length; i++) {
                numm[i] = Double.parseDouble(parts[i].replaceAll("\\s", ""));
            }

            double num = numm[0];
            for (int i = 1; i < parts.length; i++) {
                num = num - numm[i];
            }
            System.out.println(num);
            tf1.setText(String.valueOf(num));
            parts[0] = "";
        } catch (NumberFormatException ex) {
            System.out.println(ex);
            tf1.setText("Error");
        }
    }

    String mul(String a) {

        String[] parts = a.split("\\*");
        double numm[] = new double[9];
        for (int i = 0; i < parts.length; i++) {
            numm[i] = Double.parseDouble(parts[i].replaceAll("\\s", ""));

        }
        double num = 1;
        for (int i = 0; i < parts.length; i++) {
            num = num * numm[i];
        }
        String num1 = String.valueOf(num);
        return num1;
    }

    void mul(String[] parts) {
        try {
            for (int j = 0; j < parts.length; j++) {
                System.out.println("parts[" + j + "] =" + parts[j]);

                if (parts[j].indexOf("/") != -1) {
                    parts[j] = div(parts[j]);
                }
            }
            double numm[] = new double[9];
            for (int i = 0; i < parts.length; i++) {
                numm[i] = Double.parseDouble(parts[i].replaceAll("\\s", ""));

            }
            double num = 1;
            for (int i = 0; i < parts.length; i++) {
                num = num * numm[i];
            }
            System.out.println(num);
            tf1.setText(String.valueOf(num));

        } catch (NumberFormatException ex) {
            System.out.println(ex);
            tf1.setText("Error");
        }
    }

    String div(String a) {

        String[] parts = a.split("\\/");
        double numm[] = new double[9];
        for (int i = 0; i < parts.length; i++) {
            numm[i] = Double.parseDouble(parts[i].replaceAll("\\s", ""));
        }
        double num = numm[0];
        for (int i = 1; i < parts.length; i++) {
            num = num / numm[i];
        }
        String num1 = String.valueOf(num);
        return num1;
    }

    void div(String[] parts) {
        try {
            for (int j = 0; j < parts.length; j++) {
                System.out.println("parts[" + j + "] =" + parts[j]);
            }
            double numm[] = new double[9];
            for (int i = 0; i < parts.length; i++) {
                numm[i] = Double.parseDouble(parts[i].replaceAll("\\s", ""));
            }
            double num = numm[0];
            for (int i = 1; i < parts.length; i++) {
                num = num / numm[i];
            }
            System.out.println(num);
            tf1.setText(String.valueOf(num));

        } catch (NumberFormatException ex) {
            System.out.println(ex);
            tf1.setText("Error");
        }
    }

    void down() {
        JButton b1 = new JButton("1");
        b1.setBounds(20, 100, 50, 30);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b1.getText());
            }
        });

        JButton b2 = new JButton("2");
        b2.setBounds(80, 100, 50, 30);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b2.getText());
            }
        });

        JButton b3 = new JButton("3");
        b3.setBounds(140, 100, 50, 30);
        add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b3.getText());
            }
        });

        JButton b4 = new JButton("4");
        b4.setBounds(20, 140, 50, 30);
        add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b4.getText());
            }
        });

        JButton b5 = new JButton("5");
        b5.setBounds(80, 140, 50, 30);
        add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b5.getText());
            }
        });

        JButton b6 = new JButton("6");
        b6.setBounds(140, 140, 50, 30);
        add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b6.getText());
            }
        });

        JButton b7 = new JButton("7");
        b7.setBounds(20, 180, 50, 30);
        add(b7);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b7.getText());
            }
        });

        JButton b8 = new JButton("8");
        b8.setBounds(80, 180, 50, 30);
        add(b8);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b8.getText());
            }
        });

        JButton b9 = new JButton("9");
        b9.setBounds(140, 180, 50, 30);
        add(b9);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b9.getText());
            }
        });

        JButton b10 = new JButton(".");
        b10.setBounds(20, 220, 50, 30);
        add(b10);
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b10.getText());
            }
        });

        JButton b11 = new JButton("0");
        b11.setBounds(80, 220, 50, 30);
        add(b11);
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b11.getText());
            }
        });

        JButton b12 = new JButton("/");
        b12.setBounds(140, 220, 50, 30);
        add(b12);
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b12.getText());
            }
        });

        JButton b13 = new JButton("<<");
        b13.setBounds(200, 100, 50, 30);
        add(b13);
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (tf.getText().length() != 0) {
                    tf.setText(tf.getText().substring(0, tf.getText().length() - 1));
                }
            }
        });

        JButton b14 = new JButton("*");
        b14.setBounds(200, 140, 50, 30);
        add(b14);
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b14.getText());
            }
        });

        JButton b15 = new JButton("-");
        b15.setBounds(200, 180, 50, 30);
        add(b15);
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b15.getText());
            }
        });

        JButton b16 = new JButton("+");
        b16.setBounds(200, 220, 50, 30);
        add(b16);
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + b16.getText());
            }
        });

        JButton b17 = new JButton("=");
        b17.setBounds(200, 260, 50, 30);
        add(b17);
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (tf.getText().indexOf("/") != -1) {
                    //Divide
                    String[] parts2 = tf.getText().split("\\/");
                    div(parts2);
                }
                if (tf.getText().indexOf("*") != -1) {
                    //Multiply
                    String[] parts3 = tf.getText().split("\\*");
                    mul(parts3);
                }
                if (tf.getText().indexOf("+") != -1) {
                    //Add
                    String[] parts4 = tf.getText().split("\\+");
                    addition(parts4);
                }
                if (tf.getText().indexOf("-") != -1) {
                    //Subtract
                    String[] parts1 = tf.getText().split("\\-");
                    for (int i = 0; i < parts1.length; i++) {
                        if (parts1[i].indexOf("*") != -1) {
                            String[] parts5 = parts1[i].split("\\*");
                            if (parts5[1].length() == 0) {
                                break;
                            }
                        }
                    }
                    subt(parts1);
                }
            }
        });

        JButton b18 = new JButton("c");
        b18.setBounds(140, 260, 50, 30);
        add(b18);
        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });

        JButton b19 = new JButton("Ans");
        b19.setBounds(70, 260, 60, 30);
        add(b19);
        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf1.getText());
            }
        });
    }
}
