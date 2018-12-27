package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileDataSource implements C2368d {
    /* renamed from: a */
    private final C2371l<? super FileDataSource> f16296a;
    /* renamed from: b */
    private RandomAccessFile f16297b;
    /* renamed from: c */
    private Uri f16298c;
    /* renamed from: d */
    private long f16299d;
    /* renamed from: e */
    private boolean f16300e;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public FileDataSource() {
        this(null);
    }

    public FileDataSource(C2371l<? super FileDataSource> c2371l) {
        this.f16296a = c2371l;
    }

    /* renamed from: a */
    public long mo1685a(C2369e c2369e) {
        try {
            this.f16298c = c2369e.f7513a;
            this.f16297b = new RandomAccessFile(c2369e.f7513a.getPath(), "r");
            this.f16297b.seek(c2369e.f7516d);
            this.f16299d = c2369e.f7517e == -1 ? this.f16297b.length() - c2369e.f7516d : c2369e.f7517e;
            if (this.f16299d >= 0) {
                this.f16300e = true;
                if (this.f16296a != null) {
                    this.f16296a.mo1697a((Object) this, c2369e);
                }
                return this.f16299d;
            }
            throw new EOFException();
        } catch (C2369e c2369e2) {
            throw new FileDataSourceException(c2369e2);
        }
    }

    /* renamed from: a */
    public int mo1684a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return null;
        }
        if (this.f16299d == 0) {
            return -1;
        }
        try {
            int read = this.f16297b.read(bArr, i, (int) Math.min(this.f16299d, (long) i2));
            if (read > null) {
                this.f16299d -= (long) read;
                if (this.f16296a != 0) {
                    this.f16296a.mo1696a((Object) this, read);
                }
            }
            return read;
        } catch (byte[] bArr2) {
            throw new FileDataSourceException(bArr2);
        }
    }

    /* renamed from: a */
    public Uri mo1686a() {
        return this.f16298c;
    }

    /* renamed from: b */
    public void mo1687b() {
        this.f16298c = null;
        try {
            if (this.f16297b != null) {
                this.f16297b.close();
            }
            this.f16297b = null;
            if (this.f16300e) {
                this.f16300e = false;
                if (this.f16296a != null) {
                    this.f16296a.mo1695a(this);
                }
            }
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        } catch (Throwable th) {
            this.f16297b = null;
            if (this.f16300e) {
                this.f16300e = false;
                if (this.f16296a != null) {
                    this.f16296a.mo1695a(this);
                }
            }
        }
    }
}
