//package jason.lau.Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jason on 7/25/2016.
 */
public class Quotation {
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField1;
    private JPanel Quotation;
    private JButton createButton;
    private JButton cancelButton;
    private int QuotationNumber;
    private String To;
    private String Address;
    private String Description;
    private float Price;
    private int Quantity;
    private float Total;
    JFrame frame = new JFrame("Quotation");
    public void init(){

        frame.setContentPane(new Quotation().Quotation);
        frame.pack();
        frame.setVisible(true);

    }
    public Quotation(){
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValues(Integer.parseInt(textField1.getText().toString()), textField6.getText().toString(), textField5.getText().toString(), textField3.getText().toString(), Float.parseFloat(textField4.getText().toString()), Integer.parseInt(textField2.getText().toString()));
                JOptionPane.showMessageDialog(null,"Total "+Total);
                frame.dispose();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
    }



    public void setValues(int QN, String to, String add, String des, float price, int quantity){
        this.QuotationNumber=QN;
        this.To=to;
        this.Address=add;
        this.Description=des;
        this.Price=price;
        this.Quantity=quantity;
        this.Total=this.Quantity*this.Price;
    }
}
