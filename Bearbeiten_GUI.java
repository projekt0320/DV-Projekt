import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Beschreiben Sie hier die Klasse Bearbeiten_GUI.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bearbeiten_GUI extends JFrame
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
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

    /**
     * Konstruktor für Objekte der Klasse Loeschen_GUI
     */
    public Bearbeiten_GUI()
    {
        super();
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
        c.add(l3);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Bearbeiten_GUI();
    } 

    public void bBearbeiten_ActionPerformed(ActionEvent evt){
        // TODO hier Quelltext einfügen
        if(evt.getSource() == this.bBearbeiten){
           int i= Liste.getSelectedIndex();
        if(i==0){
            bearbeitenNameMethode();
        }
        }
    } //

    private Datenbank Datenbank = new Datenbank();
    public void bearbeitenNameMethode(){
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
}
