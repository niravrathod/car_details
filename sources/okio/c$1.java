package okio;

import java.io.InputStream;

class c$1 extends InputStream {
    /* renamed from: a */
    final /* synthetic */ C4755c f21953a;

    public void close() {
    }

    c$1(C4755c c4755c) {
        this.f21953a = c4755c;
    }

    public int read() {
        return this.f21953a.f20813b > 0 ? this.f21953a.h() & 255 : -1;
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.f21953a.a(bArr, i, i2);
    }

    public int available() {
        return (int) Math.min(this.f21953a.f20813b, 2147483647L);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f21953a);
        stringBuilder.append(".inputStream()");
        return stringBuilder.toString();
    }
}
