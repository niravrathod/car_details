package com.google.android.gms.internal.ads;

public final class zzec extends zzek {
    /* renamed from: d */
    private final StackTraceElement[] f17176d;

    public zzec(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzdb, str, str2, zzbb, i, 45);
        this.f17176d = stackTraceElementArr;
    }

    /* renamed from: a */
    protected final void mo2435a() {
        if (this.f17176d != null) {
            zzcz zzcz = new zzcz((String) this.c.invoke(null, new Object[]{this.f17176d}));
            synchronized (this.b) {
                this.b.f19960B = zzcz.f17140a;
                if (zzcz.f17141b.booleanValue()) {
                    this.b.f19968J = Integer.valueOf(zzcz.f17142c.booleanValue() ^ 1);
                } else {
                    this.b.f19968J = Integer.valueOf(2);
                }
            }
        }
    }
}
