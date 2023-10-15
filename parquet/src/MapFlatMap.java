import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {

    public static void main(String[] args) {
          List<Integer> al=Arrays.asList(1,2,3,4,5);
          List<Integer> sarl = al.stream().map(n->n+10).collect(Collectors.toList());
          System.out.println(sarl);
        List<Integer> al1=Arrays.asList(1,2,3);
        List<Integer> al2=Arrays.asList(4,5,6);
        List<Integer> al3=Arrays.asList(7,8,9);
List<List<Integer>> flatmap = Arrays.asList(al1,al2,al3);
List<Integer> fm = flatmap.stream().flatMap(x->x.stream().map(n->n+1)).collect(Collectors.toList());
System.out.println(fm);

    }
}
