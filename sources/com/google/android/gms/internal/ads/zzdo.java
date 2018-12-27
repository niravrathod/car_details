package com.google.android.gms.internal.ads;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class zzdo extends zzek {
    public zzdo(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 49);
    }

    /* renamed from: a */
    protected final void mo2435a() {
        this.b.f19964F = Integer.valueOf(2);
        try {
            boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.m10504a()})).booleanValue();
            this.b.f19964F = Integer.valueOf(booleanValue);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
