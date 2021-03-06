package okhttp3.internal.p160f;

import java.io.Closeable;
import java.io.InputStream;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.C2933c;
import okio.C4905m;
import okio.C4914k;

/* renamed from: okhttp3.internal.f.a */
public final class C2946a {
    /* renamed from: a */
    private static final byte[] f12414a = new byte[]{(byte) 42};
    /* renamed from: b */
    private static final String[] f12415b = new String[0];
    /* renamed from: c */
    private static final String[] f12416c = new String[]{"*"};
    /* renamed from: d */
    private static final C2946a f12417d = new C2946a();
    /* renamed from: e */
    private final AtomicBoolean f12418e = new AtomicBoolean(false);
    /* renamed from: f */
    private final CountDownLatch f12419f = new CountDownLatch(1);
    /* renamed from: g */
    private byte[] f12420g;
    /* renamed from: h */
    private byte[] f12421h;

    /* renamed from: a */
    public static C2946a m14284a() {
        return f12417d;
    }

    /* renamed from: a */
    public String m14288a(String str) {
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] a = m14285a(split);
            if (split.length == a.length && a[0].charAt(0) != '!') {
                return null;
            }
            int length;
            if (a[0].charAt(0) == '!') {
                length = split.length - a.length;
            } else {
                length = split.length - (a.length + 1);
            }
            StringBuilder stringBuilder = new StringBuilder();
            str = str.split("\\.");
            for (length = 
/*
Method generation error in method: okhttp3.internal.f.a.a(java.lang.String):java.lang.String, dex: classes.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r0_6 'length' int) = (r0_3 'length' int), (r0_5 'length' int) binds: {(r0_5 'length' int)=B:10:0x002d, (r0_3 'length' int)=B:9:0x0029} in method: okhttp3.internal.f.a.a(java.lang.String):java.lang.String, dex: classes.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 27 more

*/

            /* renamed from: a */
            private java.lang.String[] m14285a(java.lang.String[] r8) {
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
                r7 = this;
                r0 = r7.f12418e;
                r0 = r0.get();
                r1 = 0;
                r2 = 1;
                if (r0 != 0) goto L_0x0016;
            L_0x000a:
                r0 = r7.f12418e;
                r0 = r0.compareAndSet(r1, r2);
                if (r0 == 0) goto L_0x0016;
            L_0x0012:
                r7.m14286b();
                goto L_0x001b;
            L_0x0016:
                r0 = r7.f12419f;	 Catch:{ InterruptedException -> 0x001b }
                r0.await();	 Catch:{ InterruptedException -> 0x001b }
            L_0x001b:
                monitor-enter(r7);
                r0 = r7.f12420g;	 Catch:{ all -> 0x00bf }
                if (r0 == 0) goto L_0x00b7;	 Catch:{ all -> 0x00bf }
            L_0x0020:
                monitor-exit(r7);	 Catch:{ all -> 0x00bf }
                r0 = r8.length;
                r0 = new byte[r0][];
                r3 = 0;
            L_0x0025:
                r4 = r8.length;
                if (r3 >= r4) goto L_0x0035;
            L_0x0028:
                r4 = r8[r3];
                r5 = okhttp3.internal.C2933c.f12356e;
                r4 = r4.getBytes(r5);
                r0[r3] = r4;
                r3 = r3 + 1;
                goto L_0x0025;
            L_0x0035:
                r8 = 0;
            L_0x0036:
                r3 = r0.length;
                r4 = 0;
                if (r8 >= r3) goto L_0x0046;
            L_0x003a:
                r3 = r7.f12420g;
                r3 = okhttp3.internal.p160f.C2946a.m14283a(r3, r0, r8);
                if (r3 == 0) goto L_0x0043;
            L_0x0042:
                goto L_0x0047;
            L_0x0043:
                r8 = r8 + 1;
                goto L_0x0036;
            L_0x0046:
                r3 = r4;
            L_0x0047:
                r8 = r0.length;
                if (r8 <= r2) goto L_0x0065;
            L_0x004a:
                r8 = r0.clone();
                r8 = (byte[][]) r8;
                r5 = 0;
            L_0x0051:
                r6 = r8.length;
                r6 = r6 - r2;
                if (r5 >= r6) goto L_0x0065;
            L_0x0055:
                r6 = f12414a;
                r8[r5] = r6;
                r6 = r7.f12420g;
                r6 = okhttp3.internal.p160f.C2946a.m14283a(r6, r8, r5);
                if (r6 == 0) goto L_0x0062;
            L_0x0061:
                goto L_0x0066;
            L_0x0062:
                r5 = r5 + 1;
                goto L_0x0051;
            L_0x0065:
                r6 = r4;
            L_0x0066:
                if (r6 == 0) goto L_0x0078;
            L_0x0068:
                r8 = r0.length;
                r8 = r8 - r2;
                if (r1 >= r8) goto L_0x0078;
            L_0x006c:
                r8 = r7.f12421h;
                r8 = okhttp3.internal.p160f.C2946a.m14283a(r8, r0, r1);
                if (r8 == 0) goto L_0x0075;
            L_0x0074:
                goto L_0x0079;
            L_0x0075:
                r1 = r1 + 1;
                goto L_0x0068;
            L_0x0078:
                r8 = r4;
            L_0x0079:
                if (r8 == 0) goto L_0x0093;
            L_0x007b:
                r0 = new java.lang.StringBuilder;
                r0.<init>();
                r1 = "!";
                r0.append(r1);
                r0.append(r8);
                r8 = r0.toString();
                r0 = "\\.";
                r8 = r8.split(r0);
                return r8;
            L_0x0093:
                if (r3 != 0) goto L_0x009a;
            L_0x0095:
                if (r6 != 0) goto L_0x009a;
            L_0x0097:
                r8 = f12416c;
                return r8;
            L_0x009a:
                if (r3 == 0) goto L_0x00a3;
            L_0x009c:
                r8 = "\\.";
                r8 = r3.split(r8);
                goto L_0x00a5;
            L_0x00a3:
                r8 = f12415b;
            L_0x00a5:
                if (r6 == 0) goto L_0x00ae;
            L_0x00a7:
                r0 = "\\.";
                r0 = r6.split(r0);
                goto L_0x00b0;
            L_0x00ae:
                r0 = f12415b;
            L_0x00b0:
                r1 = r8.length;
                r2 = r0.length;
                if (r1 <= r2) goto L_0x00b5;
            L_0x00b4:
                goto L_0x00b6;
            L_0x00b5:
                r8 = r0;
            L_0x00b6:
                return r8;
            L_0x00b7:
                r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00bf }
                r0 = "Unable to load publicsuffixes.gz resource from the classpath.";	 Catch:{ all -> 0x00bf }
                r8.<init>(r0);	 Catch:{ all -> 0x00bf }
                throw r8;	 Catch:{ all -> 0x00bf }
            L_0x00bf:
                r8 = move-exception;	 Catch:{ all -> 0x00bf }
                monitor-exit(r7);	 Catch:{ all -> 0x00bf }
                throw r8;
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.f.a.a(java.lang.String[]):java.lang.String[]");
            }

            /* renamed from: a */
            private static String m14283a(byte[] bArr, byte[][] bArr2, int i) {
                byte[] bArr3 = bArr;
                byte[][] bArr4 = bArr2;
                int length = bArr3.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3;
                    int i4 = (i2 + length) / 2;
                    while (i4 > -1 && bArr3[i4] != (byte) 10) {
                        i4--;
                    }
                    i4++;
                    int i5 = 1;
                    while (true) {
                        i3 = i4 + i5;
                        if (bArr3[i3] == (byte) 10) {
                            break;
                        }
                        i5++;
                    }
                    int i6 = i3 - i4;
                    int i7 = i;
                    Object obj = null;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        int i10;
                        if (obj != null) {
                            obj = null;
                            i10 = 46;
                        } else {
                            i10 = bArr4[i7][i8] & 255;
                        }
                        i10 -= bArr3[i4 + i9] & 255;
                        if (i10 != 0) {
                            break;
                        }
                        i9++;
                        i8++;
                        if (i9 == i6) {
                            break;
                        } else if (bArr4[i7].length == i8) {
                            if (i7 == bArr4.length - 1) {
                                break;
                            }
                            i7++;
                            obj = 1;
                            i8 = -1;
                        }
                    }
                    if (i10 < 0) {
                        i4--;
                    } else {
                        if (i10 > 0) {
                            i3++;
                        } else {
                            int i11 = i6 - i9;
                            int length2 = bArr4[i7].length - i8;
                            while (true) {
                                i7++;
                                if (i7 >= bArr4.length) {
                                    break;
                                }
                                length2 += bArr4[i7].length;
                            }
                            if (length2 < i11) {
                                i4--;
                            } else if (length2 <= i11) {
                                return new String(bArr3, i4, i6, C2933c.f12356e);
                            } else {
                                i3++;
                            }
                        }
                        i2 = i3;
                    }
                    length = i4;
                }
                return null;
            }

            /* renamed from: b */
            private void m14286b() {
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
                r5 = this;
                r0 = 0;
            L_0x0001:
                r5.m14287c();	 Catch:{ InterruptedIOException -> 0x002f, IOException -> 0x0010 }
                if (r0 == 0) goto L_0x000d;
            L_0x0006:
                r0 = java.lang.Thread.currentThread();
                r0.interrupt();
            L_0x000d:
                return;
            L_0x000e:
                r1 = move-exception;
                goto L_0x0025;
            L_0x0010:
                r1 = move-exception;
                r2 = okhttp3.internal.p159e.C2945f.m14270c();	 Catch:{ all -> 0x000e }
                r3 = 5;	 Catch:{ all -> 0x000e }
                r4 = "Failed to read public suffix list";	 Catch:{ all -> 0x000e }
                r2.mo3651a(r3, r4, r1);	 Catch:{ all -> 0x000e }
                if (r0 == 0) goto L_0x0024;
            L_0x001d:
                r0 = java.lang.Thread.currentThread();
                r0.interrupt();
            L_0x0024:
                return;
            L_0x0025:
                if (r0 == 0) goto L_0x002e;
            L_0x0027:
                r0 = java.lang.Thread.currentThread();
                r0.interrupt();
            L_0x002e:
                throw r1;
            L_0x002f:
                r0 = 1;
                goto L_0x0001;
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.f.a.b():void");
            }

            /* renamed from: c */
            private void m14287c() {
                InputStream resourceAsStream = C2946a.class.getResourceAsStream("publicsuffixes.gz");
                if (resourceAsStream != null) {
                    Closeable a = C4905m.a(new C4914k(C4905m.a(resourceAsStream)));
                    try {
                        byte[] bArr = new byte[a.mo4566j()];
                        a.mo4548a(bArr);
                        byte[] bArr2 = new byte[a.mo4566j()];
                        a.mo4548a(bArr2);
                        synchronized (this) {
                            this.f12420g = bArr;
                            this.f12421h = bArr2;
                        }
                        this.f12419f.countDown();
                    } finally {
                        C2933c.m14194a(a);
                    }
                }
            }
        }
