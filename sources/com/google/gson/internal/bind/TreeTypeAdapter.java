package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2632i;
import com.google.gson.C2656j;
import com.google.gson.C2658o;
import com.google.gson.C2659p;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.internal.C2654g;
import com.google.gson.p141b.C2624a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public final class TreeTypeAdapter<T> extends C2660q<T> {
    /* renamed from: a */
    final C2629e f17837a;
    /* renamed from: b */
    private final C2659p<T> f17838b;
    /* renamed from: c */
    private final C2656j<T> f17839c;
    /* renamed from: d */
    private final C2624a<T> f17840d;
    /* renamed from: e */
    private final C2661r f17841e;
    /* renamed from: f */
    private final C4231a f17842f = new C4231a();
    /* renamed from: g */
    private C2660q<T> f17843g;

    private static final class SingleTypeFactory implements C2661r {
        /* renamed from: a */
        private final C2624a<?> f17831a;
        /* renamed from: b */
        private final boolean f17832b;
        /* renamed from: c */
        private final Class<?> f17833c;
        /* renamed from: d */
        private final C2659p<?> f17834d;
        /* renamed from: e */
        private final C2656j<?> f17835e;

        /* renamed from: a */
        public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
            boolean z;
            if (this.f17831a != null) {
                if (!this.f17831a.equals(c2624a)) {
                    if (!this.f17832b || this.f17831a.getType() != c2624a.getRawType()) {
                        z = false;
                    }
                }
                z = true;
            } else {
                z = this.f17833c.isAssignableFrom(c2624a.getRawType());
            }
            return z ? new TreeTypeAdapter(this.f17834d, this.f17835e, c2629e, c2624a, this) : null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$a */
    private final class C4231a implements C2632i, C2658o {
        /* renamed from: a */
        final /* synthetic */ TreeTypeAdapter f17836a;

        private C4231a(TreeTypeAdapter treeTypeAdapter) {
            this.f17836a = treeTypeAdapter;
        }
    }

    public TreeTypeAdapter(C2659p<T> c2659p, C2656j<T> c2656j, C2629e c2629e, C2624a<T> c2624a, C2661r c2661r) {
        this.f17838b = c2659p;
        this.f17839c = c2656j;
        this.f17837a = c2629e;
        this.f17840d = c2624a;
        this.f17841e = c2661r;
    }

    /* renamed from: b */
    public T mo3332b(JsonReader jsonReader) {
        if (this.f17839c == null) {
            return m23187b().mo3332b(jsonReader);
        }
        jsonReader = C2654g.m12954a(jsonReader);
        if (jsonReader.m12970j()) {
            return null;
        }
        return this.f17839c.m12960a(jsonReader, this.f17840d.getType(), this.f17842f);
    }

    /* renamed from: a */
    public void mo3331a(JsonWriter jsonWriter, T t) {
        if (this.f17838b == null) {
            m23187b().mo3331a(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            C2654g.m12956a(this.f17838b.m12975a(t, this.f17840d.getType(), this.f17842f), jsonWriter);
        }
    }

    /* renamed from: b */
    private C2660q<T> m23187b() {
        C2660q<T> c2660q = this.f17843g;
        if (c2660q != null) {
            return c2660q;
        }
        c2660q = this.f17837a.m12874a(this.f17841e, this.f17840d);
        this.f17843g = c2660q;
        return c2660q;
    }
}
