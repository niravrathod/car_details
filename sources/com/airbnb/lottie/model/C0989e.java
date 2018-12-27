package com.airbnb.lottie.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.e */
public class C0989e {
    /* renamed from: a */
    private final List<String> f3316a;
    /* renamed from: b */
    private C0990f f3317b;

    public C0989e(String... strArr) {
        this.f3316a = Arrays.asList(strArr);
    }

    private C0989e(C0989e c0989e) {
        this.f3316a = new ArrayList(c0989e.f3316a);
        this.f3317b = c0989e.f3317b;
    }

    /* renamed from: a */
    public C0989e m4267a(String str) {
        C0989e c0989e = new C0989e(this);
        c0989e.f3316a.add(str);
        return c0989e;
    }

    /* renamed from: a */
    public C0989e m4266a(C0990f c0990f) {
        C0989e c0989e = new C0989e(this);
        c0989e.f3317b = c0990f;
        return c0989e;
    }

    /* renamed from: a */
    public C0990f m4268a() {
        return this.f3317b;
    }

    /* renamed from: a */
    public boolean m4269a(String str, int i) {
        if (m4265b(str)) {
            return true;
        }
        if (i >= this.f3316a.size()) {
            return false;
        }
        if (((String) this.f3316a.get(i)).equals(str) == null && ((String) this.f3316a.get(i)).equals("**") == null) {
            if (((String) this.f3316a.get(i)).equals("*") == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public int m4270b(String str, int i) {
        if (m4265b(str)) {
            return 0;
        }
        if (!((String) this.f3316a.get(i)).equals("**")) {
            return 1;
        }
        if (i == this.f3316a.size() - 1 || ((String) this.f3316a.get(i + 1)).equals(str) == null) {
            return 0;
        }
        return 2;
    }

    /* renamed from: c */
    public boolean m4271c(String str, int i) {
        boolean z = false;
        if (i >= this.f3316a.size()) {
            return false;
        }
        Object obj = i == this.f3316a.size() - 1 ? 1 : null;
        String str2 = (String) this.f3316a.get(i);
        if (str2.equals("**")) {
            Object obj2 = (obj == null && ((String) this.f3316a.get(i + 1)).equals(str)) ? 1 : null;
            if (obj2 != null) {
                if (i == this.f3316a.size() - 2 || (i == this.f3316a.size() - 3 && m4264b() != null)) {
                    z = true;
                }
                return z;
            } else if (obj != null) {
                return true;
            } else {
                i++;
                if (i < this.f3316a.size() - 1) {
                    return false;
                }
                return ((String) this.f3316a.get(i)).equals(str);
            }
        }
        if (str2.equals(str) == null) {
            if (str2.equals("*") == null) {
                str = null;
                if ((obj != null || (i == this.f3316a.size() - 2 && m4264b() != 0)) && r6 != null) {
                    z = true;
                }
                return z;
            }
        }
        str = true;
        z = true;
        return z;
    }

    /* renamed from: d */
    public boolean m4272d(String str, int i) {
        boolean z = true;
        if (str.equals("__container") != null) {
            return true;
        }
        if (i >= this.f3316a.size() - 1) {
            if (((String) this.f3316a.get(i)).equals("**") == null) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private boolean m4265b(String str) {
        return str.equals("__container");
    }

    /* renamed from: b */
    private boolean m4264b() {
        return ((String) this.f3316a.get(this.f3316a.size() - 1)).equals("**");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KeyPath{keys=");
        stringBuilder.append(this.f3316a);
        stringBuilder.append(",resolved=");
        stringBuilder.append(this.f3317b != null);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
