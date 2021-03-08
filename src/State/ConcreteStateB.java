package State;

public class ConcreteStateB extends State {
    @Override
    void Handle(Context ctx) {
        System.out.println("State B");
    }
}
