/*import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class GalleryApp {
   // private User user1;
    
    public static void main(String[] args) {
        
        new GalleryApp();
    }

    
    public GalleryApp()
    {
    	//  user1=new User();
        JFrame galFrame = new JFrame();
        JTextField textuser, textpass;
        
        textuser = new JTextField(10);
        textpass = new JTextField(10);
       // container.add(textuser);
      //  container.add(textpass);
        
        
        
        
        
        
        
        
        //make sure the program exits when the frame closes
        galFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        galFrame.setTitle("Gallery App");
        galFrame.setSize(300,250);
      
        //This will center the JFrame in the middle of the screen
        galFrame.setLocationRelativeTo(null);
        
        //Options for the JComboBox 
        final String[] fruitOptions = {"Apple", "Apricot", "Banana"
                ,"Cherry", "Date", "Kiwi", "Orange", "Pear", "Strawberry"};
        
        //Options for the JList
        String[] vegOptions = {"Asparagus", "Beans", "Broccoli", "Cabbage"
                , "Carrot", "Celery", "Cucumber", "Leek", "Mushroom"
                , "Pepper", "Radish", "Shallot", "Spinach", "Swede"
                , "Turnip"};
        
        //The first JPanel contains a JLabel and JCombobox
        final JPanel comboPanel = new JPanel();
        JLabel comboLbl = new JLabel("Fruits:");
        JComboBox fruits = new JComboBox(fruitOptions);

        comboPanel.add(comboLbl);
        comboPanel.add(fruits);



        JOptionPane.showMessageDialog(null,"fruit: "+fruits.getSelectedItem());
        //Create the second JPanel. Add a JLabel and JList and
        //make use the JPanel is not visible.
        final JPanel listPanel = new JPanel();
        listPanel.setVisible(false);
        JLabel listLbl = new JLabel("Vegetables:");
        JList vegs = new JList(vegOptions);
        vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);
          
        listPanel.add(listLbl);
        listPanel.add(vegs);
        
        JButton vegFruitBut = new JButton( "Fruit or Veg");
        
        //The ActionListener class is used to handle the
        //event that happens when the user clicks the button.
        //As there is not a lot that needs to happen we can 
        //define an anonymous inner class to make the code simpler.
        vegFruitBut.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
               //When the fruit of veg button is pressed
               //the setVisible value of the listPanel and
               //comboPanel is switched from true to 
               //value or vice versa.
               listPanel.setVisible(!listPanel.isVisible());
               comboPanel.setVisible(!comboPanel.isVisible());
                JOptionPane.showMessageDialog(null,"fruit: "+fruits.getSelectedItem());
            }
        });
        
        //The JFrame uses the BorderLayout layout manager.
        //Put the two JPanels and JButton in different areas.
        galFrame.add(comboPanel, BorderLayout.NORTH);
        galFrame.add(listPanel, BorderLayout.CENTER);
        galFrame.add(vegFruitBut,BorderLayout.SOUTH);
        
        //make sure the JFrame is visible
        galFrame.setVisible(true);
    }
       // public void register(){
    	//user1(username,password);
    //	}
}
    
*/