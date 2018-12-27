package com.facebook.ads.internal.p086e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.facebook.ads.internal.e.e */
public class C1788e extends SQLiteOpenHelper {
    /* renamed from: a */
    private final C1787d f5399a;

    public C1788e(Context context, C1787d c1787d) {
        super(context, "ads.db", null, 4);
        if (c1787d != null) {
            this.f5399a = c1787d;
            return;
        }
        throw new IllegalArgumentException("AdDatabaseHelper can not be null");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (C1791g a : this.f5399a.m6722c()) {
            a.m6736a(sQLiteDatabase);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        for (C1791g c1791g : this.f5399a.m6722c()) {
            c1791g.m6737b(sQLiteDatabase);
            c1791g.m6736a(sQLiteDatabase);
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON;");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 2 && i2 >= 3) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS crashes");
        }
        if (i <= 3 && i2 >= 4) {
            C1784b c1784b = C3794c.f15210i;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ALTER TABLE events ADD COLUMN ");
            stringBuilder.append(c1784b.f5378b);
            stringBuilder.append(" ");
            stringBuilder.append(c1784b.f5379c);
            stringBuilder.append(" DEFAULT 0");
            sQLiteDatabase.execSQL(stringBuilder.toString());
        }
    }
}
