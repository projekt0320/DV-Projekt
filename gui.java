
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 14.05.2020
 * @author 
 */

public class gui extends JFrame {
  // Anfang Attribute
  private JTextField tfWerkstoffdatenbank = new JTextField();
  private JButton bWerksofferstellen = new JButton();
  private JButton bWerkstoffbearbeiten = new JButton();
  private JButton bWerkstoffloeschen = new JButton();
  private JButton bWerkstoffsuchen = new JButton();
  // Ende Attribute
  
  public gui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 718; 
    int frameHeight = 588;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("gui");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    tfWerkstoffdatenbank.setBounds(1, 141, 702, 104);
    tfWerkstoffdatenbank.setToolTipText("hh");
    tfWerkstoffdatenbank.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    tfWerkstoffdatenbank.setText("Werkstoffdatenbank");
    tfWerkstoffdatenbank.setFont(new Font("Dialog", Font.PLAIN, 22));
    tfWerkstoffdatenbank.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(tfWerkstoffdatenbank);
    cp.setBackground(new Color(0xC0C0C0));
    bWerksofferstellen.setBounds(39, 278, 155, 25);
    bWerksofferstellen.setText("Werksoff erstellen");
    bWerksofferstellen.setMargin(new Insets(2, 2, 2, 2));
    bWerksofferstellen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWerksofferstellen_ActionPerformed(evt);
      }
    });
    cp.add(bWerksofferstellen);
    bWerkstoffbearbeiten.setBounds(34, 346, 163, 25);
    bWerkstoffbearbeiten.setText("Werkstoff bearbeiten");
    bWerkstoffbearbeiten.setMargin(new Insets(2, 2, 2, 2));
    bWerkstoffbearbeiten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWerkstoffbearbeiten_ActionPerformed(evt);
      }
    });
    cp.add(bWerkstoffbearbeiten);
    bWerkstoffloeschen.setBounds(32, 385, 163, 25);
    bWerkstoffloeschen.setText("Werkstoff löschen");
    bWerkstoffloeschen.setMargin(new Insets(2, 2, 2, 2));
    bWerkstoffloeschen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWerkstoffloeschen_ActionPerformed(evt);
      }
    });
    cp.add(bWerkstoffloeschen);
    bWerkstoffsuchen.setBounds(31, 313, 171, 25);
    bWerkstoffsuchen.setText("Werkstoff suchen");
    bWerkstoffsuchen.setMargin(new Insets(2, 2, 2, 2));
    bWerkstoffsuchen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWerkstoffsuchen_ActionPerformed(evt);
      }
    });
    cp.add(bWerkstoffsuchen);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public gui
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new gui();
  } // end of main
  
  public void bWerksofferstellen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bWerksofferstellen_ActionPerformed

  public void bWerkstoffbearbeiten_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bWerkstoffbearbeiten_ActionPerformed

  public void bWerkstoffloeschen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bWerkstoffloeschen_ActionPerformed

  public void bWerkstoffsuchen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bWerkstoffsuchen_ActionPerformed

  // Ende Methoden
} // end of class gui
