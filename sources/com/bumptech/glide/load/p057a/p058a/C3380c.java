package com.bumptech.glide.load.p057a.p058a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.util.Log;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p057a.C1192g;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.a.c */
public class C3380c implements C1188d<InputStream> {
    /* renamed from: a */
    private final Uri f14263a;
    /* renamed from: b */
    private final C1185e f14264b;
    /* renamed from: c */
    private InputStream f14265c;

    /* renamed from: com.bumptech.glide.load.a.a.c$a */
    static class C3378a implements C1184d {
        /* renamed from: b */
        private static final String[] f14259b = new String[]{"_data"};
        /* renamed from: a */
        private final ContentResolver f14260a;

        C3378a(ContentResolver contentResolver) {
            this.f14260a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo958a(Uri uri) {
            uri = uri.getLastPathSegment();
            return this.f14260a.query(Thumbnails.EXTERNAL_CONTENT_URI, f14259b, "kind = 1 AND image_id = ?", new String[]{uri}, null);
        }
    }

    /* renamed from: com.bumptech.glide.load.a.a.c$b */
    static class C3379b implements C1184d {
        /* renamed from: b */
        private static final String[] f14261b = new String[]{"_data"};
        /* renamed from: a */
        private final ContentResolver f14262a;

        C3379b(ContentResolver contentResolver) {
            this.f14262a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo958a(Uri uri) {
            uri = uri.getLastPathSegment();
            return this.f14262a.query(Video.Thumbnails.EXTERNAL_CONTENT_URI, f14261b, "kind = 1 AND video_id = ?", new String[]{uri}, null);
        }
    }

    /* renamed from: c */
    public void mo962c() {
    }

    /* renamed from: a */
    public static C3380c m17302a(Context context, Uri uri) {
        return C3380c.m17303a(context, uri, new C3378a(context.getContentResolver()));
    }

    /* renamed from: b */
    public static C3380c m17304b(Context context, Uri uri) {
        return C3380c.m17303a(context, uri, new C3379b(context.getContentResolver()));
    }

    /* renamed from: a */
    private static C3380c m17303a(Context context, Uri uri, C1184d c1184d) {
        return new C3380c(uri, new C1185e(C1143c.m4768a(context).m4787h().m4635a(), c1184d, C1143c.m4768a(context).m4780b(), context.getContentResolver()));
    }

    C3380c(Uri uri, C1185e c1185e) {
        this.f14263a = uri;
        this.f14264b = c1185e;
    }

    /* renamed from: a */
    public void mo960a(Priority priority, C1187a<? super InputStream> c1187a) {
        try {
            this.f14265c = m17305e();
            c1187a.mo986a(this.f14265c);
        } catch (Exception e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            c1187a.mo985a(e);
        }
    }

    /* renamed from: e */
    private InputStream m17305e() {
        InputStream b = this.f14264b.m4922b(this.f14263a);
        int a = b != null ? this.f14264b.m4921a(this.f14263a) : -1;
        return a != -1 ? new C1192g(b, a) : b;
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
        r0 = r1.f14265c;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r1.f14265c;	 Catch:{ IOException -> 0x0009 }
        r0.close();	 Catch:{ IOException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.a.c.b():void");
    }

    /* renamed from: a */
    public Class<InputStream> mo959a() {
        return InputStream.class;
    }

    /* renamed from: d */
    public DataSource mo963d() {
        return DataSource.LOCAL;
    }
}
