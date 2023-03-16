import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpMain {

    public static void main(String[] args) {

        List<Emp>  empal = new ArrayList<Emp>();
        empal.add(new Emp("mahen",100));
        empal.add(new Emp("kis",200));
        empal.add(new Emp("mahenkis",50));
        System.out.println(empal);
        Collections.sort(empal, (e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
        System.out.println(empal);

    }
}
