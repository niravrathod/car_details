package com.facebook.ads.internal.p097p.p099b;

import android.text.TextUtils;
import com.facebook.ads.internal.p097p.p099b.p100a.C3820b;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/* renamed from: com.facebook.ads.internal.p.b.e */
class C3823e extends C1889k {
    /* renamed from: a */
    private final C3825h f15256a;
    /* renamed from: b */
    private final C3820b f15257b;
    /* renamed from: c */
    private C1875b f15258c;

    public C3823e(C3825h c3825h, C3820b c3820b) {
        super(c3825h, c3820b);
        this.f15257b = c3820b;
        this.f15256a = c3825h;
    }

    /* renamed from: a */
    private void m19077a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        while (true) {
            int a = m7203a(bArr, j, bArr.length);
            if (a != -1) {
                outputStream.write(bArr, 0, a);
                j += (long) a;
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    /* renamed from: a */
    private boolean m19078a(C1877d c1877d) {
        int a = this.f15256a.mo1402a();
        return (a > 0 ? 1 : null) == null || !c1877d.f5717c || ((float) c1877d.f5716b) <= ((float) this.f15257b.mo1392a()) + (((float) a) * 0.2f);
    }

    /* renamed from: b */
    private String m19079b(C1877d c1877d) {
        int isEmpty = TextUtils.isEmpty(this.f15256a.m19092c()) ^ 1;
        int a = this.f15257b.mo1397d() ? this.f15257b.mo1392a() : this.f15256a.mo1402a();
        Object obj = a >= 0 ? 1 : null;
        long j = c1877d.f5717c ? ((long) a) - c1877d.f5716b : (long) a;
        Object obj2 = (obj == null || !c1877d.f5717c) ? null : 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c1877d.f5717c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        stringBuilder.append("Accept-Ranges: bytes\n");
        stringBuilder.append(obj != null ? String.format("Content-Length: %d\n", new Object[]{Long.valueOf(j)}) : "");
        stringBuilder.append(obj2 != null ? String.format("Content-Range: bytes %d-%d/%d\n", new Object[]{Long.valueOf(c1877d.f5716b), Integer.valueOf(a - 1), Integer.valueOf(a)}) : "");
        stringBuilder.append(isEmpty != 0 ? String.format("Content-Type: %s\n", new Object[]{r0}) : "");
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private void m19080b(OutputStream outputStream, long j) {
        try {
            C3825h c3825h = new C3825h(this.f15256a);
            c3825h.mo1404a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int a = c3825h.mo1403a(bArr);
                if (a == -1) {
                    break;
                }
                outputStream.write(bArr, 0, a);
            }
            outputStream.flush();
        } finally {
            this.f15256a.mo1405b();
        }
    }

    /* renamed from: a */
    protected void mo1400a(int i) {
        if (this.f15258c != null) {
            this.f15258c.mo1401a(this.f15257b.f15252a, this.f15256a.f15261a, i);
        }
    }

    /* renamed from: a */
    public void m19082a(C1875b c1875b) {
        this.f15258c = c1875b;
    }

    /* renamed from: a */
    public void m19083a(C1877d c1877d, Socket socket) {
        OutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(m19079b(c1877d).getBytes("UTF-8"));
        long j = c1877d.f5716b;
        if (m19078a(c1877d)) {
            m19077a(bufferedOutputStream, j);
        } else {
            m19080b(bufferedOutputStream, j);
        }
    }
}
