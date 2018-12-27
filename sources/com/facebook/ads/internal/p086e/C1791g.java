package com.facebook.ads.internal.p086e;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.facebook.ads.internal.e.g */
public abstract class C1791g {
    /* renamed from: k */
    protected final C1787d f5409k;

    protected C1791g(C1787d c1787d) {
        this.f5409k = c1787d;
    }

    /* renamed from: a */
    public static String m6732a(String str, C1784b[] c1784bArr) {
        StringBuilder stringBuilder = new StringBuilder("SELECT ");
        for (int i = 0; i < c1784bArr.length - 1; i++) {
            stringBuilder.append(c1784bArr[i].f5378b);
            stringBuilder.append(", ");
        }
        stringBuilder.append(c1784bArr[c1784bArr.length - 1].f5378b);
        stringBuilder.append(" FROM ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m6733a(String str, C1784b[] c1784bArr, C1784b c1784b) {
        StringBuilder stringBuilder = new StringBuilder(C1791g.m6732a(str, c1784bArr));
        stringBuilder.append(" WHERE ");
        stringBuilder.append(c1784b.f5378b);
        stringBuilder.append(" = ?");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    private String mo1350c() {
        C1784b[] b = mo1349b();
        if (b.length < 1) {
            return null;
        }
        String str = "";
        for (int i = 0; i < b.length - 1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(b[i].m6708a());
            stringBuilder.append(", ");
            str = stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(b[b.length - 1].m6708a());
        return stringBuilder2.toString();
    }

    /* renamed from: a */
    public abstract String mo1348a();

    /* renamed from: a */
    public void m6736a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CREATE TABLE ");
        stringBuilder.append(mo1348a());
        stringBuilder.append(" (");
        stringBuilder.append(mo1350c());
        stringBuilder.append(")");
        sQLiteDatabase.execSQL(stringBuilder.toString());
    }

    /* renamed from: b */
    public void m6737b(SQLiteDatabase sQLiteDatabase) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DROP TABLE IF EXISTS ");
        stringBuilder.append(mo1348a());
        sQLiteDatabase.execSQL(stringBuilder.toString());
    }

    /* renamed from: b */
    public abstract C1784b[] mo1349b();

    /* renamed from: e */
    public void m6739e() {
    }

    /* renamed from: f */
    protected SQLiteDatabase m6740f() {
        return this.f5409k.m6716a();
    }
}
