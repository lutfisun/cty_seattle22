package com.mycompany.guipractice;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConvert extends JFrame {
    private static final double c_f = 1.8;
    private JTextField _FahrenheitTF = new JTextField(3);
    private JTextField _CelsiusTF   = new JTextField(3);
        public TempConvert() {
            JButton convertBtn = new JButton("Convert");
            convertBtn.addActionListener(new TempConvert.ConvertBtnListener());
            _FahrenheitTF.setEditable(false);


            JPanel content = new JPanel();
            content.setLayout(new FlowLayout());

            content.add(new JLabel("Celsius"));
            content.add(_CelsiusTF);
            content.add(convertBtn);
            content.add(new JLabel("Fahrenheit"));
            content.add(_FahrenheitTF);

            setContentPane(content);
            pack();
            setTitle("Celsius to Fahrenheit Converter");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        } 
        
        class ConvertBtnListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                //... Get the value from the dog years textfield.
                String dyStr = _CelsiusTF.getText();
                double dogYears = Double.parseDouble(dyStr);

                //... Convert it - each dog year is worth 7 human years.
                double humanYears = (dogYears * c_f) + 32;

                //... Convert to string and set human yrs textfield
                _FahrenheitTF.setText("" + humanYears);
        }
    }
    public static void main(String[] args) {
        TempConvert window = new TempConvert();
        window.setVisible(true);
    }
    
}
