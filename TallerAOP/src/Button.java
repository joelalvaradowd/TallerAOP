import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Button extends java.awt.Button {

    static final Color  defaultBackgroundColor = Color.gray;
    static final Color  defaultForegroundColor = Color.black;
    static final String defaultText = "ClickMe";
    private int counter=0;
    
    Button(Display display) {
    	
        super();
        setLabel(defaultText);
        setBackground(defaultBackgroundColor);
        setForeground(defaultForegroundColor);
        addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Button.this.click();
                }
            });
        display.addToFrame(this);
    }

    public void click() {
    	this.getParent().setBackground(this.getBackground());
    	counter();
    }
    
    public void counter() {
    	counter++;
    	this.setLabel(Integer.toString(counter));
    }
    
    }
