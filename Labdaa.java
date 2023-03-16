import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Labdaa {

    public static void main(String[] args) {
        List<Integer> intlst = new ArrayList<>();

        Function<Integer,Integer> f=i -> i*i;
        System.out.println(f.apply(5));
        System.out.println(f.apply(4));


    }
}
