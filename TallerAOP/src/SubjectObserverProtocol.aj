
import java.util.Vector;

abstract aspect SubjectObserverProtocol {

    //private Vector Subject.observers = new Vector();
    private Vector Subject.observers = new Vector();
    public void   Subject.addObserver(Observer obs) {
        observers.addElement(obs);
        obs.setSubject(this);
    }
    public void   Subject.removeObserver(Observer obs) {
        observers.removeElement(obs);
        obs.setSubject(null);
    }
    public Vector Subject.getObservers() { return observers; }

    private Subject Observer.subject = null;
    public void     Observer.setSubject(Subject s) { subject = s; }
    public Subject  Observer.getSubject() { return subject; }
}
