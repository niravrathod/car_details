package com.bumptech.glide.load.p057a.p058a;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p060a.C1230b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a.a.e */
class C1185e {
    /* renamed from: a */
    private static final C1182a f3853a = new C1182a();
    /* renamed from: b */
    private final C1182a f3854b;
    /* renamed from: c */
    private final C1184d f3855c;
    /* renamed from: d */
    private final C1230b f3856d;
    /* renamed from: e */
    private final ContentResolver f3857e;
    /* renamed from: f */
    private final List<ImageHeaderParser> f3858f;

    C1185e(List<ImageHeaderParser> list, C1184d c1184d, C1230b c1230b, ContentResolver contentResolver) {
        this(list, f3853a, c1184d, c1230b, contentResolver);
    }

    C1185e(List<ImageHeaderParser> list, C1182a c1182a, C1184d c1184d, C1230b c1230b, ContentResolver contentResolver) {
        this.f3854b = c1182a;
        this.f3855c = c1184d;
        this.f3856d = c1230b;
        this.f3857e = contentResolver;
        this.f3858f = list;
    }

    /* renamed from: a */
    int m4921a(android.net.Uri r7) {
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
        r6 = this;
        r0 = 0;
        r1 = r6.f3857e;	 Catch:{ IOException -> 0x001a, IOException -> 0x001a, all -> 0x0017 }
        r1 = r1.openInputStream(r7);	 Catch:{ IOException -> 0x001a, IOException -> 0x001a, all -> 0x0017 }
        r0 = r6.f3858f;	 Catch:{ IOException -> 0x0015, IOException -> 0x0015 }
        r2 = r6.f3856d;	 Catch:{ IOException -> 0x0015, IOException -> 0x0015 }
        r0 = com.bumptech.glide.load.C1215b.m4984b(r0, r1, r2);	 Catch:{ IOException -> 0x0015, IOException -> 0x0015 }
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        r1.close();	 Catch:{ IOException -> 0x0014 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        goto L_0x001e;
    L_0x0017:
        r7 = move-exception;
        r1 = r0;
        goto L_0x0045;
    L_0x001a:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x001e:
        r2 = "ThumbStreamOpener";	 Catch:{ all -> 0x0044 }
        r3 = 3;	 Catch:{ all -> 0x0044 }
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ all -> 0x0044 }
        if (r2 == 0) goto L_0x003d;	 Catch:{ all -> 0x0044 }
    L_0x0027:
        r2 = "ThumbStreamOpener";	 Catch:{ all -> 0x0044 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0044 }
        r3.<init>();	 Catch:{ all -> 0x0044 }
        r4 = "Failed to open uri: ";	 Catch:{ all -> 0x0044 }
        r3.append(r4);	 Catch:{ all -> 0x0044 }
        r3.append(r7);	 Catch:{ all -> 0x0044 }
        r7 = r3.toString();	 Catch:{ all -> 0x0044 }
        android.util.Log.d(r2, r7, r0);	 Catch:{ all -> 0x0044 }
    L_0x003d:
        if (r1 == 0) goto L_0x0042;
    L_0x003f:
        r1.close();	 Catch:{ IOException -> 0x0042 }
    L_0x0042:
        r7 = -1;
        return r7;
    L_0x0044:
        r7 = move-exception;
    L_0x0045:
        if (r1 == 0) goto L_0x004a;
    L_0x0047:
        r1.close();	 Catch:{ IOException -> 0x004a }
    L_0x004a:
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.a.e.a(android.net.Uri):int");
    }

    /* renamed from: b */
    public InputStream m4922b(Uri uri) {
        String c = m4920c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File a = this.f3854b.m4910a(c);
        if (!m4919a(a)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(a);
        try {
            return this.f3857e.openInputStream(fromFile);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NPE opening uri: ");
            stringBuilder.append(uri);
            stringBuilder.append(" -> ");
            stringBuilder.append(fromFile);
            throw ((FileNotFoundException) new FileNotFoundException(stringBuilder.toString()).initCause(e));
        }
    }

    /* renamed from: c */
    private String m4920c(Uri uri) {
        uri = this.f3855c.mo958a(uri);
        if (uri != null) {
            try {
                if (uri.moveToFirst()) {
                    String string = uri.getString(0);
                    return string;
                }
            } finally {
                if (uri != null) {
                    uri.close();
                }
            }
        }
        if (uri != null) {
            uri.close();
        }
        return null;
    }

    /* renamed from: a */
    private boolean m4919a(File file) {
        return (!this.f3854b.m4911a(file) || 0 >= this.f3854b.m4912b(file)) ? null : true;
    }
}
