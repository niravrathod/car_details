package com.bumptech.glide.load.p057a;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p057a.C1188d.C1187a;

/* renamed from: com.bumptech.glide.load.a.l */
public abstract class C3388l<T> implements C1188d<T> {
    /* renamed from: a */
    private final Uri f14279a;
    /* renamed from: b */
    private final ContentResolver f14280b;
    /* renamed from: c */
    private T f14281c;

    /* renamed from: a */
    protected abstract void mo3899a(T t);

    /* renamed from: b */
    protected abstract T mo3900b(Uri uri, ContentResolver contentResolver);

    /* renamed from: c */
    public void mo962c() {
    }

    public C3388l(ContentResolver contentResolver, Uri uri) {
        this.f14280b = contentResolver;
        this.f14279a = uri;
    }

    /* renamed from: a */
    public final void mo960a(Priority priority, C1187a<? super T> c1187a) {
        try {
            this.f14281c = mo3900b(this.f14279a, this.f14280b);
            c1187a.mo986a(this.f14281c);
        } catch (Exception e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
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
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.f14281c;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r1.f14281c;	 Catch:{ IOException -> 0x0009 }
        r1.mo3899a(r0);	 Catch:{ IOException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.l.b():void");
    }

    /* renamed from: d */
    public DataSource mo963d() {
        return DataSource.LOCAL;
    }
}
