package observer;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;


class Display extends Panel {
	private static final long serialVersionUID = -5859749639403673116L;
	protected Frame frame = new Frame("Subject/Observer Demo");

    Display() {
        frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {System.exit(0);}
            });
        frame.setVisible(true);

        frame.add(this, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(720,720);
    }

    void addToFrame(Component c) {
        add(c);
    }
}
