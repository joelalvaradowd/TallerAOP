package observer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Button extends java.awt.Button {

	private static final long serialVersionUID = -6372448150200545733L;
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
    	counter();
    }
    
    public void counter() {
    	counter++;
    	this.setLabel(Integer.toString(counter));
    }
    
}
