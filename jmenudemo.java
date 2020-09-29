import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jmenudemo extends JFrame implements ActionListener

 {JMenuBar b1;
  JMenu m1,m2,m3,m4;
  JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
  
  public jmenudemo()
 { 
   b1=new JMenuBar();
   setJMenuBar(b1);
     
   m1=new JMenu("Stock");
   m2=new JMenu("Transaction");
   m3=new JMenu("Report");
   m4=new JMenu("quit");
   
   b1.add(m1);
   b1.add(m2);
   b1.add(m3);
   b1.add(m4);
 
   i1=new JMenuItem("Add Item");
   i1.addActionListener(this);
   m1.add(i1);
  
   i2=new JMenuItem("Update");
   i2.addActionListener(this);
   m1.add(i2);

   i3=new JMenuItem("Delete");
   i3.addActionListener(this);
   m1.add(i3);

   i4=new JMenuItem("Issue");
   i4.addActionListener(this);
   m2.add(i4);

   i5=new JMenuItem("Reciept");
   i5.addActionListener(this);
   m2.add(i5);

   i6=new JMenuItem("Reports");
   i6.addActionListener(this);
   m3.add(i6);

   i7=new JMenuItem("All Items");
   i7.addActionListener(this);
   m3.add(i7);
  
   i8=new JMenuItem("All Issues");
   i8.addActionListener(this);
   m3.add(i8);
    
   i9=new JMenuItem("All Reciepts");
   i9.addActionListener(this);
   m3.add(i9);
    
   i10=new JMenuItem("Exit the app");
   i10.addActionListener(this);
   m4.add(i10);
}


public void actionPerformed(ActionEvent h)
{  	if(h.getSource()==i1)
     	{ stockentry q=new stockentry();
          q.setVisible(true);
          q.setSize(800,800);
          q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          q.setTitle("Stock Entry"); 
          dispose();
        }
  
   	if(h.getSource()==i2)
	 {stockupdate k=new stockupdate();
          k.setVisible(true);
          k.setSize(800,800);
          k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          k.setTitle("Stock Update"); 
          dispose(); 
          }
   	
        if(h.getSource()==i3)
   	 {stockupdate k=new stockupdate();
          k.setVisible(true);
    	  k.setSize(800,800);
    	  k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  k.setTitle("Stock Update"); 
            dispose();
          }
 
	if(h.getSource()==i4)
      	{  issuescreen l=new issuescreen();
           l.setVisible(true);
           l.setSize(800,800);
           l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           l.setTitle("Issue Screen"); 
           dispose();      
          }
 
	if(h.getSource()==i5)
     	{ issuescreen l=new issuescreen();
    	  l.setVisible(true);
    	  l.setSize(800,800);
    	  l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  l.setTitle("Issue Screen");
           dispose();
        }

	if(h.getSource()==i6)
     	{tables l=new tables();
         l.setVisible(true);
         l.setSize(800,800);}

	if(h.getSource()==i7)
     	{}

	if(h.getSource()==i8)
     	{}

	if(h.getSource()==i9)
     	{}

	if(h.getSource()==i10)
     	{System.exit(0); }

  }


public static void main(String args[])
{  jmenudemo m=new jmenudemo();
    m.setVisible(true);
    m.setSize(800,800);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setTitle("Main Menu");
}
}   
