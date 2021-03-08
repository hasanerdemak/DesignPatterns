package Decorator;

public class Decorator extends Component {
    Component component;

    public Decorator(Component cmp) {
        component = cmp;
    }

    @Override
    String Operation() {
        return component.Operation();
    }
}
