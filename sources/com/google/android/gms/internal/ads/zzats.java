package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@zzaer
public final class zzats extends MutableContextWrapper {
    /* renamed from: a */
    private Activity f9015a;
    /* renamed from: b */
    private Context f9016b;
    /* renamed from: c */
    private Context f9017c;

    public zzats(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void setBaseContext(Context context) {
        this.f9016b = context.getApplicationContext();
        this.f9015a = context instanceof Activity ? (Activity) context : null;
        this.f9017c = context;
        super.setBaseContext(this.f9016b);
    }

    public final void startActivity(Intent intent) {
        if (this.f9015a != null) {
            this.f9015a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f9016b.startActivity(intent);
    }

    /* renamed from: a */
    public final Activity m10126a() {
        return this.f9015a;
    }

    public final Object getSystemService(String str) {
        return this.f9017c.getSystemService(str);
    }

    /* renamed from: b */
    public final Context m10127b() {
        return this.f9017c;
    }
}
