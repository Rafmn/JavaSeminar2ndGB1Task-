import java.util.ArrayList;


public class WriteFile {
        ArrayList<Node> tree;
        ArrayList<String> result = new ArrayList<>();

    public WriteFile(GeoTree geoTree) {
        tree = geoTree.getTree();
        
    }

    public ArrayList<String> spend() {
        for (Node t : tree) {      
            result.add(t.p1.fullName + " " + t.p1.age + " " + t.re + " " + t.p2.fullName + " " + t.p2.age);
        }
    
        
        return result;
    }
}