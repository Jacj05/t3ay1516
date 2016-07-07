package instructor.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class NewContact extends JFrame {
  private JPanel contactRootPanel;
  private JPanel west;
  private JPanel south;
  private JPanel east;
  private JLabel givenNamesLabel;
  private JLabel surnameLabel;
  private JLabel mobileLabel;
  private JLabel emailLabel;
  private JTextField givenNamesTextField;
  private JTextField surnameTextField;
  private JTextField mobileTextField;
  private JTextField emailTextField;
  private JButton addContactButton;
  private JButton cancelButton;

  private final static List<Contact> contactBook = new ArrayList<Contact>();

  public static void main(String[] args) {
    JFrame frame = new JFrame("NewContact");
    frame.setContentPane(new NewContact().contactRootPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    frame.setResizable(false);
  }

  public NewContact() {
    super("Contact Panel");

    addContactButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        contactBook.add(new Contact(givenNamesTextField.getText(), surnameTextField.getText(),
            mobileTextField.getText(), emailTextField.getText()));

        /* for (Contact c : contactBook) {
          JOptionPane.showMessageDialog(null, "Given Name is " + c.getGivenNames(), "Contact",
              JOptionPane.PLAIN_MESSAGE);
        }*/

        ContactsFrame cf = new ContactsFrame(contactBook);
        cf.setVisible(true);
      }
    });
  }
}
