import java.util.ArrayList;
import java.util.Comparator;


public class Reserch implements Comparator<Person>{
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName() + " " + t.p2.getAge() + " лет");
            }
        }
        return result;
    }

     public ArrayList<String> spendGrand(Relationship re) {
        for (Node t : tree) {
            if (t.re == re) {
                result.add(t.p1.getFullName() + " " + t.p1.getAge() + " лет");
            }
        }
        return result;
    }

    public ArrayList<String> spendOlder(int age) {
        for (Node t : tree) {
            if (t.p1.getAge() > age) {
                result.add(t.p1.getFullName() + " " + t.p1.getAge() + " лет");
            }
        }
        return result;
    }

    public ArrayList<String> spendOlderPerson(Person p) {
        for (Node t : tree) {
            if (t.p1.getAge() > p.getAge()) {
                result.add(t.p1.getFullName() + " " + t.p1.getAge() + " лет");
            }
        }
        return result;
    }

    @Override
    public int compare(Person arg0, Person arg1) {
        return arg0.getAge() - arg1.getAge();
    }

}
