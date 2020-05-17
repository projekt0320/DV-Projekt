
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
public class Loeschen_GUI extends JFrame
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private JLabel lNummer;
    private JLabel lAusgabe;

    private JTextField tNummer;

    private JButton bLoeschen = new JButton();
    /**
     * Konstruktor für Objekte der Klasse Loeschen_GUI
     */
    public Loeschen_GUI()
    {
        super();
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

        lNummer=new JLabel ("Nummer des Werkstoffs, der gelöscht werden soll:");
        lAusgabe=new JLabel();

        tNummer=new JTextField(10);

        c.add(lAusgabe);
        c.add(lNummer);
        c.add(tNummer);

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
        setVisible(true);
    }

    public static void main(String[] args) {
        new Loeschen_GUI();
    } 

    public void bLoeschen_ActionPerformed(ActionEvent evt){
        // TODO hier Quelltext einfügen
        if(evt.getSource() == this.bLoeschen){
            bLoeschenMethode(); 
        }
    } //

    private Datenbank Datenbank = new Datenbank(); 
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
                lAusgabe.setText("Werkstoff wurde gelöscht");
            }
            catch(Exception e) {
                lAusgabe.setText(e.getMessage());
            }
        }
        else {
            lAusgabe.setText("Eingabe ist nicht in Ordnung");
        }
    }
}