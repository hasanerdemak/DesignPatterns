package Mediator;

import java.util.ArrayList;

public class ConcreteMediator extends Mediator {
    ArrayList<Colleague> colleagues;
    public ConcreteMediator(){
        colleagues = new ArrayList<Colleague>();
    }
    public void add(Colleague col){
        colleagues.add(col);
    }
}
