package com.google.android.exoplayer2.text.p133b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region.Op;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.p126c.C2174j;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.text.C2333a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.b.b */
final class C2342b {
    /* renamed from: a */
    private static final byte[] f7410a = new byte[]{(byte) 0, (byte) 7, (byte) 8, (byte) 15};
    /* renamed from: b */
    private static final byte[] f7411b = new byte[]{(byte) 0, (byte) 119, (byte) -120, (byte) -1};
    /* renamed from: c */
    private static final byte[] f7412c = new byte[]{(byte) 0, (byte) 17, (byte) 34, (byte) 51, (byte) 68, (byte) 85, (byte) 102, (byte) 119, (byte) -120, (byte) -103, (byte) -86, (byte) -69, (byte) -52, (byte) -35, (byte) -18, (byte) -1};
    /* renamed from: d */
    private final Paint f7413d = new Paint();
    /* renamed from: e */
    private final Paint f7414e;
    /* renamed from: f */
    private final Canvas f7415f;
    /* renamed from: g */
    private final C2335b f7416g;
    /* renamed from: h */
    private final C2334a f7417h;
    /* renamed from: i */
    private final C2341h f7418i;
    /* renamed from: j */
    private Bitmap f7419j;

    /* renamed from: com.google.android.exoplayer2.text.b.b$a */
    private static final class C2334a {
        /* renamed from: a */
        public final int f7364a;
        /* renamed from: b */
        public final int[] f7365b;
        /* renamed from: c */
        public final int[] f7366c;
        /* renamed from: d */
        public final int[] f7367d;

        public C2334a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f7364a = i;
            this.f7365b = iArr;
            this.f7366c = iArr2;
            this.f7367d = iArr3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$b */
    private static final class C2335b {
        /* renamed from: a */
        public final int f7368a;
        /* renamed from: b */
        public final int f7369b;
        /* renamed from: c */
        public final int f7370c;
        /* renamed from: d */
        public final int f7371d;
        /* renamed from: e */
        public final int f7372e;
        /* renamed from: f */
        public final int f7373f;

        public C2335b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f7368a = i;
            this.f7369b = i2;
            this.f7370c = i3;
            this.f7371d = i4;
            this.f7372e = i5;
            this.f7373f = i6;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$c */
    private static final class C2336c {
        /* renamed from: a */
        public final int f7374a;
        /* renamed from: b */
        public final boolean f7375b;
        /* renamed from: c */
        public final byte[] f7376c;
        /* renamed from: d */
        public final byte[] f7377d;

        public C2336c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f7374a = i;
            this.f7375b = z;
            this.f7376c = bArr;
            this.f7377d = bArr2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$d */
    private static final class C2337d {
        /* renamed from: a */
        public final int f7378a;
        /* renamed from: b */
        public final int f7379b;
        /* renamed from: c */
        public final int f7380c;
        /* renamed from: d */
        public final SparseArray<C2338e> f7381d;

        public C2337d(int i, int i2, int i3, SparseArray<C2338e> sparseArray) {
            this.f7378a = i;
            this.f7379b = i2;
            this.f7380c = i3;
            this.f7381d = sparseArray;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$e */
    private static final class C2338e {
        /* renamed from: a */
        public final int f7382a;
        /* renamed from: b */
        public final int f7383b;

        public C2338e(int i, int i2) {
            this.f7382a = i;
            this.f7383b = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$f */
    private static final class C2339f {
        /* renamed from: a */
        public final int f7384a;
        /* renamed from: b */
        public final boolean f7385b;
        /* renamed from: c */
        public final int f7386c;
        /* renamed from: d */
        public final int f7387d;
        /* renamed from: e */
        public final int f7388e;
        /* renamed from: f */
        public final int f7389f;
        /* renamed from: g */
        public final int f7390g;
        /* renamed from: h */
        public final int f7391h;
        /* renamed from: i */
        public final int f7392i;
        /* renamed from: j */
        public final int f7393j;
        /* renamed from: k */
        public final SparseArray<C2340g> f7394k;

        public C2339f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C2340g> sparseArray) {
            this.f7384a = i;
            this.f7385b = z;
            this.f7386c = i2;
            this.f7387d = i3;
            this.f7388e = i4;
            this.f7389f = i5;
            this.f7390g = i6;
            this.f7391h = i7;
            this.f7392i = i8;
            this.f7393j = i9;
            this.f7394k = sparseArray;
        }

        /* renamed from: a */
        public void m8526a(C2339f c2339f) {
            if (c2339f != null) {
                c2339f = c2339f.f7394k;
                for (int i = 0; i < c2339f.size(); i++) {
                    this.f7394k.put(c2339f.keyAt(i), c2339f.valueAt(i));
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$g */
    private static final class C2340g {
        /* renamed from: a */
        public final int f7395a;
        /* renamed from: b */
        public final int f7396b;
        /* renamed from: c */
        public final int f7397c;
        /* renamed from: d */
        public final int f7398d;
        /* renamed from: e */
        public final int f7399e;
        /* renamed from: f */
        public final int f7400f;

        public C2340g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f7395a = i;
            this.f7396b = i2;
            this.f7397c = i3;
            this.f7398d = i4;
            this.f7399e = i5;
            this.f7400f = i6;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$h */
    private static final class C2341h {
        /* renamed from: a */
        public final int f7401a;
        /* renamed from: b */
        public final int f7402b;
        /* renamed from: c */
        public final SparseArray<C2339f> f7403c = new SparseArray();
        /* renamed from: d */
        public final SparseArray<C2334a> f7404d = new SparseArray();
        /* renamed from: e */
        public final SparseArray<C2336c> f7405e = new SparseArray();
        /* renamed from: f */
        public final SparseArray<C2334a> f7406f = new SparseArray();
        /* renamed from: g */
        public final SparseArray<C2336c> f7407g = new SparseArray();
        /* renamed from: h */
        public C2335b f7408h;
        /* renamed from: i */
        public C2337d f7409i;

        public C2341h(int i, int i2) {
            this.f7401a = i;
            this.f7402b = i2;
        }

        /* renamed from: a */
        public void m8527a() {
            this.f7403c.clear();
            this.f7404d.clear();
            this.f7405e.clear();
            this.f7406f.clear();
            this.f7407g.clear();
            this.f7408h = null;
            this.f7409i = null;
        }
    }

    /* renamed from: a */
    private static int m8528a(int i, int i2, int i3, int i4) {
        return (((i << 24) | (i2 << 16)) | (i3 << 8)) | i4;
    }

    public C2342b(int i, int i2) {
        this.f7413d.setStyle(Style.FILL_AND_STROKE);
        this.f7413d.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.f7413d.setPathEffect(null);
        this.f7414e = new Paint();
        this.f7414e.setStyle(Style.FILL);
        this.f7414e.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        this.f7414e.setPathEffect(null);
        this.f7415f = new Canvas();
        this.f7416g = new C2335b(719, 575, 0, 719, 0, 575);
        this.f7417h = new C2334a(0, C2342b.m8539b(), C2342b.m8542c(), C2342b.m8543d());
        this.f7418i = new C2341h(i, i2);
    }

    /* renamed from: a */
    public void m8545a() {
        this.f7418i.m8527a();
    }

    /* renamed from: a */
    public List<C2333a> m8544a(byte[] bArr, int i) {
        C2342b c2342b = this;
        C2174j c2174j = new C2174j(bArr, i);
        while (c2174j.m7959a() >= 48 && c2174j.m7966c(8) == 15) {
            C2342b.m8532a(c2174j, c2342b.f7418i);
        }
        if (c2342b.f7418i.f7409i == null) {
            return Collections.emptyList();
        }
        C2335b c2335b = c2342b.f7418i.f7408h != null ? c2342b.f7418i.f7408h : c2342b.f7416g;
        if (!(c2342b.f7419j != null && c2335b.f7368a + 1 == c2342b.f7419j.getWidth() && c2335b.f7369b + 1 == c2342b.f7419j.getHeight())) {
            c2342b.f7419j = Bitmap.createBitmap(c2335b.f7368a + 1, c2335b.f7369b + 1, Config.ARGB_8888);
            c2342b.f7415f.setBitmap(c2342b.f7419j);
        }
        List<C2333a> arrayList = new ArrayList();
        SparseArray sparseArray = c2342b.f7418i.f7409i.f7381d;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            C2338e c2338e = (C2338e) sparseArray.valueAt(i2);
            C2339f c2339f = (C2339f) c2342b.f7418i.f7403c.get(sparseArray.keyAt(i2));
            int i3 = c2338e.f7382a + c2335b.f7370c;
            int i4 = c2338e.f7383b + c2335b.f7372e;
            float f = (float) i3;
            float f2 = (float) i4;
            float f3 = f2;
            float f4 = f;
            c2342b.f7415f.clipRect(f, f2, (float) Math.min(c2339f.f7386c + i3, c2335b.f7371d), (float) Math.min(c2339f.f7387d + i4, c2335b.f7373f), Op.REPLACE);
            C2334a c2334a = (C2334a) c2342b.f7418i.f7404d.get(c2339f.f7390g);
            if (c2334a == null) {
                c2334a = (C2334a) c2342b.f7418i.f7406f.get(c2339f.f7390g);
                if (c2334a == null) {
                    c2334a = c2342b.f7417h;
                }
            }
            SparseArray sparseArray2 = c2339f.f7394k;
            int i5 = 0;
            while (i5 < sparseArray2.size()) {
                int i6;
                SparseArray sparseArray3;
                int keyAt = sparseArray2.keyAt(i5);
                C2340g c2340g = (C2340g) sparseArray2.valueAt(i5);
                C2336c c2336c = (C2336c) c2342b.f7418i.f7405e.get(keyAt);
                C2336c c2336c2 = c2336c == null ? (C2336c) c2342b.f7418i.f7407g.get(keyAt) : c2336c;
                if (c2336c2 != null) {
                    i6 = i5;
                    sparseArray3 = sparseArray2;
                    C2342b.m8533a(c2336c2, c2334a, c2339f.f7389f, c2340g.f7397c + i3, i4 + c2340g.f7398d, c2336c2.f7375b ? null : c2342b.f7413d, c2342b.f7415f);
                } else {
                    i6 = i5;
                    sparseArray3 = sparseArray2;
                }
                i5 = i6 + 1;
                sparseArray2 = sparseArray3;
            }
            if (c2339f.f7385b) {
                int i7;
                if (c2339f.f7389f == 3) {
                    i7 = c2334a.f7367d[c2339f.f7391h];
                } else if (c2339f.f7389f == 2) {
                    i7 = c2334a.f7366c[c2339f.f7392i];
                } else {
                    i7 = c2334a.f7365b[c2339f.f7393j];
                }
                c2342b.f7414e.setColor(i7);
                c2342b.f7415f.drawRect(f4, f3, (float) (c2339f.f7386c + i3), (float) (c2339f.f7387d + i4), c2342b.f7414e);
            }
            arrayList.add(new C2333a(Bitmap.createBitmap(c2342b.f7419j, i3, i4, c2339f.f7386c, c2339f.f7387d), f4 / ((float) c2335b.f7368a), 0, f3 / ((float) c2335b.f7369b), 0, ((float) c2339f.f7386c) / ((float) c2335b.f7368a), ((float) c2339f.f7387d) / ((float) c2335b.f7369b)));
            c2342b.f7415f.drawColor(0, Mode.CLEAR);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m8532a(C2174j c2174j, C2341h c2341h) {
        int c = c2174j.m7966c(8);
        int c2 = c2174j.m7966c(16);
        int c3 = c2174j.m7966c(16);
        int c4 = c2174j.m7965c() + c3;
        if (c3 * 8 > c2174j.m7959a()) {
            Log.w("DvbParser", "Data field length exceeds limit");
            c2174j.m7964b(c2174j.m7959a());
            return;
        }
        C2337d c2337d;
        switch (c) {
            case 16:
                if (c2 == c2341h.f7401a) {
                    c2337d = c2341h.f7409i;
                    C2337d a = C2342b.m8531a(c2174j, c3);
                    if (a.f7380c == 0) {
                        if (!(c2337d == null || c2337d.f7379b == a.f7379b)) {
                            c2341h.f7409i = a;
                            break;
                        }
                    }
                    c2341h.f7409i = a;
                    c2341h.f7403c.clear();
                    c2341h.f7404d.clear();
                    c2341h.f7405e.clear();
                    break;
                }
                break;
            case 17:
                c2337d = c2341h.f7409i;
                if (c2 == c2341h.f7401a && c2337d != null) {
                    C2339f b = C2342b.m8538b(c2174j, c3);
                    if (c2337d.f7380c == 0) {
                        b.m8526a((C2339f) c2341h.f7403c.get(b.f7384a));
                    }
                    c2341h.f7403c.put(b.f7384a, b);
                    break;
                }
            case 18:
                C2334a c5;
                if (c2 != c2341h.f7401a) {
                    if (c2 == c2341h.f7402b) {
                        c5 = C2342b.m8541c(c2174j, c3);
                        c2341h.f7406f.put(c5.f7364a, c5);
                        break;
                    }
                }
                c5 = C2342b.m8541c(c2174j, c3);
                c2341h.f7404d.put(c5.f7364a, c5);
                break;
                break;
            case 19:
                C2336c b2;
                if (c2 != c2341h.f7401a) {
                    if (c2 == c2341h.f7402b) {
                        b2 = C2342b.m8537b(c2174j);
                        c2341h.f7407g.put(b2.f7374a, b2);
                        break;
                    }
                }
                b2 = C2342b.m8537b(c2174j);
                c2341h.f7405e.put(b2.f7374a, b2);
                break;
                break;
            case 20:
                if (c2 == c2341h.f7401a) {
                    c2341h.f7408h = C2342b.m8530a(c2174j);
                    break;
                }
                break;
            default:
                break;
        }
        c2174j.m7967d(c4 - c2174j.m7965c());
    }

    /* renamed from: a */
    private static C2335b m8530a(C2174j c2174j) {
        int c;
        int c2;
        int i;
        int i2;
        c2174j.m7964b(4);
        boolean d = c2174j.m7968d();
        c2174j.m7964b(3);
        int c3 = c2174j.m7966c(16);
        int c4 = c2174j.m7966c(16);
        if (d) {
            int c5 = c2174j.m7966c(16);
            int c6 = c2174j.m7966c(16);
            c = c2174j.m7966c(16);
            c2 = c2174j.m7966c(16);
            i = c6;
            i2 = c;
            c = c5;
        } else {
            i = c3;
            c2 = c4;
            c = 0;
            i2 = 0;
        }
        return new C2335b(c3, c4, c, i, i2, c2);
    }

    /* renamed from: a */
    private static C2337d m8531a(C2174j c2174j, int i) {
        int c = c2174j.m7966c(8);
        int c2 = c2174j.m7966c(4);
        int c3 = c2174j.m7966c(2);
        c2174j.m7964b(2);
        i -= 2;
        SparseArray sparseArray = new SparseArray();
        while (i > 0) {
            int c4 = c2174j.m7966c(8);
            c2174j.m7964b(8);
            i -= 6;
            sparseArray.put(c4, new C2338e(c2174j.m7966c(16), c2174j.m7966c(16)));
        }
        return new C2337d(c, c2, c3, sparseArray);
    }

    /* renamed from: b */
    private static C2339f m8538b(C2174j c2174j, int i) {
        C2174j c2174j2 = c2174j;
        int c = c2174j2.m7966c(8);
        c2174j2.m7964b(4);
        boolean d = c2174j.m7968d();
        c2174j2.m7964b(3);
        int i2 = 16;
        int c2 = c2174j2.m7966c(16);
        int c3 = c2174j2.m7966c(16);
        int c4 = c2174j2.m7966c(3);
        int c5 = c2174j2.m7966c(3);
        int i3 = 2;
        c2174j2.m7964b(2);
        int c6 = c2174j2.m7966c(8);
        int c7 = c2174j2.m7966c(8);
        int c8 = c2174j2.m7966c(4);
        int c9 = c2174j2.m7966c(2);
        c2174j2.m7964b(2);
        int i4 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int i5;
            int i6;
            int c10 = c2174j2.m7966c(i2);
            i2 = c2174j2.m7966c(i3);
            int c11 = c2174j2.m7966c(i3);
            int c12 = c2174j2.m7966c(12);
            int i7 = c9;
            c2174j2.m7964b(4);
            int c13 = c2174j2.m7966c(12);
            i4 -= 6;
            if (i2 != 1) {
                if (i2 != 2) {
                    i5 = 0;
                    i6 = 0;
                    sparseArray.put(c10, new C2340g(i2, c11, c12, c13, i5, i6));
                    c9 = i7;
                    i3 = 2;
                    i2 = 16;
                }
            }
            i4 -= 2;
            i5 = c2174j2.m7966c(8);
            i6 = c2174j2.m7966c(8);
            sparseArray.put(c10, new C2340g(i2, c11, c12, c13, i5, i6));
            c9 = i7;
            i3 = 2;
            i2 = 16;
        }
        return new C2339f(c, d, c2, c3, c4, c5, c6, c7, c8, c9, sparseArray);
    }

    /* renamed from: c */
    private static C2334a m8541c(C2174j c2174j, int i) {
        C2174j c2174j2 = c2174j;
        int i2 = 8;
        int c = c2174j2.m7966c(8);
        c2174j2.m7964b(8);
        int i3 = 2;
        int i4 = i - 2;
        int[] b = C2342b.m8539b();
        int[] c2 = C2342b.m8542c();
        int[] d = C2342b.m8543d();
        while (i4 > 0) {
            int c3;
            int c4;
            int c5;
            int c6 = c2174j2.m7966c(i2);
            int c7 = c2174j2.m7966c(i2);
            i4 -= 2;
            int[] iArr = (c7 & 128) != 0 ? b : (c7 & 64) != 0 ? c2 : d;
            if ((c7 & 1) != 0) {
                c7 = c2174j2.m7966c(i2);
                c3 = c2174j2.m7966c(i2);
                c4 = c2174j2.m7966c(i2);
                c5 = c2174j2.m7966c(i2);
                i4 -= 4;
            } else {
                c4 = c2174j2.m7966c(4) << 4;
                i4 -= 2;
                c5 = c2174j2.m7966c(i3) << 6;
                c7 = c2174j2.m7966c(6) << i3;
                c3 = c2174j2.m7966c(4) << 4;
            }
            if (c7 == 0) {
                c3 = 0;
                c4 = 0;
                c5 = 255;
            }
            byte b2 = (byte) (255 - (c5 & 255));
            int i5 = i4;
            double d2 = (double) c7;
            int i6 = c;
            double d3 = (double) (c3 - 128);
            Double.isNaN(d3);
            double d4 = 1.402d * d3;
            Double.isNaN(d2);
            c7 = (int) (d2 + d4);
            double d5 = (double) (c4 - 128);
            Double.isNaN(d5);
            double d6 = 0.34414d * d5;
            Double.isNaN(d2);
            d6 = d2 - d6;
            Double.isNaN(d3);
            i2 = (int) (d6 - (d3 * 0.71414d));
            Double.isNaN(d5);
            d5 *= 1.772d;
            Double.isNaN(d2);
            iArr[c6] = C2342b.m8528a(b2, C2186s.m8041a(c7, 0, 255), C2186s.m8041a(i2, 0, 255), C2186s.m8041a((int) (d2 + d5), 0, 255));
            i4 = i5;
            c = i6;
            i2 = 8;
            i3 = 2;
        }
        return new C2334a(c, b, c2, d);
    }

    /* renamed from: b */
    private static C2336c m8537b(C2174j c2174j) {
        byte[] bArr;
        int c = c2174j.m7966c(16);
        c2174j.m7964b(4);
        int c2 = c2174j.m7966c(2);
        boolean d = c2174j.m7968d();
        c2174j.m7964b(1);
        byte[] bArr2 = null;
        if (c2 == 1) {
            c2174j.m7964b(c2174j.m7966c(8) * 16);
        } else if (c2 == 0) {
            c2 = c2174j.m7966c(16);
            int c3 = c2174j.m7966c(16);
            if (c2 > 0) {
                bArr2 = new byte[c2];
                c2174j.m7962a(bArr2, 0, c2);
            }
            if (c3 > 0) {
                bArr = new byte[c3];
                c2174j.m7962a(bArr, 0, c3);
                return new C2336c(c, d, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C2336c(c, d, bArr2, bArr);
    }

    /* renamed from: b */
    private static int[] m8539b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: c */
    private static int[] m8542c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                iArr[i] = C2342b.m8528a(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = C2342b.m8528a(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: d */
    private static int[] m8543d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = 255;
            int i3;
            int i4;
            if (i < 8) {
                i3 = (i & 1) != 0 ? 255 : 0;
                i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = C2342b.m8528a(63, i3, i4, i2);
            } else {
                i3 = i & 136;
                i4 = 170;
                int i5 = 85;
                int i6;
                if (i3 == 0) {
                    i6 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    i3 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i5 = 0;
                    }
                    if ((i & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i] = C2342b.m8528a(255, i6, i3, i5 + i4);
                } else if (i3 != 8) {
                    i4 = 43;
                    if (i3 == 128) {
                        i6 = (((i & 1) != 0 ? 43 : 0) + 127) + ((i & 16) != 0 ? 85 : 0);
                        i3 = (((i & 2) != 0 ? 43 : 0) + 127) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i4 = 0;
                        }
                        i4 += 127;
                        if ((i & 64) == 0) {
                            i5 = 0;
                        }
                        iArr[i] = C2342b.m8528a(255, i6, i3, i4 + i5);
                    } else if (i3 == 136) {
                        i6 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        i3 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i4 = 0;
                        }
                        if ((i & 64) == 0) {
                            i5 = 0;
                        }
                        iArr[i] = C2342b.m8528a(255, i6, i3, i4 + i5);
                    }
                } else {
                    i6 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    i2 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i5 = 0;
                    }
                    if ((i & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i] = C2342b.m8528a(127, i6, i2, i5 + i4);
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private static void m8533a(C2336c c2336c, C2334a c2334a, int i, int i2, int i3, Paint paint, Canvas canvas) {
        if (i == 3) {
            c2334a = c2334a.f7367d;
        } else if (i == 2) {
            c2334a = c2334a.f7366c;
        } else {
            c2334a = c2334a.f7365b;
        }
        int[] iArr = c2334a;
        int i4 = i;
        int i5 = i2;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        C2342b.m8534a(c2336c.f7376c, iArr, i4, i5, i3, paint2, canvas2);
        C2342b.m8534a(c2336c.f7377d, iArr, i4, i5, i3 + 1, paint2, canvas2);
    }

    /* renamed from: a */
    private static void m8534a(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int i4 = i;
        byte[] bArr2 = bArr;
        C2174j c2174j = new C2174j(bArr);
        int i5 = i2;
        int i6 = i3;
        byte[] bArr3 = null;
        byte[] bArr4 = bArr3;
        while (c2174j.m7959a() != 0) {
            int c = c2174j.m7966c(8);
            if (c != 240) {
                int a;
                switch (c) {
                    case 16:
                        byte[] bArr5;
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr5 = null;
                                a = C2342b.m8529a(c2174j, iArr, bArr5, i5, i6, paint, canvas);
                                c2174j.m7969e();
                                break;
                            }
                            bArr2 = bArr4 == null ? f7410a : bArr4;
                        } else {
                            bArr2 = bArr3 == null ? f7411b : bArr3;
                        }
                        bArr5 = bArr2;
                        a = C2342b.m8529a(c2174j, iArr, bArr5, i5, i6, paint, canvas);
                        c2174j.m7969e();
                    case 17:
                        a = C2342b.m8536b(c2174j, iArr, i4 == 3 ? f7412c : null, i5, i6, paint, canvas);
                        c2174j.m7969e();
                        break;
                    case 18:
                        a = C2342b.m8540c(c2174j, iArr, null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (c) {
                            case 32:
                                bArr4 = C2342b.m8535a(4, 4, c2174j);
                                continue;
                            case 33:
                                bArr2 = C2342b.m8535a(4, 8, c2174j);
                                break;
                            case 34:
                                bArr2 = C2342b.m8535a(16, 8, c2174j);
                                break;
                            default:
                                continue;
                                continue;
                        }
                        bArr3 = bArr2;
                        break;
                }
                i5 = a;
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    /* renamed from: a */
    private static int m8529a(C2174j c2174j, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        C2174j c2174j2 = c2174j;
        int i3 = i2;
        Paint paint2 = paint;
        int i4 = i;
        Object obj = null;
        while (true) {
            int c;
            int i5;
            Object obj2;
            int c2 = c2174j.m7966c(2);
            if (c2174j.m7968d()) {
                if (c2174j.m7968d()) {
                    c2 = 3 + c2174j.m7966c(3);
                    c = c2174j.m7966c(2);
                } else {
                    if (!c2174j.m7968d()) {
                        switch (c2174j.m7966c(2)) {
                            case 0:
                                c = 0;
                                i5 = 0;
                                obj2 = 1;
                                break;
                            case 1:
                                obj2 = obj;
                                c = 0;
                                i5 = 2;
                                break;
                            case 2:
                                c2 = c2174j.m7966c(4) + 12;
                                c = c2174j.m7966c(2);
                                break;
                            case 3:
                                c2 = c2174j.m7966c(8) + 29;
                                c = c2174j.m7966c(2);
                                break;
                            default:
                                break;
                        }
                    }
                    obj2 = obj;
                    c = 0;
                    i5 = 0;
                }
                obj2 = obj;
                i5 = c2;
            } else {
                obj2 = obj;
                c = c2;
                i5 = 1;
            }
            if (!(i5 == 0 || paint2 == null)) {
                if (bArr != null) {
                    c = bArr[c];
                }
                paint2.setColor(iArr[c]);
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) i4, (float) i3, (float) (i4 + i5), (float) (i3 + 1), paint);
            }
            i4 += i5;
            if (obj2 != null) {
                return i4;
            }
            obj = obj2;
        }
    }

    /* renamed from: b */
    private static int m8536b(C2174j c2174j, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        C2174j c2174j2 = c2174j;
        int i3 = i2;
        Paint paint2 = paint;
        int i4 = i;
        Object obj = null;
        while (true) {
            Object obj2;
            int i5;
            int i6;
            Canvas canvas2;
            int c = c2174j.m7966c(4);
            if (c != 0) {
                obj2 = obj;
                i5 = c;
            } else {
                if (c2174j.m7968d()) {
                    if (c2174j.m7968d()) {
                        switch (c2174j.m7966c(2)) {
                            case 0:
                                obj2 = obj;
                                i5 = 0;
                                break;
                            case 1:
                                obj2 = obj;
                                i5 = 0;
                                i6 = 2;
                                break;
                            case 2:
                                c = c2174j.m7966c(4) + 9;
                                i5 = c2174j.m7966c(4);
                                break;
                            case 3:
                                c = c2174j.m7966c(8) + 25;
                                i5 = c2174j.m7966c(4);
                                break;
                            default:
                                obj2 = obj;
                                i5 = 0;
                                i6 = 0;
                                break;
                        }
                    }
                    c = c2174j.m7966c(2) + 4;
                    i5 = c2174j.m7966c(4);
                    obj2 = obj;
                    i6 = c;
                } else {
                    i5 = c2174j.m7966c(3);
                    if (i5 != 0) {
                        obj2 = obj;
                        i6 = i5 + 2;
                        i5 = 0;
                    } else {
                        i5 = 0;
                        i6 = 0;
                        obj2 = 1;
                    }
                }
                if (!(i6 == 0 || paint2 == null)) {
                    if (bArr != null) {
                        i5 = bArr[i5];
                    }
                    paint2.setColor(iArr[i5]);
                    canvas2 = canvas;
                    canvas2.drawRect((float) i4, (float) i3, (float) (i4 + i6), (float) (i3 + 1), paint);
                }
                i4 += i6;
                if (obj2 != null) {
                    return i4;
                }
                obj = obj2;
            }
            i6 = 1;
            if (bArr != null) {
                i5 = bArr[i5];
            }
            paint2.setColor(iArr[i5]);
            canvas2 = canvas;
            canvas2.drawRect((float) i4, (float) i3, (float) (i4 + i6), (float) (i3 + 1), paint);
            i4 += i6;
            if (obj2 != null) {
                return i4;
            }
            obj = obj2;
        }
    }

    /* renamed from: c */
    private static int m8540c(C2174j c2174j, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        C2174j c2174j2 = c2174j;
        int i3 = i2;
        Paint paint2 = paint;
        int i4 = i;
        Object obj = null;
        while (true) {
            Object obj2;
            int i5;
            int i6;
            int c = c2174j.m7966c(8);
            if (c != 0) {
                obj2 = obj;
                i5 = c;
                i6 = 1;
            } else if (c2174j.m7968d()) {
                c = c2174j.m7966c(7);
                i5 = c2174j.m7966c(8);
                obj2 = obj;
                i6 = c;
            } else {
                i5 = c2174j.m7966c(7);
                if (i5 != 0) {
                    obj2 = obj;
                    i6 = i5;
                    i5 = 0;
                } else {
                    i5 = 0;
                    i6 = 0;
                    obj2 = 1;
                }
            }
            if (!(i6 == 0 || paint2 == null)) {
                if (bArr != null) {
                    i5 = bArr[i5];
                }
                paint2.setColor(iArr[i5]);
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) i4, (float) i3, (float) (i4 + i6), (float) (i3 + 1), paint);
            }
            i4 += i6;
            if (obj2 != null) {
                return i4;
            }
            obj = obj2;
        }
    }

    /* renamed from: a */
    private static byte[] m8535a(int i, int i2, C2174j c2174j) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c2174j.m7966c(i2);
        }
        return bArr;
    }
}
