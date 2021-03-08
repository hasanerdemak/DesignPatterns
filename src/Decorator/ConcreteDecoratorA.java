package Decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component cmp){
        super(cmp);
    }
    @Override
    String Operation() {
        return super.Operation() + AddedBehavior();
    }

    String AddedBehavior() {
        return "with A";
    }

}
