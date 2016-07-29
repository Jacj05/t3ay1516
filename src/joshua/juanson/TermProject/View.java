//package tommy.lim.PROJECT;//package jason.lau.Project;

import javax.swing.*;

/**
 * Created by Jason on 7/25/2016.
 */
public class View {
    private JPanel View;
    private JTable table1;
    private JTable table2;
    JFrame frame = new JFrame("Evaluation");


    public View(){}

    public void init(){

        frame.setContentPane(new View().View);
        frame.pack();
        frame.setVisible(true);
    }
}
