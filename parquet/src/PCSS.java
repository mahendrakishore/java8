import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class PCSS {
    public static void main(String[] args) {
        List<Integer> pl = Arrays.asList(650,250,730,530);
        Supplier<Integer> si = () -> 750;
   System.out.println(si.get());
    }
}
