package sie2019;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class SieConcurrent {

    public static void main(String... args) {

    }

    private static void concurrentHashSet() {
        Collections.newSetFromMap(new ConcurrentHashMap<>());
    }
}
