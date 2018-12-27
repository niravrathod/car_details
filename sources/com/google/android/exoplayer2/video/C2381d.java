package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.WindowManager;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.video.d */
public final class C2381d {
    /* renamed from: a */
    private final C2380a f7556a;
    /* renamed from: b */
    private final boolean f7557b;
    /* renamed from: c */
    private final long f7558c;
    /* renamed from: d */
    private final long f7559d;
    /* renamed from: e */
    private long f7560e;
    /* renamed from: f */
    private long f7561f;
    /* renamed from: g */
    private long f7562g;
    /* renamed from: h */
    private boolean f7563h;
    /* renamed from: i */
    private long f7564i;
    /* renamed from: j */
    private long f7565j;
    /* renamed from: k */
    private long f7566k;

    /* renamed from: com.google.android.exoplayer2.video.d$a */
    private static final class C2380a implements Callback, FrameCallback {
        /* renamed from: b */
        private static final C2380a f7550b = new C2380a();
        /* renamed from: a */
        public volatile long f7551a;
        /* renamed from: c */
        private final Handler f7552c;
        /* renamed from: d */
        private final HandlerThread f7553d = new HandlerThread("ChoreographerOwner:Handler");
        /* renamed from: e */
        private Choreographer f7554e;
        /* renamed from: f */
        private int f7555f;

        /* renamed from: a */
        public static C2380a m8715a() {
            return f7550b;
        }

        private C2380a() {
            this.f7553d.start();
            this.f7552c = new Handler(this.f7553d.getLooper(), this);
            this.f7552c.sendEmptyMessage(0);
        }

        /* renamed from: b */
        public void m8719b() {
            this.f7552c.sendEmptyMessage(1);
        }

        /* renamed from: c */
        public void m8720c() {
            this.f7552c.sendEmptyMessage(2);
        }

        public void doFrame(long j) {
            this.f7551a = j;
            this.f7554e.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case null:
                    m8716d();
                    return true;
                case 1:
                    m8717e();
                    return true;
                case 2:
                    m8718f();
                    return true;
                default:
                    return null;
            }
        }

        /* renamed from: d */
        private void m8716d() {
            this.f7554e = Choreographer.getInstance();
        }

        /* renamed from: e */
        private void m8717e() {
            this.f7555f++;
            if (this.f7555f == 1) {
                this.f7554e.postFrameCallback(this);
            }
        }

        /* renamed from: f */
        private void m8718f() {
            this.f7555f--;
            if (this.f7555f == 0) {
                this.f7554e.removeFrameCallback(this);
                this.f7551a = 0;
            }
        }
    }

    /* renamed from: c */
    protected void m8727c() {
    }

    public C2381d() {
        this(-1.0d, false);
    }

    public C2381d(Context context) {
        this((double) C2381d.m8721a(context), true);
    }

    private C2381d(double d, boolean z) {
        this.f7557b = z;
        if (z) {
            this.f7556a = C2380a.m8715a();
            this.f7558c = (long) (1.0E9d / d);
            this.f7559d = (this.f7558c * 80) / 100;
            return;
        }
        this.f7556a = 0.0d;
        this.f7558c = -1;
        this.f7559d = -1;
    }

    /* renamed from: a */
    public void m8725a() {
        this.f7563h = false;
        if (this.f7557b) {
            this.f7556a.m8719b();
        }
    }

    /* renamed from: b */
    public void m8726b() {
        if (this.f7557b) {
            this.f7556a.m8720c();
        }
    }

    /* renamed from: a */
    public long m8724a(long j, long j2) {
        long j3;
        long j4;
        long j5 = j;
        long j6 = j2;
        long j7 = 1000 * j5;
        if (this.f7563h) {
            if (j5 != r0.f7560e) {
                r0.f7566k++;
                r0.f7561f = r0.f7562g;
            }
            if (r0.f7566k >= 6) {
                long j8;
                j3 = r0.f7561f + ((j7 - r0.f7565j) / r0.f7566k);
                if (m8723b(j3, j6)) {
                    r0.f7563h = false;
                    j8 = j6;
                    j3 = j7;
                } else {
                    j8 = (r0.f7564i + j3) - r0.f7565j;
                }
                j4 = j8;
                if (!r0.f7563h) {
                    r0.f7565j = j7;
                    r0.f7564i = j6;
                    r0.f7566k = 0;
                    r0.f7563h = true;
                    m8727c();
                }
                r0.f7560e = j5;
                r0.f7562g = j3;
                if (r0.f7556a != null) {
                    if (r0.f7556a.f7551a == 0) {
                        return C2381d.m8722a(j4, r0.f7556a.f7551a, r0.f7558c) - r0.f7559d;
                    }
                }
                return j4;
            } else if (m8723b(j7, j6)) {
                r0.f7563h = false;
            }
        }
        j4 = j6;
        j3 = j7;
        if (r0.f7563h) {
            r0.f7565j = j7;
            r0.f7564i = j6;
            r0.f7566k = 0;
            r0.f7563h = true;
            m8727c();
        }
        r0.f7560e = j5;
        r0.f7562g = j3;
        if (r0.f7556a != null) {
            if (r0.f7556a.f7551a == 0) {
                return C2381d.m8722a(j4, r0.f7556a.f7551a, r0.f7558c) - r0.f7559d;
            }
        }
        return j4;
    }

    /* renamed from: b */
    private boolean m8723b(long j, long j2) {
        return Math.abs((j2 - this.f7564i) - (j - this.f7565j)) > 20000000 ? 1 : 0;
    }

    /* renamed from: a */
    private static long m8722a(long j, long j2, long j3) {
        j2 += ((j - j2) / j3) * j3;
        if (j <= j2) {
            j3 = j2 - j3;
        } else {
            long j4 = j2;
            j2 = j3 + j2;
            j3 = j4;
        }
        return j2 - j < j - j3 ? j2 : j3;
    }

    /* renamed from: a */
    private static float m8721a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }
}
