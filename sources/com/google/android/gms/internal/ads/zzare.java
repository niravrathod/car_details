package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@zzaer
@TargetApi(14)
public final class zzare extends Thread implements OnFrameAvailableListener, ga {
    /* renamed from: a */
    private static final float[] f16908a = new float[]{-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    /* renamed from: A */
    private volatile boolean f16909A;
    /* renamed from: B */
    private volatile boolean f16910B;
    /* renamed from: b */
    private final fy f16911b;
    /* renamed from: c */
    private final float[] f16912c;
    /* renamed from: d */
    private final float[] f16913d;
    /* renamed from: e */
    private final float[] f16914e;
    /* renamed from: f */
    private final float[] f16915f;
    /* renamed from: g */
    private final float[] f16916g;
    /* renamed from: h */
    private final float[] f16917h;
    /* renamed from: i */
    private final float[] f16918i;
    /* renamed from: j */
    private float f16919j;
    /* renamed from: k */
    private float f16920k;
    /* renamed from: l */
    private float f16921l;
    /* renamed from: m */
    private int f16922m;
    /* renamed from: n */
    private int f16923n;
    /* renamed from: o */
    private SurfaceTexture f16924o;
    /* renamed from: p */
    private SurfaceTexture f16925p;
    /* renamed from: q */
    private int f16926q;
    /* renamed from: r */
    private int f16927r;
    /* renamed from: s */
    private int f16928s;
    /* renamed from: t */
    private FloatBuffer f16929t = ByteBuffer.allocateDirect(f16908a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    /* renamed from: u */
    private final CountDownLatch f16930u;
    /* renamed from: v */
    private final Object f16931v;
    /* renamed from: w */
    private EGL10 f16932w;
    /* renamed from: x */
    private EGLDisplay f16933x;
    /* renamed from: y */
    private EGLContext f16934y;
    /* renamed from: z */
    private EGLSurface f16935z;

    public zzare(Context context) {
        super("SphericalVideoProcessor");
        this.f16929t.put(f16908a).position(0);
        this.f16912c = new float[9];
        this.f16913d = new float[9];
        this.f16914e = new float[9];
        this.f16915f = new float[9];
        this.f16916g = new float[9];
        this.f16917h = new float[9];
        this.f16918i = new float[9];
        this.f16919j = Float.NaN;
        this.f16911b = new fy(context);
        this.f16911b.m8932a((ga) this);
        this.f16930u = new CountDownLatch(1);
        this.f16931v = new Object();
    }

    /* renamed from: a */
    public final void m21344a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f16923n = i;
        this.f16922m = i2;
        this.f16925p = surfaceTexture;
    }

    /* renamed from: a */
    public final void m21343a(int i, int i2) {
        synchronized (this.f16931v) {
            this.f16923n = i;
            this.f16922m = i2;
            this.f16909A = true;
            this.f16931v.notifyAll();
        }
    }

    /* renamed from: b */
    public final void m21345b() {
        synchronized (this.f16931v) {
            this.f16910B = true;
            this.f16925p = null;
            this.f16931v.notifyAll();
        }
    }

    /* renamed from: c */
    public final android.graphics.SurfaceTexture m21346c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f16925p;
        if (r0 != 0) goto L_0x0006;
    L_0x0004:
        r0 = 0;
        return r0;
    L_0x0006:
        r0 = r1.f16930u;	 Catch:{ InterruptedException -> 0x000b }
        r0.await();	 Catch:{ InterruptedException -> 0x000b }
    L_0x000b:
        r0 = r1.f16924o;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzare.c():android.graphics.SurfaceTexture");
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f16928s++;
        synchronized (this.f16931v) {
            this.f16931v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo2387a() {
        synchronized (this.f16931v) {
            this.f16931v.notifyAll();
        }
    }

    public final void run() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r14 = this;
        r0 = r14.f16925p;
        if (r0 != 0) goto L_0x000f;
    L_0x0004:
        r0 = "SphericalVideoProcessor started with no output texture.";
        com.google.android.gms.internal.ads.zzaok.m10003c(r0);
        r0 = r14.f16930u;
        r0.countDown();
        return;
    L_0x000f:
        r0 = javax.microedition.khronos.egl.EGLContext.getEGL();
        r0 = (javax.microedition.khronos.egl.EGL10) r0;
        r14.f16932w = r0;
        r0 = r14.f16932w;
        r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
        r0 = r0.eglGetDisplay(r1);
        r14.f16933x = r0;
        r0 = r14.f16933x;
        r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        r2 = 3;
        r3 = 2;
        r4 = 0;
        r5 = 1;
        r6 = 0;
        if (r0 != r1) goto L_0x002f;
    L_0x002c:
        r0 = 0;
        goto L_0x00a4;
    L_0x002f:
        r0 = new int[r3];
        r1 = r14.f16932w;
        r7 = r14.f16933x;
        r0 = r1.eglInitialize(r7, r0);
        if (r0 != 0) goto L_0x003c;
    L_0x003b:
        goto L_0x002c;
    L_0x003c:
        r0 = new int[r5];
        r1 = new javax.microedition.khronos.egl.EGLConfig[r5];
        r7 = 11;
        r9 = new int[r7];
        r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344};
        r7 = r14.f16932w;
        r8 = r14.f16933x;
        r11 = 1;
        r10 = r1;
        r12 = r0;
        r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12);
        if (r7 == 0) goto L_0x005b;
    L_0x0054:
        r0 = r0[r6];
        if (r0 <= 0) goto L_0x005b;
    L_0x0058:
        r0 = r1[r6];
        goto L_0x005c;
    L_0x005b:
        r0 = r4;
    L_0x005c:
        if (r0 != 0) goto L_0x005f;
    L_0x005e:
        goto L_0x002c;
    L_0x005f:
        r1 = new int[r2];
        r1 = {12440, 2, 12344};
        r7 = r14.f16932w;
        r8 = r14.f16933x;
        r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        r1 = r7.eglCreateContext(r8, r0, r9, r1);
        r14.f16934y = r1;
        r1 = r14.f16934y;
        if (r1 == 0) goto L_0x002c;
    L_0x0074:
        r1 = r14.f16934y;
        r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        if (r1 != r7) goto L_0x007b;
    L_0x007a:
        goto L_0x002c;
    L_0x007b:
        r1 = r14.f16932w;
        r7 = r14.f16933x;
        r8 = r14.f16925p;
        r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4);
        r14.f16935z = r0;
        r0 = r14.f16935z;
        if (r0 == 0) goto L_0x002c;
    L_0x008b:
        r0 = r14.f16935z;
        r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        if (r0 != r1) goto L_0x0092;
    L_0x0091:
        goto L_0x002c;
    L_0x0092:
        r0 = r14.f16932w;
        r1 = r14.f16933x;
        r7 = r14.f16935z;
        r8 = r14.f16935z;
        r9 = r14.f16934y;
        r0 = r0.eglMakeCurrent(r1, r7, r8, r9);
        if (r0 != 0) goto L_0x00a3;
    L_0x00a2:
        goto L_0x002c;
    L_0x00a3:
        r0 = 1;
    L_0x00a4:
        r1 = 35633; // 0x8b31 float:4.9932E-41 double:1.7605E-319;
        r7 = com.google.android.gms.internal.ads.zznw.aR;
        r8 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r8 = r8.m10897a(r7);
        r8 = (java.lang.String) r8;
        r9 = r7.m10887b();
        r8 = r8.equals(r9);
        if (r8 != 0) goto L_0x00c8;
    L_0x00bd:
        r8 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r7 = r8.m10897a(r7);
        r7 = (java.lang.String) r7;
        goto L_0x00ca;
    L_0x00c8:
        r7 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
    L_0x00ca:
        r1 = m21335a(r1, r7);
        if (r1 != 0) goto L_0x00d3;
    L_0x00d0:
        r8 = 0;
        goto L_0x0155;
    L_0x00d3:
        r7 = 35632; // 0x8b30 float:4.9931E-41 double:1.76045E-319;
        r8 = com.google.android.gms.internal.ads.zznw.aS;
        r9 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r9 = r9.m10897a(r8);
        r9 = (java.lang.String) r9;
        r10 = r8.m10887b();
        r9 = r9.equals(r10);
        if (r9 != 0) goto L_0x00f7;
    L_0x00ec:
        r9 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r8 = r9.m10897a(r8);
        r8 = (java.lang.String) r8;
        goto L_0x00f9;
    L_0x00f7:
        r8 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
    L_0x00f9:
        r7 = m21335a(r7, r8);
        if (r7 != 0) goto L_0x0100;
    L_0x00ff:
        goto L_0x00d0;
    L_0x0100:
        r8 = android.opengl.GLES20.glCreateProgram();
        r9 = "createProgram";
        m21336a(r9);
        if (r8 == 0) goto L_0x0155;
    L_0x010b:
        android.opengl.GLES20.glAttachShader(r8, r1);
        r1 = "attachShader";
        m21336a(r1);
        android.opengl.GLES20.glAttachShader(r8, r7);
        r1 = "attachShader";
        m21336a(r1);
        android.opengl.GLES20.glLinkProgram(r8);
        r1 = "linkProgram";
        m21336a(r1);
        r1 = new int[r5];
        r7 = 35714; // 0x8b82 float:5.0046E-41 double:1.7645E-319;
        android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6);
        r7 = "getProgramiv";
        m21336a(r7);
        r1 = r1[r6];
        if (r1 == r5) goto L_0x014d;
    L_0x0134:
        r1 = "SphericalVideoRenderer";
        r7 = "Could not link program: ";
        android.util.Log.e(r1, r7);
        r1 = "SphericalVideoRenderer";
        r7 = android.opengl.GLES20.glGetProgramInfoLog(r8);
        android.util.Log.e(r1, r7);
        android.opengl.GLES20.glDeleteProgram(r8);
        r1 = "deleteProgram";
        m21336a(r1);
        goto L_0x00d0;
    L_0x014d:
        android.opengl.GLES20.glValidateProgram(r8);
        r1 = "validateProgram";
        m21336a(r1);
    L_0x0155:
        r14.f16926q = r8;
        r1 = r14.f16926q;
        android.opengl.GLES20.glUseProgram(r1);
        r1 = "useProgram";
        m21336a(r1);
        r1 = r14.f16926q;
        r7 = "aPosition";
        r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7);
        r9 = 3;
        r10 = 5126; // 0x1406 float:7.183E-42 double:2.5326E-320;
        r11 = 0;
        r12 = 12;
        r13 = r14.f16929t;
        r8 = r1;
        android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13);
        r7 = "vertexAttribPointer";
        m21336a(r7);
        android.opengl.GLES20.glEnableVertexAttribArray(r1);
        r1 = "enableVertexAttribArray";
        m21336a(r1);
        r1 = new int[r5];
        android.opengl.GLES20.glGenTextures(r5, r1, r6);
        r7 = "genTextures";
        m21336a(r7);
        r1 = r1[r6];
        r7 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        android.opengl.GLES20.glBindTexture(r7, r1);
        r8 = "bindTextures";
        m21336a(r8);
        r8 = 10240; // 0x2800 float:1.4349E-41 double:5.059E-320;
        r9 = 9729; // 0x2601 float:1.3633E-41 double:4.807E-320;
        android.opengl.GLES20.glTexParameteri(r7, r8, r9);
        r8 = "texParameteri";
        m21336a(r8);
        r8 = 10241; // 0x2801 float:1.435E-41 double:5.0597E-320;
        android.opengl.GLES20.glTexParameteri(r7, r8, r9);
        r8 = "texParameteri";
        m21336a(r8);
        r8 = 10242; // 0x2802 float:1.4352E-41 double:5.06E-320;
        r9 = 33071; // 0x812f float:4.6342E-41 double:1.6339E-319;
        android.opengl.GLES20.glTexParameteri(r7, r8, r9);
        r8 = "texParameteri";
        m21336a(r8);
        r8 = 10243; // 0x2803 float:1.4354E-41 double:5.0607E-320;
        android.opengl.GLES20.glTexParameteri(r7, r8, r9);
        r7 = "texParameteri";
        m21336a(r7);
        r7 = r14.f16926q;
        r8 = "uVMat";
        r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8);
        r14.f16927r = r7;
        r7 = 9;
        r7 = new float[r7];
        r7 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216};
        r8 = r14.f16927r;
        android.opengl.GLES20.glUniformMatrix3fv(r8, r5, r6, r7, r6);
        r7 = r14.f16926q;
        if (r7 == 0) goto L_0x01e2;
    L_0x01e0:
        r7 = 1;
        goto L_0x01e3;
    L_0x01e2:
        r7 = 0;
    L_0x01e3:
        if (r0 == 0) goto L_0x039f;
    L_0x01e5:
        if (r7 != 0) goto L_0x01e9;
    L_0x01e7:
        goto L_0x039f;
    L_0x01e9:
        r0 = new android.graphics.SurfaceTexture;
        r0.<init>(r1);
        r14.f16924o = r0;
        r0 = r14.f16924o;
        r0.setOnFrameAvailableListener(r14);
        r0 = r14.f16930u;
        r0.countDown();
        r0 = r14.f16911b;
        r0.m8931a();
        r14.f16909A = r5;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x0201:
        r0 = r14.f16910B;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        if (r0 != 0) goto L_0x0349;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x0205:
        r0 = r14.f16928s;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        if (r0 <= 0) goto L_0x0214;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x0209:
        r0 = r14.f16924o;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0.updateTexImage();	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16928s;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r0 - r5;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r14.f16928s = r0;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        goto L_0x0205;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x0214:
        r0 = r14.f16911b;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r1 = r14.f16912c;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r0.m8933a(r1);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r1 = 5;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r7 = 4;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r8 = 1070141403; // 0x3fc90fdb float:1.5707964 double:5.287201034E-315;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        if (r0 == 0) goto L_0x0294;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x0223:
        r0 = r14.f16919j;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = java.lang.Float.isNaN(r0);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        if (r0 == 0) goto L_0x0289;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x022b:
        r0 = r14.f16912c;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = new float[r2];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = {0, 1065353216, 0};	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r10 = new float[r2];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r0[r6];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r9[r6];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r11 * r12;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r0[r5];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r13 = r9[r5];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r12 * r13;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r11 + r12;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r0[r3];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r13 = r9[r3];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r12 * r13;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r11 + r12;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r10[r6] = r11;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r0[r2];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r9[r6];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r11 * r12;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r0[r7];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r13 = r9[r5];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r12 * r13;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r11 + r12;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r0[r1];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r13 = r9[r3];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r12 * r13;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r11 + r12;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r10[r5] = r11;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = 6;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r0[r11];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r9[r6];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r11 * r12;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = 7;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r0[r12];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r13 = r9[r5];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = r12 * r13;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r11 + r12;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r12 = 8;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r0[r12];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = r9[r3];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r0 * r9;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = r11 + r0;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r10[r3] = r11;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r10[r5];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r11 = (double) r0;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r10[r6];	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = (double) r0;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = java.lang.Math.atan2(r11, r9);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = (float) r9;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r0 - r8;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = -r0;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r14.f16919j = r0;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x0289:
        r0 = r14.f16917h;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = r14.f16919j;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r10 = r14.f16920k;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = r9 + r10;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        m21339b(r0, r9);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        goto L_0x02a3;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x0294:
        r0 = r14.f16912c;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = -1077342245; // 0xffffffffbfc90fdb float:-1.5707964 double:NaN;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        m21337a(r0, r9);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16917h;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = r14.f16920k;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        m21339b(r0, r9);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x02a3:
        r0 = r14.f16913d;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        m21337a(r0, r8);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16914e;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r8 = r14.f16917h;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = r14.f16913d;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        m21338a(r0, r8, r9);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16915f;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r8 = r14.f16912c;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = r14.f16914e;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        m21338a(r0, r8, r9);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16916g;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r8 = r14.f16921l;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        m21337a(r0, r8);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16918i;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r8 = r14.f16916g;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = r14.f16915f;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        m21338a(r0, r8, r9);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16927r;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r8 = r14.f16918i;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        android.opengl.GLES20.glDrawArrays(r1, r6, r7);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = "drawArrays";	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        m21336a(r0);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        android.opengl.GLES20.glFinish();	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16932w;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r1 = r14.f16933x;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r7 = r14.f16935z;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0.eglSwapBuffers(r1, r7);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16909A;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        if (r0 == 0) goto L_0x032f;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x02e9:
        r0 = r14.f16923n;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r1 = r14.f16922m;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        android.opengl.GLES20.glViewport(r6, r6, r0, r1);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = "viewport";	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        m21336a(r0);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16926q;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r1 = "uFOVx";	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r1 = r14.f16926q;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r7 = "uFOVy";	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r7 = r14.f16923n;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r8 = r14.f16922m;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r9 = 1063216883; // 0x3f5f66f3 float:0.87266463 double:5.25298936E-315;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        if (r7 <= r8) goto L_0x031e;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x030e:
        android.opengl.GLES20.glUniform1f(r0, r9);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r14.f16922m;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = (float) r0;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r0 * r9;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r7 = r14.f16923n;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r7 = (float) r7;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r0 = r0 / r7;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        android.opengl.GLES20.glUniform1f(r1, r0);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        goto L_0x032d;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x031e:
        r7 = r14.f16923n;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r7 = (float) r7;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r7 = r7 * r9;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r8 = r14.f16922m;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r8 = (float) r8;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        r7 = r7 / r8;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        android.opengl.GLES20.glUniform1f(r0, r7);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
        android.opengl.GLES20.glUniform1f(r1, r9);	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x032d:
        r14.f16909A = r6;	 Catch:{ IllegalStateException -> 0x037a, Throwable -> 0x035b }
    L_0x032f:
        r0 = r14.f16931v;	 Catch:{ InterruptedException -> 0x0201 }
        monitor-enter(r0);	 Catch:{ InterruptedException -> 0x0201 }
        r1 = r14.f16910B;	 Catch:{ all -> 0x0346 }
        if (r1 != 0) goto L_0x0343;	 Catch:{ all -> 0x0346 }
    L_0x0336:
        r1 = r14.f16909A;	 Catch:{ all -> 0x0346 }
        if (r1 != 0) goto L_0x0343;	 Catch:{ all -> 0x0346 }
    L_0x033a:
        r1 = r14.f16928s;	 Catch:{ all -> 0x0346 }
        if (r1 != 0) goto L_0x0343;	 Catch:{ all -> 0x0346 }
    L_0x033e:
        r1 = r14.f16931v;	 Catch:{ all -> 0x0346 }
        r1.wait();	 Catch:{ all -> 0x0346 }
    L_0x0343:
        monitor-exit(r0);	 Catch:{ all -> 0x0346 }
        goto L_0x0201;	 Catch:{ all -> 0x0346 }
    L_0x0346:
        r1 = move-exception;	 Catch:{ all -> 0x0346 }
        monitor-exit(r0);	 Catch:{ all -> 0x0346 }
        throw r1;	 Catch:{ InterruptedException -> 0x0201 }
    L_0x0349:
        r0 = r14.f16911b;
        r0.m8934b();
        r0 = r14.f16924o;
        r0.setOnFrameAvailableListener(r4);
        r14.f16924o = r4;
        r14.m21340d();
        return;
    L_0x0359:
        r0 = move-exception;
        goto L_0x038f;
    L_0x035b:
        r0 = move-exception;
        r1 = "SphericalVideoProcessor died.";	 Catch:{ all -> 0x0359 }
        com.google.android.gms.internal.ads.zzaok.m10002b(r1, r0);	 Catch:{ all -> 0x0359 }
        r1 = com.google.android.gms.ads.internal.zzbv.zzeo();	 Catch:{ all -> 0x0359 }
        r2 = "SphericalVideoProcessor.run.2";	 Catch:{ all -> 0x0359 }
        r1.m9714a(r0, r2);	 Catch:{ all -> 0x0359 }
        r0 = r14.f16911b;
        r0.m8934b();
        r0 = r14.f16924o;
        r0.setOnFrameAvailableListener(r4);
        r14.f16924o = r4;
        r14.m21340d();
        return;
    L_0x037a:
        r0 = "SphericalVideoProcessor halted unexpectedly.";	 Catch:{ all -> 0x0359 }
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);	 Catch:{ all -> 0x0359 }
        r0 = r14.f16911b;
        r0.m8934b();
        r0 = r14.f16924o;
        r0.setOnFrameAvailableListener(r4);
        r14.f16924o = r4;
        r14.m21340d();
        return;
    L_0x038f:
        r1 = r14.f16911b;
        r1.m8934b();
        r1 = r14.f16924o;
        r1.setOnFrameAvailableListener(r4);
        r14.f16924o = r4;
        r14.m21340d();
        throw r0;
    L_0x039f:
        r0 = r14.f16932w;
        r0 = r0.eglGetError();
        r0 = android.opengl.GLUtils.getEGLErrorString(r0);
        r1 = "EGL initialization failed: ";
        r0 = java.lang.String.valueOf(r0);
        r2 = r0.length();
        if (r2 == 0) goto L_0x03ba;
    L_0x03b5:
        r0 = r1.concat(r0);
        goto L_0x03bf;
    L_0x03ba:
        r0 = new java.lang.String;
        r0.<init>(r1);
    L_0x03bf:
        com.google.android.gms.internal.ads.zzaok.m10003c(r0);
        r1 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r2 = new java.lang.Throwable;
        r2.<init>(r0);
        r0 = "SphericalVideoProcessor.run.1";
        r1.m9714a(r2, r0);
        r14.m21340d();
        r0 = r14.f16930u;
        r0.countDown();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzare.run():void");
    }

    /* renamed from: a */
    public final void m21342a(float f, float f2) {
        if (this.f16923n > this.f16922m) {
            f = (f * 1.7453293f) / ((float) this.f16923n);
            f2 = (f2 * 1.7453293f) / ((float) this.f16923n);
        } else {
            f = (f * 1.7453293f) / ((float) this.f16922m);
            f2 = (f2 * 1.7453293f) / ((float) this.f16922m);
        }
        this.f16920k -= f;
        this.f16921l -= f2;
        if (this.f16921l < -1.5707964f) {
            this.f16921l = -1.5707964f;
        }
        if (this.f16921l > 1.5707964f) {
            this.f16921l = 1.5707964f;
        }
    }

    /* renamed from: a */
    private static void m21338a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = ((fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3])) + (fArr2[2] * fArr3[6]);
        fArr[1] = ((fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4])) + (fArr2[2] * fArr3[7]);
        fArr[2] = ((fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5])) + (fArr2[2] * fArr3[8]);
        fArr[3] = ((fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3])) + (fArr2[5] * fArr3[6]);
        fArr[4] = ((fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4])) + (fArr2[5] * fArr3[7]);
        fArr[5] = ((fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5])) + (fArr2[5] * fArr3[8]);
        fArr[6] = ((fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3])) + (fArr2[8] * fArr3[6]);
        fArr[7] = ((fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4])) + (fArr2[8] * fArr3[7]);
        fArr[8] = ((fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5])) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: a */
    private static void m21337a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: b */
    private static void m21339b(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: a */
    private static int m21335a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m21336a("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        m21336a("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        m21336a("compileShader");
        str = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, str, 0);
        m21336a("getShaderiv");
        if (str[0] != null) {
            return glCreateShader;
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Could not compile shader ");
        stringBuilder.append(i);
        stringBuilder.append(":");
        Log.e("SphericalVideoRenderer", stringBuilder.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        m21336a("deleteShader");
        return 0;
    }

    @VisibleForTesting
    /* renamed from: d */
    private final boolean m21340d() {
        boolean z = false;
        if (!(this.f16935z == null || this.f16935z == EGL10.EGL_NO_SURFACE)) {
            z = this.f16932w.eglDestroySurface(this.f16933x, this.f16935z) | (this.f16932w.eglMakeCurrent(this.f16933x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | 0);
            this.f16935z = null;
        }
        if (this.f16934y != null) {
            z |= this.f16932w.eglDestroyContext(this.f16933x, this.f16934y);
            this.f16934y = null;
        }
        if (this.f16933x == null) {
            return z;
        }
        z |= this.f16932w.eglTerminate(this.f16933x);
        this.f16933x = null;
        return z;
    }

    /* renamed from: a */
    private static void m21336a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
            stringBuilder.append(str);
            stringBuilder.append(": glError ");
            stringBuilder.append(glGetError);
            Log.e("SphericalVideoRenderer", stringBuilder.toString());
        }
    }
}
