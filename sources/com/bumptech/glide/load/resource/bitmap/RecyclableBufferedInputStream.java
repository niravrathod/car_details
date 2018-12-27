package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.p060a.C1230b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream extends FilterInputStream {
    /* renamed from: a */
    private volatile byte[] f4044a;
    /* renamed from: b */
    private int f4045b;
    /* renamed from: c */
    private int f4046c;
    /* renamed from: d */
    private int f4047d;
    /* renamed from: e */
    private int f4048e;
    /* renamed from: f */
    private final C1230b f4049f;

    static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        InvalidMarkException(String str) {
            super(str);
        }
    }

    public boolean markSupported() {
        return true;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, C1230b c1230b) {
        this(inputStream, c1230b, 65536);
    }

    RecyclableBufferedInputStream(InputStream inputStream, C1230b c1230b, int i) {
        super(inputStream);
        this.f4047d = -1;
        this.f4049f = c1230b;
        this.f4044a = (byte[]) c1230b.mo1011a(i, byte[].class);
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f4044a == null || inputStream == null) {
            throw m5166c();
        }
        return (this.f4045b - this.f4048e) + inputStream.available();
    }

    /* renamed from: c */
    private static IOException m5166c() {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void m5167a() {
        this.f4046c = this.f4044a.length;
    }

    /* renamed from: b */
    public synchronized void m5168b() {
        if (this.f4044a != null) {
            this.f4049f.mo1014a(this.f4044a);
            this.f4044a = null;
        }
    }

    public void close() {
        if (this.f4044a != null) {
            this.f4049f.mo1014a(this.f4044a);
            this.f4044a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: a */
    private int m5165a(InputStream inputStream, byte[] bArr) {
        if (this.f4047d != -1) {
            if (this.f4048e - this.f4047d < this.f4046c) {
                if (this.f4047d == 0 && this.f4046c > bArr.length && this.f4045b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length > this.f4046c) {
                        length = this.f4046c;
                    }
                    byte[] bArr2 = (byte[]) this.f4049f.mo1011a(length, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f4044a = bArr2;
                    this.f4049f.mo1014a((Object) bArr);
                    bArr = bArr2;
                } else if (this.f4047d > 0) {
                    System.arraycopy(bArr, this.f4047d, bArr, 0, bArr.length - this.f4047d);
                }
                this.f4048e -= this.f4047d;
                this.f4047d = 0;
                this.f4045b = 0;
                inputStream = inputStream.read(bArr, this.f4048e, bArr.length - this.f4048e);
                if (inputStream <= null) {
                    bArr = this.f4048e;
                } else {
                    bArr = this.f4048e + inputStream;
                }
                this.f4045b = bArr;
                return inputStream;
            }
        }
        inputStream = inputStream.read(bArr);
        if (inputStream > null) {
            this.f4047d = -1;
            this.f4048e = 0;
            this.f4045b = inputStream;
        }
        return inputStream;
    }

    public synchronized void mark(int i) {
        this.f4046c = Math.max(this.f4046c, i);
        this.f4047d = this.f4048e;
    }

    public synchronized int read() {
        byte[] bArr = this.f4044a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw m5166c();
        } else if (this.f4048e >= this.f4045b && m5165a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr != this.f4044a) {
                bArr = this.f4044a;
                if (bArr == null) {
                    throw m5166c();
                }
            }
            if (this.f4045b - this.f4048e <= 0) {
                return -1;
            }
            int i = this.f4048e;
            this.f4048e = i + 1;
            return bArr[i] & 255;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r6, int r7, int r8) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.f4044a;	 Catch:{ all -> 0x009e }
        if (r0 == 0) goto L_0x0099;
    L_0x0005:
        if (r8 != 0) goto L_0x000a;
    L_0x0007:
        r6 = 0;
        monitor-exit(r5);
        return r6;
    L_0x000a:
        r1 = r5.in;	 Catch:{ all -> 0x009e }
        if (r1 == 0) goto L_0x0094;
    L_0x000e:
        r2 = r5.f4048e;	 Catch:{ all -> 0x009e }
        r3 = r5.f4045b;	 Catch:{ all -> 0x009e }
        if (r2 >= r3) goto L_0x003b;
    L_0x0014:
        r2 = r5.f4045b;	 Catch:{ all -> 0x009e }
        r3 = r5.f4048e;	 Catch:{ all -> 0x009e }
        r2 = r2 - r3;
        if (r2 < r8) goto L_0x001d;
    L_0x001b:
        r2 = r8;
        goto L_0x0022;
    L_0x001d:
        r2 = r5.f4045b;	 Catch:{ all -> 0x009e }
        r3 = r5.f4048e;	 Catch:{ all -> 0x009e }
        r2 = r2 - r3;
    L_0x0022:
        r3 = r5.f4048e;	 Catch:{ all -> 0x009e }
        java.lang.System.arraycopy(r0, r3, r6, r7, r2);	 Catch:{ all -> 0x009e }
        r3 = r5.f4048e;	 Catch:{ all -> 0x009e }
        r3 = r3 + r2;
        r5.f4048e = r3;	 Catch:{ all -> 0x009e }
        if (r2 == r8) goto L_0x0039;
    L_0x002e:
        r3 = r1.available();	 Catch:{ all -> 0x009e }
        if (r3 != 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0039;
    L_0x0035:
        r7 = r7 + r2;
        r2 = r8 - r2;
        goto L_0x003c;
    L_0x0039:
        monitor-exit(r5);
        return r2;
    L_0x003b:
        r2 = r8;
    L_0x003c:
        r3 = r5.f4047d;	 Catch:{ all -> 0x009e }
        r4 = -1;
        if (r3 != r4) goto L_0x0051;
    L_0x0041:
        r3 = r0.length;	 Catch:{ all -> 0x009e }
        if (r2 < r3) goto L_0x0051;
    L_0x0044:
        r3 = r1.read(r6, r7, r2);	 Catch:{ all -> 0x009e }
        if (r3 != r4) goto L_0x0084;
    L_0x004a:
        if (r2 != r8) goto L_0x004d;
    L_0x004c:
        goto L_0x004f;
    L_0x004d:
        r4 = r8 - r2;
    L_0x004f:
        monitor-exit(r5);
        return r4;
    L_0x0051:
        r3 = r5.m5165a(r1, r0);	 Catch:{ all -> 0x009e }
        if (r3 != r4) goto L_0x005e;
    L_0x0057:
        if (r2 != r8) goto L_0x005a;
    L_0x0059:
        goto L_0x005c;
    L_0x005a:
        r4 = r8 - r2;
    L_0x005c:
        monitor-exit(r5);
        return r4;
    L_0x005e:
        r3 = r5.f4044a;	 Catch:{ all -> 0x009e }
        if (r0 == r3) goto L_0x006c;
    L_0x0062:
        r0 = r5.f4044a;	 Catch:{ all -> 0x009e }
        if (r0 == 0) goto L_0x0067;
    L_0x0066:
        goto L_0x006c;
    L_0x0067:
        r6 = m5166c();	 Catch:{ all -> 0x009e }
        throw r6;	 Catch:{ all -> 0x009e }
    L_0x006c:
        r3 = r5.f4045b;	 Catch:{ all -> 0x009e }
        r4 = r5.f4048e;	 Catch:{ all -> 0x009e }
        r3 = r3 - r4;
        if (r3 < r2) goto L_0x0075;
    L_0x0073:
        r3 = r2;
        goto L_0x007a;
    L_0x0075:
        r3 = r5.f4045b;	 Catch:{ all -> 0x009e }
        r4 = r5.f4048e;	 Catch:{ all -> 0x009e }
        r3 = r3 - r4;
    L_0x007a:
        r4 = r5.f4048e;	 Catch:{ all -> 0x009e }
        java.lang.System.arraycopy(r0, r4, r6, r7, r3);	 Catch:{ all -> 0x009e }
        r4 = r5.f4048e;	 Catch:{ all -> 0x009e }
        r4 = r4 + r3;
        r5.f4048e = r4;	 Catch:{ all -> 0x009e }
    L_0x0084:
        r2 = r2 - r3;
        if (r2 != 0) goto L_0x0089;
    L_0x0087:
        monitor-exit(r5);
        return r8;
    L_0x0089:
        r4 = r1.available();	 Catch:{ all -> 0x009e }
        if (r4 != 0) goto L_0x0092;
    L_0x008f:
        r8 = r8 - r2;
        monitor-exit(r5);
        return r8;
    L_0x0092:
        r7 = r7 + r3;
        goto L_0x003c;
    L_0x0094:
        r6 = m5166c();	 Catch:{ all -> 0x009e }
        throw r6;	 Catch:{ all -> 0x009e }
    L_0x0099:
        r6 = m5166c();	 Catch:{ all -> 0x009e }
        throw r6;	 Catch:{ all -> 0x009e }
    L_0x009e:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read(byte[], int, int):int");
    }

    public synchronized void reset() {
        if (this.f4044a == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f4047d) {
            this.f4048e = this.f4047d;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Mark has been invalidated, pos: ");
            stringBuilder.append(this.f4048e);
            stringBuilder.append(" markLimit: ");
            stringBuilder.append(this.f4046c);
            throw new InvalidMarkException(stringBuilder.toString());
        }
    }

    public synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f4044a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw m5166c();
            } else if (((long) (this.f4045b - this.f4048e)) >= j) {
                this.f4048e = (int) (((long) this.f4048e) + j);
                return j;
            } else {
                long j2 = ((long) this.f4045b) - ((long) this.f4048e);
                this.f4048e = this.f4045b;
                if (this.f4047d == -1 || j > ((long) this.f4046c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m5165a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.f4045b - this.f4048e)) >= j - j2) {
                        this.f4048e = (int) ((((long) this.f4048e) + j) - j2);
                        return j;
                    }
                    j2 = (j2 + ((long) this.f4045b)) - ((long) this.f4048e);
                    this.f4048e = this.f4045b;
                    return j2;
                }
            }
        }
        throw m5166c();
    }
}
