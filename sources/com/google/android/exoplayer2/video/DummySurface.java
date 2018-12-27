package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2186s;

@TargetApi(17)
public final class DummySurface extends Surface {
    /* renamed from: a */
    public static final boolean f7535a;
    /* renamed from: b */
    public final boolean f7536b;
    /* renamed from: c */
    private final C2374a f7537c;
    /* renamed from: d */
    private boolean f7538d;

    /* renamed from: com.google.android.exoplayer2.video.DummySurface$a */
    private static class C2374a extends HandlerThread implements OnFrameAvailableListener, Callback {
        /* renamed from: a */
        private final int[] f7529a;
        /* renamed from: b */
        private Handler f7530b;
        /* renamed from: c */
        private SurfaceTexture f7531c;
        /* renamed from: d */
        private Error f7532d;
        /* renamed from: e */
        private RuntimeException f7533e;
        /* renamed from: f */
        private DummySurface f7534f;

        /* renamed from: a */
        public void m8711a() {
            this.f7530b.sendEmptyMessage(3);
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.f7530b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    try {
                        m8709a(message.arg1 != null ? true : null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Message message2) {
                        Log.e("DummySurface", "Failed to initialize dummy surface", message2);
                        this.f7533e = message2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Message message22) {
                        try {
                            Log.e("DummySurface", "Failed to initialize dummy surface", message22);
                            this.f7532d = message22;
                            synchronized (this) {
                                notify();
                            }
                        } catch (Throwable th) {
                            synchronized (this) {
                                notify();
                            }
                        }
                    }
                    return true;
                case 2:
                    this.f7531c.updateTexImage();
                    return true;
                case 3:
                    try {
                        m8710b();
                    } catch (Throwable th2) {
                        quit();
                    }
                    quit();
                    return true;
                default:
                    return true;
            }
        }

        /* renamed from: a */
        private void m8709a(boolean z) {
            int[] iArr;
            int[] iArr2;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            C2163a.m7919b(eglGetDisplay != null, "eglGetDisplay failed");
            int[] iArr3 = new int[2];
            C2163a.m7919b(EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1), "eglInitialize failed");
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr4 = new int[1];
            boolean z2 = EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr4, 0) && iArr4[0] > 0 && eGLConfigArr[0] != null;
            C2163a.m7919b(z2, "eglChooseConfig failed");
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (z) {
                iArr = new int[]{12440, 2, 12992, 1, 12344};
            } else {
                iArr = new int[]{12440, 2, 12344};
            }
            EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
            C2163a.m7919b(eglCreateContext != null, "eglCreateContext failed");
            if (z) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, iArr2, 0);
            C2163a.m7919b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
            C2163a.m7919b(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
            GLES20.glGenTextures(1, this.f7529a, 0);
            this.f7531c = new SurfaceTexture(this.f7529a[0]);
            this.f7531c.setOnFrameAvailableListener(this);
            this.f7534f = new DummySurface(this, this.f7531c, z);
        }

        /* renamed from: b */
        private void m8710b() {
            try {
                this.f7531c.release();
            } finally {
                this.f7534f = null;
                this.f7531c = null;
                GLES20.glDeleteTextures(1, this.f7529a, 0);
            }
        }
    }

    static {
        boolean z = false;
        if (C2186s.f6761a >= 17) {
            String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
            if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                z = true;
            }
            f7535a = z;
            return;
        }
        f7535a = false;
    }

    private DummySurface(C2374a c2374a, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f7537c = c2374a;
        this.f7536b = z;
    }

    public void release() {
        super.release();
        synchronized (this.f7537c) {
            if (!this.f7538d) {
                this.f7537c.m8711a();
                this.f7538d = true;
            }
        }
    }
}
