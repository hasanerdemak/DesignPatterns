package State;

public class ConcreteStateA extends State {
    @Override
    void Handle(Context ctx) {
        System.out.println("State A");
    }
}
