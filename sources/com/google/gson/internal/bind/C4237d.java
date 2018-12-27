package com.google.gson.internal.bind;

import com.google.gson.C2657k;
import com.google.gson.C4212h;
import com.google.gson.C4256l;
import com.google.gson.C4257m;
import com.google.gson.C4258n;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.gson.internal.bind.d */
public final class C4237d extends JsonWriter {
    /* renamed from: a */
    private static final Writer f17871a = new C26451();
    /* renamed from: b */
    private static final C4258n f17872b = new C4258n("closed");
    /* renamed from: c */
    private final List<C2657k> f17873c = new ArrayList();
    /* renamed from: d */
    private String f17874d;
    /* renamed from: e */
    private C2657k f17875e = C4256l.f17892a;

    /* renamed from: com.google.gson.internal.bind.d$1 */
    static class C26451 extends Writer {
        C26451() {
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void close() {
            throw new AssertionError();
        }
    }

    public void flush() {
    }

    public C4237d() {
        super(f17871a);
    }

    /* renamed from: a */
    public C2657k m23218a() {
        if (this.f17873c.isEmpty()) {
            return this.f17875e;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected one JSON element but was ");
        stringBuilder.append(this.f17873c);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: b */
    private C2657k m23217b() {
        return (C2657k) this.f17873c.get(this.f17873c.size() - 1);
    }

    /* renamed from: a */
    private void m23216a(C2657k c2657k) {
        if (this.f17874d != null) {
            if (!c2657k.m12970j() || getSerializeNulls()) {
                ((C4257m) m23217b()).m23353a(this.f17874d, c2657k);
            }
            this.f17874d = null;
        } else if (this.f17873c.isEmpty()) {
            this.f17875e = c2657k;
        } else {
            C2657k b = m23217b();
            if (b instanceof C4212h) {
                ((C4212h) b).m23115a(c2657k);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public JsonWriter beginArray() {
        C2657k c4212h = new C4212h();
        m23216a(c4212h);
        this.f17873c.add(c4212h);
        return this;
    }

    public JsonWriter endArray() {
        if (this.f17873c.isEmpty() || this.f17874d != null) {
            throw new IllegalStateException();
        } else if (m23217b() instanceof C4212h) {
            this.f17873c.remove(this.f17873c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter beginObject() {
        C2657k c4257m = new C4257m();
        m23216a(c4257m);
        this.f17873c.add(c4257m);
        return this;
    }

    public JsonWriter endObject() {
        if (this.f17873c.isEmpty() || this.f17874d != null) {
            throw new IllegalStateException();
        } else if (m23217b() instanceof C4257m) {
            this.f17873c.remove(this.f17873c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter name(String str) {
        if (this.f17873c.isEmpty() || this.f17874d != null) {
            throw new IllegalStateException();
        } else if (m23217b() instanceof C4257m) {
            this.f17874d = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        m23216a(new C4258n(str));
        return this;
    }

    public JsonWriter nullValue() {
        m23216a(C4256l.f17892a);
        return this;
    }

    public JsonWriter value(boolean z) {
        m23216a(new C4258n(Boolean.valueOf(z)));
        return this;
    }

    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        m23216a(new C4258n(bool));
        return this;
    }

    public JsonWriter value(double d) {
        if (!isLenient()) {
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("JSON forbids NaN and infinities: ");
                stringBuilder.append(d);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        m23216a(new C4258n(Double.valueOf(d)));
        return this;
    }

    public JsonWriter value(long j) {
        m23216a(new C4258n(Long.valueOf(j)));
        return this;
    }

    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("JSON forbids NaN and infinities: ");
                stringBuilder.append(number);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        m23216a(new C4258n(number));
        return this;
    }

    public void close() {
        if (this.f17873c.isEmpty()) {
            this.f17873c.add(f17872b);
            return;
        }
        throw new IOException("Incomplete document");
    }
}
