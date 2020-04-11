
/**
 * Die Klasse Metalle ist eine abstrakte Subklasse von "Werkstoffe", initialisiert das Attribut elektrische Leitfähigkeit und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft.
 * 
 * @author Markus Schnee, Jenny Glönkler 
 * @version 11.04.2020
 */
public abstract class Metalle extends Werkstoffe
{
    private double elektrischeLeitfaehigkeit;
    
    public Metalle(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit)
    {   
        
        super(name,nummer,verwendung);
        if(elektrischeLeitfaehigkeit>0)
        {
            this.elektrischeLeitfaehigkeit= elektrischeLeitfaehigkeit;
        }
    //xyz
        
    }
    
    public void setElektrischeLeitfaehigkeit(double elektrischeLeitfaehigkeit)
    {
        if(elektrischeLeitfaehigkeit>0)
        {
            this.elektrischeLeitfaehigkeit= elektrischeLeitfaehigkeit;
    
        }
    }
    
    public double getElektrischeLeitfaehigkeit()
    {
        return elektrischeLeitfaehigkeit;

    }

    public  String gibEigenschaft()
    {   

        String s= " name:   "+this.getName()+"\n nummer:   "+this.getNummer()+ "\n verwendung:   "+this.getVerwendung()+"\n   elektrischeLeitfaehigkeit: "+ elektrischeLeitfaehigkeit;
        return s;


    }
}