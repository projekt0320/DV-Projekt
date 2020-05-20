
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

public class gesamt_GUI extends JFrame {

    // Anfang Attribute
    private JLabel lWerkstoffdatenbank = new JLabel();
    private JButton bWerkstofferstellen = new JButton();
    private JButton bWerkstoffbearbeiten = new JButton();
    private JButton bWerkstoffloeschen = new JButton();
    private JButton bWerkstoffsuchen = new JButton();

    private JButton bStahlerstellen = new JButton();
    private JButton bGusseisenerstellen = new JButton();
    private JButton bLeichtmetalleerstellen = new JButton();
    private JButton bSchwermetalleerstellen = new JButton();
    private JButton bHalbleitererstellen = new JButton();
    private JButton bKeramikerstellen = new JButton();
    private JButton bKunststofferstellen = new JButton();
    private JButton bNaturstofferstellen = new JButton();

    private JLabel lName;
    private JLabel lNummer;
    private JLabel lVerwendung;
    private JLabel lElektrLeitf;
    private JLabel lEisengehalt;
    private JLabel lKohlenstoffgehalt;

    private JTextField tName;
    private JTextField tNummer;
    private JTextField tVerwendung;
    private JTextField tElektrLeitf;
    private JTextField tEisengehalt;
    private JTextField tKohlenstoffgehalt;
    Datenbank datenbank = new Datenbank();

    private JLabel lFertig;
    private JButton erstellen = new JButton();

    // Ende Attribute

    public gesamt_GUI() { 
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

        lWerkstoffdatenbank.setBounds(130, 90, 400, 104);
        lWerkstoffdatenbank.setToolTipText("");
        lWerkstoffdatenbank.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        lWerkstoffdatenbank.setText("Werkstoffdatenbank");
        lWerkstoffdatenbank.setFont(new Font("Dialog", Font.PLAIN, 22));
        lWerkstoffdatenbank.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(lWerkstoffdatenbank);
        cp.setBackground(new Color(0xC0C0C0));

        bWerkstofferstellen.setBounds(250, 230, 150, 30);
        bWerkstofferstellen.setText("Werkstoff erstellen");
        bWerkstofferstellen.setMargin(new Insets(2, 2, 2, 2));
        bWerkstofferstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    
                    cp.removeAll();
                    Erstellen_GUI();
                }
            }
        );
        cp.add(bWerkstofferstellen);

        bWerkstoffbearbeiten.setBounds(250, 310, 150, 30);
        bWerkstoffbearbeiten.setText("Werkstoff bearbeiten");
        bWerkstoffbearbeiten.setMargin(new Insets(2, 2, 2, 2));
        bWerkstoffbearbeiten.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    Bearbeiten_GUI bearbeiten = new Bearbeiten_GUI();
                }
            });
        cp.add(bWerkstoffbearbeiten);

        bWerkstoffloeschen.setBounds(250, 350, 150, 30);
        bWerkstoffloeschen.setText("Werkstoff löschen");
        bWerkstoffloeschen.setMargin(new Insets(2, 2, 2, 2));
        bWerkstoffloeschen.addActionListener(new ActionListener() 
            { 
                public void actionPerformed(ActionEvent evt){ 
                    Loeschen_GUI loeschen = new Loeschen_GUI();
                }
            });
        cp.add(bWerkstoffloeschen);

        bWerkstoffsuchen.setBounds(250, 270, 150, 30);
        bWerkstoffsuchen.setText("Werkstoff suchen");
        bWerkstoffsuchen.setMargin(new Insets(2, 2, 2, 2));
        bWerkstoffsuchen.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    Suchen_GUI suchen= new Suchen_GUI();
                }
            });
        cp.add(bWerkstoffsuchen);
        // Ende Komponenten

        setVisible(true);
    } // end of public gui

    // Anfang Methoden

    public static void main(String[] args) {
        new gesamt_GUI();
    } // end of main

    public void Erstellen_GUI()
    {
        
        
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Erstellen");
        setResizable(false);
        setSize(700, 600);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        setVisible(true);

        bStahlerstellen.setText("Stahl erstellen");
        bStahlerstellen.setMargin(new Insets(2, 2, 2, 2));
        bStahlerstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Stahlerstellen_GUI();
                }
            }
        );
        c.add(bStahlerstellen);

        bGusseisenerstellen.setText("Gusseisen erstellen");
        bGusseisenerstellen.setMargin(new Insets(2, 2, 2, 2));
        bGusseisenerstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 

                }
            }
        );
        c.add(bGusseisenerstellen);

        bLeichtmetalleerstellen.setText("Leichtmetall erstellen");
        bLeichtmetalleerstellen.setMargin(new Insets(2, 2, 2, 2));
        bLeichtmetalleerstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 

                }
            }
        );
        c.add(bLeichtmetalleerstellen);

        bSchwermetalleerstellen.setText("Schwermetall erstellen");
        bSchwermetalleerstellen.setMargin(new Insets(2, 2, 2, 2));
        bSchwermetalleerstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 

                }
            }
        );
        c.add(bSchwermetalleerstellen);

        bHalbleitererstellen.setText("Halbleiter erstellen");
        bHalbleitererstellen.setMargin(new Insets(2, 2, 2, 2));
        bHalbleitererstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 

                }
            }
        );
        c.add(bHalbleitererstellen);

        bKeramikerstellen.setText("keramischen Werkstoff erstellen");
        bKeramikerstellen.setMargin(new Insets(2, 2, 2, 2));
        bKeramikerstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 

                }
            }
        );
        c.add(bKeramikerstellen);

        bKunststofferstellen.setText("Kunststoff erstellen");
        bKunststofferstellen.setMargin(new Insets(2, 2, 2, 2));
        bKunststofferstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 

                }
            }
        );
        c.add(bKunststofferstellen);

        bNaturstofferstellen.setText("Naturstoff erstellen");
        bNaturstofferstellen.setMargin(new Insets(2, 2, 2, 2));
        bNaturstofferstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 

                }
            }
        );
        c.add(bNaturstofferstellen);

        setVisible(true);
    }

    public void Stahlerstellen_GUI()
    {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Stahl erstellen");
        setResizable(false);
        setSize(700, 600);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

        lName=new JLabel ("Name:");
        lNummer=new JLabel ("Nummer:");
        lVerwendung=new JLabel ("Verwendung:");
        lElektrLeitf=new JLabel ("Elektrische Leitfähigkeit:");
        lEisengehalt=new JLabel ("Eisengehalt:");
        lKohlenstoffgehalt=new JLabel ("Kohlenstoffgehalt:");

        tName=new JTextField(10);
        tNummer=new JTextField(10);
        tVerwendung=new JTextField(10);
        tElektrLeitf=new JTextField(10);
        tEisengehalt=new JTextField(10);
        tKohlenstoffgehalt=new JTextField(10);

        c.add(lName);
        c.add(tName);
        c.add(lNummer);
        c.add(tNummer);
        c.add(lVerwendung);
        c.add(tVerwendung);
        c.add(lElektrLeitf);
        c.add(tElektrLeitf);
        c.add(lEisengehalt);
        c.add(tEisengehalt);
        c.add(lKohlenstoffgehalt);
        c.add(tKohlenstoffgehalt);

        erstellen.setText("erstellen");
        erstellen.setMargin(new Insets(2, 2, 2, 2));
        erstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Stahlerstellen_ActionPerformed(evt);
                }
            }
        );

        c.add(erstellen);

        lFertig = new JLabel();
        lFertig.setText("");
        c.add(lFertig);
        setVisible(true);
    }

    public void Stahlerstellen_ActionPerformed(ActionEvent evt)
    {
        String na = tName.getText();
        int nr = Integer.parseInt(tNummer.getText());
        String ve = tVerwendung.getText();
        double el = Double.parseDouble(tElektrLeitf.getText());
        double eg = Double.parseDouble(tEisengehalt.getText());
        double kg = Double.parseDouble(tKohlenstoffgehalt.getText());

        try
        {
            datenbank.ErstellenStahl(na, nr, ve, el, eg, kg);
            lFertig.setText("Stahl wurde erstellt");
        }
        catch (Exception e)
        { 
            lFertig.setText(     e.getMessage()      );
        }

    }
    // Ende Methoden
} // end of class gui
