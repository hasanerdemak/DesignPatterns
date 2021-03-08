package Composite;

public class Component {
    public void Operation() { }

    public void Add(Component component){ }

    public void Remove(Component component){ }

    public Component GetChild(int x){ return this; }
}
