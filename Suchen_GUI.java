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

public class Suchen_GUI extends JFrame {
  // Anfang Attribute
  private JButton bSucheNummer = new JButton();
  private JButton bSucheName = new JButton();
  private JButton bSucheVerwendung = new JButton();
  // Ende Attribute
  
  public Suchen_GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Suchen_GUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    bSucheNummer.setBounds(44, 30, 139, 25);
    bSucheNummer.setText("Suche Nummer");
    bSucheNummer.setMargin(new Insets(2, 2, 2, 2));
    bSucheNummer.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSucheNummer_ActionPerformed(evt);
      }
    });
    cp.add(bSucheNummer);
    bSucheName.setBounds(42, 73, 147, 25);
    bSucheName.setText("Suche Name");
    bSucheName.setMargin(new Insets(2, 2, 2, 2));
    bSucheName.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSucheName_ActionPerformed(evt);
      }
    });
    cp.add(bSucheName);
    bSucheVerwendung.setBounds(40, 113, 139, 25);
    bSucheVerwendung.setText("Suche Verwendung");
    bSucheVerwendung.setMargin(new Insets(2, 2, 2, 2));
    bSucheVerwendung.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSucheVerwendung_ActionPerformed(evt);
      }
    });
    cp.add(bSucheVerwendung);
    cp.setBackground(new Color(0xC0C0C0));
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Suchen_GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Suchen_GUI();
  } // end of main
  
  public void bSucheNummer_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    sucheNummer snummer= new sucheNummer();
  } // end of bSucheNummer_ActionPerformed

  public void bSucheName_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bSucheName_ActionPerformed

  public void bSucheVerwendung_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bSucheVerwendung_ActionPerformed

  // Ende Methoden
} // end of class Suchen_GUI
