import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.05.2020
 * @author 
 */

public class Suchen_GUI3 extends JFrame {
  // Anfang Attribute
  private JList jList1 = new JList();
    private DefaultListModel jList1Model = new DefaultListModel();
    private JScrollPane jList1ScrollPane = new JScrollPane(jList1);
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JButton bSuchestarten = new JButton();
  private JTextArea jTextArea2 = new JTextArea("");
    private JScrollPane jTextArea2ScrollPane = new JScrollPane(jTextArea2);
  // Ende Attribute
  
  public Suchen_GUI3() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 470; 
    int frameHeight = 328;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Suchen_GUI3");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jList1.setModel(jList1Model);
    jList1ScrollPane.setBounds(16, 103, 150, 60);
    jList1Model.addElement("Name");
    jList1Model.addElement("Nummer");
    jList1Model.addElement("Verwendung");
    cp.add(jList1ScrollPane);
    jTextArea1ScrollPane.setBounds(15, 61, 128, 36);
    jTextArea1.setText("Suchparameter");
    cp.add(jTextArea1ScrollPane);
    bSuchestarten.setBounds(161, 204, 131, 25);
    bSuchestarten.setText("Suche starten");
    bSuchestarten.setMargin(new Insets(2, 2, 2, 2));
    bSuchestarten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSuchestarten_ActionPerformed(evt);
      }
    });
    cp.add(bSuchestarten);
    jTextArea2ScrollPane.setBounds(200, 104, 185, 33);
    cp.add(jTextArea2ScrollPane);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Suchen_GUI3
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Suchen_GUI3();
  } // end of main
  
  public void bSuchestarten_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bSuchestarten_ActionPerformed

  // Ende Methoden
} // end of class Suchen_GUI3