
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

    private JButton bZuruck = new JButton("Hauptmenü");

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
    Datenbank Datenbank = new Datenbank();

    private JLabel lFertig;
    private JButton erstellen = new JButton();

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
  private JTextField jTextField = new JTextField();
  
  private JButton bSuchestarten1 = new JButton();
  private JLabel lEingabeNummer = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JLabel Ausgabe1 = new JLabel();
  
  
  private JButton bSuchestarten2 = new JButton();
  private JLabel Ausgabe2 = new JLabel();
  private JLabel lEingabeVerwendung = new JLabel();
  private JTextField jTextField2 = new JTextField();
  
  private JLabel lNummerLoeschen;
    private JLabel lAusgabeLoeschen;

    private JTextField tNummerLoeschen;

    private JButton bLoeschen;

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

        lFertig = new JLabel();
        
        
        erstellen.setText("erstellen");
        erstellen.setMargin(new Insets(2, 2, 2, 2));
        erstellen.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent evt)
                { 
                    lFertig.setText("");
                    Stahlerstellen_ActionPerformed(evt);
                }
            }
        );

        c.add(erstellen);
        
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
            Datenbank.ErstellenStahl(na, nr, ve, el, eg, kg);
            lFertig.setText("Stahl wurde erstellt");
        }
        catch (Exception e)
        { 
            lFertig.setText(     e.getMessage()      );
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
                    c.removeAll();
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

        if(evt.getSource() == this.bBearbeiten){
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
        sucheName();
      }
    });
    cp.add(bSucheNummer);
    bSucheName.setBounds(250, 140, 150, 30);
    bSucheName.setText("Suche Name");
    bSucheName.setMargin(new Insets(2, 2, 2, 2));
    bSucheName.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        cp.removeAll();
        sucheNummer();
      }
    });
    cp.add(bSucheName);
    bSucheVerwendung.setBounds(250, 180, 150, 30);
    bSucheVerwendung.setText("Suche Verwendung");
    bSucheVerwendung.setMargin(new Insets(2, 2, 2, 2));
    bSucheVerwendung.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        cp.removeAll();
        sucheVerwendung();
      }
    });
    cp.add(bSucheVerwendung);
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
        cp.removeAll();
          bNameSuchestarten_ActionPerformed(evt);
      }
    });
    cp.add(bSuchestarten);
    Ausgabe.setBounds(59, 220, 500, 500);
    Ausgabe.setVerticalAlignment(SwingConstants.TOP);
    Ausgabe.setText("");
    cp.add(Ausgabe);
    jTextField.setBounds(195, 80, 250, 20);
    cp.add(jTextField);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public sucheName
  
  public void bNameSuchestarten_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     if(evt.getSource() == this.bSuchestarten){
            bSucheNameMethode(); 
        }
       
  } // end of bSuchestarten_ActionPerformed
  
  public void bSucheNameMethode()
  {
      String s= jTextField.getText();
      
       try
          {
              String s2= Datenbank.sucheNameAnzeige(s);
              Ausgabe.setText(s2);
        }
        catch(Exception e)
        {
             Ausgabe.setText(     e.getMessage()      );
           
        }
  }
  
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
    cp.setLayout(null);
    // Anfang Komponenten
    
    bSuchestarten1.setBounds(250, 135, 175, 25);
    bSuchestarten1.setText("Suche starten");
    bSuchestarten1.setMargin(new Insets(2, 2, 2, 2));
    bSuchestarten1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        cp.removeAll();
          bNummerSuchestarten_ActionPerformed(evt);
      }
    });
    bSuchestarten1.setHorizontalTextPosition(SwingConstants.RIGHT);
    bSuchestarten1.setVerticalAlignment(SwingConstants.CENTER);
    bSuchestarten1.setVerticalTextPosition(SwingConstants.CENTER);
    cp.add(bSuchestarten1);
    lEingabeNummer.setBounds(50, 80, 110, 20);
    lEingabeNummer.setText("Eingabe Nummer");
    cp.add(lEingabeNummer);
    jTextField1.setBounds(195, 80, 250, 20);
    cp.add(jTextField1);
    Ausgabe1.setBounds(50, 220, 500, 500);
    Ausgabe1.setVerticalAlignment(SwingConstants.TOP);
    Ausgabe1.setText("");
    cp.add(Ausgabe1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public sucheNummer
  
  public void bNummerSuchestarten_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    if(evt.getSource() == this.bSuchestarten){
            bSucheNummerMethode(); 
        }
  } // end of bSuchestarten_ActionPerformed
  
  public void bSucheNummerMethode()
  {
    
    int n=-1;
    //fehlerhafter Datentyp oder keine Eingabe
    try
    {
          n= Integer.parseInt(  jTextField1.getText()    );
    }
    catch(Exception e)
    {
          Ausgabe1.setText("Fehlerhafte Eingabe");
    }
    
    if(n!=-1)
    {
        try
        {
              String s=Datenbank.sucheNummerAnzeige(n);
              Ausgabe1.setText(s);
        }
        catch(Exception e)
        {
           Ausgabe1.setText(     e.getMessage()      );
        }
    }
  }
  
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
    cp.setLayout(null);
    // Anfang Komponenten
    
    bSuchestarten.setBounds(250, 135, 175, 25);
    bSuchestarten.setText("Suche starten");
    bSuchestarten.setMargin(new Insets(2, 2, 2, 2));
    bSuchestarten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        cp.removeAll();
          bVerwendungSuchestarten_ActionPerformed(evt);
      }
    });
    cp.add(bSuchestarten);
    Ausgabe2.setBounds(50, 220, 500, 500);
    Ausgabe2.setVerticalAlignment(SwingConstants.TOP);
    Ausgabe2.setText("");
    cp.add(Ausgabe2);
    lEingabeVerwendung.setBounds(50, 80, 156, 20);
    lEingabeVerwendung.setText("Eingabe Verwendung");
    cp.add(lEingabeVerwendung);
    jTextField2.setBounds(195, 80, 250, 20);
    cp.add(jTextField2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public sucheVerwendung
 
   public void bVerwendungSuchestarten_ActionPerformed(ActionEvent evt) 
   {
    // TODO hier Quelltext einfügen
     if(evt.getSource() == this.bSuchestarten){
            bSucheVerwendungMethode(); 
        }
  } // end of bSuchestarten_ActionPerformed
  
  public void bSucheVerwendungMethode()
  {
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
                    c.removeAll();
                    bLoeschen_ActionPerformed(evt);
                }
            }
        );
        c.add(bLoeschen);
        c.add(lAusgabeLoeschen);
        setVisible(true);
    }

    public void bLoeschen_ActionPerformed(ActionEvent evt){
        // TODO hier Quelltext einfügen
        if(evt.getSource() == this.bLoeschen){
            bLoeschenMethode(); 
        }
    } //

    
    public void bLoeschenMethode(){
        int n;
        try{
            n= Integer.parseInt(tNummer.getText());
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
