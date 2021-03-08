package Visitor;

public class ConcreteVisitor2 extends Visitor {
    public void VisitConreteElementA(ConcreteElementA concreteElementA) {
        super.VisitConreteElementA(concreteElementA);
    }

    @Override
    public void VisitConreteElementB(ConcreteElementB concreteElementB) {
        super.VisitConreteElementB(concreteElementB);
    }
}
