
import java.util.Vector;

aspect SubjectObserverProtocolImpl extends SubjectObserverProtocol {

    declare parents: Button implements Subject;
	public Object Button.getData() {return this;}
	
    declare parents: Display implements Observer;
    public void    Display.update() {
        backgroundChange();
    }

    pointcut stateChanges(Subject s):
        target(s) &&
        call(void Button.click());

}
