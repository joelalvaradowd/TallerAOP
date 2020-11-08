package observer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Aspect that will update every action in a Txt File.
 * @author TeamOne
 *
 */
public aspect Logger {
	EventManager subject = new EventManager();
	StateChanges changes = new StateChanges(subject);
    File file = new File("log.txt");

    pointcut pintarR(): call(* pintarRojo(..)); 
    pointcut pintarG(): call(* pintarVerde(..)); 
    pointcut pintarB(): call(* pintarAzul(..)); 
    after(): pintarR() {
    	subject.setState("DISPLAY > ROJO");
    }
    after(): pintarG() {
    	subject.setState("DISPLAY > AZUL");
    }
    after():pintarB(){
    	subject.setState("DISPLAY > VERDE");
    }
    
    after():pintarR() || pintarG() || pintarB(){
    	logging();
    }
    public void logging() {
    	try
        {
        	BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
            Calendar cal = Calendar.getInstance();
        	if(!file.exists()){
         	   file.createNewFile();
         	}
        	Date fecha = cal.getTime();
        	SimpleDateFormat DateFor = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        	String stringDate= DateFor.format(fecha);
        	stringDate = DateFor.format(fecha);
            bw.write(subject.getState() + "| DATETIME:" + stringDate + "\n");
            bw.close();
            System.out.println("Logged successfully");
            
        } catch (Exception e) {
        	System.out.println("Error in logger.");
        }
    }
}
