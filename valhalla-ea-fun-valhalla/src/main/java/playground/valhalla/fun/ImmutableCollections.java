package playground.valhalla.fun;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ImmutableCollections {

    static void main() {
        System.out.println(Objects.hasIdentity(List.of()));
        System.out.println(Objects.hasIdentity(List.of("one")));
        System.out.println(Objects.hasIdentity(List.of("one", "two")));
        System.out.println(Objects.hasIdentity(List.of("one", "two", "many")));
        System.out.println(Objects.hasIdentity(Set.of()));
        System.out.println(Objects.hasIdentity(Set.of("one")));
        System.out.println(Objects.hasIdentity(Set.of("one", "two")));
        System.out.println(Objects.hasIdentity(Set.of("one", "two", "many")));
    }

}
