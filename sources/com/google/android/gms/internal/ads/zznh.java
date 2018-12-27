package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;

@zzaer
public final class zznh {
    /* renamed from: a */
    private final Context f9662a;

    public zznh(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.f9662a = context;
    }

    /* renamed from: a */
    public final boolean m10871a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m10870a(intent);
    }

    /* renamed from: b */
    public final boolean m10872b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m10870a(intent);
    }

    /* renamed from: c */
    public final boolean m10873c() {
        return ((Boolean) zzanr.m9933a(this.f9662a, new se())).booleanValue() && Wrappers.packageManager(this.f9662a).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* renamed from: d */
    public final boolean m10874d() {
        return m10870a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: a */
    private final boolean m10870a(Intent intent) {
        Preconditions.checkNotNull(intent, "Intent can not be null");
        if (this.f9662a.getPackageManager().queryIntentActivities(intent, 0).isEmpty() == null) {
            return true;
        }
        return false;
    }
}
