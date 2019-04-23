package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorForm {
    private double total1=0.0;
    private double total2=0.0;
    private char op;

    public void getOp(String bt) {
        op = bt.charAt(0);
        total1 += Double.parseDouble(display.getText());
        display.setText("");
    }

    private JPanel Calculator;
    private JTextField display;
    private JButton bc;
    private JButton b9;
    private JButton b6;
    private JButton b1;
    private JButton b2;
    private JButton b4;
    private JButton b7;
    private JButton bp;
    private JButton b3;
    private JButton b5;
    private JButton b8;
    private JButton b0;
    private JButton bs;
    private JButton ba;
    private JButton bss;
    private JButton beq;

    public CalculatorForm() {
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b0data =display.getText() + b0.getText();
                display.setText(b0data);
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b1data =display.getText() + b1.getText();
                display.setText(b1data);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b2data =display.getText() + b2.getText();
                display.setText(b2data);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b3data =display.getText() + b3.getText();
                display.setText(b3data);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b4data =display.getText() + b4.getText();
                display.setText(b4data);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b5data =display.getText() + b5.getText();
                display.setText(b5data);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b6data =display.getText() + b6.getText();
                display.setText(b6data);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b7data =display.getText() + b7.getText();
                display.setText(b7data);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b8data =display.getText() + b8.getText();
                display.setText(b8data);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b9data =display.getText() + b9.getText();
                display.setText(b9data);
            }
        });
        ba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = ba.getText();
                getOp(button_text);
            }
        });
        beq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                switch (op){
                    case '+':
                        total2 = total1 + Double.parseDouble(display.getText( ) );
                        break;

                    case '-':
                    total2 = total1 -Double.parseDouble(display.getText( ) );
                    break;
                }
                display.setText( Double.toString(total2) );
                total1 = 0;
                }catch (Exception exception){
                    System.out.println("No input to work with!");
                }
            }
        });
        bc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                total1=total2=0;
            }
        });
        bp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bptext = display.getText() + bp.getText();
                display.setText(bptext);
            }
        });
        bss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = bss.getText();
                getOp(button_text);
            }
        });
        bs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().substring(0, display.getText().length()-1));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorForm");
        frame.setContentPane(new CalculatorForm().Calculator);
        frame.setPreferredSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
