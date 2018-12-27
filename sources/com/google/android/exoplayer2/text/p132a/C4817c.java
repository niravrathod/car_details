package com.google.android.exoplayer2.text.p132a;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2174j;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.text.C2333a;
import com.google.android.exoplayer2.text.C2348d;
import com.google.android.exoplayer2.text.C4694g;
import com.google.android.exoplayer2.text.C4695h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.a.c */
public final class C4817c extends C4692d {
    /* renamed from: a */
    private final C2175k f21192a = new C2175k();
    /* renamed from: b */
    private final C2174j f21193b = new C2174j();
    /* renamed from: c */
    private final int f21194c;
    /* renamed from: d */
    private final C2330a[] f21195d;
    /* renamed from: e */
    private C2330a f21196e;
    /* renamed from: f */
    private List<C2333a> f21197f;
    /* renamed from: g */
    private List<C2333a> f21198g;
    /* renamed from: h */
    private C2331b f21199h;
    /* renamed from: i */
    private int f21200i;

    /* renamed from: com.google.android.exoplayer2.text.a.c$a */
    private static final class C2330a {
        /* renamed from: a */
        public static final int f7315a = C2330a.m8506a(2, 2, 2, 0);
        /* renamed from: b */
        public static final int f7316b = C2330a.m8506a(0, 0, 0, 0);
        /* renamed from: c */
        public static final int f7317c = C2330a.m8506a(0, 0, 0, 3);
        /* renamed from: d */
        private static final int[] f7318d = new int[]{0, 0, 0, 0, 0, 2, 0};
        /* renamed from: e */
        private static final int[] f7319e = new int[]{0, 0, 0, 0, 0, 0, 2};
        /* renamed from: f */
        private static final int[] f7320f = new int[]{3, 3, 3, 3, 3, 3, 1};
        /* renamed from: g */
        private static final boolean[] f7321g = new boolean[]{false, false, false, true, true, true, false};
        /* renamed from: h */
        private static final int[] f7322h = new int[]{f7316b, f7317c, f7316b, f7316b, f7317c, f7316b, f7316b};
        /* renamed from: i */
        private static final int[] f7323i = new int[]{0, 1, 2, 3, 4, 3, 4};
        /* renamed from: j */
        private static final int[] f7324j = new int[]{0, 0, 0, 0, 0, 3, 3};
        /* renamed from: k */
        private static final int[] f7325k = new int[]{f7316b, f7316b, f7316b, f7316b, f7316b, f7317c, f7317c};
        /* renamed from: A */
        private int f7326A;
        /* renamed from: B */
        private int f7327B;
        /* renamed from: C */
        private int f7328C;
        /* renamed from: D */
        private int f7329D;
        /* renamed from: E */
        private int f7330E;
        /* renamed from: F */
        private int f7331F;
        /* renamed from: G */
        private int f7332G;
        /* renamed from: l */
        private final List<SpannableString> f7333l = new LinkedList();
        /* renamed from: m */
        private final SpannableStringBuilder f7334m = new SpannableStringBuilder();
        /* renamed from: n */
        private boolean f7335n;
        /* renamed from: o */
        private boolean f7336o;
        /* renamed from: p */
        private int f7337p;
        /* renamed from: q */
        private boolean f7338q;
        /* renamed from: r */
        private int f7339r;
        /* renamed from: s */
        private int f7340s;
        /* renamed from: t */
        private int f7341t;
        /* renamed from: u */
        private int f7342u;
        /* renamed from: v */
        private boolean f7343v;
        /* renamed from: w */
        private int f7344w;
        /* renamed from: x */
        private int f7345x;
        /* renamed from: y */
        private int f7346y;
        /* renamed from: z */
        private int f7347z;

        public C2330a() {
            m8516b();
        }

        /* renamed from: a */
        public boolean m8515a() {
            if (m8518d()) {
                if (!this.f7333l.isEmpty() || this.f7334m.length() != 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void m8516b() {
            m8517c();
            this.f7335n = false;
            this.f7336o = false;
            this.f7337p = 4;
            this.f7338q = false;
            this.f7339r = 0;
            this.f7340s = 0;
            this.f7341t = 0;
            this.f7342u = 15;
            this.f7343v = true;
            this.f7344w = 0;
            this.f7345x = 0;
            this.f7346y = 0;
            this.f7347z = f7316b;
            this.f7329D = f7315a;
            this.f7331F = f7316b;
        }

        /* renamed from: c */
        public void m8517c() {
            this.f7333l.clear();
            this.f7334m.clear();
            this.f7326A = -1;
            this.f7327B = -1;
            this.f7328C = -1;
            this.f7330E = -1;
            this.f7332G = 0;
        }

        /* renamed from: d */
        public boolean m8518d() {
            return this.f7335n;
        }

        /* renamed from: a */
        public void m8513a(boolean z) {
            this.f7336o = z;
        }

        /* renamed from: e */
        public boolean m8519e() {
            return this.f7336o;
        }

        /* renamed from: a */
        public void m8514a(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z5 = z2;
            int i9 = i7;
            int i10 = i8;
            this.f7335n = true;
            this.f7336o = z;
            this.f7343v = z5;
            this.f7337p = i;
            this.f7338q = z4;
            this.f7339r = i2;
            this.f7340s = i3;
            this.f7341t = i6;
            int i11 = i4 + 1;
            if (this.f7342u != i11) {
                r0.f7342u = i11;
                while (true) {
                    if ((!z5 || r0.f7333l.size() < r0.f7342u) && r0.f7333l.size() < 15) {
                        break;
                    }
                    r0.f7333l.remove(0);
                }
            }
            if (!(i9 == 0 || r0.f7345x == i9)) {
                r0.f7345x = i9;
                int i12 = i9 - 1;
                m8512a((int) f7322h[i12], (int) f7317c, f7321g[i12], (int) false, f7319e[i12], f7320f[i12], f7318d[i12]);
            }
            if (i10 != 0 && r0.f7346y != i10) {
                r0.f7346y = i10;
                i12 = i10 - 1;
                m8511a((int) false, (int) true, 1, false, false, f7324j[i12], f7323i[i12]);
                m8510a(f7315a, f7325k[i12], f7316b);
            }
        }

        /* renamed from: a */
        public void m8512a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f7347z = i;
            this.f7344w = i6;
        }

        /* renamed from: a */
        public void m8511a(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f7326A != -1) {
                if (!z) {
                    this.f7334m.setSpan(new StyleSpan(2), this.f7326A, this.f7334m.length(), 33);
                    this.f7326A = -1;
                }
            } else if (z) {
                this.f7326A = this.f7334m.length();
            }
            if (this.f7327B != -1) {
                if (!z2) {
                    this.f7334m.setSpan(new UnderlineSpan(), this.f7327B, this.f7334m.length(), 33);
                    this.f7327B = -1;
                }
            } else if (z2) {
                this.f7327B = this.f7334m.length();
            }
        }

        /* renamed from: a */
        public void m8510a(int i, int i2, int i3) {
            if (!(this.f7328C == -1 || this.f7329D == i)) {
                this.f7334m.setSpan(new ForegroundColorSpan(this.f7329D), this.f7328C, this.f7334m.length(), 33);
            }
            if (i != f7315a) {
                this.f7328C = this.f7334m.length();
                this.f7329D = i;
            }
            if (!(this.f7330E == -1 || this.f7331F == i2)) {
                this.f7334m.setSpan(new BackgroundColorSpan(this.f7331F), this.f7330E, this.f7334m.length(), 33);
            }
            if (i2 != f7316b) {
                this.f7330E = this.f7334m.length();
                this.f7331F = i2;
            }
        }

        /* renamed from: a */
        public void m8509a(int i, int i2) {
            if (this.f7332G != i) {
                m8508a((char) 10);
            }
            this.f7332G = i;
        }

        /* renamed from: f */
        public void m8520f() {
            int length = this.f7334m.length();
            if (length > 0) {
                this.f7334m.delete(length - 1, length);
            }
        }

        /* renamed from: a */
        public void m8508a(char c) {
            if (c == '\n') {
                this.f7333l.add(m8521g());
                this.f7334m.clear();
                if (this.f7326A != '￿') {
                    this.f7326A = 0;
                }
                if (this.f7327B != '￿') {
                    this.f7327B = 0;
                }
                if (this.f7328C != '￿') {
                    this.f7328C = 0;
                }
                if (this.f7330E != '￿') {
                    this.f7330E = 0;
                }
                while (true) {
                    if ((this.f7343v != '\u0000' && this.f7333l.size() >= this.f7342u) || this.f7333l.size() >= '\u000f') {
                        this.f7333l.remove(0);
                    } else {
                        return;
                    }
                }
            }
            this.f7334m.append(c);
        }

        /* renamed from: g */
        public SpannableString m8521g() {
            CharSequence spannableStringBuilder = new SpannableStringBuilder(this.f7334m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f7326A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f7326A, length, 33);
                }
                if (this.f7327B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7327B, length, 33);
                }
                if (this.f7328C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7329D), this.f7328C, length, 33);
                }
                if (this.f7330E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7331F), this.f7330E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: h */
        public C4040b m8522h() {
            if (m8515a()) {
                return null;
            }
            Alignment alignment;
            float f;
            float f2;
            CharSequence spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.f7333l.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f7333l.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(m8521g());
            switch (this.f7344w) {
                case 0:
                case 3:
                    alignment = Alignment.ALIGN_NORMAL;
                    break;
                case 1:
                    alignment = Alignment.ALIGN_OPPOSITE;
                    break;
                case 2:
                    alignment = Alignment.ALIGN_CENTER;
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected justification value: ");
                    stringBuilder.append(this.f7344w);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            Alignment alignment2 = alignment;
            if (this.f7338q) {
                f = ((float) this.f7340s) / 99.0f;
                f2 = ((float) this.f7339r) / 99.0f;
            } else {
                f = ((float) this.f7340s) / 209.0f;
                f2 = ((float) this.f7339r) / 74.0f;
            }
            float f3 = (f * 0.9f) + 0.05f;
            float f4 = (f2 * 0.9f) + 0.05f;
            int i2 = this.f7341t % 3 == 0 ? 0 : this.f7341t % 3 == 1 ? 1 : 2;
            int i3 = this.f7341t / 3 == 0 ? 0 : this.f7341t / 3 == 1 ? 1 : 2;
            return new C4040b(spannableStringBuilder, alignment2, f4, 0, i2, f3, i3, Float.MIN_VALUE, this.f7347z != f7316b, this.f7347z, this.f7337p);
        }

        /* renamed from: b */
        public static int m8507b(int i, int i2, int i3) {
            return C2330a.m8506a(i, i2, i3, 0);
        }

        /* renamed from: a */
        public static int m8506a(int i, int i2, int i3, int i4) {
            C2163a.m7913a(i, 0, 4);
            C2163a.m7913a(i2, 0, 4);
            C2163a.m7913a(i3, 0, 4);
            C2163a.m7913a(i4, 0, 4);
            int i5 = 255;
            switch (i4) {
                case 2:
                    i4 = 127;
                    break;
                case 3:
                    i4 = 0;
                    break;
                default:
                    i4 = 255;
                    break;
            }
            i = i > 1 ? 255 : 0;
            i2 = i2 > 1 ? 255 : 0;
            if (i3 <= 1) {
                i5 = 0;
            }
            return Color.argb(i4, i, i2, i5);
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.a.c$b */
    private static final class C2331b {
        /* renamed from: a */
        public final int f7348a;
        /* renamed from: b */
        public final int f7349b;
        /* renamed from: c */
        public final byte[] f7350c;
        /* renamed from: d */
        int f7351d = 0;

        public C2331b(int i, int i2) {
            this.f7348a = i;
            this.f7349b = i2;
            this.f7350c = new byte[((i2 * 2) - 1)];
        }
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo1525d() {
        super.mo1525d();
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ C4695h mo4686g() {
        return super.mo4686g();
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ C4694g mo4687h() {
        return super.mo4687h();
    }

    public C4817c(int i) {
        if (i == -1) {
            i = 1;
        }
        this.f21194c = i;
        this.f21195d = new C2330a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f21195d[i2] = new C2330a();
        }
        this.f21196e = this.f21195d[0];
        m28016p();
    }

    /* renamed from: c */
    public void mo1524c() {
        super.mo1524c();
        this.f21197f = null;
        this.f21198g = null;
        this.f21200i = 0;
        this.f21196e = this.f21195d[this.f21200i];
        m28016p();
        this.f21199h = null;
    }

    /* renamed from: e */
    protected boolean mo4684e() {
        return this.f21197f != this.f21198g;
    }

    /* renamed from: f */
    protected C2348d mo4685f() {
        this.f21198g = this.f21197f;
        return new C4041f(this.f21197f);
    }

    /* renamed from: a */
    protected void mo4682a(C4694g c4694g) {
        this.f21192a.m7974a(c4694g.b.array(), c4694g.b.limit());
        while (this.f21192a.m7976b() >= 3) {
            c4694g = this.f21192a.m7986g() & 7;
            int i = c4694g & 3;
            boolean z = false;
            c4694g = (c4694g & 4) == 4 ? true : null;
            byte g = (byte) this.f21192a.m7986g();
            byte g2 = (byte) this.f21192a.m7986g();
            if (i == 2 || i == 3) {
                if (c4694g != null) {
                    C2331b c2331b;
                    if (i == 3) {
                        m28008i();
                        c4694g = (g & 192) >> 6;
                        int i2 = g & 63;
                        if (i2 == 0) {
                            i2 = 64;
                        }
                        this.f21199h = new C2331b(c4694g, i2);
                        c4694g = this.f21199h.f7350c;
                        c2331b = this.f21199h;
                        i = c2331b.f7351d;
                        c2331b.f7351d = i + 1;
                        c4694g[i] = g2;
                    } else {
                        if (i == 2) {
                            z = true;
                        }
                        C2163a.m7916a(z);
                        if (this.f21199h == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            c4694g = this.f21199h.f7350c;
                            c2331b = this.f21199h;
                            i = c2331b.f7351d;
                            c2331b.f7351d = i + 1;
                            c4694g[i] = g;
                            c4694g = this.f21199h.f7350c;
                            c2331b = this.f21199h;
                            i = c2331b.f7351d;
                            c2331b.f7351d = i + 1;
                            c4694g[i] = g2;
                        }
                    }
                    if (this.f21199h.f7351d == (this.f21199h.f7349b * 2) - 1) {
                        m28008i();
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private void m28008i() {
        if (this.f21199h != null) {
            m28010j();
            this.f21199h = null;
        }
    }

    /* renamed from: j */
    private void m28010j() {
        if (this.f21199h.f7351d != (this.f21199h.f7349b * 2) - 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DtvCcPacket ended prematurely; size is ");
            stringBuilder.append((this.f21199h.f7349b * 2) - 1);
            stringBuilder.append(", but current index is ");
            stringBuilder.append(this.f21199h.f7351d);
            stringBuilder.append(" (sequence number ");
            stringBuilder.append(this.f21199h.f7348a);
            stringBuilder.append("); ignoring packet");
            Log.w("Cea708Decoder", stringBuilder.toString());
            return;
        }
        this.f21193b.m7961a(this.f21199h.f7350c, this.f21199h.f7351d);
        int c = this.f21193b.m7966c(3);
        int c2 = this.f21193b.m7966c(5);
        if (c == 7) {
            this.f21193b.m7964b(2);
            c += this.f21193b.m7966c(6);
        }
        if (c2 == 0) {
            if (c != 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("serviceNumber is non-zero (");
                stringBuilder2.append(c);
                stringBuilder2.append(") when blockSize is 0");
                Log.w("Cea708Decoder", stringBuilder2.toString());
            }
        } else if (c == this.f21194c) {
            Object obj = null;
            while (this.f21193b.m7959a() > 0) {
                c2 = this.f21193b.m7966c(8);
                StringBuilder stringBuilder3;
                if (c2 == 16) {
                    c2 = this.f21193b.m7966c(8);
                    if (c2 <= 31) {
                        m28002c(c2);
                    } else if (c2 <= 127) {
                        m28006g(c2);
                    } else if (c2 <= 159) {
                        m28003d(c2);
                    } else if (c2 <= 255) {
                        m28007h(c2);
                    } else {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("Invalid extended command: ");
                        stringBuilder3.append(c2);
                        Log.w("Cea708Decoder", stringBuilder3.toString());
                    }
                } else if (c2 <= 31) {
                    m28000a(c2);
                } else if (c2 <= 127) {
                    m28004e(c2);
                } else if (c2 <= 159) {
                    m28001b(c2);
                } else if (c2 <= 255) {
                    m28005f(c2);
                } else {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Invalid base command: ");
                    stringBuilder3.append(c2);
                    Log.w("Cea708Decoder", stringBuilder3.toString());
                }
                obj = 1;
            }
            if (obj != null) {
                this.f21197f = m28015o();
            }
        }
    }

    /* renamed from: a */
    private void m28000a(int i) {
        if (i == 0) {
            return;
        }
        if (i == 3) {
            this.f21197f = m28015o();
        } else if (i != 8) {
            switch (i) {
                case 12:
                    m28016p();
                    return;
                case 13:
                    this.f21196e.m8508a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Currently unsupported COMMAND_EXT1 Command: ");
                        stringBuilder.append(i);
                        Log.w("Cea708Decoder", stringBuilder.toString());
                        this.f21193b.m7964b(8);
                        return;
                    } else if (i < 24 || i > 31) {
                        r1 = new StringBuilder();
                        r1.append("Invalid C0 command: ");
                        r1.append(i);
                        Log.w("Cea708Decoder", r1.toString());
                        return;
                    } else {
                        r1 = new StringBuilder();
                        r1.append("Currently unsupported COMMAND_P16 Command: ");
                        r1.append(i);
                        Log.w("Cea708Decoder", r1.toString());
                        this.f21193b.m7964b(16);
                        return;
                    }
            }
        } else {
            this.f21196e.m8520f();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m28001b(int r5) {
        /*
        r4 = this;
        r0 = 16;
        r1 = 8;
        r2 = 1;
        switch(r5) {
            case 128: goto L_0x010c;
            case 129: goto L_0x010c;
            case 130: goto L_0x010c;
            case 131: goto L_0x010c;
            case 132: goto L_0x010c;
            case 133: goto L_0x010c;
            case 134: goto L_0x010c;
            case 135: goto L_0x010c;
            case 136: goto L_0x00f6;
            case 137: goto L_0x00df;
            case 138: goto L_0x00c8;
            case 139: goto L_0x00ac;
            case 140: goto L_0x0096;
            case 141: goto L_0x008f;
            case 142: goto L_0x011a;
            case 143: goto L_0x008a;
            case 144: goto L_0x0076;
            case 145: goto L_0x0060;
            case 146: goto L_0x004c;
            default: goto L_0x0008;
        };
    L_0x0008:
        switch(r5) {
            case 151: goto L_0x0036;
            case 152: goto L_0x0023;
            case 153: goto L_0x0023;
            case 154: goto L_0x0023;
            case 155: goto L_0x0023;
            case 156: goto L_0x0023;
            case 157: goto L_0x0023;
            case 158: goto L_0x0023;
            case 159: goto L_0x0023;
            default: goto L_0x000b;
        };
    L_0x000b:
        r0 = "Cea708Decoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid C1 command: ";
        r1.append(r2);
        r1.append(r5);
        r5 = r1.toString();
        android.util.Log.w(r0, r5);
        goto L_0x011a;
    L_0x0023:
        r5 = r5 + -152;
        r4.m28009i(r5);
        r0 = r4.f21200i;
        if (r0 == r5) goto L_0x011a;
    L_0x002c:
        r4.f21200i = r5;
        r0 = r4.f21195d;
        r5 = r0[r5];
        r4.f21196e = r5;
        goto L_0x011a;
    L_0x0036:
        r5 = r4.f21196e;
        r5 = r5.m8518d();
        if (r5 != 0) goto L_0x0047;
    L_0x003e:
        r5 = r4.f21193b;
        r0 = 32;
        r5.m7964b(r0);
        goto L_0x011a;
    L_0x0047:
        r4.m28014n();
        goto L_0x011a;
    L_0x004c:
        r5 = r4.f21196e;
        r5 = r5.m8518d();
        if (r5 != 0) goto L_0x005b;
    L_0x0054:
        r5 = r4.f21193b;
        r5.m7964b(r0);
        goto L_0x011a;
    L_0x005b:
        r4.m28013m();
        goto L_0x011a;
    L_0x0060:
        r5 = r4.f21196e;
        r5 = r5.m8518d();
        if (r5 != 0) goto L_0x0071;
    L_0x0068:
        r5 = r4.f21193b;
        r0 = 24;
        r5.m7964b(r0);
        goto L_0x011a;
    L_0x0071:
        r4.m28012l();
        goto L_0x011a;
    L_0x0076:
        r5 = r4.f21196e;
        r5 = r5.m8518d();
        if (r5 != 0) goto L_0x0085;
    L_0x007e:
        r5 = r4.f21193b;
        r5.m7964b(r0);
        goto L_0x011a;
    L_0x0085:
        r4.m28011k();
        goto L_0x011a;
    L_0x008a:
        r4.m28016p();
        goto L_0x011a;
    L_0x008f:
        r5 = r4.f21193b;
        r5.m7964b(r1);
        goto L_0x011a;
    L_0x0096:
        if (r2 > r1) goto L_0x011a;
    L_0x0098:
        r5 = r4.f21193b;
        r5 = r5.m7968d();
        if (r5 == 0) goto L_0x00a9;
    L_0x00a0:
        r5 = r4.f21195d;
        r0 = 8 - r2;
        r5 = r5[r0];
        r5.m8516b();
    L_0x00a9:
        r2 = r2 + 1;
        goto L_0x0096;
    L_0x00ac:
        r5 = 1;
    L_0x00ad:
        if (r5 > r1) goto L_0x011a;
    L_0x00af:
        r0 = r4.f21193b;
        r0 = r0.m7968d();
        if (r0 == 0) goto L_0x00c5;
    L_0x00b7:
        r0 = r4.f21195d;
        r3 = 8 - r5;
        r0 = r0[r3];
        r3 = r0.m8519e();
        r3 = r3 ^ r2;
        r0.m8513a(r3);
    L_0x00c5:
        r5 = r5 + 1;
        goto L_0x00ad;
    L_0x00c8:
        if (r2 > r1) goto L_0x011a;
    L_0x00ca:
        r5 = r4.f21193b;
        r5 = r5.m7968d();
        if (r5 == 0) goto L_0x00dc;
    L_0x00d2:
        r5 = r4.f21195d;
        r0 = 8 - r2;
        r5 = r5[r0];
        r0 = 0;
        r5.m8513a(r0);
    L_0x00dc:
        r2 = r2 + 1;
        goto L_0x00c8;
    L_0x00df:
        r5 = 1;
    L_0x00e0:
        if (r5 > r1) goto L_0x011a;
    L_0x00e2:
        r0 = r4.f21193b;
        r0 = r0.m7968d();
        if (r0 == 0) goto L_0x00f3;
    L_0x00ea:
        r0 = r4.f21195d;
        r3 = 8 - r5;
        r0 = r0[r3];
        r0.m8513a(r2);
    L_0x00f3:
        r5 = r5 + 1;
        goto L_0x00e0;
    L_0x00f6:
        if (r2 > r1) goto L_0x011a;
    L_0x00f8:
        r5 = r4.f21193b;
        r5 = r5.m7968d();
        if (r5 == 0) goto L_0x0109;
    L_0x0100:
        r5 = r4.f21195d;
        r0 = 8 - r2;
        r5 = r5[r0];
        r5.m8517c();
    L_0x0109:
        r2 = r2 + 1;
        goto L_0x00f6;
    L_0x010c:
        r5 = r5 + -128;
        r0 = r4.f21200i;
        if (r0 == r5) goto L_0x011a;
    L_0x0112:
        r4.f21200i = r5;
        r0 = r4.f21195d;
        r5 = r0[r5];
        r4.f21196e = r5;
    L_0x011a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.a.c.b(int):void");
    }

    /* renamed from: c */
    private void m28002c(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f21193b.m7964b(8);
            } else if (i <= 23) {
                this.f21193b.m7964b(16);
            } else if (i <= 31) {
                this.f21193b.m7964b(24);
            }
        }
    }

    /* renamed from: d */
    private void m28003d(int i) {
        if (i <= 135) {
            this.f21193b.m7964b(32);
        } else if (i <= 143) {
            this.f21193b.m7964b(40);
        } else if (i <= 159) {
            this.f21193b.m7964b(2);
            this.f21193b.m7964b(this.f21193b.m7966c(6) * 8);
        }
    }

    /* renamed from: e */
    private void m28004e(int i) {
        if (i == 127) {
            this.f21196e.m8508a('♫');
        } else {
            this.f21196e.m8508a((char) (i & 255));
        }
    }

    /* renamed from: f */
    private void m28005f(int i) {
        this.f21196e.m8508a((char) (i & 255));
    }

    /* renamed from: g */
    private void m28006g(int i) {
        if (i == 37) {
            this.f21196e.m8508a('…');
        } else if (i == 42) {
            this.f21196e.m8508a('Š');
        } else if (i == 44) {
            this.f21196e.m8508a('Œ');
        } else if (i != 63) {
            switch (i) {
                case 32:
                    this.f21196e.m8508a(' ');
                    return;
                case 33:
                    this.f21196e.m8508a(' ');
                    return;
                default:
                    switch (i) {
                        case 48:
                            this.f21196e.m8508a('█');
                            return;
                        case 49:
                            this.f21196e.m8508a('‘');
                            return;
                        case 50:
                            this.f21196e.m8508a('’');
                            return;
                        case 51:
                            this.f21196e.m8508a('“');
                            return;
                        case 52:
                            this.f21196e.m8508a('”');
                            return;
                        case 53:
                            this.f21196e.m8508a('•');
                            return;
                        default:
                            switch (i) {
                                case 57:
                                    this.f21196e.m8508a('™');
                                    return;
                                case 58:
                                    this.f21196e.m8508a('š');
                                    return;
                                default:
                                    switch (i) {
                                        case 60:
                                            this.f21196e.m8508a('œ');
                                            return;
                                        case 61:
                                            this.f21196e.m8508a('℠');
                                            return;
                                        default:
                                            switch (i) {
                                                case 118:
                                                    this.f21196e.m8508a('⅛');
                                                    return;
                                                case 119:
                                                    this.f21196e.m8508a('⅜');
                                                    return;
                                                case 120:
                                                    this.f21196e.m8508a('⅝');
                                                    return;
                                                case 121:
                                                    this.f21196e.m8508a('⅞');
                                                    return;
                                                case 122:
                                                    this.f21196e.m8508a('│');
                                                    return;
                                                case 123:
                                                    this.f21196e.m8508a('┐');
                                                    return;
                                                case 124:
                                                    this.f21196e.m8508a('└');
                                                    return;
                                                case 125:
                                                    this.f21196e.m8508a('─');
                                                    return;
                                                case 126:
                                                    this.f21196e.m8508a('┘');
                                                    return;
                                                case 127:
                                                    this.f21196e.m8508a('┌');
                                                    return;
                                                default:
                                                    StringBuilder stringBuilder = new StringBuilder();
                                                    stringBuilder.append("Invalid G2 character: ");
                                                    stringBuilder.append(i);
                                                    Log.w("Cea708Decoder", stringBuilder.toString());
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        } else {
            this.f21196e.m8508a('Ÿ');
        }
    }

    /* renamed from: h */
    private void m28007h(int i) {
        if (i == 160) {
            this.f21196e.m8508a('㏄');
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid G3 character: ");
        stringBuilder.append(i);
        Log.w("Cea708Decoder", stringBuilder.toString());
        this.f21196e.m8508a('_');
    }

    /* renamed from: k */
    private void m28011k() {
        this.f21196e.m8511a(this.f21193b.m7966c(4), this.f21193b.m7966c(2), this.f21193b.m7966c(2), this.f21193b.m7968d(), this.f21193b.m7968d(), this.f21193b.m7966c(3), this.f21193b.m7966c(3));
    }

    /* renamed from: l */
    private void m28012l() {
        int a = C2330a.m8506a(this.f21193b.m7966c(2), this.f21193b.m7966c(2), this.f21193b.m7966c(2), this.f21193b.m7966c(2));
        int a2 = C2330a.m8506a(this.f21193b.m7966c(2), this.f21193b.m7966c(2), this.f21193b.m7966c(2), this.f21193b.m7966c(2));
        this.f21193b.m7964b(2);
        this.f21196e.m8510a(a, a2, C2330a.m8507b(this.f21193b.m7966c(2), this.f21193b.m7966c(2), this.f21193b.m7966c(2)));
    }

    /* renamed from: m */
    private void m28013m() {
        this.f21193b.m7964b(4);
        int c = this.f21193b.m7966c(4);
        this.f21193b.m7964b(2);
        this.f21196e.m8509a(c, this.f21193b.m7966c(6));
    }

    /* renamed from: n */
    private void m28014n() {
        int a = C2330a.m8506a(this.f21193b.m7966c(2), this.f21193b.m7966c(2), this.f21193b.m7966c(2), this.f21193b.m7966c(2));
        int c = this.f21193b.m7966c(2);
        int b = C2330a.m8507b(this.f21193b.m7966c(2), this.f21193b.m7966c(2), this.f21193b.m7966c(2));
        if (this.f21193b.m7968d()) {
            c |= 4;
        }
        int i = c;
        boolean d = this.f21193b.m7968d();
        int c2 = this.f21193b.m7966c(2);
        int c3 = this.f21193b.m7966c(2);
        int c4 = this.f21193b.m7966c(2);
        this.f21193b.m7964b(8);
        this.f21196e.m8512a(a, b, d, i, c2, c3, c4);
    }

    /* renamed from: i */
    private void m28009i(int i) {
        C2330a c2330a = this.f21195d[i];
        this.f21193b.m7964b(2);
        boolean d = this.f21193b.m7968d();
        boolean d2 = this.f21193b.m7968d();
        boolean d3 = this.f21193b.m7968d();
        i = this.f21193b.m7966c(3);
        boolean d4 = this.f21193b.m7968d();
        int c = this.f21193b.m7966c(7);
        int c2 = this.f21193b.m7966c(8);
        int c3 = this.f21193b.m7966c(4);
        int c4 = this.f21193b.m7966c(4);
        this.f21193b.m7964b(2);
        int c5 = this.f21193b.m7966c(6);
        this.f21193b.m7964b(2);
        c2330a.m8514a(d, d2, d3, i, d4, c, c2, c4, c5, c3, this.f21193b.m7966c(3), this.f21193b.m7966c(3));
    }

    /* renamed from: o */
    private List<C2333a> m28015o() {
        List arrayList = new ArrayList();
        int i = 0;
        while (i < 8) {
            if (!this.f21195d[i].m8515a() && this.f21195d[i].m8519e()) {
                arrayList.add(this.f21195d[i].m8522h());
            }
            i++;
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p */
    private void m28016p() {
        for (int i = 0; i < 8; i++) {
            this.f21195d[i].m8516b();
        }
    }
}
