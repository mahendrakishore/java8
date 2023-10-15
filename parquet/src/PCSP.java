import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PCSP {
    public static void main(String[] args) {
       List<Integer> pl = Arrays.asList(650,250,730,530);
        Predicate<Integer> pf= p -> p > 500;
        pl.stream().filter(pf).forEach(n -> System.out.println(n));

    }
}
