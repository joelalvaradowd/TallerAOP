package observer;

public abstract class EventListener {
    public EventManager subject;
    public abstract void update();
}