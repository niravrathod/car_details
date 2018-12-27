package com.bumptech.glide.p050a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.a.b */
class C1126b implements Closeable {
    /* renamed from: a */
    private final InputStream f3683a;
    /* renamed from: b */
    private final Charset f3684b;
    /* renamed from: c */
    private byte[] f3685c;
    /* renamed from: d */
    private int f3686d;
    /* renamed from: e */
    private int f3687e;

    public C1126b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C1126b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C1127c.f3688a)) {
            this.f3683a = inputStream;
            this.f3684b = charset;
            this.f3685c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public void close() {
        synchronized (this.f3683a) {
            if (this.f3685c != null) {
                this.f3685c = null;
                this.f3683a.close();
            }
        }
    }

    /* renamed from: a */
    public String m4689a() {
        synchronized (this.f3683a) {
            if (this.f3685c != null) {
                int i;
                if (this.f3686d >= this.f3687e) {
                    m4688c();
                }
                for (int i2 = this.f3686d; i2 != this.f3687e; i2++) {
                    if (this.f3685c[i2] == (byte) 10) {
                        int i3;
                        String str;
                        if (i2 != this.f3686d) {
                            i3 = i2 - 1;
                            if (this.f3685c[i3] == (byte) 13) {
                                str = new String(this.f3685c, this.f3686d, i3 - this.f3686d, this.f3684b.name());
                                this.f3686d = i2 + 1;
                                return str;
                            }
                        }
                        i3 = i2;
                        str = new String(this.f3685c, this.f3686d, i3 - this.f3686d, this.f3684b.name());
                        this.f3686d = i2 + 1;
                        return str;
                    }
                }
                ByteArrayOutputStream c11251 = new ByteArrayOutputStream(this, (this.f3687e - this.f3686d) + 80) {
                    /* renamed from: a */
                    final /* synthetic */ C1126b f3682a;

                    public String toString() {
                        int i = (this.count <= 0 || this.buf[this.count - 1] != (byte) 13) ? this.count : this.count - 1;
                        try {
                            return new String(this.buf, 0, i, this.f3682a.f3684b.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    c11251.write(this.f3685c, this.f3686d, this.f3687e - this.f3686d);
                    this.f3687e = -1;
                    m4688c();
                    i = this.f3686d;
                    while (i != this.f3687e) {
                        if (this.f3685c[i] == (byte) 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                if (i != this.f3686d) {
                    c11251.write(this.f3685c, this.f3686d, i - this.f3686d);
                }
                this.f3686d = i + 1;
                String byteArrayOutputStream = c11251.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    /* renamed from: b */
    public boolean m4690b() {
        return this.f3687e == -1;
    }

    /* renamed from: c */
    private void m4688c() {
        int read = this.f3683a.read(this.f3685c, 0, this.f3685c.length);
        if (read != -1) {
            this.f3686d = 0;
            this.f3687e = read;
            return;
        }
        throw new EOFException();
    }
}
