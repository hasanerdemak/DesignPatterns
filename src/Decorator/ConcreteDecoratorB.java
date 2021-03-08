package Decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component cmp) {
        super(cmp);
    }
    @Override
    String Operation() {
        return super.Operation() + AddedBehavior();
    }

    String AddedBehavior() {
        return "with B";
    }
}
