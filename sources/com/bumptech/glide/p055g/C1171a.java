package com.bumptech.glide.p055g;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.g.a */
public final class C1171a {
    /* renamed from: a */
    private static final AtomicReference<byte[]> f3820a = new AtomicReference();

    /* renamed from: com.bumptech.glide.g.a$a */
    private static class C1162a extends InputStream {
        /* renamed from: a */
        private final ByteBuffer f3814a;
        /* renamed from: b */
        private int f3815b = -1;

        public boolean markSupported() {
            return true;
        }

        C1162a(ByteBuffer byteBuffer) {
            this.f3814a = byteBuffer;
        }

        public int available() {
            return this.f3814a.remaining();
        }

        public int read() {
            if (this.f3814a.hasRemaining()) {
                return this.f3814a.get();
            }
            return -1;
        }

        public synchronized void mark(int i) {
            this.f3815b = this.f3814a.position();
        }

        public int read(byte[] bArr, int i, int i2) {
            if (!this.f3814a.hasRemaining()) {
                return -1;
            }
            i2 = Math.min(i2, available());
            this.f3814a.get(bArr, i, i2);
            return i2;
        }

        public synchronized void reset() {
            if (this.f3815b != -1) {
                this.f3814a.position(this.f3815b);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public long skip(long j) {
            if (!this.f3814a.hasRemaining()) {
                return -1;
            }
            j = Math.min(j, (long) available());
            this.f3814a.position((int) (((long) this.f3814a.position()) + j));
            return j;
        }
    }

    /* renamed from: com.bumptech.glide.g.a$b */
    static final class C1163b {
        /* renamed from: a */
        final int f3816a;
        /* renamed from: b */
        final int f3817b;
        /* renamed from: c */
        final byte[] f3818c;

        C1163b(byte[] bArr, int i, int i2) {
            this.f3818c = bArr;
            this.f3816a = i;
            this.f3817b = i2;
        }
    }

    /* renamed from: a */
    public static java.nio.ByteBuffer m4854a(java.io.File r9) {
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
        r0 = 0;
        r5 = r9.length();	 Catch:{ all -> 0x004a }
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ all -> 0x004a }
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));	 Catch:{ all -> 0x004a }
        if (r3 > 0) goto L_0x0042;	 Catch:{ all -> 0x004a }
    L_0x000c:
        r1 = 0;	 Catch:{ all -> 0x004a }
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));	 Catch:{ all -> 0x004a }
        if (r3 == 0) goto L_0x003a;	 Catch:{ all -> 0x004a }
    L_0x0012:
        r7 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x004a }
        r1 = "r";	 Catch:{ all -> 0x004a }
        r7.<init>(r9, r1);	 Catch:{ all -> 0x004a }
        r9 = r7.getChannel();	 Catch:{ all -> 0x0038 }
        r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ all -> 0x0033 }
        r3 = 0;	 Catch:{ all -> 0x0033 }
        r1 = r9;	 Catch:{ all -> 0x0033 }
        r0 = r1.map(r2, r3, r5);	 Catch:{ all -> 0x0033 }
        r0 = r0.load();	 Catch:{ all -> 0x0033 }
        if (r9 == 0) goto L_0x002f;
    L_0x002c:
        r9.close();	 Catch:{ IOException -> 0x002f }
    L_0x002f:
        r7.close();	 Catch:{ IOException -> 0x0032 }
    L_0x0032:
        return r0;
    L_0x0033:
        r0 = move-exception;
        r8 = r0;
        r0 = r9;
        r9 = r8;
        goto L_0x004c;
    L_0x0038:
        r9 = move-exception;
        goto L_0x004c;
    L_0x003a:
        r9 = new java.io.IOException;	 Catch:{ all -> 0x004a }
        r1 = "File unsuitable for memory mapping";	 Catch:{ all -> 0x004a }
        r9.<init>(r1);	 Catch:{ all -> 0x004a }
        throw r9;	 Catch:{ all -> 0x004a }
    L_0x0042:
        r9 = new java.io.IOException;	 Catch:{ all -> 0x004a }
        r1 = "File too large to map into memory";	 Catch:{ all -> 0x004a }
        r9.<init>(r1);	 Catch:{ all -> 0x004a }
        throw r9;	 Catch:{ all -> 0x004a }
    L_0x004a:
        r9 = move-exception;
        r7 = r0;
    L_0x004c:
        if (r0 == 0) goto L_0x0053;
    L_0x004e:
        r0.close();	 Catch:{ IOException -> 0x0052 }
        goto L_0x0053;
    L_0x0053:
        if (r7 == 0) goto L_0x0058;
    L_0x0055:
        r7.close();	 Catch:{ IOException -> 0x0058 }
    L_0x0058:
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.a.a(java.io.File):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public static void m4855a(java.nio.ByteBuffer r4, java.io.File r5) {
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
        r0 = 0;
        r4.position(r0);
        r1 = 0;
        r2 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x002a }
        r3 = "rw";	 Catch:{ all -> 0x002a }
        r2.<init>(r5, r3);	 Catch:{ all -> 0x002a }
        r5 = r2.getChannel();	 Catch:{ all -> 0x0027 }
        r5.write(r4);	 Catch:{ all -> 0x0025 }
        r5.force(r0);	 Catch:{ all -> 0x0025 }
        r5.close();	 Catch:{ all -> 0x0025 }
        r2.close();	 Catch:{ all -> 0x0025 }
        if (r5 == 0) goto L_0x0021;
    L_0x001e:
        r5.close();	 Catch:{ IOException -> 0x0021 }
    L_0x0021:
        r2.close();	 Catch:{ IOException -> 0x0024 }
    L_0x0024:
        return;
    L_0x0025:
        r4 = move-exception;
        goto L_0x002d;
    L_0x0027:
        r4 = move-exception;
        r5 = r1;
        goto L_0x002d;
    L_0x002a:
        r4 = move-exception;
        r5 = r1;
        r2 = r5;
    L_0x002d:
        if (r5 == 0) goto L_0x0034;
    L_0x002f:
        r5.close();	 Catch:{ IOException -> 0x0033 }
        goto L_0x0034;
    L_0x0034:
        if (r2 == 0) goto L_0x0039;
    L_0x0036:
        r2.close();	 Catch:{ IOException -> 0x0039 }
    L_0x0039:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.a.a(java.nio.ByteBuffer, java.io.File):void");
    }

    /* renamed from: a */
    public static byte[] m4856a(ByteBuffer byteBuffer) {
        C1163b c = C1171a.m4858c(byteBuffer);
        if (c != null && c.f3816a == 0 && c.f3817b == c.f3818c.length) {
            return byteBuffer.array();
        }
        byteBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.position(0);
        byteBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: b */
    public static InputStream m4857b(ByteBuffer byteBuffer) {
        return new C1162a(byteBuffer);
    }

    /* renamed from: c */
    private static C1163b m4858c(ByteBuffer byteBuffer) {
        return (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new C1163b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }
}
