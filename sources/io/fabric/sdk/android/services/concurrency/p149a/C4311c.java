package io.fabric.sdk.android.services.concurrency.p149a;

/* renamed from: io.fabric.sdk.android.services.concurrency.a.c */
public class C4311c implements C2819a {
    /* renamed from: a */
    private final long f18041a;
    /* renamed from: b */
    private final int f18042b;

    public C4311c(long j, int i) {
        this.f18041a = j;
        this.f18042b = i;
    }

    /* renamed from: a */
    public long mo1111a(int i) {
        double d = (double) this.f18041a;
        double pow = Math.pow((double) this.f18042b, (double) i);
        Double.isNaN(d);
        return (long) (d * pow);
    }
}
