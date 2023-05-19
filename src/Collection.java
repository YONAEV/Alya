import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> groups = new ArrayList<>();
        groups.add("Mariya");
        groups.add("Dilem");
        groups.add("Kirill");
        groups.add("Lea");
        groups.add("Anastasia");
        groups.add("Chynara");

        Iterator<String> itr = groups.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
