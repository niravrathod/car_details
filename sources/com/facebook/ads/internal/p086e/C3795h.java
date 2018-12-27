package com.facebook.ads.internal.p086e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.e.h */
public class C3795h extends C1791g {
    /* renamed from: a */
    public static final C1784b f15213a = new C1784b(0, "token_id", "TEXT PRIMARY KEY");
    /* renamed from: b */
    public static final C1784b f15214b = new C1784b(1, "token", "TEXT");
    /* renamed from: c */
    public static final C1784b[] f15215c = new C1784b[]{f15213a, f15214b};
    /* renamed from: d */
    private static final String f15216d = C3795h.class.getSimpleName();
    /* renamed from: e */
    private static final String f15217e = C1791g.m6732a("tokens", f15215c);
    /* renamed from: f */
    private static final String f15218f = C1791g.m6733a("tokens", f15215c, f15214b);
    /* renamed from: g */
    private static final String f15219g;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DELETE FROM tokens WHERE NOT EXISTS (SELECT 1 FROM events WHERE tokens.");
        stringBuilder.append(f15213a.f5378b);
        stringBuilder.append(" = ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15203b.f5378b);
        stringBuilder.append(")");
        f15219g = stringBuilder.toString();
    }

    public C3795h(C1787d c1787d) {
        super(c1787d);
    }

    /* renamed from: a */
    public String mo1348a() {
        return "tokens";
    }

    /* renamed from: a */
    String m18981a(String str) {
        Cursor rawQuery;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid token.");
        }
        try {
            rawQuery = m6740f().rawQuery(f15218f, new String[]{str});
            try {
                Object string = rawQuery.moveToNext() ? rawQuery.getString(f15213a.f5377a) : null;
                if (TextUtils.isEmpty(string)) {
                    String uuid = UUID.randomUUID().toString();
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put(f15213a.f5378b, uuid);
                    contentValues.put(f15214b.f5378b, str);
                    m6740f().insertOrThrow("tokens", null, contentValues);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return uuid;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return string;
            } catch (Throwable th2) {
                th = th2;
                if (rawQuery != null) {
                    rawQuery.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public C1784b[] mo1349b() {
        return f15215c;
    }

    /* renamed from: c */
    Cursor mo1350c() {
        return m6740f().rawQuery(f15217e, null);
    }

    /* renamed from: d */
    public void m18984d() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.m6740f();	 Catch:{ SQLException -> 0x0009 }
        r1 = f15219g;	 Catch:{ SQLException -> 0x0009 }
        r0.execSQL(r1);	 Catch:{ SQLException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.e.h.d():void");
    }
}
