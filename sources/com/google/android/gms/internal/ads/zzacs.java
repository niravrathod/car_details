package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.common.util.PlatformVersion;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzacs {
    /* renamed from: a */
    public static zzami m9460a(Context context, zza zza, zzakn zzakn, zzck zzck, zzasg zzasg, zzyn zzyn, zzact zzact, zzoj zzoj) {
        zzami zzacu;
        zzaft zzaft = zzakn.f8807b;
        zzami zzacy;
        if (zzaft.f19792g) {
            zzacy = new zzacy(context, zzakn, zzyn, zzact, zzoj, zzasg);
        } else {
            if (!zzaft.f19804s) {
                if (!(zza instanceof zzbb)) {
                    if (!PlatformVersion.isAtLeastKitKat() || PlatformVersion.isAtLeastLollipop() || zzasg == null || !zzasg.mo4205s().m10134e()) {
                        zzacu = new zzacu(context, zzakn, zzasg, zzact);
                    } else {
                        zzacu = new zzacx(context, zzakn, zzasg, zzact);
                    }
                }
            }
            if (zzaft.f19804s && (zza instanceof zzbb)) {
                zzacy = new zzada(context, (zzbb) zza, zzakn, zzck, zzact, zzoj);
            } else {
                zzacu = new zzacv(zzakn, zzact);
            }
        }
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(zzacu.getClass().getName());
        zzaok.m10001b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        zzacu.mo2219c();
        return zzacu;
    }
}
