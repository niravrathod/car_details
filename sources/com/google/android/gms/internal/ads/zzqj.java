package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.ArrayList;
import java.util.List;

@zzaer
public final class zzqj extends AdChoicesInfo {
    /* renamed from: a */
    private final zzqg f17318a;
    /* renamed from: b */
    private final List<Image> f17319b = new ArrayList();
    /* renamed from: c */
    private String f17320c;

    public zzqj(zzqg zzqg) {
        this.f17318a = zzqg;
        try {
            this.f17320c = this.f17318a.mo2611a();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            this.f17320c = "";
        }
        try {
            for (Object next : zzqg.mo2612b()) {
                zzqk zzqm;
                if (next instanceof IBinder) {
                    IBinder iBinder = (IBinder) next;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzqm = queryLocalInterface instanceof zzqk ? (zzqk) queryLocalInterface : new zzqm(iBinder);
                        if (zzqm != null) {
                            this.f17319b.add(new zzqn(zzqm));
                        }
                    }
                }
                zzqm = null;
                if (zzqm != null) {
                    this.f17319b.add(new zzqn(zzqm));
                }
            }
        } catch (zzqg zzqg2) {
            zzaok.m10002b("", zzqg2);
        }
    }

    public final CharSequence getText() {
        return this.f17320c;
    }

    public final List<Image> getImages() {
        return this.f17319b;
    }
}
