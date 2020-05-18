
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

public class sucheNummer extends JFrame {
  // Anfang Attribute
  private JButton bSuchestarten = new JButton();
  private JLabel lEingabeNummer = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JLabel Ausgabe = new JLabel();
  // Ende Attribute
  
  public sucheNummer() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 562; 
    int frameHeight = 300;
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
    
    bSuchestarten.setBounds(182, 134, 171, 25);
    bSuchestarten.setText("Suche starten");
    bSuchestarten.setMargin(new Insets(2, 2, 2, 2));
    bSuchestarten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSuchestarten_ActionPerformed(evt);
      }
    });
    cp.add(bSuchestarten);
    lEingabeNummer.setBounds(44, 70, 110, 20);
    lEingabeNummer.setText("Eingabe Nummer");
    cp.add(lEingabeNummer);
    jTextField1.setBounds(194, 77, 182, 20);
    cp.add(jTextField1);
    Ausgabe.setBounds(82, 188, 414, 52);
    Ausgabe.setText("");
    cp.add(Ausgabe);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public sucheNummer
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new sucheNummer();
  } // end of main
  
  public void bSuchestarten_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    if(evt.getSource() == this.bSuchestarten){
            bSucheNummerMethode(); 
        }
  } // end of bSuchestarten_ActionPerformed
  public void bSucheNummerMethode()
  {
      Datenbank datenban1= new Datenbank();
      int n= Integer.parseInt(  jTextField1.getText()    );
      try
      {
          datenban1.sucheNummerAnzeige(n);
      }
      catch(Exception e)
      {
           Ausgabe.setText(     e.getMessage()      );
      }
  }

  // Ende Methoden
} // end of class sucheNummer