package com.google.gson;

import com.google.gson.internal.C2639a;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

/* renamed from: com.google.gson.n */
public final class C4258n extends C2657k {
    /* renamed from: a */
    private static final Class<?>[] f17894a = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    /* renamed from: b */
    private Object f17895b;

    public C4258n(Boolean bool) {
        m23359a((Object) bool);
    }

    public C4258n(Number number) {
        m23359a((Object) number);
    }

    public C4258n(String str) {
        m23359a((Object) str);
    }

    C4258n(Object obj) {
        m23359a(obj);
    }

    /* renamed from: a */
    void m23359a(Object obj) {
        if (obj instanceof Character) {
            this.f17895b = String.valueOf(((Character) obj).charValue());
            return;
        }
        boolean z;
        if (!(obj instanceof Number)) {
            if (!C4258n.m23357b(obj)) {
                z = false;
                C2639a.m12931a(z);
                this.f17895b = obj;
            }
        }
        z = true;
        C2639a.m12931a(z);
        this.f17895b = obj;
    }

    /* renamed from: o */
    public boolean m23366o() {
        return this.f17895b instanceof Boolean;
    }

    /* renamed from: n */
    Boolean mo3377n() {
        return (Boolean) this.f17895b;
    }

    /* renamed from: f */
    public boolean mo3338f() {
        if (m23366o()) {
            return mo3377n().booleanValue();
        }
        return Boolean.parseBoolean(mo3334b());
    }

    /* renamed from: p */
    public boolean m23367p() {
        return this.f17895b instanceof Number;
    }

    /* renamed from: a */
    public Number mo3333a() {
        return this.f17895b instanceof String ? new LazilyParsedNumber((String) this.f17895b) : (Number) this.f17895b;
    }

    /* renamed from: q */
    public boolean m23368q() {
        return this.f17895b instanceof String;
    }

    /* renamed from: b */
    public String mo3334b() {
        if (m23367p()) {
            return mo3333a().toString();
        }
        if (m23366o()) {
            return mo3377n().toString();
        }
        return (String) this.f17895b;
    }

    /* renamed from: c */
    public double mo3335c() {
        return m23367p() ? mo3333a().doubleValue() : Double.parseDouble(mo3334b());
    }

    /* renamed from: d */
    public long mo3336d() {
        return m23367p() ? mo3333a().longValue() : Long.parseLong(mo3334b());
    }

    /* renamed from: e */
    public int mo3337e() {
        return m23367p() ? mo3333a().intValue() : Integer.parseInt(mo3334b());
    }

    /* renamed from: b */
    private static boolean m23357b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        obj = obj.getClass();
        for (Class isAssignableFrom : f17894a) {
            if (isAssignableFrom.isAssignableFrom(obj)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f17895b == null) {
            return 31;
        }
        long longValue;
        if (C4258n.m23356a(this)) {
            longValue = mo3333a().longValue();
            return (int) ((longValue >>> 32) ^ longValue);
        } else if (!(this.f17895b instanceof Number)) {
            return this.f17895b.hashCode();
        } else {
            longValue = Double.doubleToLongBits(mo3333a().doubleValue());
            return (int) ((longValue >>> 32) ^ longValue);
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C4258n c4258n = (C4258n) obj;
                if (this.f17895b == null) {
                    if (c4258n.f17895b != null) {
                        z = false;
                    }
                    return z;
                } else if (C4258n.m23356a(this) && C4258n.m23356a(c4258n)) {
                    if (mo3333a().longValue() != c4258n.mo3333a().longValue()) {
                        z = false;
                    }
                    return z;
                } else if (!(this.f17895b instanceof Number) || !(c4258n.f17895b instanceof Number)) {
                    return this.f17895b.equals(c4258n.f17895b);
                } else {
                    double doubleValue = mo3333a().doubleValue();
                    double doubleValue2 = c4258n.mo3333a().doubleValue();
                    if (doubleValue != doubleValue2) {
                        if (Double.isNaN(doubleValue) == null || Double.isNaN(doubleValue2) == null) {
                            z = false;
                        }
                    }
                    return z;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m23356a(C4258n c4258n) {
        boolean z = false;
        if (!(c4258n.f17895b instanceof Number)) {
            return false;
        }
        Number number = (Number) c4258n.f17895b;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte) != null) {
            z = true;
        }
        return z;
    }
}
