package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class AssetDataSource implements C2368d {
    /* renamed from: a */
    private final AssetManager f16283a;
    /* renamed from: b */
    private final C2371l<? super AssetDataSource> f16284b;
    /* renamed from: c */
    private Uri f16285c;
    /* renamed from: d */
    private InputStream f16286d;
    /* renamed from: e */
    private long f16287e;
    /* renamed from: f */
    private boolean f16288f;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context, C2371l<? super AssetDataSource> c2371l) {
        this.f16283a = context.getAssets();
        this.f16284b = c2371l;
    }

    /* renamed from: a */
    public long mo1685a(C2369e c2369e) {
        try {
            this.f16285c = c2369e.f7513a;
            String path = this.f16285c.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            this.f16286d = this.f16283a.open(path, 1);
            if (this.f16286d.skip(c2369e.f7516d) >= c2369e.f7516d) {
                if (c2369e.f7517e != -1) {
                    this.f16287e = c2369e.f7517e;
                } else {
                    this.f16287e = (long) this.f16286d.available();
                    if (this.f16287e == 2147483647L) {
                        this.f16287e = -1;
                    }
                }
                this.f16288f = true;
                if (this.f16284b != null) {
                    this.f16284b.mo1697a((Object) this, c2369e);
                }
                return this.f16287e;
            }
            throw new EOFException();
        } catch (C2369e c2369e2) {
            throw new AssetDataSourceException(c2369e2);
        }
    }

    /* renamed from: a */
    public int mo1684a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return null;
        }
        if (this.f16287e == 0) {
            return -1;
        }
        try {
            if (this.f16287e != -1) {
                i2 = (int) Math.min(this.f16287e, (long) i2);
            }
            int read = this.f16286d.read(bArr, i, i2);
            if (read != -1) {
                if (this.f16287e != -1) {
                    this.f16287e -= (long) read;
                }
                if (this.f16284b != 0) {
                    this.f16284b.mo1696a((Object) this, read);
                }
                return read;
            } else if (this.f16287e == -1) {
                return -1;
            } else {
                throw new AssetDataSourceException(new EOFException());
            }
        } catch (byte[] bArr2) {
            throw new AssetDataSourceException(bArr2);
        }
    }

    /* renamed from: a */
    public Uri mo1686a() {
        return this.f16285c;
    }

    /* renamed from: b */
    public void mo1687b() {
        this.f16285c = null;
        try {
            if (this.f16286d != null) {
                this.f16286d.close();
            }
            this.f16286d = null;
            if (this.f16288f) {
                this.f16288f = false;
                if (this.f16284b != null) {
                    this.f16284b.mo1695a(this);
                }
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        } catch (Throwable th) {
            this.f16286d = null;
            if (this.f16288f) {
                this.f16288f = false;
                if (this.f16284b != null) {
                    this.f16284b.mo1695a(this);
                }
            }
        }
    }
}
