package com.bumptech.glide.load.p059b;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.b.j */
public final class C3424j implements C1199h {
    /* renamed from: c */
    private final Map<String, List<C1200i>> f14322c;
    /* renamed from: d */
    private volatile Map<String, String> f14323d;

    /* renamed from: com.bumptech.glide.load.b.j$a */
    public static final class C1201a {
        /* renamed from: a */
        private static final String f3872a = C1201a.m4952b();
        /* renamed from: b */
        private static final Map<String, List<C1200i>> f3873b;
        /* renamed from: c */
        private boolean f3874c = true;
        /* renamed from: d */
        private Map<String, List<C1200i>> f3875d = f3873b;
        /* renamed from: e */
        private boolean f3876e = true;

        static {
            Map hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f3872a)) {
                hashMap.put("User-Agent", Collections.singletonList(new C3423b(f3872a)));
            }
            f3873b = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: a */
        public C3424j m4953a() {
            this.f3874c = true;
            return new C3424j(this.f3875d);
        }

        /* renamed from: b */
        static String m4952b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder stringBuilder = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > '\u001f' || charAt == '\t') && charAt < '') {
                    stringBuilder.append(charAt);
                } else {
                    stringBuilder.append('?');
                }
            }
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.bumptech.glide.load.b.j$b */
    static final class C3423b implements C1200i {
        /* renamed from: a */
        private final String f14321a;

        C3423b(String str) {
            this.f14321a = str;
        }

        /* renamed from: a */
        public String mo983a() {
            return this.f14321a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("StringHeaderFactory{value='");
            stringBuilder.append(this.f14321a);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3423b)) {
                return null;
            }
            return this.f14321a.equals(((C3423b) obj).f14321a);
        }

        public int hashCode() {
            return this.f14321a.hashCode();
        }
    }

    C3424j(Map<String, List<C1200i>> map) {
        this.f14322c = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public Map<String, String> mo982a() {
        if (this.f14323d == null) {
            synchronized (this) {
                if (this.f14323d == null) {
                    this.f14323d = Collections.unmodifiableMap(m17449b());
                }
            }
        }
        return this.f14323d;
    }

    /* renamed from: b */
    private Map<String, String> m17449b() {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : this.f14322c.entrySet()) {
            CharSequence a = m17448a((List) entry.getValue());
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(entry.getKey(), a);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private String m17448a(List<C1200i> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object a = ((C1200i) list.get(i)).mo983a();
            if (!TextUtils.isEmpty(a)) {
                stringBuilder.append(a);
                if (i != list.size() - 1) {
                    stringBuilder.append(',');
                }
            }
        }
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LazyHeaders{headers=");
        stringBuilder.append(this.f14322c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3424j)) {
            return null;
        }
        return this.f14322c.equals(((C3424j) obj).f14322c);
    }

    public int hashCode() {
        return this.f14322c.hashCode();
    }
}
