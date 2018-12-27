package com.bumptech.glide.load.p059b;

import android.support.v4.p017f.C0431k.C0430a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p055g.C1178i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b.q */
class C3430q<Model, Data> implements C1206n<Model, Data> {
    /* renamed from: a */
    private final List<C1206n<Model, Data>> f14336a;
    /* renamed from: b */
    private final C0430a<List<Throwable>> f14337b;

    /* renamed from: com.bumptech.glide.load.b.q$a */
    static class C3429a<Data> implements C1188d<Data>, C1187a<Data> {
        /* renamed from: a */
        private final List<C1188d<Data>> f14330a;
        /* renamed from: b */
        private final C0430a<List<Throwable>> f14331b;
        /* renamed from: c */
        private int f14332c = null;
        /* renamed from: d */
        private Priority f14333d;
        /* renamed from: e */
        private C1187a<? super Data> f14334e;
        /* renamed from: f */
        private List<Throwable> f14335f;

        C3429a(List<C1188d<Data>> list, C0430a<List<Throwable>> c0430a) {
            this.f14331b = c0430a;
            C1178i.m4883a((Collection) list);
            this.f14330a = list;
        }

        /* renamed from: a */
        public void mo960a(Priority priority, C1187a<? super Data> c1187a) {
            this.f14333d = priority;
            this.f14334e = c1187a;
            this.f14335f = (List) this.f14331b.mo338a();
            ((C1188d) this.f14330a.get(this.f14332c)).mo960a(priority, this);
        }

        /* renamed from: b */
        public void mo961b() {
            if (this.f14335f != null) {
                this.f14331b.mo339a(this.f14335f);
            }
            this.f14335f = null;
            for (C1188d b : this.f14330a) {
                b.mo961b();
            }
        }

        /* renamed from: c */
        public void mo962c() {
            for (C1188d c : this.f14330a) {
                c.mo962c();
            }
        }

        /* renamed from: a */
        public Class<Data> mo959a() {
            return ((C1188d) this.f14330a.get(0)).mo959a();
        }

        /* renamed from: d */
        public DataSource mo963d() {
            return ((C1188d) this.f14330a.get(0)).mo963d();
        }

        /* renamed from: a */
        public void mo986a(Data data) {
            if (data != null) {
                this.f14334e.mo986a((Object) data);
            } else {
                m17463e();
            }
        }

        /* renamed from: a */
        public void mo985a(Exception exception) {
            ((List) C1178i.m4880a(this.f14335f)).add(exception);
            m17463e();
        }

        /* renamed from: e */
        private void m17463e() {
            if (this.f14332c < this.f14330a.size() - 1) {
                this.f14332c++;
                mo960a(this.f14333d, this.f14334e);
                return;
            }
            C1178i.m4880a(this.f14335f);
            this.f14334e.mo985a(new GlideException("Fetch failed", new ArrayList(this.f14335f)));
        }
    }

    C3430q(List<C1206n<Model, Data>> list, C0430a<List<Throwable>> c0430a) {
        this.f14336a = list;
        this.f14337b = c0430a;
    }

    /* renamed from: a */
    public C1205a<Data> mo971a(Model model, int i, int i2, C3452e c3452e) {
        int size = this.f14336a.size();
        List arrayList = new ArrayList(size);
        C1216c c1216c = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1206n c1206n = (C1206n) this.f14336a.get(i3);
            if (c1206n.mo972a(model)) {
                C1205a a = c1206n.mo971a(model, i, i2, c3452e);
                if (a != null) {
                    c1216c = a.f3882a;
                    arrayList.add(a.f3884c);
                }
            }
        }
        if (arrayList.isEmpty() != null || c1216c == null) {
            return null;
        }
        return new C1205a(c1216c, new C3429a(arrayList, this.f14337b));
    }

    /* renamed from: a */
    public boolean mo972a(Model model) {
        for (C1206n a : this.f14336a) {
            if (a.mo972a(model)) {
                return true;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiModelLoader{modelLoaders=");
        stringBuilder.append(Arrays.toString(this.f14336a.toArray()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
