
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

public class sucheName extends JFrame {
  // Anfang Attribute
  private JLabel lEingabeName = new JLabel();
  private JButton bSuchestarten = new JButton();
  private JLabel Ausgabe = new JLabel();
  private JTextField jTextField1 = new JTextField();
  // Ende Attribute
  
  public sucheName() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 700; 
    int frameHeight = 600;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("sucheName");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lEingabeName.setBounds(50, 80, 110, 20);
    lEingabeName.setText("Eingabe Name");
    cp.add(lEingabeName);
    bSuchestarten.setBounds(250, 135, 175, 25);
    bSuchestarten.setText("Suche starten");
    bSuchestarten.setMargin(new Insets(2, 2, 2, 2));
    bSuchestarten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSuchestarten_ActionPerformed(evt);
      }
    });
    cp.add(bSuchestarten);
    Ausgabe.setBounds(59, 220, 500, 500);
    Ausgabe.setVerticalAlignment(SwingConstants.TOP);
    Ausgabe.setText("");
    cp.add(Ausgabe);
    jTextField1.setBounds(195, 80, 250, 20);
    cp.add(jTextField1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public sucheName
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new sucheName();
  } // end of main
  
  public void bSuchestarten_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     if(evt.getSource() == this.bSuchestarten){
            bSucheNameMethode(); 
        }
       
  } // end of bSuchestarten_ActionPerformed
  public void bSucheNameMethode()
  {
      String s= jTextField1.getText();
      Datenbank datenban1= new Datenbank();
      
       try
          {
              String s2= datenban1.sucheNameAnzeige(s);
              Ausgabe.setText(s2);
        }
        catch(Exception e)
        {
             Ausgabe.setText(     e.getMessage()      );
           
        }
  }

  // Ende Methoden
} // end of class sucheName







