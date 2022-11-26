import java.util.ArrayList;

class Search {
    ArrayList<Node> tree;

    public Search(Tree pd) {
        tree = pd.getData();
    }

    public ArrayList<Person> spend(Human p, Human.Relationship re) {
        var result = new ArrayList<Person>();
        for (Node t : tree) {
            if (t.p1.getFullname() == p.getFullname() && t.re == re) {
                result.add(t.p2);
            }
        }
        return result;
    }

}

interface Tree {
    void append(Person parent, Person children);

    ArrayList<Node> getData();
}

class GeoTree implements Tree {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getData() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Human.Relationship.parent, children));
        tree.add(new Node(children, Human.Relationship.children, parent));
        System.out.println("я здесь" + tree);
    }



}