package io.fabric.sdk.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

/* renamed from: io.fabric.sdk.android.d */
class C2767d extends ContextWrapper {
    /* renamed from: a */
    private final String f11820a;
    /* renamed from: b */
    private final String f11821b;

    public C2767d(Context context, String str, String str2) {
        super(context);
        this.f11821b = str;
        this.f11820a = str2;
    }

    public File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.f11820a);
        file.mkdirs();
        return new File(file, str);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    @TargetApi(11)
    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }

    public File getFilesDir() {
        return new File(super.getFilesDir(), this.f11820a);
    }

    @TargetApi(8)
    public File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.f11820a);
    }

    public File getCacheDir() {
        return new File(super.getCacheDir(), this.f11820a);
    }

    @TargetApi(8)
    public File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.f11820a);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f11821b);
        stringBuilder.append(":");
        stringBuilder.append(str);
        return super.getSharedPreferences(stringBuilder.toString(), i);
    }
}
