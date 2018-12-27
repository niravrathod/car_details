package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p124a.C2128d;
import com.google.android.exoplayer2.p126c.C2163a;

/* renamed from: com.google.android.exoplayer2.video.e */
public interface C2390e {

    /* renamed from: com.google.android.exoplayer2.video.e$a */
    public static final class C2389a {
        /* renamed from: a */
        private final Handler f7587a;
        /* renamed from: b */
        private final C2390e f7588b;

        public C2389a(Handler handler, C2390e c2390e) {
            this.f7587a = c2390e != null ? (Handler) C2163a.m7914a((Object) handler) : null;
            this.f7588b = c2390e;
        }

        /* renamed from: a */
        public void m8733a(final C2128d c2128d) {
            if (this.f7588b != null) {
                this.f7587a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2389a f7568b;

                    public void run() {
                        this.f7568b.f7588b.mo1651a(c2128d);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8734a(String str, long j, long j2) {
            if (this.f7588b != null) {
                final String str2 = str;
                final long j3 = j;
                final long j4 = j2;
                this.f7587a.post(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2389a f7572d;

                    public void run() {
                        this.f7572d.f7588b.mo1653a(str2, j3, j4);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8732a(final Format format) {
            if (this.f7588b != null) {
                this.f7587a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2389a f7574b;

                    public void run() {
                        this.f7574b.f7588b.mo1650a(format);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8730a(final int i, final long j) {
            if (this.f7588b != null) {
                this.f7587a.post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ C2389a f7577c;

                    public void run() {
                        this.f7577c.f7588b.mo1647a(i, j);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8729a(int i, int i2, int i3, float f) {
            if (this.f7588b != null) {
                final int i4 = i;
                final int i5 = i2;
                final int i6 = i3;
                final float f2 = f;
                this.f7587a.post(new Runnable(this) {
                    /* renamed from: e */
                    final /* synthetic */ C2389a f7582e;

                    public void run() {
                        this.f7582e.f7588b.mo1646a(i4, i5, i6, f2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8731a(final Surface surface) {
            if (this.f7588b != null) {
                this.f7587a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2389a f7584b;

                    public void run() {
                        this.f7584b.f7588b.mo1649a(surface);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m8735b(final C2128d c2128d) {
            if (this.f7588b != null) {
                this.f7587a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2389a f7586b;

                    public void run() {
                        c2128d.m7776a();
                        this.f7586b.f7588b.mo1656b(c2128d);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo1646a(int i, int i2, int i3, float f);

    /* renamed from: a */
    void mo1647a(int i, long j);

    /* renamed from: a */
    void mo1649a(Surface surface);

    /* renamed from: a */
    void mo1650a(Format format);

    /* renamed from: a */
    void mo1651a(C2128d c2128d);

    /* renamed from: a */
    void mo1653a(String str, long j, long j2);

    /* renamed from: b */
    void mo1656b(C2128d c2128d);
}
