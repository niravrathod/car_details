package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.C2146c;
import com.google.android.exoplayer2.drm.C2190a;
import com.google.android.exoplayer2.drm.C3960c;
import com.google.android.exoplayer2.metadata.C4815d;
import com.google.android.exoplayer2.metadata.C4815d.C2286a;
import com.google.android.exoplayer2.text.C4826i;
import com.google.android.exoplayer2.text.C4826i.C2358a;
import com.google.android.exoplayer2.video.C2390e;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.d */
public class C3959d implements C2308o {
    /* renamed from: a */
    private final Context f15764a;
    /* renamed from: b */
    private final C2190a<C3960c> f15765b;
    /* renamed from: c */
    private final int f15766c;
    /* renamed from: d */
    private final long f15767d;

    /* renamed from: a */
    protected void m19705a(Context context, Handler handler, int i, ArrayList<C4023l> arrayList) {
    }

    public C3959d(Context context) {
        this(context, null);
    }

    public C3959d(Context context, C2190a<C3960c> c2190a) {
        this(context, c2190a, 0);
    }

    public C3959d(Context context, C2190a<C3960c> c2190a, int i) {
        this(context, c2190a, i, 5000);
    }

    public C3959d(Context context, C2190a<C3960c> c2190a, int i, long j) {
        this.f15764a = context;
        this.f15765b = c2190a;
        this.f15766c = i;
        this.f15767d = j;
    }

    /* renamed from: a */
    public C4023l[] mo1560a(Handler handler, C2390e c2390e, C2146c c2146c, C2358a c2358a, C2286a c2286a) {
        ArrayList arrayList = new ArrayList();
        m19706a(this.f15764a, this.f15765b, this.f15767d, handler, c2390e, this.f15766c, arrayList);
        m19707a(this.f15764a, this.f15765b, m19710a(), handler, c2146c, this.f15766c, arrayList);
        ArrayList arrayList2 = arrayList;
        m19709a(this.f15764a, c2358a, handler.getLooper(), this.f15766c, arrayList2);
        m19708a(this.f15764a, c2286a, handler.getLooper(), this.f15766c, arrayList2);
        m19705a(this.f15764a, handler, this.f15766c, arrayList);
        return (C4023l[]) arrayList.toArray(new C4023l[arrayList.size()]);
    }

    /* renamed from: a */
    protected void m19706a(android.content.Context r14, com.google.android.exoplayer2.drm.C2190a<com.google.android.exoplayer2.drm.C3960c> r15, long r16, android.os.Handler r18, com.google.android.exoplayer2.video.C2390e r19, int r20, java.util.ArrayList<com.google.android.exoplayer2.C4023l> r21) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r13 = this;
        r0 = r20;
        r1 = r21;
        r12 = new com.google.android.exoplayer2.video.c;
        r4 = com.google.android.exoplayer2.mediacodec.C2282b.f7242a;
        r8 = 0;
        r11 = 50;
        r2 = r12;
        r3 = r14;
        r5 = r16;
        r7 = r15;
        r9 = r18;
        r10 = r19;
        r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11);
        r1.add(r12);
        if (r0 != 0) goto L_0x001d;
    L_0x001c:
        return;
    L_0x001d:
        r2 = r21.size();
        r3 = 2;
        if (r0 != r3) goto L_0x0026;
    L_0x0024:
        r2 = r2 + -1;
    L_0x0026:
        r0 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer";	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r4 = 5;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r5 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r7 = 0;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r5[r7] = r6;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r6 = java.lang.Long.TYPE;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r8 = 1;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r5[r8] = r6;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r6 = android.os.Handler.class;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r5[r3] = r6;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r6 = com.google.android.exoplayer2.video.C2390e.class;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r9 = 3;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r5[r9] = r6;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r6 = java.lang.Integer.TYPE;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r10 = 4;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r5[r10] = r6;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r0 = r0.getConstructor(r5);	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r4 = new java.lang.Object[r4];	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r5 = java.lang.Boolean.valueOf(r8);	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r4[r7] = r5;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r5 = java.lang.Long.valueOf(r16);	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r4[r8] = r5;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r4[r3] = r18;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r4[r9] = r19;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r3 = 50;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r4[r10] = r3;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r0 = r0.newInstance(r4);	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r0 = (com.google.android.exoplayer2.C4023l) r0;	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r1.add(r2, r0);	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r0 = "DefaultRenderersFactory";	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        r1 = "Loaded LibvpxVideoRenderer.";	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        android.util.Log.i(r0, r1);	 Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0076 }
        goto L_0x007d;
    L_0x0076:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x007d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.d.a(android.content.Context, com.google.android.exoplayer2.drm.a, long, android.os.Handler, com.google.android.exoplayer2.video.e, int, java.util.ArrayList):void");
    }

    /* renamed from: a */
    protected void m19707a(android.content.Context r13, com.google.android.exoplayer2.drm.C2190a<com.google.android.exoplayer2.drm.C3960c> r14, com.google.android.exoplayer2.audio.AudioProcessor[] r15, android.os.Handler r16, com.google.android.exoplayer2.audio.C2146c r17, int r18, java.util.ArrayList<com.google.android.exoplayer2.C4023l> r19) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r12 = this;
        r9 = r18;
        r10 = r19;
        r11 = new com.google.android.exoplayer2.audio.f;
        r2 = com.google.android.exoplayer2.mediacodec.C2282b.f7242a;
        r7 = com.google.android.exoplayer2.audio.C2138b.m7853a(r13);
        r4 = 1;
        r1 = r11;
        r3 = r14;
        r5 = r16;
        r6 = r17;
        r8 = r15;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);
        r10.add(r11);
        if (r9 != 0) goto L_0x001d;
    L_0x001c:
        return;
    L_0x001d:
        r1 = r19.size();
        r2 = 2;
        if (r9 != r2) goto L_0x0026;
    L_0x0024:
        r1 = r1 + -1;
    L_0x0026:
        r3 = 0;
        r4 = 3;
        r5 = 1;
        r6 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer";	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r6 = java.lang.Class.forName(r6);	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r7 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r8 = android.os.Handler.class;	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r7[r3] = r8;	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r8 = com.google.android.exoplayer2.audio.C2146c.class;	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r7[r5] = r8;	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r8 = com.google.android.exoplayer2.audio.AudioProcessor[].class;	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r7[r2] = r8;	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r6 = r6.getConstructor(r7);	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r7 = new java.lang.Object[r4];	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r7[r3] = r16;	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r7[r5] = r17;	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r7[r2] = r15;	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r6 = r6.newInstance(r7);	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r6 = (com.google.android.exoplayer2.C4023l) r6;	 Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
        r7 = r1 + 1;
        r10.add(r1, r6);	 Catch:{ ClassNotFoundException -> 0x0064, Exception -> 0x005c }
        r1 = "DefaultRenderersFactory";	 Catch:{ ClassNotFoundException -> 0x0064, Exception -> 0x005c }
        r6 = "Loaded LibopusAudioRenderer.";	 Catch:{ ClassNotFoundException -> 0x0064, Exception -> 0x005c }
        android.util.Log.i(r1, r6);	 Catch:{ ClassNotFoundException -> 0x0064, Exception -> 0x005c }
        goto L_0x0064;
    L_0x005c:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0063:
        r7 = r1;
    L_0x0064:
        r1 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer";	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r6 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r8 = android.os.Handler.class;	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r6[r3] = r8;	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r8 = com.google.android.exoplayer2.audio.C2146c.class;	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r6[r5] = r8;	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r8 = com.google.android.exoplayer2.audio.AudioProcessor[].class;	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r6[r2] = r8;	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r1 = r1.getConstructor(r6);	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r6 = new java.lang.Object[r4];	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r6[r3] = r16;	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r6[r5] = r17;	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r6[r2] = r15;	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r1 = r1.newInstance(r6);	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r1 = (com.google.android.exoplayer2.C4023l) r1;	 Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
        r6 = r7 + 1;
        r10.add(r7, r1);	 Catch:{ ClassNotFoundException -> 0x009f, Exception -> 0x0097 }
        r1 = "DefaultRenderersFactory";	 Catch:{ ClassNotFoundException -> 0x009f, Exception -> 0x0097 }
        r7 = "Loaded LibflacAudioRenderer.";	 Catch:{ ClassNotFoundException -> 0x009f, Exception -> 0x0097 }
        android.util.Log.i(r1, r7);	 Catch:{ ClassNotFoundException -> 0x009f, Exception -> 0x0097 }
        goto L_0x009f;
    L_0x0097:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x009e:
        r6 = r7;
    L_0x009f:
        r1 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer";	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r7 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r8 = android.os.Handler.class;	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r7[r3] = r8;	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r8 = com.google.android.exoplayer2.audio.C2146c.class;	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r7[r5] = r8;	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r8 = com.google.android.exoplayer2.audio.AudioProcessor[].class;	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r7[r2] = r8;	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r1 = r1.getConstructor(r7);	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r4 = new java.lang.Object[r4];	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r4[r3] = r16;	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r4[r5] = r17;	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r4[r2] = r15;	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r0 = r1.newInstance(r4);	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r0 = (com.google.android.exoplayer2.C4023l) r0;	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r10.add(r6, r0);	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r0 = "DefaultRenderersFactory";	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        r1 = "Loaded FfmpegAudioRenderer.";	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        android.util.Log.i(r0, r1);	 Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
        goto L_0x00d7;
    L_0x00d0:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x00d7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.d.a(android.content.Context, com.google.android.exoplayer2.drm.a, com.google.android.exoplayer2.audio.AudioProcessor[], android.os.Handler, com.google.android.exoplayer2.audio.c, int, java.util.ArrayList):void");
    }

    /* renamed from: a */
    protected void m19709a(Context context, C2358a c2358a, Looper looper, int i, ArrayList<C4023l> arrayList) {
        arrayList.add(new C4826i(c2358a, looper));
    }

    /* renamed from: a */
    protected void m19708a(Context context, C2286a c2286a, Looper looper, int i, ArrayList<C4023l> arrayList) {
        arrayList.add(new C4815d(c2286a, looper));
    }

    /* renamed from: a */
    protected AudioProcessor[] m19710a() {
        return new AudioProcessor[0];
    }
}
