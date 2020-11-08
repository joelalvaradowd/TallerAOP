package observer;
import java.util.List;
import java.util.ArrayList;

public class EventManager {
    private List<EventListener> observers = new ArrayList<EventListener>();
    private String state;
    
    public String getState() {
    	return state;
    }
    public void setState(String state) {
    	this.state = state;
    	notifyState();
    }
    
    public void join(EventListener observer) {
    	observers.add(observer);
    }
    public void leave(EventListener observer) {
    	observers.remove(observer);
    }
    public void notifyState() {
    	for(EventListener observer: observers) {
    		observer.update();
    	}
    }
}
