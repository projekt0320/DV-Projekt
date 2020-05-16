
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Beschreiben Sie hier die Klasse Stahlerstellen_GUI.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Stahlerstellen_GUI extends JFrame
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
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

    private JButton erstellen = new JButton();

    /**
     * Konstruktor für Objekte der Klasse Stahlerstellen_GUI
     */
    public Stahlerstellen_GUI()
    {
        super();
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
                    erstellen_ActionPerformed(evt);
                }
            }
            );

        setVisible(true);
    }

    public void erstellen_ActionPerformed(ActionEvent evt)
    {

        String na = tName.getText();
        int nr = Integer.parseInt(tNummer.getText());
        String ve = tVerwendung.getText();

        //Datenbank.ErstellenStahl(na, nr, ve, 3, 45, 2);
    }

    public static void main(String[] args) {
        new Stahlerstellen_GUI();
    } 

}
