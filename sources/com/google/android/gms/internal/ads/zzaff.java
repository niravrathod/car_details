package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@zzaer
public final class zzaff {
    /* renamed from: b */
    private static boolean m9515b(Context context, boolean z) {
        if (!z) {
            return true;
        }
        z = DynamiteModule.m8890b(context, ModuleDescriptor.MODULE_ID);
        return z && z <= DynamiteModule.m8883a(context, ModuleDescriptor.MODULE_ID);
    }
}
