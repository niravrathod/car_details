package io.fabric.sdk.android.services.common;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.WritableByteChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.fabric.sdk.android.services.common.o */
public class C2808o implements Closeable {
    /* renamed from: b */
    private static final Logger f11907b = Logger.getLogger(C2808o.class.getName());
    /* renamed from: a */
    int f11908a;
    /* renamed from: c */
    private final RandomAccessFile f11909c;
    /* renamed from: d */
    private int f11910d;
    /* renamed from: e */
    private C2805a f11911e;
    /* renamed from: f */
    private C2805a f11912f;
    /* renamed from: g */
    private final byte[] f11913g = new byte[16];

    /* renamed from: io.fabric.sdk.android.services.common.o$a */
    static class C2805a {
        /* renamed from: a */
        static final C2805a f11901a = new C2805a(0, 0);
        /* renamed from: b */
        final int f11902b;
        /* renamed from: c */
        final int f11903c;

        C2805a(int i, int i2) {
            this.f11902b = i;
            this.f11903c = i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append("[position = ");
            stringBuilder.append(this.f11902b);
            stringBuilder.append(", length = ");
            stringBuilder.append(this.f11903c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: io.fabric.sdk.android.services.common.o$b */
    private final class C2806b extends InputStream {
        /* renamed from: a */
        final /* synthetic */ C2808o f11904a;
        /* renamed from: b */
        private int f11905b;
        /* renamed from: c */
        private int f11906c;

        private C2806b(C2808o c2808o, C2805a c2805a) {
            this.f11904a = c2808o;
            this.f11905b = c2808o.m13708b(c2805a.f11902b + 4);
            this.f11906c = c2805a.f11903c;
        }

        public int read(byte[] bArr, int i, int i2) {
            C2808o.m13710b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            } else if (this.f11906c <= 0) {
                return -1;
            } else {
                if (i2 > this.f11906c) {
                    i2 = this.f11906c;
                }
                this.f11904a.m13711b(this.f11905b, bArr, i, i2);
                this.f11905b = this.f11904a.m13708b(this.f11905b + i2);
                this.f11906c -= i2;
                return i2;
            }
        }

        public int read() {
            if (this.f11906c == 0) {
                return -1;
            }
            this.f11904a.f11909c.seek((long) this.f11905b);
            int read = this.f11904a.f11909c.read();
            this.f11905b = this.f11904a.m13708b(this.f11905b + 1);
            this.f11906c--;
            return read;
        }
    }

    /* renamed from: io.fabric.sdk.android.services.common.o$c */
    public interface C2807c {
        /* renamed from: a */
        void mo1127a(InputStream inputStream, int i);
    }

    public C2808o(File file) {
        if (!file.exists()) {
            C2808o.m13706a(file);
        }
        this.f11909c = C2808o.m13709b(file);
        m13715e();
    }

    /* renamed from: b */
    private static void m13712b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: a */
    private static void m13707a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int b : iArr) {
            C2808o.m13712b(bArr, i, b);
            i += 4;
        }
    }

    /* renamed from: a */
    private static int m13699a(byte[] bArr, int i) {
        return ((((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16)) + ((bArr[i + 2] & 255) << 8)) + (bArr[i + 3] & 255);
    }

    /* renamed from: e */
    private void m13715e() {
        this.f11909c.seek(0);
        this.f11909c.readFully(this.f11913g);
        this.f11908a = C2808o.m13699a(this.f11913g, 0);
        if (((long) this.f11908a) <= this.f11909c.length()) {
            this.f11910d = C2808o.m13699a(this.f11913g, 4);
            int a = C2808o.m13699a(this.f11913g, 8);
            int a2 = C2808o.m13699a(this.f11913g, 12);
            this.f11911e = m13700a(a);
            this.f11912f = m13700a(a2);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("File is truncated. Expected length: ");
        stringBuilder.append(this.f11908a);
        stringBuilder.append(", Actual length: ");
        stringBuilder.append(this.f11909c.length());
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: a */
    private void m13703a(int i, int i2, int i3, int i4) {
        C2808o.m13707a(this.f11913g, i, i2, i3, i4);
        this.f11909c.seek(0);
        this.f11909c.write(this.f11913g);
    }

    /* renamed from: a */
    private C2805a m13700a(int i) {
        if (i == 0) {
            return C2805a.f11901a;
        }
        this.f11909c.seek((long) i);
        return new C2805a(i, this.f11909c.readInt());
    }

    /* renamed from: a */
    private static void m13706a(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getPath());
        stringBuilder.append(".tmp");
        File file2 = new File(stringBuilder.toString());
        RandomAccessFile b = C2808o.m13709b(file2);
        try {
            b.setLength(4096);
            b.seek(0);
            byte[] bArr = new byte[16];
            C2808o.m13707a(bArr, 4096, 0, 0, 0);
            b.write(bArr);
            if (file2.renameTo(file) == null) {
                throw new IOException("Rename failed!");
            }
        } finally {
            b.close();
        }
    }

    /* renamed from: b */
    private static RandomAccessFile m13709b(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: b */
    private int m13708b(int i) {
        return i < this.f11908a ? i : (i + 16) - this.f11908a;
    }

    /* renamed from: a */
    private void m13704a(int i, byte[] bArr, int i2, int i3) {
        i = m13708b(i);
        if (i + i3 <= this.f11908a) {
            this.f11909c.seek((long) i);
            this.f11909c.write(bArr, i2, i3);
            return;
        }
        int i4 = this.f11908a - i;
        this.f11909c.seek((long) i);
        this.f11909c.write(bArr, i2, i4);
        this.f11909c.seek(16);
        this.f11909c.write(bArr, i2 + i4, i3 - i4);
    }

    /* renamed from: b */
    private void m13711b(int i, byte[] bArr, int i2, int i3) {
        i = m13708b(i);
        if (i + i3 <= this.f11908a) {
            this.f11909c.seek((long) i);
            this.f11909c.readFully(bArr, i2, i3);
            return;
        }
        int i4 = this.f11908a - i;
        this.f11909c.seek((long) i);
        this.f11909c.readFully(bArr, i2, i4);
        this.f11909c.seek(16);
        this.f11909c.readFully(bArr, i2 + i4, i3 - i4);
    }

    /* renamed from: a */
    public void m13719a(byte[] bArr) {
        m13720a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public synchronized void m13720a(byte[] bArr, int i, int i2) {
        C2808o.m13710b(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int i3;
        m13713c(i2);
        boolean b = m13722b();
        if (b) {
            i3 = 16;
        } else {
            i3 = m13708b((this.f11912f.f11902b + 4) + this.f11912f.f11903c);
        }
        C2805a c2805a = new C2805a(i3, i2);
        C2808o.m13712b(this.f11913g, 0, i2);
        m13704a(c2805a.f11902b, this.f11913g, 0, 4);
        m13704a(c2805a.f11902b + 4, bArr, i, i2);
        m13703a(this.f11908a, this.f11910d + 1, b ? c2805a.f11902b : this.f11911e.f11902b, c2805a.f11902b);
        this.f11912f = c2805a;
        this.f11910d++;
        if (b) {
            this.f11911e = this.f11912f;
        }
    }

    /* renamed from: a */
    public int m13717a() {
        if (this.f11910d == 0) {
            return 16;
        }
        if (this.f11912f.f11902b >= this.f11911e.f11902b) {
            return (((this.f11912f.f11902b - this.f11911e.f11902b) + 4) + this.f11912f.f11903c) + 16;
        }
        return (((this.f11912f.f11902b + 4) + this.f11912f.f11903c) + this.f11908a) - this.f11911e.f11902b;
    }

    /* renamed from: f */
    private int m13716f() {
        return this.f11908a - m13717a();
    }

    /* renamed from: b */
    public synchronized boolean m13722b() {
        return this.f11910d == 0;
    }

    /* renamed from: c */
    private void m13713c(int i) {
        i += 4;
        int f = m13716f();
        if (f < i) {
            int i2 = this.f11908a;
            do {
                f += i2;
                i2 <<= 1;
            } while (f < i);
            m13714d(i2);
            i = m13708b((this.f11912f.f11902b + 4) + this.f11912f.f11903c);
            if (i < this.f11911e.f11902b) {
                WritableByteChannel channel = this.f11909c.getChannel();
                channel.position((long) this.f11908a);
                long j = (long) (i - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f11912f.f11902b < this.f11911e.f11902b) {
                i = (this.f11908a + this.f11912f.f11902b) - 16;
                m13703a(i2, this.f11910d, this.f11911e.f11902b, i);
                this.f11912f = new C2805a(i, this.f11912f.f11903c);
            } else {
                m13703a(i2, this.f11910d, this.f11911e.f11902b, this.f11912f.f11902b);
            }
            this.f11908a = i2;
        }
    }

    /* renamed from: d */
    private void m13714d(int i) {
        this.f11909c.setLength((long) i);
        this.f11909c.getChannel().force(true);
    }

    /* renamed from: a */
    public synchronized void m13718a(C2807c c2807c) {
        int i = this.f11911e.f11902b;
        for (int i2 = 0; i2 < this.f11910d; i2++) {
            C2805a a = m13700a(i);
            c2807c.mo1127a(new C2806b(a), a.f11903c);
            i = m13708b((a.f11902b + 4) + a.f11903c);
        }
    }

    /* renamed from: b */
    private static <T> T m13710b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public synchronized void m13723c() {
        if (m13722b()) {
            throw new NoSuchElementException();
        } else if (this.f11910d == 1) {
            m13724d();
        } else {
            int b = m13708b((this.f11911e.f11902b + 4) + this.f11911e.f11903c);
            m13711b(b, this.f11913g, 0, 4);
            int a = C2808o.m13699a(this.f11913g, 0);
            m13703a(this.f11908a, this.f11910d - 1, b, this.f11912f.f11902b);
            this.f11910d--;
            this.f11911e = new C2805a(b, a);
        }
    }

    /* renamed from: d */
    public synchronized void m13724d() {
        m13703a(4096, 0, 0, 0);
        this.f11910d = 0;
        this.f11911e = C2805a.f11901a;
        this.f11912f = C2805a.f11901a;
        if (this.f11908a > 4096) {
            m13714d(4096);
        }
        this.f11908a = 4096;
    }

    public synchronized void close() {
        this.f11909c.close();
    }

    /* renamed from: a */
    public boolean m13721a(int i, int i2) {
        return (m13717a() + 4) + i <= i2;
    }

    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append("fileLength=");
        stringBuilder.append(this.f11908a);
        stringBuilder.append(", size=");
        stringBuilder.append(this.f11910d);
        stringBuilder.append(", first=");
        stringBuilder.append(this.f11911e);
        stringBuilder.append(", last=");
        stringBuilder.append(this.f11912f);
        stringBuilder.append(", element lengths=[");
        try {
            m13718a(new C2807c(this) {
                /* renamed from: a */
                boolean f18036a = true;
                /* renamed from: c */
                final /* synthetic */ C2808o f18038c;

                /* renamed from: a */
                public void mo1127a(InputStream inputStream, int i) {
                    if (this.f18036a != null) {
                        this.f18036a = null;
                    } else {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(i);
                }
            });
        } catch (Throwable e) {
            f11907b.log(Level.WARNING, "read error", e);
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
