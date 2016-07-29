//package tommy.lim.PROJECT;//package jason.lau.Project;

import javax.swing.*;
import java.awt.event.*;


/**
 * Created by Jason on 7/25/2016.
 */
public class MainMenu extends JFrame {
    private JButton CreatePO;
    private JButton View;
    private JButton RequestRawMats;
    private JPanel MainMenu;
    JFrame frame = new JFrame("MainMenu");
    Eval eval=new Eval();

    public MainMenu() {

        CreatePO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PurchaseOrder PO = new PurchaseOrder(eval);
                PO.init(eval);

            }
        });
        RequestRawMats.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raw raw = new Raw(eval);
                raw.init();

            }
        });
        View.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                View view = new View();
                view.init();
            }
        });}

    public void init(){
        frame.setSize(300,300);
        frame.setContentPane(new MainMenu().MainMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
