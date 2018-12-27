package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p124a.C2128d;
import com.google.android.exoplayer2.p126c.C2163a;

/* renamed from: com.google.android.exoplayer2.audio.c */
public interface C2146c {

    /* renamed from: com.google.android.exoplayer2.audio.c$a */
    public static final class C2145a {
        /* renamed from: a */
        private final Handler f6630a;
        /* renamed from: b */
        private final C2146c f6631b;

        public C2145a(Handler handler, C2146c c2146c) {
            this.f6630a = c2146c != null ? (Handler) C2163a.m7914a((Object) handler) : null;
            this.f6631b = c2146c;
        }

        /* renamed from: a */
        public void m7860a(final C2128d c2128d) {
            if (this.f6631b != null) {
                this.f6630a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2145a f6615b;

                    public void run() {
                        this.f6615b.f6631b.mo1658c(c2128d);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7861a(String str, long j, long j2) {
            if (this.f6631b != null) {
                final String str2 = str;
                final long j3 = j;
                final long j4 = j2;
                this.f6630a.post(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2145a f6619d;

                    public void run() {
                        this.f6619d.f6631b.mo1657b(str2, j3, j4);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7859a(final Format format) {
            if (this.f6631b != null) {
                this.f6630a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2145a f6621b;

                    public void run() {
                        this.f6621b.f6631b.mo1655b(format);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7858a(int i, long j, long j2) {
            if (this.f6631b != null) {
                final int i2 = i;
                final long j3 = j;
                final long j4 = j2;
                this.f6630a.post(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2145a f6625d;

                    public void run() {
                        this.f6625d.f6631b.mo1648a(i2, j3, j4);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m7862b(final C2128d c2128d) {
            if (this.f6631b != null) {
                this.f6630a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2145a f6627b;

                    public void run() {
                        c2128d.m7776a();
                        this.f6627b.f6631b.mo1659d(c2128d);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7857a(final int i) {
            if (this.f6631b != null) {
                this.f6630a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2145a f6629b;

                    public void run() {
                        this.f6629b.f6631b.mo1645a(i);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo1645a(int i);

    /* renamed from: a */
    void mo1648a(int i, long j, long j2);

    /* renamed from: b */
    void mo1655b(Format format);

    /* renamed from: b */
    void mo1657b(String str, long j, long j2);

    /* renamed from: c */
    void mo1658c(C2128d c2128d);

    /* renamed from: d */
    void mo1659d(C2128d c2128d);
}
