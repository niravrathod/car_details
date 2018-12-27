package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.p152c.C2865a;
import kotlin.p152c.C2866c;

public abstract class CallableReference implements Serializable, C2865a {
    /* renamed from: b */
    public static final Object f18070b = NoReceiver.f12087a;
    /* renamed from: a */
    private transient C2865a f18071a;
    protected final Object receiver;

    private static class NoReceiver implements Serializable {
        /* renamed from: a */
        private static final NoReceiver f12087a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() {
            return f12087a;
        }
    }

    /* renamed from: f */
    protected abstract C2865a mo4539f();

    public CallableReference() {
        this(f18070b);
    }

    protected CallableReference(Object obj) {
        this.receiver = obj;
    }

    /* renamed from: g */
    public Object m23716g() {
        return this.receiver;
    }

    /* renamed from: h */
    public C2865a m23717h() {
        C2865a c2865a = this.f18071a;
        if (c2865a != null) {
            return c2865a;
        }
        c2865a = mo4539f();
        this.f18071a = c2865a;
        return c2865a;
    }

    /* renamed from: c */
    public C2866c mo4666c() {
        throw new AbstractMethodError();
    }

    /* renamed from: d */
    public String mo4667d() {
        throw new AbstractMethodError();
    }

    /* renamed from: e */
    public String mo4668e() {
        throw new AbstractMethodError();
    }
}
