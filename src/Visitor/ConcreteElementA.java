package Visitor;

public class ConcreteElementA extends Element {
    @Override
    public void Accept(Visitor v) {
        v.VisitConreteElementA(this);
    }

    public void OperationA(){

    }
}
