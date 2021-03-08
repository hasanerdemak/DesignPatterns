package Observer;

import java.util.ArrayList;

public class Subject {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void _notify(){
        for (Observer obs:observers) {
            obs.Update();
        }
    }

}
