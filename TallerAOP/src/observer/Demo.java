package observer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {
    static Display display = new Display();

    public static void main(String[] args) {

        Button b1 = new Button(display);
        Button b2 = new Button(display);
        Button b3 = new Button(display);
        b1.setBackground(Color.red);
        b2.setBackground(Color.green);
        b3.setBackground(Color.blue);
        b1.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        		pintarRojo();
		}  
		});
        b2.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        		pintarVerde();
		}  
		});
        b3.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        		pintarAzul();
		}  
		});
    }    
    public static void pintarRojo(){
		display.setBackground(Color.red);
    }
    public static void pintarAzul(){
		display.setBackground(Color.blue);
    }
    public static void pintarVerde(){
		display.setBackground(Color.green);
    }
}



