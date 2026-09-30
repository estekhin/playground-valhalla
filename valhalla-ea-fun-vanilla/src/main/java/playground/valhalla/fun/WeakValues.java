package playground.valhalla.fun;

import java.lang.ref.WeakReference;

public class WeakValues {

    static void main() {
        System.out.println(reference(1.0d));
    }

    static WeakReference<?> reference(Object value) {
        return new WeakReference<>(value);
    }

}
