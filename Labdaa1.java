import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Labdaa1 {
    public static void main(String[] args) {
        List<Integer> intlst = new ArrayList<>();
        Predicate<Integer> p = i -> i%2==0;
        System.out.println(p.test(4));
        System.out.println(p.test(5));

    }}
