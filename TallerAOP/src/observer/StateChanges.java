package observer;

public class StateChanges extends EventListener{
	public StateChanges(EventManager subject) {
		this.subject = subject;
		this.subject.join(this);
	}
	@Override
	public void update() {
		System.out.println("Cambie de color a " + subject.getState());
		
	}

}
