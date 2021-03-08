package State;

public class Context {
    private State currentState;
    public Context(){
        currentState = new ConcreteStateA();
    }

    public void setState(State state){
        currentState = state;
    }

    void Request() {
        currentState.Handle(this);
    }
}
