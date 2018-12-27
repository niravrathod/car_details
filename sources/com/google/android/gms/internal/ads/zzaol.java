package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@zzaer
public final class zzaol {
    /* renamed from: a */
    public static <T> T m10010a(Context context, String str, zzaom<IBinder, T> zzaom) {
        try {
            return zzaom.mo2163a(m10011b(context).m8898a(str));
        } catch (Context context2) {
            throw new zzaon(context2);
        }
    }

    /* renamed from: a */
    public static Context m10009a(Context context) {
        return m10011b(context).m8897a();
    }

    /* renamed from: b */
    private static DynamiteModule m10011b(Context context) {
        try {
            return DynamiteModule.m8886a(context, DynamiteModule.f7880a, ModuleDescriptor.MODULE_ID);
        } catch (Context context2) {
            throw new zzaon(context2);
        }
    }
}
