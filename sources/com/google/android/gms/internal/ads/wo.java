package com.google.android.gms.internal.ads;

final class wo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzapi f8472a;
    /* renamed from: b */
    private final /* synthetic */ zzyh f8473b;

    wo(zzyh zzyh, zzapi zzapi) {
        this.f8473b = zzyh;
        this.f8472a = zzapi;
    }

    public final void run() {
        for (zzapi zzapi : this.f8473b.f17367k.keySet()) {
            if (zzapi != this.f8472a) {
                ((zzyb) this.f8473b.f17367k.get(zzapi)).m21999a();
            }
        }
    }
}
