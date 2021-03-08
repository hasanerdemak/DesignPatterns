package Observer;

public class ConcreteObserver extends Observer {
    String observerState;
    ConcreteSubject subject;
    public ConcreteObserver() {
        subject = new ConcreteSubject();
    }

    @Override
    public void Update() {
        observerState = subject.getSubjectState();
    }
}
