package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.internal.ads.zzmn;

@KeepForSdkWithMembers
public class MobileAdsInitProvider extends ContentProvider {
    /* renamed from: a */
    private final zzmn f7604a = new zzmn();

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f7604a.attachInfo(context, providerInfo);
    }

    public boolean onCreate() {
        return this.f7604a.onCreate();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f7604a.query(uri, strArr, str, strArr2, str2);
    }

    public String getType(Uri uri) {
        return this.f7604a.getType(uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return this.f7604a.insert(uri, contentValues);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f7604a.delete(uri, str, strArr);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f7604a.update(uri, contentValues, str, strArr);
    }
}
