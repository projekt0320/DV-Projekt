
              
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
    int frameWidth = 700; 
    int frameHeight = 600;
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
    
    bSuchestarten.setBounds(250, 135, 175, 25);
    bSuchestarten.setText("Suche starten");
    bSuchestarten.setMargin(new Insets(2, 2, 2, 2));
    bSuchestarten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSuchestarten_ActionPerformed(evt);
      }
    });
    bSuchestarten.setHorizontalTextPosition(SwingConstants.RIGHT);
    bSuchestarten.setVerticalAlignment(SwingConstants.CENTER);
    bSuchestarten.setVerticalTextPosition(SwingConstants.CENTER);
    cp.add(bSuchestarten);
    lEingabeNummer.setBounds(50, 80, 110, 20);
    lEingabeNummer.setText("Eingabe Nummer");
    cp.add(lEingabeNummer);
    jTextField1.setBounds(195, 80, 250, 20);
    cp.add(jTextField1);
    Ausgabe.setBounds(50, 220, 500, 500);
    Ausgabe.setVerticalAlignment(SwingConstants.TOP);
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
    int n=-1;
    //fehlerhafter Datentyp oder keine Eingabe
    try
    {
          n= Integer.parseInt(  jTextField1.getText()    );
    }
    catch(Exception e)
    {
          Ausgabe.setText("Fehlerhafte Eingabe");
    }
    if(n!=-1)
    {
        try
        {
              String s=datenban1.sucheNummerAnzeige(n);
              Ausgabe.setText(s);
        }
        catch(Exception e)
        {
           Ausgabe.setText(     e.getMessage()      );
        }
    }
  }
  

  // Ende Methoden
} // end of class sucheNummer