package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C2885g;

public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    /* renamed from: c */
    public final A m13868c() {
        return this.first;
    }

    /* renamed from: d */
    public final B m13869d() {
        return this.second;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Pair) {
                Pair pair = (Pair) obj;
                if (C2885g.m13909a(this.first, pair.first) && C2885g.m13909a(this.second, pair.second)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.first;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.second;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public Pair(A a, B b) {
        this.first = a;
        this.second = b;
    }

    /* renamed from: a */
    public final A m13866a() {
        return this.first;
    }

    /* renamed from: b */
    public final B m13867b() {
        return this.second;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(this.first);
        stringBuilder.append(", ");
        stringBuilder.append(this.second);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
