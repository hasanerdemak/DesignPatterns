package ChainOfResponsibility;
//0<=x<10
public class ConcreteHandler1 extends Handler {
    Handler successor;
    public ConcreteHandler1(Handler suc){
        successor = suc;
    }
    @Override
    String HandleRequest(int a) {
        if (a>=10)
            return successor.HandleRequest(a);
        else if (a>=0)
            return a + " is accepted by Concretehandler1.";
        return a + " is rejected by Concretehandler1.";
    }
}
