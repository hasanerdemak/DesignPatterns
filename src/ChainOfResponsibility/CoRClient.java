package ChainOfResponsibility;

public class CoRClient {
    public static void main(String[] args) {
        Handler handler = new ConcreteHandler1(new ConcreteHandler2());
        System.out.println(handler.HandleRequest(-1));
        System.out.println(handler.HandleRequest(5));
        System.out.println(handler.HandleRequest(10));
        System.out.println(handler.HandleRequest(25));
    }
}
