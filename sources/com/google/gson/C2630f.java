package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C2647i;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.f */
public final class C2630f {
    /* renamed from: a */
    private Excluder f11126a = Excluder.f17772a;
    /* renamed from: b */
    private LongSerializationPolicy f11127b = LongSerializationPolicy.DEFAULT;
    /* renamed from: c */
    private C2628d f11128c = FieldNamingPolicy.f17751a;
    /* renamed from: d */
    private final Map<Type, C2631g<?>> f11129d = new HashMap();
    /* renamed from: e */
    private final List<C2661r> f11130e = new ArrayList();
    /* renamed from: f */
    private final List<C2661r> f11131f = new ArrayList();
    /* renamed from: g */
    private boolean f11132g = false;
    /* renamed from: h */
    private String f11133h;
    /* renamed from: i */
    private int f11134i = 2;
    /* renamed from: j */
    private int f11135j = 2;
    /* renamed from: k */
    private boolean f11136k = false;
    /* renamed from: l */
    private boolean f11137l = false;
    /* renamed from: m */
    private boolean f11138m = true;
    /* renamed from: n */
    private boolean f11139n = false;
    /* renamed from: o */
    private boolean f11140o = false;
    /* renamed from: p */
    private boolean f11141p = false;

    /* renamed from: a */
    public C2630f m12891a(String str) {
        this.f11133h = str;
        return this;
    }

    /* renamed from: a */
    public C2629e m12890a() {
        List list = r1;
        List arrayList = new ArrayList((this.f11130e.size() + this.f11131f.size()) + 3);
        arrayList.addAll(this.f11130e);
        Collections.reverse(arrayList);
        Collection arrayList2 = new ArrayList(this.f11131f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m12889a(this.f11133h, this.f11134i, this.f11135j, arrayList);
        return new C2629e(this.f11126a, this.f11128c, this.f11129d, this.f11132g, this.f11136k, this.f11140o, this.f11138m, this.f11139n, this.f11141p, this.f11137l, this.f11127b, this.f11133h, this.f11134i, this.f11135j, this.f11130e, this.f11131f, list);
    }

    /* renamed from: a */
    private void m12889a(String str, int i, int i2, List<C2661r> list) {
        C2660q c4205a;
        if (str != null && !"".equals(str.trim())) {
            i = new C4205a(Date.class, str);
            i2 = new C4205a(Timestamp.class, str);
            c4205a = new C4205a(java.sql.Date.class, str);
            str = i;
        } else if (i != 2 && i2 != 2) {
            str = new C4205a(Date.class, i, i2);
            C4205a c4205a2 = new C4205a(Timestamp.class, i, i2);
            C2660q c4205a3 = new C4205a(java.sql.Date.class, i, i2);
            i2 = c4205a2;
            c4205a = c4205a3;
        } else {
            return;
        }
        list.add(C2647i.m12943a(Date.class, str));
        list.add(C2647i.m12943a(Timestamp.class, i2));
        list.add(C2647i.m12943a(java.sql.Date.class, c4205a));
    }
}
