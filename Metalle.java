
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
    
    public Metalle(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit)throws Exception
    {   
        
        super(name,nummer,verwendung);
        setElektrischeLeitfaehigkeit( elektrischeLeitfaehigkeit);
   
        
    }
    
    public void setElektrischeLeitfaehigkeit(double elektrischeLeitfaehigkeit)throws Exception
    {
        if(elektrischeLeitfaehigkeit>0.68 && elektrischeLeitfaehigkeit <= 62)
        {
            this.elektrischeLeitfaehigkeit= elektrischeLeitfaehigkeit;
    
        }
        else
        {
           throw new Exception("Die angegebene elektrische Leitfähigkeit ist ungültig");
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