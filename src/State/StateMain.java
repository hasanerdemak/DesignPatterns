package State;

public class StateMain {
    public static void main(String[] args) {
        Context context= new Context();
        context.Request();
        context.Request();
        context.setState(new ConcreteStateB());
        context.Request();
    }
}
