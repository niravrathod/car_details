package io.fabric.sdk.android.services.p148c;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import io.fabric.sdk.android.C2771h;

/* renamed from: io.fabric.sdk.android.services.c.d */
public class C4298d implements C2787c {
    /* renamed from: a */
    private final SharedPreferences f18022a;
    /* renamed from: b */
    private final String f18023b;
    /* renamed from: c */
    private final Context f18024c;

    public C4298d(Context context, String str) {
        if (context != null) {
            this.f18024c = context;
            this.f18023b = str;
            this.f18022a = this.f18024c.getSharedPreferences(this.f18023b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Deprecated
    public C4298d(C2771h c2771h) {
        this(c2771h.getContext(), c2771h.getClass().getName());
    }

    /* renamed from: a */
    public SharedPreferences mo3576a() {
        return this.f18022a;
    }

    /* renamed from: b */
    public Editor mo3578b() {
        return this.f18022a.edit();
    }

    @TargetApi(9)
    /* renamed from: a */
    public boolean mo3577a(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }
}
