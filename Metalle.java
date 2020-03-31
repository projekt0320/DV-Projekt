
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
        this.elektrischeLeitfaehigkeit= elektrischeLeitfaehigkeit;
    }
    
        public void setElektrischeLeitfaehigkeit(double elektrischeLeitfaehigkeit)
        {
            this.elektrischeLeitfaehigkeit= elektrischeLeitfaehigkeit;
        }
    
        public double getElektrischeLeitfaehigkeit()
        {
            return elektrischeLeitfaehigkeit;
            
        }
     
    public  String gibEigenschaft()
    {   
        String s= "elektrischeLeitfaehigkeit: "+ elektrischeLeitfaehigkeit+ ",      name: "+Werkstoffe.getName()+",      nummer: "+Werkstoffe.getNummer()+ ",      verwendung: "+Werkstoffe.getVerwendung() ;
        return s;
        
    }
}