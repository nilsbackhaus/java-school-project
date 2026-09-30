public class Leistung extends Console 
{ 
    public void berechneP() 
        { 
        double p = 0.0; 
        double i = 0.0; 
        double u = 0.0; 
            
        System.out.println("Berechnung der Leistung P = U * I"); 
        System.out.print("Spannung U in V: "); 
        u = readDouble(); 
        System.out.print("Stromstärke I in A: "); 
        i = readDouble(); 
            
        p = u * i; 
        System.out.println("Die Leistung beträgt P = U * I = "+ p +" W");  
    }    
         
    public void berechneU() 
    { 
        double p = 0.0; 
        double i = 0.0; 
        double u = 0.0;
            
        System.out.println("Berechnung der Spannung  U = P / I"); 
        System.out.print("Leistung P in W: "); 
        p = readDouble(); 
        System.out.print("Stromstärke I in A: "); 
        i = readDouble(); 
            
        u = p / i; 
        System.out.println("Die Spannung beträgt U = P / I = "+ u+ " V"); 
    }
        
    public void berechneI() 
    { 
        double p = 0.0; 
        double i = 0.0; 
        double u = 0.0; 
            
        System.out.println("Berechnung der Stromstärke  I = P / U"); 
        System.out.print("Leistung P in W: "); 
        p = readDouble(); 
        System.out.print("Spannung U in V: "); 
        u = readDouble(); 
            
        i = p / u; 
        System.out.println("Die Stromstärke beträgt I = P / U = "+ i +" A");                   
    }     
} 
