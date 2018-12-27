package com.facebook.ads.internal.p086e;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.e.c */
public class C3794c extends C1791g {
    /* renamed from: a */
    public static final C1784b f15202a = new C1784b(0, "event_id", "TEXT PRIMARY KEY");
    /* renamed from: b */
    public static final C1784b f15203b = new C1784b(1, "token_id", "TEXT REFERENCES tokens ON UPDATE CASCADE ON DELETE RESTRICT");
    /* renamed from: c */
    public static final C1784b f15204c = new C1784b(2, "priority", "INTEGER");
    /* renamed from: d */
    public static final C1784b f15205d = new C1784b(3, "type", "TEXT");
    /* renamed from: e */
    public static final C1784b f15206e = new C1784b(4, "time", "REAL");
    /* renamed from: f */
    public static final C1784b f15207f = new C1784b(5, "session_time", "REAL");
    /* renamed from: g */
    public static final C1784b f15208g = new C1784b(6, "session_id", "TEXT");
    /* renamed from: h */
    public static final C1784b f15209h = new C1784b(7, "data", "TEXT");
    /* renamed from: i */
    public static final C1784b f15210i = new C1784b(8, "attempt", "INTEGER");
    /* renamed from: j */
    public static final C1784b[] f15211j = new C1784b[]{f15202a, f15203b, f15204c, f15205d, f15206e, f15207f, f15208g, f15209h, f15210i};
    /* renamed from: l */
    private static final String f15212l = C1791g.m6732a("events", f15211j);

    public C3794c(C1787d c1787d) {
        super(c1787d);
    }

    /* renamed from: a */
    public String mo1348a() {
        return "events";
    }

    /* renamed from: a */
    String m18975a(String str, int i, String str2, double d, double d2, String str3, Map<String, String> map) {
        String uuid = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(9);
        contentValues.put(f15202a.f5378b, uuid);
        contentValues.put(f15203b.f5378b, str);
        contentValues.put(f15204c.f5378b, Integer.valueOf(i));
        contentValues.put(f15205d.f5378b, str2);
        contentValues.put(f15206e.f5378b, Double.valueOf(d));
        contentValues.put(f15207f.f5378b, Double.valueOf(d2));
        contentValues.put(f15208g.f5378b, str3);
        contentValues.put(f15209h.f5378b, map != null ? new JSONObject(map).toString() : null);
        contentValues.put(f15210i.f5378b, Integer.valueOf(0));
        m6740f().insertOrThrow("events", null, contentValues);
        return uuid;
    }

    /* renamed from: a */
    boolean m18976a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f15202a.f5378b);
        stringBuilder.append(" = ?");
        return m6740f().delete("events", stringBuilder.toString(), new String[]{str}) > 0;
    }

    /* renamed from: b */
    public C1784b[] mo1349b() {
        return f15211j;
    }

    /* renamed from: c */
    Cursor mo1350c() {
        return m6740f().rawQuery("SELECT count(*) FROM events", null);
    }

    /* renamed from: d */
    Cursor m18979d() {
        return m6740f().rawQuery(f15212l, null);
    }
}
