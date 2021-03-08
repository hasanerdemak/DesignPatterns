package Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Component cmp = new ConcreteDecoratorA(new ConcreteComponent());
        System.out.println(cmp.Operation());
    }
}
