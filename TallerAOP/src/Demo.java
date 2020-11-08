//package observer;

import java.awt.Color;

public class Demo {
    public static void main(String[] args) {

        Display display = new Display();
        Button b1 = new Button(display);
        Button b2 = new Button(display);
        Button b3 = new Button(display);
        b1.setBackground(Color.red);
        b2.setBackground(Color.green);
        b3.setBackground(Color.blue);
        b1.addObserver(display);
        b2.addObserver(display);
        b3.addObserver(display);
    }
}



