import java.util.function.Consumer;
import java.util.stream.Stream;

public class PCSC {
    public static void main(String[] args) {
        Consumer<String> print = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(print);
    }
}
