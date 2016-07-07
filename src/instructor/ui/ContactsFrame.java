package instructor.ui;

import javax.swing.*;
import java.util.List;

public class ContactsFrame extends JFrame {
  private JPanel mainPanel;
  private JTextArea mainTextArea;

  public ContactsFrame(List<Contact> cList) {
    super("Second Panel");

    String accumulator = "";
    for (Contact c : cList) {
      accumulator += c.toString() + "\n";
    }

    mainTextArea.setText(accumulator);
    this.setContentPane(this.mainPanel);
    this.pack();
  }

}
