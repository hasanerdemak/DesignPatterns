package Composite;

import java.util.ArrayList;
//Aggregiation
public class Composite extends Component {
    private String name;
    private ArrayList<Component> children = new ArrayList<Component>();
    public Composite(String name){
        this.name = name;
    }
    @Override
    public void Operation() {
        System.out.println(name);
        for (Component comp:children) {
            comp.Operation();
        }
    }

    @Override
    public void Add(Component component) {
        children.add(component);
    }

    @Override
    public void Remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component GetChild(int x) {
        if (x>children.size()-1)
            return children.get(children.size()-1);
        return children.get(x);
    }
}
