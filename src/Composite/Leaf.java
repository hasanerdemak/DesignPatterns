package Composite;

public class Leaf extends Component {
    private String name;
    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void Operation() {
        System.out.println(name);
    }
}
