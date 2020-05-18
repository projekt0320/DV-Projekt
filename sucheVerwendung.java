
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

public class sucheVerwendung extends JFrame {
  // Anfang Attribute
  private JButton bSuchestarten = new JButton();
  private JLabel Ausgabe = new JLabel();
  private JLabel lEingabeVerwendung = new JLabel();
  private JTextField jTextField1 = new JTextField();
  // Ende Attribute
  
  public sucheVerwendung() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 692; 
    int frameHeight = 443;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("sucheVerwendung");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    bSuchestarten.setBounds(285, 213, 131, 41);
    bSuchestarten.setText("Suche starten");
    bSuchestarten.setMargin(new Insets(2, 2, 2, 2));
    bSuchestarten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSuchestarten_ActionPerformed(evt);
      }
    });
    cp.add(bSuchestarten);
    Ausgabe.setBounds(97, 284, 246, 52);
    Ausgabe.setText("");
    cp.add(Ausgabe);
    lEingabeVerwendung.setBounds(89, 155, 156, 20);
    lEingabeVerwendung.setText("Eingabe Verwendung");
    cp.add(lEingabeVerwendung);
    jTextField1.setBounds(269, 150, 230, 28);
    cp.add(jTextField1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public sucheVerwendung
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new sucheVerwendung();
  } // end of main
  
   public void bSuchestarten_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     if(evt.getSource() == this.bSuchestarten){
            bSucheVerwendungMethode(); 
        }
  } // end of bSuchestarten_ActionPerformed
     public void bSucheVerwendungMethode()
     {
         String s= jTextField1.getText();
          Datenbank datenban1= new Datenbank();
          try
          {
         datenban1.sucheVerwendung(s);
        }
        catch(Exception e)
        {
           Ausgabe.setText(     e.getMessage()      );
        }
    }

  // Ende Methoden
} // end of class sucheVerwendung
