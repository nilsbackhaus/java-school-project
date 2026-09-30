public class DatenFormular extends Console  
{  
    public static void main(String[] args) 
    {  
        String Name = "";
        String Nachname = "";
        
        System.out.print("Ihr Name? ");
        Name = readString();
        
        System.out.print("Ihr Nachname? ");
        Nachname = readString();
        
        System.out.println(String.format("Willkommen %s %s", Name, Nachname));
    }
}