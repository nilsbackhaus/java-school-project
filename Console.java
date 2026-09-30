import java.io.*; 

public class Console 
{
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
  
    public static boolean readBoolean() { 
      try {  
          return Boolean.valueOf(input.readLine()).booleanValue(); 
      } 
      catch ( Exception exc) { 
          System.err.println(exc.getMessage()); 
          System.err.println("Fehler: Es wurde kein boolean Wert eingeben");  
      }     
         
      return (boolean) false; 
     } 
  
    public static String readString() { 
      try {      
           return input.readLine();        
      }   
      catch (Exception exc) { 
          System.err.println("Fehler: Es wurde kein String eingeben");      
          System.err.println(exc.getMessage()); 
      }     
         
      return (String) ""; 
    }      
      
    public static char readChar() { 
      try {      
           char buchstabe; 
           buchstabe = (char) input.read(); 
           input.readLine();
           return buchstabe; 
      }   
      catch ( Exception exc) { 
          System.err.println("Fehler: Es wurde kein Char Wert eingeben");      
          System.err.println(exc.getMessage()); 
      }     
         
      return (char) ' '; 
    } 
  
    public static long readLong() { 
      try {  
          return Long.valueOf(input.readLine()).longValue(); 
      }     
      catch ( NumberFormatException nfExc) { 
          System.err.println("Fehler: Es wurde kein Long Wert eingeben");                
      }   
      catch ( Exception exc) { 
          System.err.println(exc.getMessage()); 
      }     
         
      return (long) 0; 
    } 
  
    public static short readShort() { 
      try {  
          return Short.valueOf(input.readLine()).shortValue(); 
      }     
      catch ( NumberFormatException nfExc) { 
          System.err.println("Fehler: Es wurde kein Short Wert eingeben");               
      }   
      catch ( Exception exc) { 
          System.err.println(exc.getMessage()); 
      }     
         
      return (short) 0; 
     }
     
    public static byte readByte() { 
      try {  
          return Byte.valueOf(input.readLine()).byteValue(); 
      }     
      catch ( NumberFormatException nfExc) { 
          System.err.println("Fehler: Es wurde kein Byte Wert eingeben");                
      }   
      catch ( Exception exc) { 
          System.err.println(exc.getMessage()); 
      }     
         
      return (byte) 0; 
    } 
  
    public static double readDouble() { 
      try {  
          return Double.valueOf(input.readLine()).doubleValue(); 
      }     
      catch ( NumberFormatException nfExc) { 
          System.err.println("Fehler: Es wurde kein Double Wert eingeben");              
      }   
      catch ( Exception exc) { 
          System.err.println(exc.getMessage()); 
      }     
         
      return (double) 0.0; 
     } 
 
    public static int readInt() { 
      try {  
          return Integer.valueOf(input.readLine()).intValue(); 
      }     
      catch ( NumberFormatException nfExc) { 
          System.err.println("Fehler: Es wurde kein Integer Wert eingegeben.");              
      }   
      catch ( Exception exc) { 
          System.err.println(exc.getMessage()); 
      }     
         
      return (int) 0; 
    } 

    public static float readFloat() { 
      try {  
          return Float.valueOf(input.readLine()).floatValue(); 
      }     
      catch ( NumberFormatException nfExc) { 
          System.err.println("Fehler: Es wurde kein float Wert eingegeben.");                
      }   
      catch ( Exception exc) { 
          System.err.println(exc.getMessage()); 
      }     
         
      return (float) 0; 
     }   
} 