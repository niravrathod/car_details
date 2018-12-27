package com.google.android.exoplayer2.text.p132a;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.text.C2333a;
import com.google.android.exoplayer2.text.C2348d;
import com.google.android.exoplayer2.text.C4694g;
import com.google.android.exoplayer2.text.C4695h;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.a.a */
public final class C4816a extends C4692d {
    /* renamed from: a */
    private static final int[] f21173a = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
    /* renamed from: b */
    private static final int[] f21174b = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
    /* renamed from: c */
    private static final int[] f21175c = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    /* renamed from: d */
    private static final int[] f21176d = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    /* renamed from: e */
    private static final int[] f21177e = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    /* renamed from: f */
    private static final int[] f21178f = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    /* renamed from: g */
    private static final int[] f21179g = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    /* renamed from: h */
    private final C2175k f21180h = new C2175k();
    /* renamed from: i */
    private final int f21181i;
    /* renamed from: j */
    private final int f21182j;
    /* renamed from: k */
    private final LinkedList<C2329a> f21183k = new LinkedList();
    /* renamed from: l */
    private C2329a f21184l = new C2329a(0, 4);
    /* renamed from: m */
    private List<C2333a> f21185m;
    /* renamed from: n */
    private List<C2333a> f21186n;
    /* renamed from: o */
    private int f21187o;
    /* renamed from: p */
    private int f21188p;
    /* renamed from: q */
    private boolean f21189q;
    /* renamed from: r */
    private byte f21190r;
    /* renamed from: s */
    private byte f21191s;

    /* renamed from: com.google.android.exoplayer2.text.a.a$a */
    private static class C2329a {
        /* renamed from: a */
        private final List<CharacterStyle> f7305a = new ArrayList();
        /* renamed from: b */
        private final List<C2328a> f7306b = new ArrayList();
        /* renamed from: c */
        private final List<SpannableString> f7307c = new LinkedList();
        /* renamed from: d */
        private final SpannableStringBuilder f7308d = new SpannableStringBuilder();
        /* renamed from: e */
        private int f7309e;
        /* renamed from: f */
        private int f7310f;
        /* renamed from: g */
        private int f7311g;
        /* renamed from: h */
        private int f7312h;
        /* renamed from: i */
        private int f7313i;
        /* renamed from: j */
        private int f7314j;

        /* renamed from: com.google.android.exoplayer2.text.a.a$a$a */
        private static class C2328a {
            /* renamed from: a */
            public final CharacterStyle f7302a;
            /* renamed from: b */
            public final int f7303b;
            /* renamed from: c */
            public final int f7304c;

            public C2328a(CharacterStyle characterStyle, int i, int i2) {
                this.f7302a = characterStyle;
                this.f7303b = i;
                this.f7304c = i2;
            }
        }

        public C2329a(int i, int i2) {
            m8494a(i, i2);
        }

        /* renamed from: a */
        public void m8494a(int i, int i2) {
            this.f7305a.clear();
            this.f7306b.clear();
            this.f7307c.clear();
            this.f7308d.clear();
            this.f7309e = 15;
            this.f7310f = 0;
            this.f7311g = 0;
            this.f7312h = i;
            this.f7313i = i2;
            this.f7314j = -1;
        }

        /* renamed from: a */
        public boolean m8498a() {
            return this.f7305a.isEmpty() && this.f7306b.isEmpty() && this.f7307c.isEmpty() && this.f7308d.length() == 0;
        }

        /* renamed from: b */
        public void m8499b() {
            int length = this.f7308d.length();
            if (length > 0) {
                this.f7308d.delete(length - 1, length);
            }
        }

        /* renamed from: c */
        public int m8501c() {
            return this.f7309e;
        }

        /* renamed from: a */
        public void m8493a(int i) {
            this.f7309e = i;
        }

        /* renamed from: d */
        public void m8503d() {
            this.f7307c.add(m8504e());
            this.f7308d.clear();
            this.f7305a.clear();
            this.f7306b.clear();
            this.f7314j = -1;
            int min = Math.min(this.f7313i, this.f7309e);
            while (this.f7307c.size() >= min) {
                this.f7307c.remove(0);
            }
        }

        /* renamed from: b */
        public void m8500b(int i) {
            this.f7310f = i;
        }

        /* renamed from: c */
        public void m8502c(int i) {
            this.f7311g = i;
        }

        /* renamed from: a */
        public void m8495a(CharacterStyle characterStyle) {
            this.f7305a.add(characterStyle);
        }

        /* renamed from: a */
        public void m8496a(CharacterStyle characterStyle, int i) {
            this.f7306b.add(new C2328a(characterStyle, this.f7308d.length(), i));
        }

        /* renamed from: a */
        public void m8497a(boolean z) {
            if (z) {
                this.f7314j = this.f7308d.length();
            } else if (!this.f7314j) {
                this.f7308d.setSpan(new UnderlineSpan(), this.f7314j, this.f7308d.length(), 33);
                this.f7314j = -1;
            }
        }

        /* renamed from: a */
        public void m8492a(char c) {
            this.f7308d.append(c);
        }

        /* renamed from: e */
        public SpannableString m8504e() {
            int length = this.f7308d.length();
            int i = 0;
            for (int i2 = 0; i2 < this.f7305a.size(); i2++) {
                this.f7308d.setSpan(this.f7305a.get(i2), 0, length, 33);
            }
            while (i < this.f7306b.size()) {
                C2328a c2328a = (C2328a) this.f7306b.get(i);
                this.f7308d.setSpan(c2328a.f7302a, c2328a.f7303b, i < this.f7306b.size() - c2328a.f7304c ? ((C2328a) this.f7306b.get(c2328a.f7304c + i)).f7303b : length, 33);
                i++;
            }
            if (this.f7314j != -1) {
                this.f7308d.setSpan(new UnderlineSpan(), this.f7314j, length, 33);
            }
            return new SpannableString(this.f7308d);
        }

        /* renamed from: f */
        public C2333a m8505f() {
            int i;
            CharSequence spannableStringBuilder = new SpannableStringBuilder();
            for (i = 0; i < this.f7307c.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f7307c.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(m8504e());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            float f;
            int i2;
            int i3;
            i = this.f7310f + this.f7311g;
            int length = (32 - i) - spannableStringBuilder.length();
            int i4 = i - length;
            if (this.f7312h == 2 && Math.abs(i4) < 3) {
                f = 0.5f;
                i2 = 1;
            } else if (this.f7312h != 2 || i4 <= 0) {
                f = ((((float) i) / 32.0f) * 0.8f) + 0.1f;
                i2 = 0;
            } else {
                f = ((((float) (32 - length)) / 32.0f) * 0.8f) + 0.1f;
                i2 = 2;
            }
            if (this.f7312h != 1) {
                if (this.f7309e <= 7) {
                    i = this.f7309e;
                    i3 = 0;
                    return new C2333a(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i, 1, i3, f, i2, Float.MIN_VALUE);
                }
            }
            i = (this.f7309e - 15) - 2;
            i3 = 2;
            return new C2333a(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i, 1, i3, f, i2, Float.MIN_VALUE);
        }

        public String toString() {
            return this.f7308d.toString();
        }
    }

    /* renamed from: c */
    private static boolean m27981c(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: d */
    private static boolean m27983d(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: e */
    private static boolean m27985e(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= (byte) 33 && b2 <= (byte) 35;
    }

    /* renamed from: f */
    private static boolean m27987f(byte b, byte b2) {
        return (b & 247) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: g */
    private static boolean m27988g(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: d */
    public void mo1525d() {
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ C4695h mo4686g() {
        return super.mo4686g();
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ C4694g mo4687h() {
        return super.mo4687h();
    }

    public C4816a(String str, int i) {
        this.f21181i = "application/x-mp4-cea-608".equals(str) != null ? 2 : 3;
        switch (i) {
            case 3:
            case 4:
                this.f21182j = 2;
                break;
            default:
                this.f21182j = 1;
                break;
        }
        m27976a(0);
        m27990j();
    }

    /* renamed from: c */
    public void mo1524c() {
        super.mo1524c();
        this.f21185m = null;
        this.f21186n = null;
        m27976a(0);
        m27990j();
        this.f21188p = 4;
        this.f21189q = false;
        this.f21190r = (byte) 0;
        this.f21191s = (byte) 0;
    }

    /* renamed from: e */
    protected boolean mo4684e() {
        return this.f21185m != this.f21186n;
    }

    /* renamed from: f */
    protected C2348d mo4685f() {
        this.f21186n = this.f21185m;
        return new C4041f(this.f21185m);
    }

    /* renamed from: a */
    protected void mo4682a(C4694g c4694g) {
        this.f21180h.m7974a(c4694g.b.array(), c4694g.b.limit());
        Object obj = null;
        boolean z = false;
        while (this.f21180h.m7976b() >= this.f21181i) {
            int i;
            if (this.f21181i == 2) {
                i = -4;
            } else {
                i = (byte) this.f21180h.m7986g();
            }
            byte g = (byte) (this.f21180h.m7986g() & 127);
            byte g2 = (byte) (this.f21180h.m7986g() & 127);
            if ((i & 6) == 4) {
                if (this.f21182j != 1 || (i & 1) == 0) {
                    if (this.f21182j != 2 || (i & 1) == 1) {
                        if (g != (byte) 0 || g2 != (byte) 0) {
                            if ((g & 247) == 17 && (g2 & 240) == 48) {
                                this.f21184l.m8492a(C4816a.m27982d(g2));
                            } else if ((g & 246) == 18 && (g2 & 224) == 32) {
                                this.f21184l.m8499b();
                                if ((g & 1) == 0) {
                                    this.f21184l.m8492a(C4816a.m27984e(g2));
                                } else {
                                    this.f21184l.m8492a(C4816a.m27986f(g2));
                                }
                            } else if ((g & 224) == 0) {
                                z = m27977a(g, g2);
                            } else {
                                this.f21184l.m8492a(C4816a.m27980c(g));
                                if ((g2 & 224) != 0) {
                                    this.f21184l.m8492a(C4816a.m27980c(g2));
                                }
                            }
                            obj = 1;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!z) {
                this.f21189q = null;
            }
            if (this.f21187o == 1 || this.f21187o == 3) {
                this.f21185m = m27989i();
            }
        }
    }

    /* renamed from: a */
    private boolean m27977a(byte b, byte b2) {
        boolean g = C4816a.m27988g(b);
        if (g) {
            if (this.f21189q && this.f21190r == b && this.f21191s == b2) {
                this.f21189q = false;
                return true;
            }
            this.f21189q = true;
            this.f21190r = b;
            this.f21191s = b2;
        }
        if (C4816a.m27981c(b, b2)) {
            m27975a(b2);
        } else if (C4816a.m27983d(b, b2)) {
            m27979b(b, b2);
        } else if (C4816a.m27985e(b, b2)) {
            this.f21184l.m8502c(b2 - 32);
        } else if (C4816a.m27987f(b, b2) != (byte) 0) {
            m27978b(b2);
        }
        return g;
    }

    /* renamed from: a */
    private void m27975a(byte b) {
        this.f21184l.m8497a((b & 1) == 1);
        b = (b >> (byte) 1) & 15;
        if (b == (byte) 7) {
            this.f21184l.m8496a(new StyleSpan(2), 2);
            this.f21184l.m8496a(new ForegroundColorSpan(-1), 1);
            return;
        }
        this.f21184l.m8496a(new ForegroundColorSpan(f21175c[b]), 1);
    }

    /* renamed from: b */
    private void m27979b(byte b, byte b2) {
        int i = f21173a[b & (byte) 7];
        if (((b2 & 32) != 0 ? 1 : null) != null) {
            i++;
        }
        if (i != this.f21184l.m8501c()) {
            if (!(this.f21187o == 1 || this.f21184l.m8498a())) {
                this.f21184l = new C2329a(this.f21187o, this.f21188p);
                this.f21183k.add(this.f21184l);
            }
            this.f21184l.m8493a(i);
        }
        if ((b2 & 1) == (byte) 1) {
            this.f21184l.m8495a(new UnderlineSpan());
        }
        b = (b2 >> 1) & 15;
        if (b > (byte) 7) {
            this.f21184l.m8500b(f21174b[b & (byte) 7]);
        } else if (b == (byte) 7) {
            this.f21184l.m8495a(new StyleSpan(2));
            this.f21184l.m8495a(new ForegroundColorSpan(-1));
        } else {
            this.f21184l.m8495a(new ForegroundColorSpan(f21175c[b]));
        }
    }

    /* renamed from: b */
    private void m27978b(byte b) {
        if (b == (byte) 32) {
            m27976a(2);
        } else if (b != (byte) 41) {
            switch (b) {
                case (byte) 37:
                    this.f21188p = 2;
                    m27976a(1);
                    return;
                case (byte) 38:
                    this.f21188p = 3;
                    m27976a(1);
                    return;
                case (byte) 39:
                    this.f21188p = (byte) 4;
                    m27976a(1);
                    return;
                default:
                    if (this.f21187o != 0) {
                        if (b != (byte) 33) {
                            switch (b) {
                                case (byte) 44:
                                    this.f21185m = (byte) 0;
                                    if (this.f21187o == (byte) 1 || this.f21187o == (byte) 3) {
                                        m27990j();
                                        break;
                                    }
                                case (byte) 45:
                                    if (this.f21187o == (byte) 1 && this.f21184l.m8498a() == (byte) 0) {
                                        this.f21184l.m8503d();
                                        break;
                                    }
                                case (byte) 46:
                                    m27990j();
                                    break;
                                case (byte) 47:
                                    this.f21185m = m27989i();
                                    m27990j();
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f21184l.m8499b();
                        return;
                    }
                    return;
            }
        } else {
            m27976a(3);
        }
    }

    /* renamed from: i */
    private List<C2333a> m27989i() {
        List<C2333a> arrayList = new ArrayList();
        for (int i = 0; i < this.f21183k.size(); i++) {
            C2333a f = ((C2329a) this.f21183k.get(i)).m8505f();
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m27976a(int i) {
        if (this.f21187o != i) {
            int i2 = this.f21187o;
            this.f21187o = i;
            m27990j();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f21185m = 0;
            }
        }
    }

    /* renamed from: j */
    private void m27990j() {
        this.f21184l.m8494a(this.f21187o, this.f21188p);
        this.f21183k.clear();
        this.f21183k.add(this.f21184l);
    }

    /* renamed from: c */
    private static char m27980c(byte b) {
        return (char) f21176d[(b & 127) - 32];
    }

    /* renamed from: d */
    private static char m27982d(byte b) {
        return (char) f21177e[b & 15];
    }

    /* renamed from: e */
    private static char m27984e(byte b) {
        return (char) f21178f[b & 31];
    }

    /* renamed from: f */
    private static char m27986f(byte b) {
        return (char) f21179g[b & 31];
    }
}
