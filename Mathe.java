public class Mathe extends Console
{
    public void ganzZahlDividieren()
    {
        int x = 0;
        int y = 0;
        int z = 0;
        
        System.out.println("Division von zwei Ganzzahlen");
        System.out.print("Geben Sie x ein: ");
        x = readInt();
        System.out.print("Geben Sie y ein: ");
        y = readInt();
        
        z = x / y; // test
        System.out.println("Ergebnis der Division x/y = "+ z);
    }
    
    public void ganzZahlDividierenRest()
    {
        int x = 0;
        int y = 0;
        int z = 0;
        
        System.out.println("Modulo von zwei Ganzzahlen");
        System.out.print("Geben Sie x ein: ");
        x = readInt();
        System.out.print("Geben Sie y ein: ");
        y = readInt();
        
        z = x % y;
        System.out.println("Ergebnis des Modulos x%y = "+ z);
    }
    
    public void addieren()
    {
        double x = 0.0;
        double y = 0.0;
        double z = 0.0;
        
        System.out.println("Addition von zwei Gleitkommazahlen");
        System.out.print("Geben Sie x ein: ");
        x = readDouble();
        System.out.print("Geben Sie y ein: ");
        y = readDouble();
        
        z = x + y;
        System.out.println("Ergebnis der Addition x+y = "+ z);
    }  
 
    public void subtrahieren()
    {
        double x = 0.0;
        double y = 0.0;
        double z = 0.0;
        
        System.out.println("Subtraktion von zwei Gleitkommazahlen");
        System.out.print("Geben Sie x ein: ");
        x = readDouble();
        System.out.print("Geben Sie y ein: ");
        y = readDouble();
        
        z = x - y;
        System.out.println("Ergebnis der Subtraktion x-y = "+ z);
    } 
    
    public void dividieren()
    {
        double x = 0.0;
        double y = 0.0;
        double z = 0.0;
        
        System.out.println("Division von zwei Gleitkommazahlen");
        System.out.print("Geben Sie x ein: ");
        x = readDouble();
        System.out.print("Geben Sie y ein: ");
        y = readDouble();
        
        z = x / y;
        System.out.println("Ergebnis der Division x/y = "+ z);
    }
    
    public void multiplizieren()
    {
        double x = 0.0;
        double y = 0.0;
        double z = 0.0;
        
        System.out.println("Multiplikation von zwei Gleitkommazahlen");
        System.out.print("Geben Sie x ein: ");
        x = readDouble();
        System.out.print("Geben Sie y ein: ");
        y = readDouble();
        
        z = x * y;
        System.out.println("Ergebnis der Multiplikation x*y = "+ z);
    }
    
    public void quadrieren()
    {
        double x = 0.0;
        double z = 0.0;
        
        System.out.println("Quadrierung von zwei Gleitkommazahlen");
        System.out.print("Geben Sie x ein: ");
        x = readDouble();
        
        z = x * x;
        System.out.println("Ergebnis der Quadrierung x^2 = "+ z);
    } 
}
