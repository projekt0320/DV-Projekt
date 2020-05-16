
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Beschreiben Sie hier die Klasse Erstellen_GUI.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Erstellen_GUI extends JFrame
{

    private JButton bStahlerstellen = new JButton();
    private JButton bGusseisenerstellen = new JButton();
    private JButton bLeichtmetalleerstellen = new JButton();
    private JButton bSchwermetalleerstellen = new JButton();
    private JButton bHalbleitererstellen = new JButton();
    private JButton bKeramikerstellen = new JButton();
    private JButton bKunststofferstellen = new JButton();
    private JButton bNaturstofferstellen = new JButton();

    public Erstellen_GUI()
    {
        super();
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
                    Stahlerstellen_GUI SE = new Stahlerstellen_GUI();
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

    public static void main(String[] args) {
        new Erstellen_GUI();
    } 

    
}
