package com.facebook.ads.internal.p097p.p099b.p100a;

import com.facebook.ads.internal.p097p.p099b.C1874a;
import com.facebook.ads.internal.p097p.p099b.C1890l;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.facebook.ads.internal.p.b.a.b */
public class C3820b implements C1874a {
    /* renamed from: a */
    public File f15252a;
    /* renamed from: b */
    private final C1868a f15253b;
    /* renamed from: c */
    private RandomAccessFile f15254c;

    public C3820b(File file, C1868a c1868a) {
        if (c1868a != null) {
            try {
                File file2;
                this.f15253b = c1868a;
                C1872d.m7142a(file.getParentFile());
                boolean exists = file.exists();
                if (exists) {
                    file2 = file;
                } else {
                    File parentFile = file.getParentFile();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(file.getName());
                    stringBuilder.append(".download");
                    file2 = new File(parentFile, stringBuilder.toString());
                }
                this.f15252a = file2;
                this.f15254c = new RandomAccessFile(this.f15252a, exists ? "r" : "rw");
                return;
            } catch (Throwable e) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Error using file ");
                stringBuilder2.append(file);
                stringBuilder2.append(" as disc cache");
                throw new C1890l(stringBuilder2.toString(), e);
            }
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private boolean m19062a(File file) {
        return file.getName().endsWith(".download");
    }

    /* renamed from: a */
    public synchronized int mo1392a() {
        try {
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error reading length of file ");
            stringBuilder.append(this.f15252a);
            throw new C1890l(stringBuilder.toString(), e);
        }
        return (int) this.f15254c.length();
    }

    /* renamed from: a */
    public synchronized int mo1393a(byte[] bArr, long j, int i) {
        try {
            this.f15254c.seek(j);
        } catch (Throwable e) {
            throw new C1890l(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[]{Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(mo1392a()), Integer.valueOf(bArr.length)}), e);
        }
        return this.f15254c.read(bArr, 0, i);
    }

    /* renamed from: a */
    public synchronized void mo1394a(byte[] bArr, int i) {
        try {
            if (mo1397d()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error append cache: cache file ");
                stringBuilder.append(this.f15252a);
                stringBuilder.append(" is completed!");
                throw new C1890l(stringBuilder.toString());
            }
            this.f15254c.seek((long) mo1392a());
            this.f15254c.write(bArr, 0, i);
        } catch (Throwable e) {
            throw new C1890l(String.format("Error writing %d bytes to %s from buffer with size %d", new Object[]{Integer.valueOf(i), this.f15254c, Integer.valueOf(bArr.length)}), e);
        }
    }

    /* renamed from: b */
    public synchronized void mo1395b() {
        try {
            this.f15254c.close();
            this.f15253b.mo1398a(this.f15252a);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error closing file ");
            stringBuilder.append(this.f15252a);
            throw new C1890l(stringBuilder.toString(), e);
        }
    }

    /* renamed from: c */
    public synchronized void mo1396c() {
        if (!mo1397d()) {
            mo1395b();
            File file = new File(this.f15252a.getParentFile(), this.f15252a.getName().substring(0, this.f15252a.getName().length() - ".download".length()));
            StringBuilder stringBuilder;
            if (this.f15252a.renameTo(file)) {
                this.f15252a = file;
                try {
                    this.f15254c = new RandomAccessFile(this.f15252a, "r");
                    return;
                } catch (Throwable e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error opening ");
                    stringBuilder.append(this.f15252a);
                    stringBuilder.append(" as disc cache");
                    throw new C1890l(stringBuilder.toString(), e);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error renaming file ");
            stringBuilder.append(this.f15252a);
            stringBuilder.append(" to ");
            stringBuilder.append(file);
            stringBuilder.append(" for completion!");
            throw new C1890l(stringBuilder.toString());
        }
    }

    /* renamed from: d */
    public synchronized boolean mo1397d() {
        return m19062a(this.f15252a) ^ 1;
    }
}
