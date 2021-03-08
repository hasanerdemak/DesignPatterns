package ChainOfResponsibility;
//10<=x<20
public class ConcreteHandler2 extends Handler {
    @Override
    String HandleRequest(int b) {
        if (b<20)
            return b + " is accepted by Concretehandler2.";
        else
            return b + " is rejected by Concretehandler2.";
    }
}
