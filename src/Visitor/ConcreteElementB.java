package Visitor;

public class ConcreteElementB extends Element {
    @Override
    public void Accept(Visitor v) {
        v.VisitConreteElementB(this);
    }

    public void OperationB(){

    }
}
