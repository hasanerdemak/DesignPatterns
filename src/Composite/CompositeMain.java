package Composite;

public class CompositeMain {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        Leaf leaf3 = new Leaf("leaf3");

        Composite composite1 = new Composite("composite1");
        Composite composite2 = new Composite("composite2");

        Composite leaderComposite = new Composite("leader composite");

        composite1.Add(leaf1);
        composite1.Add(leaf2);

        composite2.Add(leaf3);

        leaderComposite.Add(composite1);
        leaderComposite.Add(composite2);

        leaderComposite.Operation();
        System.out.println("asdp");
        leaderComposite.GetChild(3).Operation();

    }
}
