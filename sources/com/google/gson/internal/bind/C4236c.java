package com.google.gson.internal.bind;

import com.google.gson.C4212h;
import com.google.gson.C4256l;
import com.google.gson.C4257m;
import com.google.gson.C4258n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.gson.internal.bind.c */
public final class C4236c extends JsonReader {
    /* renamed from: a */
    private static final Reader f17865a = new C26441();
    /* renamed from: b */
    private static final Object f17866b = new Object();
    /* renamed from: c */
    private Object[] f17867c;
    /* renamed from: d */
    private int f17868d;
    /* renamed from: e */
    private String[] f17869e;
    /* renamed from: f */
    private int[] f17870f;

    /* renamed from: com.google.gson.internal.bind.c$1 */
    static class C26441 extends Reader {
        C26441() {
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        public void close() {
            throw new AssertionError();
        }
    }

    public void beginArray() {
        m23210a(JsonToken.BEGIN_ARRAY);
        m23211a(((C4212h) m23212b()).iterator());
        this.f17870f[this.f17868d - 1] = 0;
    }

    public void endArray() {
        m23210a(JsonToken.END_ARRAY);
        m23213c();
        m23213c();
        if (this.f17868d > 0) {
            int[] iArr = this.f17870f;
            int i = this.f17868d - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public void beginObject() {
        m23210a(JsonToken.BEGIN_OBJECT);
        m23211a(((C4257m) m23212b()).m23355o().iterator());
    }

    public void endObject() {
        m23210a(JsonToken.END_OBJECT);
        m23213c();
        m23213c();
        if (this.f17868d > 0) {
            int[] iArr = this.f17870f;
            int i = this.f17868d - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public boolean hasNext() {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    public JsonToken peek() {
        if (this.f17868d == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object b = m23212b();
        if (b instanceof Iterator) {
            boolean z = this.f17867c[this.f17868d - 2] instanceof C4257m;
            Iterator it = (Iterator) b;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            } else if (z) {
                return JsonToken.NAME;
            } else {
                m23211a(it.next());
                return peek();
            }
        } else if (b instanceof C4257m) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (b instanceof C4212h) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (b instanceof C4258n) {
                C4258n c4258n = (C4258n) b;
                if (c4258n.m23368q()) {
                    return JsonToken.STRING;
                }
                if (c4258n.m23366o()) {
                    return JsonToken.BOOLEAN;
                }
                if (c4258n.m23367p()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (b instanceof C4256l) {
                return JsonToken.NULL;
            } else {
                if (b == f17866b) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: b */
    private Object m23212b() {
        return this.f17867c[this.f17868d - 1];
    }

    /* renamed from: c */
    private Object m23213c() {
        Object[] objArr = this.f17867c;
        int i = this.f17868d - 1;
        this.f17868d = i;
        Object obj = objArr[i];
        this.f17867c[this.f17868d] = null;
        return obj;
    }

    /* renamed from: a */
    private void m23210a(JsonToken jsonToken) {
        if (peek() != jsonToken) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(jsonToken);
            stringBuilder.append(" but was ");
            stringBuilder.append(peek());
            stringBuilder.append(m23214d());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public String nextName() {
        m23210a(JsonToken.NAME);
        Entry entry = (Entry) ((Iterator) m23212b()).next();
        String str = (String) entry.getKey();
        this.f17869e[this.f17868d - 1] = str;
        m23211a(entry.getValue());
        return str;
    }

    public String nextString() {
        JsonToken peek = peek();
        if (peek != JsonToken.STRING) {
            if (peek != JsonToken.NUMBER) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(JsonToken.STRING);
                stringBuilder.append(" but was ");
                stringBuilder.append(peek);
                stringBuilder.append(m23214d());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        String b = ((C4258n) m23213c()).mo3334b();
        if (this.f17868d > 0) {
            int[] iArr = this.f17870f;
            int i = this.f17868d - 1;
            iArr[i] = iArr[i] + 1;
        }
        return b;
    }

    public boolean nextBoolean() {
        m23210a(JsonToken.BOOLEAN);
        boolean f = ((C4258n) m23213c()).mo3338f();
        if (this.f17868d > 0) {
            int[] iArr = this.f17870f;
            int i = this.f17868d - 1;
            iArr[i] = iArr[i] + 1;
        }
        return f;
    }

    public void nextNull() {
        m23210a(JsonToken.NULL);
        m23213c();
        if (this.f17868d > 0) {
            int[] iArr = this.f17870f;
            int i = this.f17868d - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public double nextDouble() {
        JsonToken peek = peek();
        if (peek != JsonToken.NUMBER) {
            if (peek != JsonToken.STRING) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(JsonToken.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(peek);
                stringBuilder.append(m23214d());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        double c = ((C4258n) m23212b()).mo3335c();
        if (!isLenient()) {
            if (Double.isNaN(c) || Double.isInfinite(c)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("JSON forbids NaN and infinities: ");
                stringBuilder2.append(c);
                throw new NumberFormatException(stringBuilder2.toString());
            }
        }
        m23213c();
        if (this.f17868d > 0) {
            int[] iArr = this.f17870f;
            int i = this.f17868d - 1;
            iArr[i] = iArr[i] + 1;
        }
        return c;
    }

    public long nextLong() {
        JsonToken peek = peek();
        if (peek != JsonToken.NUMBER) {
            if (peek != JsonToken.STRING) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(JsonToken.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(peek);
                stringBuilder.append(m23214d());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        long d = ((C4258n) m23212b()).mo3336d();
        m23213c();
        if (this.f17868d > 0) {
            int[] iArr = this.f17870f;
            int i = this.f17868d - 1;
            iArr[i] = iArr[i] + 1;
        }
        return d;
    }

    public int nextInt() {
        JsonToken peek = peek();
        if (peek != JsonToken.NUMBER) {
            if (peek != JsonToken.STRING) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(JsonToken.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(peek);
                stringBuilder.append(m23214d());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        int e = ((C4258n) m23212b()).mo3337e();
        m23213c();
        if (this.f17868d > 0) {
            int[] iArr = this.f17870f;
            int i = this.f17868d - 1;
            iArr[i] = iArr[i] + 1;
        }
        return e;
    }

    public void close() {
        this.f17867c = new Object[]{f17866b};
        this.f17868d = 1;
    }

    public void skipValue() {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f17869e[this.f17868d - 2] = "null";
        } else {
            m23213c();
            if (this.f17868d > 0) {
                this.f17869e[this.f17868d - 1] = "null";
            }
        }
        if (this.f17868d > 0) {
            int[] iArr = this.f17870f;
            int i = this.f17868d - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public void m23215a() {
        m23210a(JsonToken.NAME);
        Entry entry = (Entry) ((Iterator) m23212b()).next();
        m23211a(entry.getValue());
        m23211a(new C4258n((String) entry.getKey()));
    }

    /* renamed from: a */
    private void m23211a(Object obj) {
        if (this.f17868d == this.f17867c.length) {
            Object obj2 = new Object[(this.f17868d * 2)];
            Object obj3 = new int[(this.f17868d * 2)];
            Object obj4 = new String[(this.f17868d * 2)];
            System.arraycopy(this.f17867c, 0, obj2, 0, this.f17868d);
            System.arraycopy(this.f17870f, 0, obj3, 0, this.f17868d);
            System.arraycopy(this.f17869e, 0, obj4, 0, this.f17868d);
            this.f17867c = obj2;
            this.f17870f = obj3;
            this.f17869e = obj4;
        }
        Object[] objArr = this.f17867c;
        int i = this.f17868d;
        this.f17868d = i + 1;
        objArr[i] = obj;
    }

    public String getPath() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int i = 0;
        while (i < this.f17868d) {
            if (this.f17867c[i] instanceof C4212h) {
                i++;
                if (this.f17867c[i] instanceof Iterator) {
                    stringBuilder.append('[');
                    stringBuilder.append(this.f17870f[i]);
                    stringBuilder.append(']');
                }
            } else if (this.f17867c[i] instanceof C4257m) {
                i++;
                if (this.f17867c[i] instanceof Iterator) {
                    stringBuilder.append('.');
                    if (this.f17869e[i] != null) {
                        stringBuilder.append(this.f17869e[i]);
                    }
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }

    /* renamed from: d */
    private String m23214d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at path ");
        stringBuilder.append(getPath());
        return stringBuilder.toString();
    }
}
