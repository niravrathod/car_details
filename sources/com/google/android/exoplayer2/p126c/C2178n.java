package com.google.android.exoplayer2.p126c;

import java.util.PriorityQueue;

/* renamed from: com.google.android.exoplayer2.c.n */
public final class C2178n {
    /* renamed from: a */
    private final Object f6742a;
    /* renamed from: b */
    private final PriorityQueue<Integer> f6743b;
    /* renamed from: c */
    private int f6744c;

    /* renamed from: a */
    public void m8018a(int i) {
        synchronized (this.f6742a) {
            this.f6743b.add(Integer.valueOf(i));
            this.f6744c = Math.max(this.f6744c, i);
        }
    }

    /* renamed from: b */
    public void m8019b(int i) {
        synchronized (this.f6742a) {
            this.f6743b.remove(Integer.valueOf(i));
            this.f6744c = this.f6743b.isEmpty() != 0 ? Integer.MIN_VALUE : ((Integer) this.f6743b.peek()).intValue();
            this.f6742a.notifyAll();
        }
    }
}
