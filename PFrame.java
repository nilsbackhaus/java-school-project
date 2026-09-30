import java.awt.Color;

public class PFrame extends javax.swing.JFrame
{ 
  Panel malFlaeche = new Panel();
  
  public PFrame()
  {
      this.setBounds(0,0,500,500);
      // malFlaeche.setBounds(0,0,500,500);
      this.add(malFlaeche);
      this.setVisible(true);
  }
  
  public class Panel extends javax.swing.JPanel
  {
    public void paint(java.awt.Graphics g)
    {
        // Initialize world
        g.setColor(Color.white);
        g.fillRect(0,0,500,500);
        g.setColor(Color.black);
        
        for(int i=0;i<=450;i=i+50)
            g.drawLine(i,0,i,500);
            
        for(int i=0;i<=450;i=i+50)
            g.drawLine(0,i,500,i);
        
        // Create car body
        g.setColor(Color.red);
        g.fillRect(150, 250, 200, 50);
        
        // Front
        g.fillRect(100, 250, 50, 50); // Front
        g.setColor(Color.yellow);
        g.fillRect(100, 200, 50, 50); // Headlight
        
        // Back
        g.setColor(Color.red);
        g.fillRect(350, 200, 50, 100); 
        
        // Create windshield
        g.setColor(Color.cyan);
        g.fillRect(150, 100, 200, 150);
        
        // Create a wheel
        g.setColor(Color.gray);
        g.fillOval(150, 200, 50, 50); 
        
        // Create car tires
        g.setColor(Color.black);
        g.fillOval(150, 300, 50, 50); // Front
        g.fillOval(300, 300, 50, 50); // Right
        
        // Create passengers
        
        // Human
        g.setColor(Color.green);
        g.fillOval(200, 150, 50, 50); // Head
        g.fillRect(200, 200, 50, 50); // Body
        
        // Giraffe
        g.setColor(Color.yellow);
        g.fillOval(250, 150, 50, 50); // Head
        g.fillRect(250, 200, 50, 50); // Body
        
        // g.drawString("Mein erstes Malfenster",150,30);
        // g.setFont(new Font("Serif",3,20));
        // g.drawString("Ein neuer Schriftzug ",120,50);
        // g.setColor(Color.yellow);
        // g.fillOval(50,100,300,300);
        // g.setColor(new Color(0,0,0));
        // g.fillOval(100,150,50,50);
        // g.fillOval(250,150,50,50);
        // g.setColor(Color.blue);
        // g.fillRect(185,150,30,100);
        // g.setColor(Color.red);
        // g.fillArc(100,275,200,50,0,-180);
    }
  }
}
