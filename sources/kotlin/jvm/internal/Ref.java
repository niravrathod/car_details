package kotlin.jvm.internal;

import java.io.Serializable;

public class Ref {

    public static final class ObjectRef<T> implements Serializable {
        public T element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }
}
