
public class Node {
    Person p1;
    Person p2;
    Human.Relationship re;

    public Node(Person p1, Human.Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", p1, re, p2);
    }
}

