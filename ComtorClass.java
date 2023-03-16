import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComtorClass {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);al.add(20);al.add(50);al.add(80);al.add(100);al.add(70);
        System.out.println(al);
        //Collections.sort(al,new MyComptor());
        Collections.sort(al,(o1,o2)-> (o1<o2)?-1:(o1>o2)?+1:0);
        //System.out.println(al);
        al.stream().forEach(System.out::println);
        List<Integer> al2 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(al2);

    }
}
