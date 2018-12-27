package com.google.android.gms.internal.ads;

final class wl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzya f8468a;
    /* renamed from: b */
    private final /* synthetic */ zzyb f8469b;

    wl(zzyb zzyb, zzya zzya) {
        this.f8469b = zzyb;
        this.f8468a = zzya;
    }

    public final void run() {
        synchronized (this.f8469b.f17345i) {
            if (this.f8469b.f17355s != -2) {
                return;
            }
            this.f8469b.f17354r = this.f8469b.m21992d();
            if (this.f8469b.f17354r == null) {
                this.f8469b.mo2751a(4);
            } else if (!this.f8469b.m21994e() || this.f8469b.m21989b(1)) {
                this.f8468a.m26895a(this.f8469b);
                this.f8469b.m21983a(this.f8468a);
            } else {
                String f = this.f8469b.f17337a;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(f).length() + 56);
                stringBuilder.append("Ignoring adapter ");
                stringBuilder.append(f);
                stringBuilder.append(" as delayed impression is not supported");
                zzaok.m10007e(stringBuilder.toString());
                this.f8469b.mo2751a(2);
            }
        }
    }
}
