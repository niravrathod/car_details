package com.bumptech.glide.load.p059b;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p163f.C3370b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.e */
public final class C3415e<Model, Data> implements C1206n<Model, Data> {
    /* renamed from: a */
    private final C1197a<Data> f14308a;

    /* renamed from: com.bumptech.glide.load.b.e$a */
    public interface C1197a<Data> {
        /* renamed from: a */
        Class<Data> mo976a();

        /* renamed from: a */
        Data mo977a(String str);

        /* renamed from: a */
        void mo978a(Data data);
    }

    /* renamed from: com.bumptech.glide.load.b.e$b */
    private static final class C3412b<Data> implements C1188d<Data> {
        /* renamed from: a */
        private final String f14303a;
        /* renamed from: b */
        private final C1197a<Data> f14304b;
        /* renamed from: c */
        private Data f14305c;

        /* renamed from: c */
        public void mo962c() {
        }

        C3412b(String str, C1197a<Data> c1197a) {
            this.f14303a = str;
            this.f14304b = c1197a;
        }

        /* renamed from: a */
        public void mo960a(Priority priority, C1187a<? super Data> c1187a) {
            try {
                this.f14305c = this.f14304b.mo977a(this.f14303a);
                c1187a.mo986a(this.f14305c);
            } catch (Exception e) {
                c1187a.mo985a(e);
            }
        }

        /* renamed from: b */
        public void mo961b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f14304b;	 Catch:{ IOException -> 0x0007 }
            r1 = r2.f14305c;	 Catch:{ IOException -> 0x0007 }
            r0.mo978a(r1);	 Catch:{ IOException -> 0x0007 }
        L_0x0007:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.b.e.b.b():void");
        }

        /* renamed from: a */
        public Class<Data> mo959a() {
            return this.f14304b.mo976a();
        }

        /* renamed from: d */
        public DataSource mo963d() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: com.bumptech.glide.load.b.e$c */
    public static final class C3414c<Model> implements C1207o<Model, InputStream> {
        /* renamed from: a */
        private final C1197a<InputStream> f14307a = new C34131(this);

        /* renamed from: com.bumptech.glide.load.b.e$c$1 */
        class C34131 implements C1197a<InputStream> {
            /* renamed from: a */
            final /* synthetic */ C3414c f14306a;

            C34131(C3414c c3414c) {
                this.f14306a = c3414c;
            }

            /* renamed from: a */
            public /* synthetic */ Object mo977a(String str) {
                return m17415b(str);
            }

            /* renamed from: b */
            public InputStream m17415b(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }

            /* renamed from: a */
            public void m17413a(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: a */
            public Class<InputStream> mo976a() {
                return InputStream.class;
            }
        }

        /* renamed from: a */
        public C1206n<Model, InputStream> mo970a(C1213r c1213r) {
            return new C3415e(this.f14307a);
        }
    }

    public C3415e(C1197a<Data> c1197a) {
        this.f14308a = c1197a;
    }

    /* renamed from: a */
    public C1205a<Data> mo971a(Model model, int i, int i2, C3452e c3452e) {
        return new C1205a(new C3370b(model), new C3412b(model.toString(), this.f14308a));
    }

    /* renamed from: a */
    public boolean mo972a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
