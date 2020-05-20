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
  private JLabel ParameterSuchen = new JLabel();
  // Ende Attribute
  
  public Suchen_GUI() { 
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
    setTitle("Suchen_GUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    ParameterSuchen.setBounds(91, 40, 265, 20);
    ParameterSuchen.setText("Mit welchem Parameter soll gesucht werden?");
    cp.add(ParameterSuchen);
    bSucheNummer.setBounds(250, 100, 150, 30);
    bSucheNummer.setText("Suche Nummer");
    bSucheNummer.setMargin(new Insets(2, 2, 2, 2));
    bSucheNummer.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSucheNummer_ActionPerformed(evt);
      }
    });
    cp.add(bSucheNummer);
    bSucheName.setBounds(250, 140, 150, 30);
    bSucheName.setText("Suche Name");
    bSucheName.setMargin(new Insets(2, 2, 2, 2));
    bSucheName.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSucheName_ActionPerformed(evt);
      }
    });
    cp.add(bSucheName);
    bSucheVerwendung.setBounds(250, 180, 150, 30);
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
    sucheName sname= new sucheName();
  } // end of bSucheName_ActionPerformed

  public void bSucheVerwendung_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    sucheVerwendung sverwendung= new sucheVerwendung();
  } // end of bSucheVerwendung_ActionPerformed

  // Ende Methoden
} // end of class Suchen_GUI
