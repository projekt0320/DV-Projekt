
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
    private JLabel lWerkstoffdatenbank = new JLabel();
    private JButton bWerkstofferstellen = new JButton();
    private JButton bWerkstoffbearbeiten = new JButton();
    private JButton bWerkstoffloeschen = new JButton();
    private JButton bWerkstoffsuchen = new JButton();
    // Ende Attribute

    public gui() { 
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
        setTitle("Werkstoffdatenbank");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        // Anfang Komponenten

        lWerkstoffdatenbank.setBounds(1, 141, 702, 104);
        lWerkstoffdatenbank.setToolTipText("hh");
        lWerkstoffdatenbank.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        lWerkstoffdatenbank.setText("Werkstoffdatenbank");
        lWerkstoffdatenbank.setFont(new Font("Dialog", Font.PLAIN, 22));
        lWerkstoffdatenbank.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(lWerkstoffdatenbank);
        cp.setBackground(new Color(0xC0C0C0));

        bWerkstofferstellen.setBounds(39, 278, 155, 25);
        bWerkstofferstellen.setText("Werkstoff erstellen");
        bWerkstofferstellen.setMargin(new Insets(2, 2, 2, 2));
        bWerkstofferstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Erstellen_GUI erstelle = new Erstellen_GUI();
                }
            }
        );
        cp.add(bWerkstofferstellen);

        bWerkstoffbearbeiten.setBounds(34, 346, 163, 25);
        bWerkstoffbearbeiten.setText("Werkstoff bearbeiten");
        bWerkstoffbearbeiten.setMargin(new Insets(2, 2, 2, 2));
        bWerkstoffbearbeiten.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt) { 
                    Bearbeiten_GUI bearbeiten = new Bearbeiten_GUI();
                }
            });
        cp.add(bWerkstoffbearbeiten);

        bWerkstoffloeschen.setBounds(32, 385, 163, 25);
        bWerkstoffloeschen.setText("Werkstoff löschen");
        bWerkstoffloeschen.setMargin(new Insets(2, 2, 2, 2));
        bWerkstoffloeschen.addActionListener(new ActionListener() 
            { 
                public void actionPerformed(ActionEvent evt){ 
                    Loeschen_GUI loeschen = new Loeschen_GUI();
                }
            });
        cp.add(bWerkstoffloeschen);

        bWerkstoffsuchen.setBounds(31, 313, 171, 25);
        bWerkstoffsuchen.setText("Werkstoff suchen");
        bWerkstoffsuchen.setMargin(new Insets(2, 2, 2, 2));
        bWerkstoffsuchen.addActionListener(new ActionListener() 
            { 
                public void actionPerformed(ActionEvent evt) 
                { 
                    Suchen_GUI suchen= new Suchen_GUI();
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

