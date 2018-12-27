package com.google.gson;

import com.google.gson.internal.C2654g;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.google.gson.k */
public abstract class C2657k {
    /* renamed from: g */
    public boolean m12967g() {
        return this instanceof C4212h;
    }

    /* renamed from: h */
    public boolean m12968h() {
        return this instanceof C4257m;
    }

    /* renamed from: i */
    public boolean m12969i() {
        return this instanceof C4258n;
    }

    /* renamed from: j */
    public boolean m12970j() {
        return this instanceof C4256l;
    }

    /* renamed from: k */
    public C4257m m12971k() {
        if (m12968h()) {
            return (C4257m) this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Object: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: l */
    public C4212h m12972l() {
        if (m12967g()) {
            return (C4212h) this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Array: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: m */
    public C4258n m12973m() {
        if (m12969i()) {
            return (C4258n) this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Primitive: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: f */
    public boolean mo3338f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: n */
    Boolean mo3377n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: a */
    public Number mo3333a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: b */
    public String mo3334b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public double mo3335c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public long mo3336d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public int mo3337e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            Writer stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            C2654g.m12956a(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
