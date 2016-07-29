import java.awt.*; 
import javax.swing.*; 


public class Image extends JFrame
{    
  public Image(String path){
     this.setVisible(true);
     this.setSize(500,500);
    JPanel panel = new JPanel(); 
    panel.setSize(500,500);
    panel.setBackground(Color.BLACK); 
    ImageIcon icon = new ImageIcon(path); 
    JLabel label = new JLabel(); 
    label.setIcon(icon); 
    panel.add(label);
    this.getContentPane().add(panel);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  
}
}