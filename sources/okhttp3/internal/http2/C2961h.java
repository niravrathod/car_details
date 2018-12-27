package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.C2933c;
import okhttp3.internal.http2.C2953b.C2952b;
import okio.C4393d;
import okio.C4755c;

/* renamed from: okhttp3.internal.http2.h */
final class C2961h implements Closeable {
    /* renamed from: b */
    private static final Logger f12517b = Logger.getLogger(C2954c.class.getName());
    /* renamed from: a */
    final C2952b f12518a = new C2952b(this.f12521e);
    /* renamed from: c */
    private final C4393d f12519c;
    /* renamed from: d */
    private final boolean f12520d;
    /* renamed from: e */
    private final C4755c f12521e = new C4755c();
    /* renamed from: f */
    private int f12522f = 16384;
    /* renamed from: g */
    private boolean f12523g;

    C2961h(C4393d c4393d, boolean z) {
        this.f12519c = c4393d;
        this.f12520d = z;
    }

    /* renamed from: a */
    public synchronized void m14409a() {
        if (this.f12523g) {
            throw new IOException("closed");
        } else if (this.f12520d) {
            if (f12517b.isLoggable(Level.FINE)) {
                f12517b.fine(C2933c.m14186a(">> CONNECTION %s", C2954c.f12464a.m14658f()));
            }
            this.f12519c.mo4554c(C2954c.f12464a.m14661i());
            this.f12519c.flush();
        }
    }

    /* renamed from: a */
    public synchronized void m14416a(C2965k c2965k) {
        if (this.f12523g) {
            throw new IOException("closed");
        }
        this.f12522f = c2965k.m14443d(this.f12522f);
        if (c2965k.m14440c() != -1) {
            this.f12518a.m14320a(c2965k.m14440c());
        }
        m14411a(0, 0, (byte) 4, (byte) 1);
        this.f12519c.flush();
    }

    /* renamed from: a */
    public synchronized void m14412a(int i, int i2, List<C2950a> list) {
        if (this.f12523g) {
            throw new IOException("closed");
        }
        this.f12518a.m14322a((List) list);
        long b = this.f12521e.m27502b();
        list = (int) Math.min((long) (this.f12522f - 4), b);
        long j = (long) list;
        m14411a(i, list + 4, (byte) 5, b == j ? (byte) 4 : (byte) 0);
        this.f12519c.mo4563i(i2 & BaseClientBuilder.API_PRIORITY_OTHER);
        this.f12519c.a_(this.f12521e, j);
        if (b > j) {
            m14408b(i, b - j);
        }
    }

    /* renamed from: b */
    public synchronized void m14421b() {
        if (this.f12523g) {
            throw new IOException("closed");
        }
        this.f12519c.flush();
    }

    /* renamed from: a */
    public synchronized void m14418a(boolean z, int i, int i2, List<C2950a> list) {
        if (this.f12523g == 0) {
            m14419a(z, i, (List) list);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void m14414a(int i, ErrorCode errorCode) {
        if (this.f12523g) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            m14411a(i, 4, (byte) 3, (byte) 0);
            this.f12519c.mo4563i(errorCode.httpCode);
            this.f12519c.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public int m14423c() {
        return this.f12522f;
    }

    /* renamed from: a */
    public synchronized void m14420a(boolean z, int i, C4755c c4755c, int i2) {
        if (this.f12523g) {
            throw new IOException("closed");
        }
        byte b = (byte) 0;
        if (z) {
            b = (byte) true;
        }
        m14410a(i, b, c4755c, i2);
    }

    /* renamed from: a */
    void m14410a(int i, byte b, C4755c c4755c, int i2) {
        m14411a(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f12519c.a_(c4755c, (long) i2);
        }
    }

    /* renamed from: b */
    public synchronized void m14422b(C2965k c2965k) {
        if (this.f12523g) {
            throw new IOException("closed");
        }
        int i = (byte) 0;
        m14411a(0, c2965k.m14438b() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (c2965k.m14437a(i)) {
                int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                this.f12519c.mo4567j(i2);
                this.f12519c.mo4563i(c2965k.m14439b(i));
            }
            i++;
        }
        this.f12519c.flush();
    }

    /* renamed from: a */
    public synchronized void m14417a(boolean z, int i, int i2) {
        if (this.f12523g) {
            throw new IOException("closed");
        }
        m14411a(0, 8, (byte) 6, (byte) z);
        this.f12519c.mo4563i(i);
        this.f12519c.mo4563i(i2);
        this.f12519c.flush();
    }

    /* renamed from: a */
    public synchronized void m14415a(int i, ErrorCode errorCode, byte[] bArr) {
        if (this.f12523g) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            m14411a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f12519c.mo4563i(i);
            this.f12519c.mo4563i(errorCode.httpCode);
            if (bArr.length > 0) {
                this.f12519c.mo4554c(bArr);
            }
            this.f12519c.flush();
        } else {
            throw C2954c.m14326a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /* renamed from: a */
    public synchronized void m14413a(int i, long j) {
        if (this.f12523g) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw C2954c.m14326a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            m14411a(i, 4, (byte) 8, (byte) 0);
            this.f12519c.mo4563i((int) j);
            this.f12519c.flush();
        }
    }

    /* renamed from: a */
    public void m14411a(int i, int i2, byte b, byte b2) {
        if (f12517b.isLoggable(Level.FINE)) {
            f12517b.fine(C2954c.m14328a(false, i, i2, b, b2));
        }
        if (i2 > this.f12522f) {
            throw C2954c.m14326a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.f12522f), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            C2961h.m14407a(this.f12519c, i2);
            this.f12519c.mo4568k(b & 255);
            this.f12519c.mo4568k(b2 & 255);
            this.f12519c.mo4563i(i & (byte) -1);
        } else {
            throw C2954c.m14326a("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public synchronized void close() {
        this.f12523g = true;
        this.f12519c.close();
    }

    /* renamed from: a */
    private static void m14407a(C4393d c4393d, int i) {
        c4393d.mo4568k((i >>> 16) & 255);
        c4393d.mo4568k((i >>> 8) & 255);
        c4393d.mo4568k(i & 255);
    }

    /* renamed from: b */
    private void m14408b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f12522f, j);
            long j2 = (long) min;
            j -= j2;
            m14411a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f12519c.a_(this.f12521e, j2);
        }
    }

    /* renamed from: a */
    void m14419a(boolean z, int i, List<C2950a> list) {
        if (this.f12523g) {
            throw new IOException("closed");
        }
        this.f12518a.m14322a((List) list);
        long b = this.f12521e.m27502b();
        int min = (int) Math.min((long) this.f12522f, b);
        long j = (long) min;
        byte b2 = b == j ? (byte) 4 : (byte) 0;
        if (z) {
            b2 = (byte) (b2 | 1);
        }
        m14411a(i, min, (byte) true, b2);
        this.f12519c.a_(this.f12521e, j);
        if (b > j) {
            m14408b(i, b - j);
        }
    }
}
