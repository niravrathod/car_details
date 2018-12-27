package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.C1218d;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.C3499g;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.p060a.C1230b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
public class C4519c implements C3499g<Bitmap> {
    /* renamed from: a */
    public static final C1218d<Integer> f18831a = C1218d.m4988a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));
    /* renamed from: b */
    public static final C1218d<CompressFormat> f18832b = C1218d.m4987a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    /* renamed from: c */
    private final C1230b f18833c;

    public C4519c(C1230b c1230b) {
        this.f18833c = c1230b;
    }

    @Deprecated
    public C4519c() {
        this.f18833c = null;
    }

    /* renamed from: a */
    public boolean m24970a(com.bumptech.glide.load.engine.C1277s<android.graphics.Bitmap> r8, java.io.File r9, com.bumptech.glide.load.C3452e r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r8 = r8.mo1046d();
        r8 = (android.graphics.Bitmap) r8;
        r0 = r7.m24968a(r8, r10);
        r1 = "encode: [%dx%d] %s";
        r2 = r8.getWidth();
        r2 = java.lang.Integer.valueOf(r2);
        r3 = r8.getHeight();
        r3 = java.lang.Integer.valueOf(r3);
        com.bumptech.glide.p055g.p056a.C1168b.m4850a(r1, r2, r3, r0);
        r1 = com.bumptech.glide.p055g.C1174e.m4866a();	 Catch:{ all -> 0x00c6 }
        r3 = f18831a;	 Catch:{ all -> 0x00c6 }
        r3 = r10.m17523a(r3);	 Catch:{ all -> 0x00c6 }
        r3 = (java.lang.Integer) r3;	 Catch:{ all -> 0x00c6 }
        r3 = r3.intValue();	 Catch:{ all -> 0x00c6 }
        r4 = 0;
        r5 = 0;
        r6 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0057 }
        r6.<init>(r9);	 Catch:{ IOException -> 0x0057 }
        r9 = r7.f18833c;	 Catch:{ IOException -> 0x0052, all -> 0x004f }
        if (r9 == 0) goto L_0x0043;	 Catch:{ IOException -> 0x0052, all -> 0x004f }
    L_0x003a:
        r9 = new com.bumptech.glide.load.a.c;	 Catch:{ IOException -> 0x0052, all -> 0x004f }
        r5 = r7.f18833c;	 Catch:{ IOException -> 0x0052, all -> 0x004f }
        r9.<init>(r6, r5);	 Catch:{ IOException -> 0x0052, all -> 0x004f }
        r5 = r9;
        goto L_0x0044;
    L_0x0043:
        r5 = r6;
    L_0x0044:
        r8.compress(r0, r3, r5);	 Catch:{ IOException -> 0x0057 }
        r5.close();	 Catch:{ IOException -> 0x0057 }
        r4 = 1;
    L_0x004b:
        r5.close();	 Catch:{ IOException -> 0x006b }
        goto L_0x006b;
    L_0x004f:
        r8 = move-exception;
        r5 = r6;
        goto L_0x00c0;
    L_0x0052:
        r9 = move-exception;
        r5 = r6;
        goto L_0x0058;
    L_0x0055:
        r8 = move-exception;
        goto L_0x00c0;
    L_0x0057:
        r9 = move-exception;
    L_0x0058:
        r3 = "BitmapEncoder";	 Catch:{ all -> 0x0055 }
        r6 = 3;	 Catch:{ all -> 0x0055 }
        r3 = android.util.Log.isLoggable(r3, r6);	 Catch:{ all -> 0x0055 }
        if (r3 == 0) goto L_0x0068;	 Catch:{ all -> 0x0055 }
    L_0x0061:
        r3 = "BitmapEncoder";	 Catch:{ all -> 0x0055 }
        r6 = "Failed to encode Bitmap";	 Catch:{ all -> 0x0055 }
        android.util.Log.d(r3, r6, r9);	 Catch:{ all -> 0x0055 }
    L_0x0068:
        if (r5 == 0) goto L_0x006b;
    L_0x006a:
        goto L_0x004b;
    L_0x006b:
        r9 = "BitmapEncoder";	 Catch:{ all -> 0x00c6 }
        r3 = 2;	 Catch:{ all -> 0x00c6 }
        r9 = android.util.Log.isLoggable(r9, r3);	 Catch:{ all -> 0x00c6 }
        if (r9 == 0) goto L_0x00bc;	 Catch:{ all -> 0x00c6 }
    L_0x0074:
        r9 = "BitmapEncoder";	 Catch:{ all -> 0x00c6 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c6 }
        r3.<init>();	 Catch:{ all -> 0x00c6 }
        r5 = "Compressed with type: ";	 Catch:{ all -> 0x00c6 }
        r3.append(r5);	 Catch:{ all -> 0x00c6 }
        r3.append(r0);	 Catch:{ all -> 0x00c6 }
        r0 = " of size ";	 Catch:{ all -> 0x00c6 }
        r3.append(r0);	 Catch:{ all -> 0x00c6 }
        r0 = com.bumptech.glide.p055g.C1180j.m4889a(r8);	 Catch:{ all -> 0x00c6 }
        r3.append(r0);	 Catch:{ all -> 0x00c6 }
        r0 = " in ";	 Catch:{ all -> 0x00c6 }
        r3.append(r0);	 Catch:{ all -> 0x00c6 }
        r0 = com.bumptech.glide.p055g.C1174e.m4865a(r1);	 Catch:{ all -> 0x00c6 }
        r3.append(r0);	 Catch:{ all -> 0x00c6 }
        r0 = ", options format: ";	 Catch:{ all -> 0x00c6 }
        r3.append(r0);	 Catch:{ all -> 0x00c6 }
        r0 = f18832b;	 Catch:{ all -> 0x00c6 }
        r10 = r10.m17523a(r0);	 Catch:{ all -> 0x00c6 }
        r3.append(r10);	 Catch:{ all -> 0x00c6 }
        r10 = ", hasAlpha: ";	 Catch:{ all -> 0x00c6 }
        r3.append(r10);	 Catch:{ all -> 0x00c6 }
        r8 = r8.hasAlpha();	 Catch:{ all -> 0x00c6 }
        r3.append(r8);	 Catch:{ all -> 0x00c6 }
        r8 = r3.toString();	 Catch:{ all -> 0x00c6 }
        android.util.Log.v(r9, r8);	 Catch:{ all -> 0x00c6 }
    L_0x00bc:
        com.bumptech.glide.p055g.p056a.C1168b.m4847a();
        return r4;
    L_0x00c0:
        if (r5 == 0) goto L_0x00c5;
    L_0x00c2:
        r5.close();	 Catch:{ IOException -> 0x00c5 }
    L_0x00c5:
        throw r8;	 Catch:{ all -> 0x00c6 }
    L_0x00c6:
        r8 = move-exception;
        com.bumptech.glide.p055g.p056a.C1168b.m4847a();
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.c.a(com.bumptech.glide.load.engine.s, java.io.File, com.bumptech.glide.load.e):boolean");
    }

    /* renamed from: a */
    private CompressFormat m24968a(Bitmap bitmap, C3452e c3452e) {
        CompressFormat compressFormat = (CompressFormat) c3452e.m17523a(f18832b);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha() != null) {
            return CompressFormat.PNG;
        }
        return CompressFormat.JPEG;
    }

    /* renamed from: a */
    public EncodeStrategy mo3904a(C3452e c3452e) {
        return EncodeStrategy.TRANSFORMED;
    }
}
