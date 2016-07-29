//package tommy.lim.PROJECT;//package jason.lau.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jason on 7/25/2016.
 */
public class PurchaseOrder {
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField1;
    private JPanel PO;
    private JButton createButton;
    private int QuotationNumber;
    private String To;
    private String Address;
    private String Description;
    private float Price;
    private int Quantity=0;
    private float Total;
    JFrame frame = new JFrame("Quotation");




    public PurchaseOrder(final Eval eval){
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValues(Integer.parseInt(textField1.getText().toString()), textField6.getText().toString(), textField5.getText().toString(), textField3.getText().toString(), Float.parseFloat(textField4.getText().toString()), Integer.parseInt(textField2.getText().toString()));
                JOptionPane.showMessageDialog(null,"Total "+Total);
                String evalLog = "Quotation Number:"+QuotationNumber+" Description:"+textField3.getText().toString()+" Total Amount:"+Total;
                eval.setData(evalLog);
                eval.init();
                frame.dispose();
            }
        });

    }
    public void init(Eval eval) throws HeadlessException {

        frame.setContentPane(new PurchaseOrder(eval).PO);
        frame.pack();
        frame.setVisible(true);
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
