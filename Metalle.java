
/**
 * Beschreiben Sie hier die Klasse Metalle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
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
