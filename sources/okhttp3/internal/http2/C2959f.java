package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.Closeable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.C2933c;
import okhttp3.internal.http2.C2953b.C2951a;
import okio.ByteString;
import okio.C2995s;
import okio.C2996t;
import okio.C4394e;
import okio.C4755c;

/* renamed from: okhttp3.internal.http2.f */
final class C2959f implements Closeable {
    /* renamed from: a */
    static final Logger f12499a = Logger.getLogger(C2954c.class.getName());
    /* renamed from: b */
    final C2951a f12500b = new C2951a(4096, this.f12502d);
    /* renamed from: c */
    private final C4394e f12501c;
    /* renamed from: d */
    private final C4376a f12502d = new C4376a(this.f12501c);
    /* renamed from: e */
    private final boolean f12503e;

    /* renamed from: okhttp3.internal.http2.f$b */
    interface C2958b {
        /* renamed from: a */
        void mo3660a();

        /* renamed from: a */
        void mo3661a(int i, int i2, int i3, boolean z);

        /* renamed from: a */
        void mo3662a(int i, int i2, List<C2950a> list);

        /* renamed from: a */
        void mo3663a(int i, long j);

        /* renamed from: a */
        void mo3664a(int i, ErrorCode errorCode);

        /* renamed from: a */
        void mo3665a(int i, ErrorCode errorCode, ByteString byteString);

        /* renamed from: a */
        void mo3666a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo3667a(boolean z, int i, int i2, List<C2950a> list);

        /* renamed from: a */
        void mo3668a(boolean z, int i, C4394e c4394e, int i2);

        /* renamed from: a */
        void mo3669a(boolean z, C2965k c2965k);
    }

    /* renamed from: okhttp3.internal.http2.f$a */
    static final class C4376a implements C2995s {
        /* renamed from: a */
        int f18215a;
        /* renamed from: b */
        byte f18216b;
        /* renamed from: c */
        int f18217c;
        /* renamed from: d */
        int f18218d;
        /* renamed from: e */
        short f18219e;
        /* renamed from: f */
        private final C4394e f18220f;

        public void close() {
        }

        C4376a(C4394e c4394e) {
            this.f18220f = c4394e;
        }

        /* renamed from: a */
        public long mo3615a(C4755c c4755c, long j) {
            while (this.f18218d == 0) {
                this.f18220f.mo4565i((long) this.f18219e);
                this.f18219e = (short) 0;
                if ((this.f18216b & 4) != 0) {
                    return -1;
                }
                m23886b();
            }
            c4755c = this.f18220f.mo3615a(c4755c, Math.min(j, (long) this.f18218d));
            if (c4755c == -1) {
                return -1;
            }
            this.f18218d = (int) (((long) this.f18218d) - c4755c);
            return c4755c;
        }

        /* renamed from: a */
        public C2996t mo3616a() {
            return this.f18220f.mo3616a();
        }

        /* renamed from: b */
        private void m23886b() {
            int i = this.f18217c;
            int a = C2959f.m14374a(this.f18220f);
            this.f18218d = a;
            this.f18215a = a;
            byte h = (byte) (this.f18220f.mo4560h() & 255);
            this.f18216b = (byte) (this.f18220f.mo4560h() & 255);
            if (C2959f.f12499a.isLoggable(Level.FINE)) {
                C2959f.f12499a.fine(C2954c.m14328a(true, this.f18217c, this.f18215a, h, this.f18216b));
            }
            this.f18217c = this.f18220f.mo4566j() & BaseClientBuilder.API_PRIORITY_OTHER;
            if (h != (byte) 9) {
                throw C2954c.m14329b("%s != TYPE_CONTINUATION", Byte.valueOf(h));
            } else if (this.f18217c != i) {
                throw C2954c.m14329b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }

    C2959f(C4394e c4394e, boolean z) {
        this.f12501c = c4394e;
        this.f12503e = z;
    }

    /* renamed from: a */
    public void m14386a(C2958b c2958b) {
        if (!this.f12503e) {
            c2958b = this.f12501c.mo4556d((long) C2954c.f12464a.m14660h());
            if (f12499a.isLoggable(Level.FINE)) {
                f12499a.fine(C2933c.m14186a("<< CONNECTION %s", c2958b.m14658f()));
            }
            if (!C2954c.f12464a.equals(c2958b)) {
                throw C2954c.m14329b("Expected a connection header but was %s", c2958b.m14647a());
            }
        } else if (m14387a(true, c2958b) == null) {
            throw C2954c.m14329b("Required SETTINGS preface not received", new Object[0]);
        }
    }

    /* renamed from: a */
    public boolean m14387a(boolean r7, okhttp3.internal.http2.C2959f.C2958b r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.f12501c;	 Catch:{ IOException -> 0x0096 }
        r2 = 9;	 Catch:{ IOException -> 0x0096 }
        r1.mo4547a(r2);	 Catch:{ IOException -> 0x0096 }
        r1 = r6.f12501c;
        r1 = okhttp3.internal.http2.C2959f.m14374a(r1);
        r2 = 1;
        if (r1 < 0) goto L_0x0087;
    L_0x0011:
        r3 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r1 > r3) goto L_0x0087;
    L_0x0015:
        r3 = r6.f12501c;
        r3 = r3.mo4560h();
        r3 = r3 & 255;
        r3 = (byte) r3;
        if (r7 == 0) goto L_0x0033;
    L_0x0020:
        r7 = 4;
        if (r3 != r7) goto L_0x0024;
    L_0x0023:
        goto L_0x0033;
    L_0x0024:
        r7 = new java.lang.Object[r2];
        r8 = java.lang.Byte.valueOf(r3);
        r7[r0] = r8;
        r8 = "Expected a SETTINGS frame but was %s";
        r7 = okhttp3.internal.http2.C2954c.m14329b(r8, r7);
        throw r7;
    L_0x0033:
        r7 = r6.f12501c;
        r7 = r7.mo4560h();
        r7 = r7 & 255;
        r7 = (byte) r7;
        r0 = r6.f12501c;
        r0 = r0.mo4566j();
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = r0 & r4;
        r4 = f12499a;
        r5 = java.util.logging.Level.FINE;
        r4 = r4.isLoggable(r5);
        if (r4 == 0) goto L_0x0059;
    L_0x0050:
        r4 = f12499a;
        r5 = okhttp3.internal.http2.C2954c.m14328a(r2, r0, r1, r3, r7);
        r4.fine(r5);
    L_0x0059:
        switch(r3) {
            case 0: goto L_0x0083;
            case 1: goto L_0x007f;
            case 2: goto L_0x007b;
            case 3: goto L_0x0077;
            case 4: goto L_0x0073;
            case 5: goto L_0x006f;
            case 6: goto L_0x006b;
            case 7: goto L_0x0067;
            case 8: goto L_0x0063;
            default: goto L_0x005c;
        };
    L_0x005c:
        r7 = r6.f12501c;
        r0 = (long) r1;
        r7.mo4565i(r0);
        goto L_0x0086;
    L_0x0063:
        r6.m14385i(r8, r1, r7, r0);
        goto L_0x0086;
    L_0x0067:
        r6.m14384h(r8, r1, r7, r0);
        goto L_0x0086;
    L_0x006b:
        r6.m14383g(r8, r1, r7, r0);
        goto L_0x0086;
    L_0x006f:
        r6.m14382f(r8, r1, r7, r0);
        goto L_0x0086;
    L_0x0073:
        r6.m14381e(r8, r1, r7, r0);
        goto L_0x0086;
    L_0x0077:
        r6.m14380d(r8, r1, r7, r0);
        goto L_0x0086;
    L_0x007b:
        r6.m14379c(r8, r1, r7, r0);
        goto L_0x0086;
    L_0x007f:
        r6.m14377a(r8, r1, r7, r0);
        goto L_0x0086;
    L_0x0083:
        r6.m14378b(r8, r1, r7, r0);
    L_0x0086:
        return r2;
    L_0x0087:
        r7 = new java.lang.Object[r2];
        r8 = java.lang.Integer.valueOf(r1);
        r7[r0] = r8;
        r8 = "FRAME_SIZE_ERROR: %s";
        r7 = okhttp3.internal.http2.C2954c.m14329b(r8, r7);
        throw r7;
    L_0x0096:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.f.a(boolean, okhttp3.internal.http2.f$b):boolean");
    }

    /* renamed from: a */
    private void m14377a(C2958b c2958b, int i, byte b, int i2) {
        short s = (short) 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f12501c.mo4560h() & 255);
            }
            if ((b & 32) != 0) {
                m14376a(c2958b, i2);
                i -= 5;
            }
            c2958b.mo3667a(z, i2, (int) (byte) -1, m14375a(C2959f.m14373a(i, b, s), s, b, i2));
            return;
        }
        throw C2954c.m14329b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    /* renamed from: a */
    private List<C2950a> m14375a(int i, short s, byte b, int i2) {
        C4376a c4376a = this.f12502d;
        this.f12502d.f18218d = i;
        c4376a.f18215a = i;
        this.f12502d.f18219e = s;
        this.f12502d.f18216b = b;
        this.f12502d.f18217c = i2;
        this.f12500b.m14313a();
        return this.f12500b.m14314b();
    }

    /* renamed from: b */
    private void m14378b(C2958b c2958b, int i, byte b, int i2) {
        short s = (short) 0;
        if (i2 != 0) {
            Object obj = 1;
            boolean z = (b & 1) != 0;
            if ((b & 32) == 0) {
                obj = null;
            }
            if (obj == null) {
                if ((b & 8) != 0) {
                    s = (short) (this.f12501c.mo4560h() & 255);
                }
                c2958b.mo3668a(z, i2, this.f12501c, C2959f.m14373a(i, b, s));
                this.f12501c.mo4565i((long) s);
                return;
            }
            throw C2954c.m14329b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw C2954c.m14329b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    /* renamed from: c */
    private void m14379c(C2958b c2958b, int i, byte b, int i2) {
        if (i != 5) {
            throw C2954c.m14329b("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(i)});
        } else if (i2 != 0) {
            m14376a(c2958b, i2);
        } else {
            throw C2954c.m14329b("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    /* renamed from: a */
    private void m14376a(C2958b c2958b, int i) {
        int j = this.f12501c.mo4566j();
        c2958b.mo3661a(i, j & BaseClientBuilder.API_PRIORITY_OTHER, (this.f12501c.mo4560h() & 255) + 1, (Integer.MIN_VALUE & j) != 0);
    }

    /* renamed from: d */
    private void m14380d(C2958b c2958b, int i, byte b, int i2) {
        if (i != 4) {
            throw C2954c.m14329b("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(i)});
        } else if (i2 != 0) {
            ErrorCode a = ErrorCode.m14298a(this.f12501c.mo4566j());
            if (a != null) {
                c2958b.mo3664a(i2, a);
            } else {
                throw C2954c.m14329b("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(i)});
            }
        } else {
            throw C2954c.m14329b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    /* renamed from: e */
    private void m14381e(C2958b c2958b, int i, byte b, int i2) {
        if (i2 != 0) {
            throw C2954c.m14329b("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & (byte) 1) != (byte) 0) {
            if (i == 0) {
                c2958b.mo3660a();
            } else {
                throw C2954c.m14329b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
        } else if (i % 6 == (byte) 0) {
            C2965k c2965k = new C2965k();
            for (int i3 = 0; i3 < i; i3 += 6) {
                int i4 = this.f12501c.mo4564i() & 65535;
                int j = this.f12501c.mo4566j();
                switch (i4) {
                    case 1:
                    case 6:
                        break;
                    case 2:
                        if (j == 0) {
                            continue;
                        } else if (j == 1) {
                            break;
                        } else {
                            throw C2954c.m14329b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                    case 3:
                        i4 = 4;
                        break;
                    case 4:
                        i4 = 7;
                        if (j >= 0) {
                            break;
                        }
                        throw C2954c.m14329b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    case 5:
                        if (j >= 16384 && j <= 16777215) {
                            break;
                        }
                        throw C2954c.m14329b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[]{Integer.valueOf(j)});
                        break;
                    default:
                        break;
                }
                c2965k.m14434a(i4, j);
            }
            c2958b.mo3669a(false, c2965k);
        } else {
            throw C2954c.m14329b("TYPE_SETTINGS length %% 6 != 0: %s", new Object[]{Integer.valueOf(i)});
        }
    }

    /* renamed from: f */
    private void m14382f(C2958b c2958b, int i, byte b, int i2) {
        short s = (short) 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.f12501c.mo4560h() & 255);
            }
            c2958b.mo3662a(i2, this.f12501c.mo4566j() & BaseClientBuilder.API_PRIORITY_OTHER, m14375a(C2959f.m14373a(i - 4, b, s), s, b, i2));
            return;
        }
        throw C2954c.m14329b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    /* renamed from: g */
    private void m14383g(C2958b c2958b, int i, byte b, int i2) {
        boolean z = false;
        if (i != 8) {
            throw C2954c.m14329b("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(i)});
        } else if (i2 == 0) {
            i = this.f12501c.mo4566j();
            i2 = this.f12501c.mo4566j();
            if ((b & (byte) 1) != (byte) 0) {
                z = true;
            }
            c2958b.mo3666a(z, i, i2);
        } else {
            throw C2954c.m14329b("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    /* renamed from: h */
    private void m14384h(C2958b c2958b, int i, byte b, int i2) {
        if (i < 8) {
            throw C2954c.m14329b("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(i)});
        } else if (i2 == 0) {
            i2 = this.f12501c.mo4566j();
            i -= 8;
            ErrorCode a = ErrorCode.m14298a(this.f12501c.mo4566j());
            if (a != null) {
                ByteString byteString = ByteString.f12681b;
                if (i > 0) {
                    byteString = this.f12501c.mo4556d((long) i);
                }
                c2958b.mo3665a(i2, a, byteString);
                return;
            }
            throw C2954c.m14329b("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(r2)});
        } else {
            throw C2954c.m14329b("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    /* renamed from: i */
    private void m14385i(C2958b c2958b, int i, byte b, int i2) {
        if (i == 4) {
            long j = ((long) this.f12501c.mo4566j()) & 2147483647L;
            if (j != 0) {
                c2958b.mo3663a(i2, j);
                return;
            } else {
                throw C2954c.m14329b("windowSizeIncrement was 0", new Object[]{Long.valueOf(j)});
            }
        }
        throw C2954c.m14329b("TYPE_WINDOW_UPDATE length !=4: %s", new Object[]{Integer.valueOf(i)});
    }

    public void close() {
        this.f12501c.close();
    }

    /* renamed from: a */
    static int m14374a(C4394e c4394e) {
        return (c4394e.mo4560h() & 255) | (((c4394e.mo4560h() & 255) << 16) | ((c4394e.mo4560h() & 255) << 8));
    }

    /* renamed from: a */
    static int m14373a(int i, byte b, short s) {
        if ((b & 8) != (byte) 0) {
            short s2 = i - 1;
        }
        if (s <= s2) {
            return (short) (s2 - s);
        }
        throw C2954c.m14329b("PROTOCOL_ERROR padding %s > remaining length %s", new Object[]{Short.valueOf(s), Integer.valueOf(s2)});
    }
}
