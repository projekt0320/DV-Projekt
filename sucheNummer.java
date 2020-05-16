import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.05.2020
 * @author 
 */

public class sucheNummer extends JFrame {
  // Anfang Attribute
  private JTextArea FeldNummer = new JTextArea("");
    private JScrollPane FeldNummerScrollPane = new JScrollPane(FeldNummer);
  private JTextField tfEingabeName = new JTextField();
  private JButton bSuchestarten = new JButton();
  // Ende Attribute
  
  public sucheNummer() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 450; 
    int frameHeight = 448;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("sucheNummer");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    FeldNummerScrollPane.setBounds(203, 42, 200, 52);
    cp.add(FeldNummerScrollPane);
    tfEingabeName.setBounds(21, 54, 150, 20);
    tfEingabeName.setText("EingabeName");
    cp.add(tfEingabeName);
    bSuchestarten.setBounds(99, 138, 219, 73);
    bSuchestarten.setText("Suche starten");
    bSuchestarten.setMargin(new Insets(2, 2, 2, 2));
    bSuchestarten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSuchestarten_ActionPerformed(evt);
      }
    });
    cp.add(bSuchestarten);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public sucheNummer
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new sucheNummer();
  } // end of main
  
  public void bSuchestarten_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bSuchestarten_ActionPerformed

  // Ende Methoden
} // end of class sucheNummer
