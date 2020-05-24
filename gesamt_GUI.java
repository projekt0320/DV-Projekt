
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Alle GUI-Methoden in einer Klasse, sodass alle auf dasselbe Datenbank-Objekt zugreifen.
 * Noch nicht die endgültige Version der GUI-Klasse, es kommen noch Vereinheitlichungen in den Fenstern, java.doc-Dokumentation und
 * weitere Exceptions dazu.
 * 
 *
 * @version 20. Mai 2020
 * @author Jenny Glönkler (Bearbeiten, Löschen), Markus Schnee (Suchen, Hauptmenü), Felicia Wieland (Erstellen, gesamt_GUI)
 */

public class gesamt_GUI extends JFrame {

    // Anfang Attribute
    Datenbank Datenbank = new Datenbank();

    private JLabel lWerkstoffdatenbank = new JLabel();
    private JButton bWerkstofferstellen = new JButton();
    private JButton bWerkstoffbearbeiten = new JButton();
    private JButton bWerkstoffloeschen = new JButton();
    private JButton bWerkstoffsuchen = new JButton();

    private JButton bZuruck = new JButton("Hauptmenü");

    private JButton bStahlerstellen = new JButton();
    private JButton bGusseisenerstellen = new JButton();
    private JButton bLeichtmetalleerstellen = new JButton();
    private JButton bSchwermetalleerstellen = new JButton();
    private JButton bHalbleitererstellen = new JButton();
    private JButton bKeramikerstellen = new JButton();
    private JButton bKunststofferstellen = new JButton();
    private JButton bNaturstofferstellen = new JButton();

    private JLabel lErstellen = new JLabel("Werkstoff erstellen");

    private JLabel lName=new JLabel ("Name:");
    private JLabel lNummer=new JLabel ("Nummer:");
    private JLabel lVerwendung=new JLabel ("Verwendung:");
    private JLabel lElektrLeitf=new JLabel ("Elektrische Leitfähigkeit in MS/m:");
    private JLabel lEisengehalt=new JLabel ("Eisengehalt in Prozent:");
    private JLabel lKohlenstoffgehalt=new JLabel ("Kohlenstoffgehalt in Prozent:");
    private JLabel lSiedetemperatur= new JLabel ("Siedetemperatur in °C:");
    private JLabel lHauptelement = new JLabel ("Hauptelement:");
    private JLabel lVerformbarkeit = new JLabel ("Verformbarkeit:");
    private JLabel lDichte = new JLabel ("Dichte in g/cm^3:");
    private JLabel lmetallEig = new JLabel ("Metallähnliche Eigenschaft:");
    private JLabel lELeit = new JLabel ("Elektrische Leitfähigkeit in S/m:");
    private JLabel lZugfestigkeit = new JLabel ("Zugfestigkeit in N/mm^2:");
    private JLabel lVerform = new JLabel ("Verformbarkeit:");
    private JLabel lDegradation = new JLabel ("Degradation:");

    private JLabel lFertig = new JLabel();
    private JButton erstellen = new JButton("erstellen");
    private JButton bStahlerstellen1 = new JButton("Stahl erstellen");

    private JTextField tName = new JTextField();
    private JTextField tNummer = new JTextField();
    private JTextField tVerwendung = new JTextField();
    private JTextField tElektrLeitf = new JTextField();
    private JTextField tEisengehalt = new JTextField();
    private JTextField tKohlenstoffgehalt = new JTextField();
    private JTextField tSiedetemperatur = new JTextField();
    private JTextField tHauptelement = new JTextField();
    private JTextField tVerformbarkeit = new JTextField();
    private JTextField tDichte = new JTextField();
    private JTextField tmetallEig = new JTextField();
    private JTextField tELeit = new JTextField();
    private JTextField tZugfestigkeit = new JTextField();
    private JTextField tVerform = new JTextField();
    private JTextField tDegradation = new JTextField();

    private JLabel lBearbeiten;
    private JList Liste;
    private String bearbeitenNames[]={"Name","Nummer","Verwendung","Elektr. Leitfähigkeit Metalle",
            "Elektr. Leitfähigkeit Halbleiter","Eisengehalt","Kohlenstoffgehalt","Hauptelement","Siedetemperatur","Verformbarkeit Schwermetalle",
            "Verformbarkeit Kunststoffe","Dichte","Metallähnliche Eigenschaft","Zugfestigkeit","Degradation"};

    private JLabel l1;
    private JTextField t1;
    private JLabel l2;
    private JTextField t2;
    private JLabel l3;
    private JButton bBearbeiten;

    private JButton bSucheNummer = new JButton();
    private JButton bSucheName = new JButton();
    private JButton bSucheVerwendung = new JButton();
    private JLabel ParameterSuchen = new JLabel();

    private JLabel lEingabeName = new JLabel();
    private JButton bSuchestarten = new JButton();
    private JLabel Ausgabe = new JLabel();
    private JTextField jTextField = new JTextField(25);

    private JButton bSuchestarten1 = new JButton();
    private JLabel lEingabeNummer = new JLabel();
    private JTextField jTextField1 = new JTextField(25);
    private JLabel Ausgabe1 = new JLabel();

    private JButton bSuchestarten2 = new JButton();
    private JLabel Ausgabe2 = new JLabel();
    private JLabel lEingabeVerwendung = new JLabel();
    private JTextField jTextField2 = new JTextField(25);

    private JLabel lNummerLoeschen;
    private JLabel lAusgabeLoeschen;

    private JTextField tNummerLoeschen;

    private JButton bLoeschen;
    private JTextArea taTestTextArea;

    // Ende Attribute

    public gesamt_GUI()
    {
        super();
        Hauptmenu_GUI();
    }

    public void Hauptmenu_GUI()
    { 
        // Frame-Initialisierung
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
                    cp.removeAll();
                    Bearbeiten_GUI();
                }
            });
        cp.add(bWerkstoffbearbeiten);

        bWerkstoffloeschen.setBounds(250, 350, 150, 30);
        bWerkstoffloeschen.setText("Werkstoff löschen");
        bWerkstoffloeschen.setMargin(new Insets(2, 2, 2, 2));
        bWerkstoffloeschen.addActionListener(new ActionListener() 
            { 
                public void actionPerformed(ActionEvent evt){ 
                    cp.removeAll();
                    Loeschen_GUI();
                }
            });
        cp.add(bWerkstoffloeschen);

        bWerkstoffsuchen.setBounds(250, 270, 150, 30);
        bWerkstoffsuchen.setText("Werkstoff suchen");
        bWerkstoffsuchen.setMargin(new Insets(2, 2, 2, 2));
        bWerkstoffsuchen.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    cp.removeAll();
                    Suchen_GUI();
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
        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // setTitle("Erstellen");
        // setResizable(false);
        // setSize(700, 600);
        // Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (d.width - getSize().width) / 2;
        // int y = (d.height - getSize().height) / 2;
        // setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(null);

        bStahlerstellen.setText("Stahl erstellen");
        bStahlerstellen.setMargin(new Insets(2, 2, 2, 2));
        bStahlerstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
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
                    c.removeAll();
                    Gusserstellen_GUI();
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
                    c.removeAll();
                    Leichtmetallerstellen_GUI();
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
                    c.removeAll();
                    Schwermetallerstellen_GUI();
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
                    c.removeAll();
                    Halbleitererstellen_GUI();
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
                    c.removeAll();
                    Keramikerstellen_GUI();
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
                    c.removeAll();
                    Kunststofferstellen_GUI();
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
                    c.removeAll();
                    Naturstofferstellen_GUI();
                }
            }
        );
        c.add(bNaturstofferstellen);

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);

        c.add(lErstellen);

        lErstellen.setBounds(270, 30, 175, 30);
        bStahlerstellen.setBounds(275, 90, 100, 30);
        bGusseisenerstellen.setBounds(250, 140, 150, 30);
        bLeichtmetalleerstellen.setBounds(250, 190, 150, 30);
        bSchwermetalleerstellen.setBounds(250, 240, 150, 30);
        bHalbleitererstellen.setBounds(260, 290, 130, 30);
        bKeramikerstellen.setBounds(213, 340, 225, 30);
        bKunststofferstellen.setBounds(250, 390, 150, 30);
        bNaturstofferstellen.setBounds(250, 430, 150, 30);
        bZuruck.setBounds(250, 500, 150, 30);

        setVisible(true);
    }

    private int zahl =0;
    public void Stahlerstellen_GUI()
    {

        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setTitle("Stahl erstellen");
        // setResizable(false);
        // setSize(700, 600);
        // Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (d.width - getSize().width) / 2;
        // int y = (d.height - getSize().height) / 2;
        // setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(null);

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

        erstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Stahlerstellen_ActionPerformed(evt);
                    zahl++;
                }
            }
        );

        c.add(erstellen);

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    tName.setText("");
                    tNummer.setText("");
                    tVerwendung.setText("");
                    tElektrLeitf.setText("");
                    tEisengehalt.setText("");
                    tKohlenstoffgehalt.setText("");
                    lFertig.setText("");
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);

        c.add(lFertig);

        lName.setBounds(20, 20, 200, 20);
        lNummer.setBounds(20, 60, 200, 20);
        lVerwendung.setBounds(20, 100, 200, 20);
        lElektrLeitf.setBounds(20, 140, 200, 20);
        lEisengehalt.setBounds(20, 180, 200, 20);
        lKohlenstoffgehalt.setBounds(20, 220, 200, 20);

        tName.setBounds(240, 20, 150, 20);
        tNummer.setBounds(240, 60, 150, 20);
        tVerwendung.setBounds(240, 100, 150, 20);
        tElektrLeitf.setBounds(240, 140, 150, 20);
        tEisengehalt.setBounds(240, 180, 150, 20);
        tKohlenstoffgehalt.setBounds(240, 220, 150, 20);

        lFertig.setBounds(20, 320, 550, 20);

        erstellen.setBounds(20, 280, 150, 20);

        bZuruck.setBounds(20, 400, 150, 20);

        setVisible(true);
    }

    public void Stahlerstellen_ActionPerformed(ActionEvent evt)
    {

        String na = tName.getText();
        int nr;
        String ve = tVerwendung.getText();
        double el;
        double eg;
        double kg;

        try{
            nr = Integer.parseInt(tNummer.getText());
            el = Double.parseDouble(tElektrLeitf.getText());
            eg = Double.parseDouble(tEisengehalt.getText());
            kg = Double.parseDouble(tKohlenstoffgehalt.getText());
        } 
        catch (NumberFormatException e){
            nr =-1;
            el=-1;
            eg=-1;
            kg=-1;
        }
        if (nr>0 && nr<=9999999 && el>0 && el<=9999999 && eg>0 && eg<=9999999 && kg>0 && kg<=9999999)
        {
            try
            {
                Datenbank.ErstellenStahl(na, nr, ve, el, eg, kg);
                lFertig.setText("Stahl wurde erstellt");
            }
            catch (Exception e)
            { 
                lFertig.setText(     e.getMessage()      );
            }
        }
        else {
            lFertig.setText("Eingabe nicht in Ordnung");
        }

    }

    public void Gusserstellen_GUI()
    {

        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // setTitle("Gusseisen erstellen");
        // setResizable(false);
        // setSize(700, 600);
        // Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (d.width - getSize().width) / 2;
        // int y = (d.height - getSize().height) / 2;
        // setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(null);

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
        c.add(lSiedetemperatur);
        c.add(tSiedetemperatur);

        erstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Gusserstellen_ActionPerformed(evt);
                }
            }
        );

        c.add(erstellen);

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    tName.setText("");
                    tNummer.setText("");
                    tVerwendung.setText("");
                    tElektrLeitf.setText("");
                    tEisengehalt.setText("");
                    tSiedetemperatur.setText("");
                    lFertig.setText("");
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);

        lName.setBounds(20, 20, 200, 20);
        lNummer.setBounds(20, 60, 200, 20);
        lVerwendung.setBounds(20, 100, 200, 20);
        lElektrLeitf.setBounds(20, 140, 200, 20);
        lEisengehalt.setBounds(20, 180, 200, 20);
        lSiedetemperatur.setBounds(20, 220, 200, 20);

        tName.setBounds(240, 20, 150, 20);
        tNummer.setBounds(240, 60, 150, 20);
        tVerwendung.setBounds(240, 100, 150, 20);
        tElektrLeitf.setBounds(240, 140, 150, 20);
        tEisengehalt.setBounds(240, 180, 150, 20);
        tSiedetemperatur.setBounds(240, 220, 150, 20);

        lFertig.setBounds(20, 320, 550, 20);

        erstellen.setBounds(20, 280, 150, 20);

        bZuruck.setBounds(20, 400, 150, 20);

        c.add(lFertig);
        setVisible(true);
    }

    public void Gusserstellen_ActionPerformed(ActionEvent evt)
    {

        String na = tName.getText();
        int nr;
        String ve = tVerwendung.getText();
        double el;
        double eg;
        double st;

        try{
            nr = Integer.parseInt(tNummer.getText());
            el = Double.parseDouble(tElektrLeitf.getText());
            eg = Double.parseDouble(tEisengehalt.getText());
            st = Double.parseDouble(tSiedetemperatur.getText());
        } 
        catch (NumberFormatException e){
            nr =-1;
            el=-1;
            eg=-1;
            st=-1;
        }
        
        if (nr>0 && nr<=9999999 && el>0 && el<=9999999 && eg>0 && eg<=9999999 && st>0 && st<=9999999)
        {
            try
            {
                Datenbank.ErstellenStahl(na, nr, ve, el, eg, st);
                lFertig.setText("Gusseisen wurde erstellt");
            }
            catch (Exception e)
            { 
                lFertig.setText(     e.getMessage()      );
            }
        }
        else {
            lFertig.setText("Eingabe nicht in Ordnung");
        }
    }

    public void Schwermetallerstellen_GUI()
    {

        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // setTitle("Schwermetall erstellen");
        // setResizable(false);
        // setSize(700, 600);
        // Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (d.width - getSize().width) / 2;
        // int y = (d.height - getSize().height) / 2;
        // setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(null);

        c.add(lName);
        c.add(tName);
        c.add(lNummer);
        c.add(tNummer);
        c.add(lVerwendung);
        c.add(tVerwendung);
        c.add(lElektrLeitf);
        c.add(tElektrLeitf);
        c.add(lHauptelement);
        c.add(tHauptelement);
        c.add(lVerformbarkeit);
        c.add(tVerformbarkeit);

       erstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Schwermetallerstellen_ActionPerformed(evt);
                }
            }
        );

        c.add(erstellen);

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    tName.setText("");
                    tNummer.setText("");
                    tVerwendung.setText("");
                    tElektrLeitf.setText("");
                    tHauptelement.setText("");
                    tVerformbarkeit.setText("");
                    lFertig.setText("");
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);

        lName.setBounds(20, 20, 200, 20);
        lNummer.setBounds(20, 60, 200, 20);
        lVerwendung.setBounds(20, 100, 200, 20);
        lElektrLeitf.setBounds(20, 140, 200, 20);
        lHauptelement.setBounds(20, 180, 200, 20);
        lVerformbarkeit.setBounds(20, 220, 200, 20);

        tName.setBounds(240, 20, 150, 20);
        tNummer.setBounds(240, 60, 150, 20);
        tVerwendung.setBounds(240, 100, 150, 20);
        tElektrLeitf.setBounds(240, 140, 150, 20);
        tHauptelement.setBounds(240, 180, 150, 20);
        tVerformbarkeit.setBounds(240, 220, 150, 20);

        lFertig.setBounds(20, 320, 550, 20);

        erstellen.setBounds(20, 280, 150, 20);

        bZuruck.setBounds(20, 400, 150, 20);

        c.add(lFertig);
        setVisible(true);
    }

    public void Schwermetallerstellen_ActionPerformed(ActionEvent evt)
    {
        String na = tName.getText();
        int nr;
        String ve = tVerwendung.getText();
        double el;
        String he = tHauptelement.getText();
        String vf = tVerformbarkeit.getText();

        try{
            nr = Integer.parseInt(tNummer.getText());
            el = Double.parseDouble(tElektrLeitf.getText());
        } 
        catch (NumberFormatException e){
            nr =-1;
            el=-1;
        }
        if (nr>0 && nr<=9999999 && el>0 && el<=9999999)
        {
            try
            {
                Datenbank.ErstellenSchwermetalle(na, nr, ve, el, he, vf);
                lFertig.setText("Schwermetall wurde erstellt");
            }
            catch (Exception e)
            { 
                lFertig.setText(     e.getMessage()      );
            }
        }
        else {
            lFertig.setText("Eingabe nicht in Ordnung");
        }
    }

    public void Leichtmetallerstellen_GUI()
    {

        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // setTitle("Leichtmetall erstellen");
        // setResizable(false);
        // setSize(700, 600);
        // Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (d.width - getSize().width) / 2;
        // int y = (d.height - getSize().height) / 2;
        // setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(null);

        c.add(lName);
        c.add(tName);
        c.add(lNummer);
        c.add(tNummer);
        c.add(lVerwendung);
        c.add(tVerwendung);
        c.add(lElektrLeitf);
        c.add(tElektrLeitf);
        c.add(lHauptelement);
        c.add(tHauptelement);
        c.add(lDichte);
        c.add(tDichte);

        erstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Leichtmetallerstellen_ActionPerformed(evt);
                }
            }
        );

        c.add(erstellen);

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    tName.setText("");
                    tNummer.setText("");
                    tVerwendung.setText("");
                    tElektrLeitf.setText("");
                    tEisengehalt.setText("");
                    tDichte.setText("");
                    lFertig.setText("");
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);

        lName.setBounds(20, 20, 200, 20);
        lNummer.setBounds(20, 60, 200, 20);
        lVerwendung.setBounds(20, 100, 200, 20);
        lElektrLeitf.setBounds(20, 140, 200, 20);
        lHauptelement.setBounds(20, 180, 200, 20);
        lDichte.setBounds(20, 220, 200, 20);

        tName.setBounds(240, 20, 150, 20);
        tNummer.setBounds(240, 60, 150, 20);
        tVerwendung.setBounds(240, 100, 150, 20);
        tElektrLeitf.setBounds(240, 140, 150, 20);
        tHauptelement.setBounds(240, 180, 150, 20);
        tDichte.setBounds(240, 220, 150, 20);

        lFertig.setBounds(20, 320, 550, 20);

        erstellen.setBounds(20, 280, 150, 20);

        bZuruck.setBounds(20, 400, 150, 20);

        c.add(lFertig);
        setVisible(true);
    }

    public void Leichtmetallerstellen_ActionPerformed(ActionEvent evt)
    {

        String na = tName.getText();
        int nr;
        String ve = tVerwendung.getText();
        double el;
        String he = tHauptelement.getText();
        double d;

        try{
            nr = Integer.parseInt(tNummer.getText());
            el = Double.parseDouble(tElektrLeitf.getText());
            d = Double.parseDouble(tDichte.getText());
        } 
        catch (NumberFormatException e){
            nr =-1;
            el=-1;
            d=-1;
        }
        if (nr>0 && nr<=9999999 && el>0 && el<=9999999 && d>0 && d<=9999999)
        {
            try
            {
                Datenbank.ErstellenLeichtmetalle(na, nr, ve, el, he, d);
                lFertig.setText("Leichtmetall wurde erstellt");
            }
            catch (Exception e)
            { 
                lFertig.setText(     e.getMessage()      );
            }

        }
        else {
            lFertig.setText("Eingabe nicht in Ordnung");
        }

    }

    public void Halbleitererstellen_GUI()
    {

        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // setTitle("Halbleiter erstellen");
        // setResizable(false);
        // setSize(700, 600);
        // Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (d.width - getSize().width) / 2;
        // int y = (d.height - getSize().height) / 2;
        // setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(null);

        c.add(lName);
        c.add(tName);
        c.add(lNummer);
        c.add(tNummer);
        c.add(lVerwendung);
        c.add(tVerwendung);
        c.add(lmetallEig);
        c.add(tmetallEig);
        c.add(lELeit);
        c.add(tELeit);

        erstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Halbleitererstellen_ActionPerformed(evt);
                }
            }
        );

        c.add(erstellen);

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    tName.setText("");
                    tNummer.setText("");
                    tVerwendung.setText("");
                    tmetallEig.setText("");
                    tELeit.setText("");
                    lFertig.setText("");
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);

        lName.setBounds(20, 20, 200, 20);
        lNummer.setBounds(20, 60, 200, 20);
        lVerwendung.setBounds(20, 100, 200, 20);
        lmetallEig.setBounds(20, 140, 200, 20);
        lELeit.setBounds(20, 180, 200, 20);

        tName.setBounds(240, 20, 150, 20);
        tNummer.setBounds(240, 60, 150, 20);
        tVerwendung.setBounds(240, 100, 150, 20);
        tmetallEig.setBounds(240, 140, 150, 20);
        tELeit.setBounds(240, 180, 150, 20);

        lFertig.setBounds(20, 320, 550, 20);

        erstellen.setBounds(20, 280, 150, 20);

        bZuruck.setBounds(20, 400, 150, 20);

        c.add(lFertig);
        setVisible(true);
    }

    public void Halbleitererstellen_ActionPerformed(ActionEvent evt)
    {
        String na = tName.getText();
        int nr;
        String ve = tVerwendung.getText();
        String me = tmetallEig.getText();
        double el;

        try{
            nr = Integer.parseInt(tNummer.getText());
            el = Double.parseDouble(tElektrLeitf.getText());
        } 
        catch (NumberFormatException e){
            nr =-1;
            el=-1;
        }
        if (nr>0 && nr<=9999999 && el>0 && el<=9999999)
        {
            try
            {
                Datenbank.ErstellenHalbleiter(na, nr, ve, me, el);
                lFertig.setText("Halbleiter wurde erstellt");
            }
            catch (Exception e)
            { 
                lFertig.setText(     e.getMessage()      );
            }
        }
        else {
            lFertig.setText("Eingabe nicht in Ordnung");
        }
    }

    public void Keramikerstellen_GUI()
    {

        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // setTitle("Keramik erstellen");
        // setResizable(false);
        // setSize(700, 600);
        // Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (d.width - getSize().width) / 2;
        // int y = (d.height - getSize().height) / 2;
        // setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(null);

         c.add(lName);
        c.add(tName);
        c.add(lNummer);
        c.add(tNummer);
        c.add(lVerwendung);
        c.add(tVerwendung);
        c.add(lmetallEig);
        c.add(tmetallEig);
        c.add(lZugfestigkeit);
        c.add(tZugfestigkeit);

        erstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Keramikerstellen_ActionPerformed(evt);
                }
            }
        );

        c.add(erstellen);

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    tName.setText("");
                    tNummer.setText("");
                    tVerwendung.setText("");
                    tmetallEig.setText("");
                    tZugfestigkeit.setText("");
                    lFertig.setText("");
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);

        lName.setBounds(20, 20, 200, 20);
        lNummer.setBounds(20, 60, 200, 20);
        lVerwendung.setBounds(20, 100, 200, 20);
        lmetallEig.setBounds(20, 140, 200, 20);
        lZugfestigkeit.setBounds(20, 180, 200, 20);

        tName.setBounds(240, 20, 150, 20);
        tNummer.setBounds(240, 60, 150, 20);
        tVerwendung.setBounds(240, 100, 150, 20);
        tmetallEig.setBounds(240, 140, 150, 20);
        tZugfestigkeit.setBounds(240, 180, 150, 20);

        lFertig.setBounds(20, 320, 550, 20);

        erstellen.setBounds(20, 280, 150, 20);

        bZuruck.setBounds(20, 400, 150, 20);

        c.add(lFertig);
        setVisible(true);
    }

    public void Keramikerstellen_ActionPerformed(ActionEvent evt)
    {
        String na = tName.getText();
        int nr;
        String ve = tVerwendung.getText();
        String me = tmetallEig.getText();
        double zf;

        try{
            nr = Integer.parseInt(tNummer.getText());
            zf = Double.parseDouble(tZugfestigkeit.getText());
        } 
        catch (NumberFormatException e){
            nr =-1;
            zf=-1;
        }
        if (nr>0 && nr<=9999999 && zf>0 && zf<=9999999)
        {
            try
            {
                Datenbank.ErstellenKeramik(na, nr, ve, me, zf);
                lFertig.setText("Keramischer Werkstoff wurde erstellt");
            }
            catch (Exception e)
            { 
                lFertig.setText(     e.getMessage()      );
            }
        }
        else {
            lFertig.setText("Eingabe nicht in Ordnung");
        }
    }

    public void Kunststofferstellen_GUI()
    {

        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // setTitle("Kunststoff erstellen");
        // setResizable(false);
        // setSize(700, 600);
        // Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (d.width - getSize().width) / 2;
        // int y = (d.height - getSize().height) / 2;
        // setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(null);

        c.add(lName);
        c.add(tName);
        c.add(lNummer);
        c.add(tNummer);
        c.add(lVerwendung);
        c.add(tVerwendung);
        c.add(lmetallEig);
        c.add(tmetallEig);
        c.add(lVerform);
        c.add(tVerform);

        erstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Kunststofferstellen_ActionPerformed(evt);
                }
            }
        );

        c.add(erstellen);

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    tName.setText("");
                    tNummer.setText("");
                    tVerwendung.setText("");
                    tmetallEig.setText("");
                    tVerform.setText("");
                    lFertig.setText("");
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);

        lName.setBounds(20, 20, 200, 20);
        lNummer.setBounds(20, 60, 200, 20);
        lVerwendung.setBounds(20, 100, 200, 20);
        lmetallEig.setBounds(20, 140, 200, 20);
        lVerform.setBounds(20, 180, 200, 20);

        tName.setBounds(240, 20, 150, 20);
        tNummer.setBounds(240, 60, 150, 20);
        tVerwendung.setBounds(240, 100, 150, 20);
        tmetallEig.setBounds(240, 140, 150, 20);
        tVerform.setBounds(240, 180, 150, 20);

        lFertig.setBounds(20, 320, 550, 20);

        erstellen.setBounds(20, 280, 150, 20);

        bZuruck.setBounds(20, 400, 150, 20);

        c.add(lFertig);
        setVisible(true);
    }

    public void Kunststofferstellen_ActionPerformed(ActionEvent evt)
    {
        String na = tName.getText();
        int nr;
        String ve = tVerwendung.getText();
        String me = tmetallEig.getText();
        String vf = tVerform.getText();

        try{
            nr = Integer.parseInt(tNummer.getText());
        } 
        catch (NumberFormatException e){
            nr =-1;
        }
        if (nr>0 && nr<=9999999)
        {
            try
            {
                Datenbank.ErstellenKunststoffe(na, nr, ve, me, vf);
                lFertig.setText("Kunststoff wurde erstellt");
            }
            catch (Exception e)
            { 
                lFertig.setText(     e.getMessage()      );
            }
        }
        else {
            lFertig.setText("Eingabe nicht in Ordnung");
        }
    }

    public void Naturstofferstellen_GUI()
    {

        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // setTitle("Naturstoff erstellen");
        // setResizable(false);
        // setSize(700, 600);
        // Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (d.width - getSize().width) / 2;
        // int y = (d.height - getSize().height) / 2;
        // setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(null);

        c.add(lName);
        c.add(tName);
        c.add(lNummer);
        c.add(tNummer);
        c.add(lVerwendung);
        c.add(tVerwendung);
        c.add(lmetallEig);
        c.add(tmetallEig);
        c.add(lDegradation);
        c.add(tDegradation);

        erstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    Naturstofferstellen_ActionPerformed(evt);
                }
            }
        );

        c.add(erstellen);

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    tName.setText("");
                    tNummer.setText("");
                    tVerwendung.setText("");
                    tmetallEig.setText("");
                    tDegradation.setText("");
                    lFertig.setText("");
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);

        lName.setBounds(20, 20, 200, 20);
        lNummer.setBounds(20, 60, 200, 20);
        lVerwendung.setBounds(20, 100, 200, 20);
        lmetallEig.setBounds(20, 140, 200, 20);
        lDegradation.setBounds(20, 180, 200, 20);

        tName.setBounds(240, 20, 150, 20);
        tNummer.setBounds(240, 60, 150, 20);
        tVerwendung.setBounds(240, 100, 150, 20);
        tmetallEig.setBounds(240, 140, 150, 20);
        tDegradation.setBounds(240, 180, 150, 20);

        lFertig.setBounds(20, 320, 550, 20);

        erstellen.setBounds(20, 280, 150, 20);

        bZuruck.setBounds(20, 400, 150, 20);

        c.add(lFertig);
        setVisible(true);
    }

    public void Naturstofferstellen_ActionPerformed(ActionEvent evt)
    {
        String na = tName.getText();
        int nr;
        String ve = tVerwendung.getText();
        String me = tmetallEig.getText();
        String de = tDegradation.getText();

        try{
            nr = Integer.parseInt(tNummer.getText());
        } 
        catch (NumberFormatException e){
            nr =-1;
        }
        if (nr>0 && nr<=9999999)
        {
            try
            {
                Datenbank.ErstellenNaturstoffe(na, nr, ve, me, de);
                lFertig.setText("Naturstoff wurde erstellt");
            }
            catch (Exception e)
            { 
                lFertig.setText(     e.getMessage()      );
            }
        }
        else {
            lFertig.setText("Eingabe nicht in Ordnung");
        }
    }

    public void Bearbeiten_GUI()
    {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Werkstoff bearbeiten");
        setResizable(false);
        setSize(700, 600);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        lBearbeiten=new JLabel("                    bearbeiten:");
        c.add(lBearbeiten);

        l1=new JLabel("                     Nummer des Werkstoffs, der bearbeitet werden soll:");  
        t1=new JTextField(10);
        l2=new JLabel("                     neue Eigenschaft");
        t2=new JTextField(10);
        l3=new JLabel();

        Liste=new JList(bearbeitenNames);
        Liste.setVisibleRowCount( 5 );

        Liste.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        c.add(new JScrollPane(Liste));

        bBearbeiten=new JButton();
        bBearbeiten.setText("bearbeiten");
        bBearbeiten.setMargin(new Insets(2, 2, 2, 2));
        bBearbeiten.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt)
                { 

                    bBearbeiten_ActionPerformed(evt);

                }
            }
        );

        c.add(bBearbeiten);
        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);
        c.add(l3);

        setVisible(true);
    }

    public void bBearbeiten_ActionPerformed(ActionEvent evt){
        // TODO hier Quelltext einfügen

        int i= Liste.getSelectedIndex();
        if(i==0){
            bearbeitenName();
        }
        else if(i==1){
            bearbeitenNummer();
        }
        else if(i==2){
            bearbeitenVerwendung();
        }
        else if(i==3){
            bearbeitenElektrischeLeitfaehigkeitMetalle();
        }
        else if(i==4){
            bearbeitenElektrischeLeitfaehigkeitHalbleiter();
        }
        else if(i==5){
            bearbeitenEisengehalt();
        }
        else if(i==6){
            bearbeitenKohlenstoffgehalt();
        }
        else if(i==7){
            bearbeitenHauptelement();
        }
        else if(i==8){
            bearbeitenSiedetemperatur();
        }
        else if(i==9){
            bearbeitenVerformbarkeitSchwermetalle();
        }
        else if(i==10){
            bearbeitenVerformbarkeitKunststoffe();
        }
        else if(i==11){
            bearbeitenDichte();
        }
        else if(i==12){
            bearbeitenMetallischeEigenschaft();
        }
        else if(i==13){
            bearbeitenZugfestigkeit();
        }
        else if(i==14){
            bearbeitenDegradation();
        }

    } //

    public void bearbeitenName(){
        int n;
        String s1 ="";
        try{
            n= Integer.parseInt(t1.getText());
            s1= t2.getText();
        } 
        catch (NumberFormatException e){
            n = -1;
        }
        if (n>0 && n<=9999999){
            try{
                Datenbank.BearbeitenName(n,s1);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenNummer(){
        int n1;
        int n2;
        try{
            n1= Integer.parseInt(t1.getText());
            n2= Integer.parseInt(t2.getText());
        } 
        catch (NumberFormatException e){
            n1 = -1;
            n2 = -1;
        }
        if (n1>0 && n1<=9999999 && n2>0 && n2<=9999999){
            try{
                Datenbank.BearbeitenNummer(n1,n2);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenVerwendung(){
        int n;
        String s1 ="";
        try{
            n= Integer.parseInt(t1.getText());
            s1= t2.getText();
        } 
        catch (NumberFormatException e){
            n = -1;
        }
        if (n>0 && n<=9999999){
            try{
                Datenbank.BearbeitenVerwendung(n,s1);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenElektrischeLeitfaehigkeitMetalle(){
        int n1;
        double n2;
        try{
            n1= Integer.parseInt(t1.getText());
            n2= Double.parseDouble(t2.getText());
        } 
        catch (NumberFormatException e){
            n1 = -1;
            n2 = -1;
        }
        if (n1>0 && n1<=9999999 && n2>0.68 && n2<=62){
            try{
                Datenbank.BearbeitenElektrischeLeitfaehigkeitMetalle(n1,n2);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenElektrischeLeitfaehigkeitHalbleiter(){
        int n1;
        double n2;
        try{
            n1= Integer.parseInt(t1.getText());
            n2= Double.parseDouble(t2.getText());
        } 
        catch (NumberFormatException e){
            n1 = -1;
            n2 = -1;
        }
        if (n1>0 && n1<=9999999 && n2>0 && n2<= Math.pow(10,6)){
            try{
                Datenbank.BearbeitenElektrischeLeitfaehigkeitHalbleiter(n1,n2);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenEisengehalt(){
        int n1;
        double n2;
        try{
            n1= Integer.parseInt(t1.getText());
            n2= Double.parseDouble(t2.getText());
        } 
        catch (NumberFormatException e){
            n1 = -1;
            n2 = -1;
        }
        if (n1>0 && n1<=9999999 && n2>50 && n2<100){
            try{
                Datenbank.BearbeitenEisengehalt(n1,n2);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenKohlenstoffgehalt(){
        int n1;
        double n2;
        try{
            n1= Integer.parseInt(t1.getText());
            n2= Double.parseDouble(t2.getText());
        } 
        catch (NumberFormatException e){
            n1 = -1;
            n2 = -1;
        }
        if (n1>0 && n1<=9999999 && n2>50 && n2<100){
            try{
                Datenbank.BearbeitenKohlenstoffgehalt(n1,n2);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenHauptelement(){
        int n;
        String s1 ="";
        try{
            n= Integer.parseInt(t1.getText());
            s1= t2.getText();
        } 
        catch (NumberFormatException e){
            n = -1;
        }
        if (n>0 && n<=9999999){
            try{
                Datenbank.BearbeitenHauptelement(n,s1);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenSiedetemperatur(){
        int n1;
        double n2;
        try{
            n1= Integer.parseInt(t1.getText());
            n2= Double.parseDouble(t2.getText());
        } 
        catch (NumberFormatException e){
            n1 = -1;
            n2 = -1;
        }
        if (n1>0 && n1<=9999999 && n2>1000 && n2<1300){
            try{
                Datenbank.BearbeitenSiedetemperatur(n1,n2);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenVerformbarkeitSchwermetalle(){
        int n1;
        String s1 ="";
        try{
            n1= Integer.parseInt(t1.getText());
            s1= t2.getText();
        } 
        catch (NumberFormatException e){
            n1 = -1;
        }
        if (n1>0 && n1<=9999999){
            try{
                Datenbank.BearbeitenVerformbarkeitSchwermetalle(n1,s1);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenVerformbarkeitKunststoffe(){
        int n1;
        String s1 ="";
        try{
            n1= Integer.parseInt(t1.getText());
            s1= t2.getText();
        } 
        catch (NumberFormatException e){
            n1 = -1;
        }
        if (n1>0 && n1<=9999999){
            try{
                Datenbank.BearbeitenVerformbarkeitKunststoffe(n1,s1);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenDichte(){
        int n1;
        double n2;
        try{
            n1= Integer.parseInt(t1.getText());
            n2= Double.parseDouble(t2.getText());
        } 
        catch (NumberFormatException e){
            n1 = -1;
            n2 = -1;
        }
        if (n1>0 && n1<=9999999 && n2>0 && n2<5){
            try{
                Datenbank.BearbeitenDichte(n1,n2);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenMetallischeEigenschaft(){
        int n1;
        String s1 ="";
        try{
            n1= Integer.parseInt(t1.getText());
            s1= t2.getText();
        } 
        catch (NumberFormatException e){
            n1 = -1;
        }
        if (n1>0 && n1<=9999999){
            try{
                Datenbank.BearbeitenmetallischeEigenschaft(n1,s1);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenZugfestigkeit(){
        int n1;
        double n2;
        try{
            n1= Integer.parseInt(t1.getText());
            n2= Double.parseDouble(t2.getText());
        } 
        catch (NumberFormatException e){
            n1 = -1;
            n2 = -1;
        }
        if (n1>0 && n1<=9999999 && n2>0){
            try{
                Datenbank.BearbeitenZugfestigkeit(n1,n2);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void bearbeitenDegradation(){
        int n1;
        String s1 ="";
        try{
            n1= Integer.parseInt(t1.getText());
            s1= t2.getText();
        } 
        catch (NumberFormatException e){
            n1 = -1;
        }
        if (n1>0 && n1<=9999999){
            try{
                Datenbank.BearbeitenDegradation(n1,s1);
                l3.setText("Werkstoff wurde bearbeitet");
            }
            catch(Exception e) {
                l3.setText(e.getMessage());
            }
        }
        else {
            l3.setText("Eingabe ist nicht in Ordnung");
        }
    }

    public void Suchen_GUI()
    { 
        // Frame-Initialisierung
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
                    cp.removeAll();
                    sucheNummer();
                }
            });

        bSucheName.setBounds(250, 140, 150, 30);
        bSucheName.setText("Suche Name");
        bSucheName.setMargin(new Insets(2, 2, 2, 2));
        bSucheName.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    cp.removeAll();
                    sucheName();
                }
            });

        bSucheVerwendung.setBounds(250, 180, 150, 30);
        bSucheVerwendung.setText("Suche Verwendung");
        bSucheVerwendung.setMargin(new Insets(2, 2, 2, 2));
        bSucheVerwendung.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    cp.removeAll();
                    sucheVerwendung();
                }
            });
        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    cp.removeAll();
                    Hauptmenu_GUI();
                }
            }
        );
        bZuruck.setBounds(250, 300, 150, 30);
        cp.add(bSucheName);
        cp.add(bSucheNummer);
        cp.add(bSucheVerwendung);
        cp.add(bZuruck);
        cp.setBackground(new Color(0xC0C0C0));
        // Ende Komponenten

        setVisible(true);
    }

    public void sucheName()
    { 
        // Frame-Initialisierung

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
        cp.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 40));
        // Anfang Komponenten

        lEingabeName.setText("Eingabe Name");
        bSuchestarten.setText("Suche starten");
        bSuchestarten.setMargin(new Insets(2, 2, 2, 2));
        bSuchestarten.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    bNameSuchestarten_ActionPerformed(evt);
                }
            });

        Ausgabe.setText("");

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    cp.removeAll();
                    Hauptmenu_GUI();
                }
            }
        );
        taTestTextArea = new JTextArea();
        cp.add(lEingabeName);
        cp.add(jTextField);
        cp.add(bSuchestarten);
        cp.add(taTestTextArea);
        cp.add(bZuruck);

        // Ende Komponenten
        setVisible(true);
    } // end of public sucheName

    public void bNameSuchestarten_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen

       try
        {
            String s= jTextField.getText();
            String s2= Datenbank.sucheNameAnzeige(s);
            taTestTextArea.setText(s2);
        }
        catch(Exception e)
        {
            taTestTextArea.setText(     e.getMessage()      );

        }
        

    } // end of bSuchestarten_ActionPerformed

    public void sucheNummer() { 
        // Frame-Initialisierung
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
        cp.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 40));
        // Anfang Komponenten
        taTestTextArea = new JTextArea();

        bSuchestarten1.setText("Suche starten");
        bSuchestarten1.setMargin(new Insets(2, 2, 2, 2));
        bSuchestarten1.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    bNummerSuchestarten_ActionPerformed(evt);
                }
            });
        bSuchestarten1.setHorizontalTextPosition(SwingConstants.RIGHT);
        bSuchestarten1.setVerticalAlignment(SwingConstants.CENTER);
        bSuchestarten1.setVerticalTextPosition(SwingConstants.CENTER);

        lEingabeNummer.setText("Eingabe Nummer");
        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    cp.removeAll();
                    Hauptmenu_GUI();
                }
            }
        );

        cp.add(lEingabeNummer);
        cp.add(jTextField1);
        cp.add(bSuchestarten1);
        cp.add(taTestTextArea);
        cp.add(bZuruck);
        // Ende Komponenten

        setVisible(true);
    } // end of public sucheNummer

    public void bNummerSuchestarten_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        int n=-1;
        //fehlerhafter Datentyp oder keine Eingabe
        try
        {
            n= Integer.parseInt(  jTextField1.getText()    );
        }
        catch(Exception e)
        {
            taTestTextArea.setText("Fehlerhafte Eingabe");
        }

        if(n!=-1)
        {
            try
            {
                String s=Datenbank.sucheNummerAnzeige(n);
                taTestTextArea.setText(s);
            }
            catch(Exception e)
            {
                taTestTextArea.setText(     e.getMessage()      );
            }
        }
    } // end of bSuchestarten_ActionPerformed

    public void sucheVerwendung() { 
        // Frame-Initialisierung
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 700; 
        int frameHeight = 600;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("sucheVerwendung");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 40));
        // Anfang Komponenten

        bSuchestarten2.setBounds(250, 135, 175, 25);
        bSuchestarten2.setText("Suche starten");
        bSuchestarten2.setMargin(new Insets(2, 2, 2, 2));
        bSuchestarten2.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    bVerwendungSuchestarten_ActionPerformed(evt);
                }
            });

        Ausgabe2.setBounds(50, 220, 500, 500);
        Ausgabe2.setVerticalAlignment(SwingConstants.TOP);
        Ausgabe2.setText("");

        lEingabeVerwendung.setBounds(50, 80, 156, 20);
        lEingabeVerwendung.setText("Eingabe Verwendung");

        jTextField2.setBounds(195, 80, 250, 20);

        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    cp.removeAll();
                    Hauptmenu_GUI();
                }
            }
        );
        cp.add(lEingabeVerwendung);
        cp.add(jTextField2);
        cp.add(bSuchestarten2);
        cp.add(Ausgabe2);
        cp.add(bZuruck);
        // Ende Komponenten

        setVisible(true);
    } // end of public sucheVerwendung

    public void bVerwendungSuchestarten_ActionPerformed(ActionEvent evt) 
    {
        // TODO hier Quelltext einfügen
        if(evt.getSource() == this.bSuchestarten2){
             String s= jTextField2.getText();

        try
        {
            String s2= Datenbank.sucheVerwendung(s);
            Ausgabe2.setText( s2 );
        }
        catch(Exception e)
        {

            Ausgabe2.setText(     e.getMessage()      );

        }
        }
    } // end of bSuchestarten_ActionPerformed

   

    public void Loeschen_GUI()
    {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Werkstoff löschen");
        setResizable(false);
        setSize(700, 600);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

        lNummerLoeschen=new JLabel ("Nummer des Werkstoffs, der gelöscht werden soll:");
        lAusgabeLoeschen=new JLabel();

        tNummerLoeschen=new JTextField(10);

        c.add(lNummerLoeschen);
        c.add(tNummerLoeschen);

        bLoeschen=new JButton();
        bLoeschen.setText("löschen");
        bLoeschen.setMargin(new Insets(2, 2, 2, 2));
        bLoeschen.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt)
                { 

                    bLoeschen_ActionPerformed(evt);
                }
            }
        );

        c.add(bLoeschen);
        bZuruck.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    c.removeAll();
                    Hauptmenu_GUI();
                }
            }
        );
        c.add(bZuruck);
        c.add(lAusgabeLoeschen);
        setVisible(true);
    }

    public void bLoeschen_ActionPerformed(ActionEvent evt){
        // TODO hier Quelltext einfügen

        bLoeschenMethode(); 

    } //

    public void bLoeschenMethode(){
        int n;
        try{
            n= Integer.parseInt(tNummerLoeschen.getText());
        } 
        catch (NumberFormatException e){
            n = -1;
        }
        if (n>0 && n<=9999999){
            try{
                Datenbank.loeschen(n);
                lAusgabeLoeschen.setText("Werkstoff wurde gelöscht");
            }
            catch(Exception e) {
                lAusgabeLoeschen.setText(e.getMessage());
            }
        }
        else {
            lAusgabeLoeschen.setText("Eingabe ist nicht in Ordnung");
        }
    }// Ende Methoden
} // end of class gui
