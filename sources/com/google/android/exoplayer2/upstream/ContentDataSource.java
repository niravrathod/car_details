package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ContentDataSource implements C2368d {
    /* renamed from: a */
    private final ContentResolver f16289a;
    /* renamed from: b */
    private final C2371l<? super ContentDataSource> f16290b;
    /* renamed from: c */
    private Uri f16291c;
    /* renamed from: d */
    private AssetFileDescriptor f16292d;
    /* renamed from: e */
    private InputStream f16293e;
    /* renamed from: f */
    private long f16294f;
    /* renamed from: g */
    private boolean f16295g;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context, C2371l<? super ContentDataSource> c2371l) {
        this.f16289a = context.getContentResolver();
        this.f16290b = c2371l;
    }

    /* renamed from: a */
    public long mo1685a(C2369e c2369e) {
        try {
            this.f16291c = c2369e.f7513a;
            this.f16292d = this.f16289a.openAssetFileDescriptor(this.f16291c, "r");
            this.f16293e = new FileInputStream(this.f16292d.getFileDescriptor());
            if (this.f16293e.skip(c2369e.f7516d) >= c2369e.f7516d) {
                if (c2369e.f7517e != -1) {
                    this.f16294f = c2369e.f7517e;
                } else {
                    this.f16294f = (long) this.f16293e.available();
                    if (this.f16294f == 0) {
                        this.f16294f = -1;
                    }
                }
                this.f16295g = true;
                if (this.f16290b != null) {
                    this.f16290b.mo1697a((Object) this, c2369e);
                }
                return this.f16294f;
            }
            throw new EOFException();
        } catch (C2369e c2369e2) {
            throw new ContentDataSourceException(c2369e2);
        }
    }

    /* renamed from: a */
    public int mo1684a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return null;
        }
        if (this.f16294f == 0) {
            return -1;
        }
        try {
            if (this.f16294f != -1) {
                i2 = (int) Math.min(this.f16294f, (long) i2);
            }
            int read = this.f16293e.read(bArr, i, i2);
            if (read != -1) {
                if (this.f16294f != -1) {
                    this.f16294f -= (long) read;
                }
                if (this.f16290b != 0) {
                    this.f16290b.mo1696a((Object) this, read);
                }
                return read;
            } else if (this.f16294f == -1) {
                return -1;
            } else {
                throw new ContentDataSourceException(new EOFException());
            }
        } catch (byte[] bArr2) {
            throw new ContentDataSourceException(bArr2);
        }
    }

    /* renamed from: a */
    public Uri mo1686a() {
        return this.f16291c;
    }

    /* renamed from: b */
    public void mo1687b() {
        this.f16291c = null;
        try {
            if (this.f16293e != null) {
                this.f16293e.close();
            }
            this.f16293e = null;
            try {
                if (this.f16292d != null) {
                    this.f16292d.close();
                }
                this.f16292d = null;
                if (this.f16295g) {
                    this.f16295g = false;
                    if (this.f16290b != null) {
                        this.f16290b.mo1695a(this);
                    }
                }
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            } catch (Throwable th) {
                this.f16292d = null;
                if (this.f16295g) {
                    this.f16295g = false;
                    if (this.f16290b != null) {
                        this.f16290b.mo1695a(this);
                    }
                }
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        } catch (Throwable th2) {
            this.f16293e = null;
            try {
                if (this.f16292d != null) {
                    this.f16292d.close();
                }
                this.f16292d = null;
                if (this.f16295g) {
                    this.f16295g = false;
                    if (this.f16290b != null) {
                        this.f16290b.mo1695a(this);
                    }
                }
            } catch (IOException e22) {
                throw new ContentDataSourceException(e22);
            } catch (Throwable th3) {
                this.f16292d = null;
                if (this.f16295g) {
                    this.f16295g = false;
                    if (this.f16290b != null) {
                        this.f16290b.mo1695a(this);
                    }
                }
            }
        }
    }
}
