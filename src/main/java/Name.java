
import java.util.Arrays;
import java.util.LinkedList;

public class Name {

    public static void main(String[] args) {
        var irina = new Person("irina");
        var vasya = new Person("vasya");
        var masha = new Person("masha");
        var jane = new Person("jane");
        var ivan = new Person("ivan");


        GeoTree gt = new GeoTree();
//        var Eve = new Person("Ева");
//        var Adam = new Person("Адам");


        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);


        System.out.println(
                new Search(gt).spend(irina, Human.Relationship.parent));

        var res = Human.Relationship.parent.ordinal();

        System.out.println();
        System.out.println(Human.Relationship.res.name());

//        LinkedList<Human> listofNames = new LinkedList<>();
//        People people = new People();
//        listofNames.add(people.Eve);
//        listofNames.add(people.Adam);
//        listofNames.add(people.Vadim);




    }
}





