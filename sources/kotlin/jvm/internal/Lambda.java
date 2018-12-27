package kotlin.jvm.internal;

public abstract class Lambda implements FunctionBase {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    public String toString() {
        return C2886h.m13913a(this);
    }
}
