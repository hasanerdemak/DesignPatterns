package Bridge;

public class Abstraction {
    Implementor imp;
    void Operation() {
        imp = new ConcreteImplementorA();
        for (int i = 0; i < 5; i++) {
            System.out.println(imp.OperationImp());
        }

        imp = new ConcreteImplementorB();
        for (int i = 0; i < 5; i++) {
            System.out.println(imp.OperationImp());
        }
    }
}
