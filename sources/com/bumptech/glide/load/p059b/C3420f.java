package com.bumptech.glide.load.p059b;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p163f.C3370b;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.f */
public class C3420f<Data> implements C1206n<File, Data> {
    /* renamed from: a */
    private final C1198d<Data> f14313a;

    /* renamed from: com.bumptech.glide.load.b.f$d */
    public interface C1198d<Data> {
        /* renamed from: a */
        Class<Data> mo979a();

        /* renamed from: a */
        void mo980a(Data data);

        /* renamed from: b */
        Data mo981b(File file);
    }

    /* renamed from: com.bumptech.glide.load.b.f$a */
    public static class C3416a<Data> implements C1207o<File, Data> {
        /* renamed from: a */
        private final C1198d<Data> f14309a;

        public C3416a(C1198d<Data> c1198d) {
            this.f14309a = c1198d;
        }

        /* renamed from: a */
        public final C1206n<File, Data> mo970a(C1213r c1213r) {
            return new C3420f(this.f14309a);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.f$c */
    private static final class C3418c<Data> implements C1188d<Data> {
        /* renamed from: a */
        private final File f14310a;
        /* renamed from: b */
        private final C1198d<Data> f14311b;
        /* renamed from: c */
        private Data f14312c;

        /* renamed from: c */
        public void mo962c() {
        }

        C3418c(File file, C1198d<Data> c1198d) {
            this.f14310a = file;
            this.f14311b = c1198d;
        }

        /* renamed from: a */
        public void mo960a(Priority priority, C1187a<? super Data> c1187a) {
            try {
                this.f14312c = this.f14311b.mo981b(this.f14310a);
                c1187a.mo986a(this.f14312c);
            } catch (Exception e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
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
            r0 = r2.f14312c;
            if (r0 == 0) goto L_0x000b;
        L_0x0004:
            r0 = r2.f14311b;	 Catch:{ IOException -> 0x000b }
            r1 = r2.f14312c;	 Catch:{ IOException -> 0x000b }
            r0.mo980a(r1);	 Catch:{ IOException -> 0x000b }
        L_0x000b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.b.f.c.b():void");
        }

        /* renamed from: a */
        public Class<Data> mo959a() {
            return this.f14311b.mo979a();
        }

        /* renamed from: d */
        public DataSource mo963d() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: com.bumptech.glide.load.b.f$b */
    public static class C4513b extends C3416a<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.b.f$b$1 */
        class C34171 implements C1198d<ParcelFileDescriptor> {
            C34171() {
            }

            /* renamed from: b */
            public /* synthetic */ Object mo981b(File file) {
                return m17420a(file);
            }

            /* renamed from: a */
            public ParcelFileDescriptor m17420a(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            /* renamed from: a */
            public void m17422a(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo979a() {
                return ParcelFileDescriptor.class;
            }
        }

        public C4513b() {
            super(new C34171());
        }
    }

    /* renamed from: com.bumptech.glide.load.b.f$e */
    public static class C4514e extends C3416a<InputStream> {

        /* renamed from: com.bumptech.glide.load.b.f$e$1 */
        class C34191 implements C1198d<InputStream> {
            C34191() {
            }

            /* renamed from: b */
            public /* synthetic */ Object mo981b(File file) {
                return m17430a(file);
            }

            /* renamed from: a */
            public InputStream m17430a(File file) {
                return new FileInputStream(file);
            }

            /* renamed from: a */
            public void m17432a(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: a */
            public Class<InputStream> mo979a() {
                return InputStream.class;
            }
        }

        public C4514e() {
            super(new C34191());
        }
    }

    /* renamed from: a */
    public boolean m17437a(File file) {
        return true;
    }

    public C3420f(C1198d<Data> c1198d) {
        this.f14313a = c1198d;
    }

    /* renamed from: a */
    public C1205a<Data> m17435a(File file, int i, int i2, C3452e c3452e) {
        return new C1205a(new C3370b(file), new C3418c(file, this.f14313a));
    }
}
