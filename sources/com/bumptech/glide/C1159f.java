package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bumptech.glide.load.engine.C1265h;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.request.C1310b;
import com.bumptech.glide.request.C1311c;
import com.bumptech.glide.request.C1312d;
import com.bumptech.glide.request.C1313e;
import com.bumptech.glide.request.C3546a;
import com.bumptech.glide.request.C3549g;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.p067a.C3545h;
import com.bumptech.glide.request.p067a.C4786i;
import java.util.List;

/* renamed from: com.bumptech.glide.f */
public class C1159f<TranscodeType> implements Cloneable {
    /* renamed from: a */
    protected static final C1313e f3794a = new C1313e().m5319b(C1265h.f4010c).m5310a(Priority.LOW).m5322b(true);
    /* renamed from: b */
    protected C1313e f3795b;
    /* renamed from: c */
    private final Context f3796c;
    /* renamed from: d */
    private final C3377g f3797d;
    /* renamed from: e */
    private final Class<TranscodeType> f3798e;
    /* renamed from: f */
    private final C1313e f3799f;
    /* renamed from: g */
    private final C1143c f3800g;
    /* renamed from: h */
    private final C1157e f3801h;
    /* renamed from: i */
    private C1181h<?, ? super TranscodeType> f3802i;
    /* renamed from: j */
    private Object f3803j;
    /* renamed from: k */
    private List<C1312d<TranscodeType>> f3804k;
    /* renamed from: l */
    private C1159f<TranscodeType> f3805l;
    /* renamed from: m */
    private C1159f<TranscodeType> f3806m;
    /* renamed from: n */
    private Float f3807n;
    /* renamed from: o */
    private boolean f3808o = true;
    /* renamed from: p */
    private boolean f3809p;
    /* renamed from: q */
    private boolean f3810q;

    /* renamed from: com.bumptech.glide.f$1 */
    static /* synthetic */ class C11581 {
        /* renamed from: a */
        static final /* synthetic */ int[] f3792a = new int[ScaleType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = com.bumptech.glide.Priority.values();
            r0 = r0.length;
            r0 = new int[r0];
            f3793b = r0;
            r0 = 1;
            r1 = f3793b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.bumptech.glide.Priority.LOW;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f3793b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.bumptech.glide.Priority.NORMAL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f3793b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.bumptech.glide.Priority.HIGH;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = f3793b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = com.bumptech.glide.Priority.IMMEDIATE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = android.widget.ImageView.ScaleType.values();
            r4 = r4.length;
            r4 = new int[r4];
            f3792a = r4;
            r4 = f3792a;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r5 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            r0 = f3792a;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            r0 = f3792a;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = android.widget.ImageView.ScaleType.FIT_CENTER;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x005c }
        L_0x005c:
            r0 = f3792a;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r1 = android.widget.ImageView.ScaleType.FIT_START;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0066 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0066 }
        L_0x0066:
            r0 = f3792a;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = android.widget.ImageView.ScaleType.FIT_END;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0071 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0071 }
        L_0x0071:
            r0 = f3792a;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007c }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x007c }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007c }
        L_0x007c:
            r0 = f3792a;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1 = android.widget.ImageView.ScaleType.CENTER;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0087 }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0087 }
        L_0x0087:
            r0 = f3792a;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r1 = android.widget.ImageView.ScaleType.MATRIX;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0093 }
            r2 = 8;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0093 }
        L_0x0093:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.f.1.<clinit>():void");
        }
    }

    public /* synthetic */ Object clone() {
        return m4837b();
    }

    protected C1159f(C1143c c1143c, C3377g c3377g, Class<TranscodeType> cls, Context context) {
        this.f3800g = c1143c;
        this.f3797d = c3377g;
        this.f3798e = cls;
        this.f3799f = c3377g.m17299h();
        this.f3796c = context;
        this.f3802i = c3377g.m17291b((Class) cls);
        this.f3795b = this.f3799f;
        this.f3801h = c1143c.m4784e();
    }

    /* renamed from: a */
    public C1159f<TranscodeType> m4830a(C1313e c1313e) {
        C1178i.m4880a((Object) c1313e);
        this.f3795b = m4836a().m5315a(c1313e);
        return this;
    }

    /* renamed from: a */
    protected C1313e m4836a() {
        return this.f3799f == this.f3795b ? this.f3795b.m5305a() : this.f3795b;
    }

    /* renamed from: a */
    public C1159f<TranscodeType> m4831a(Object obj) {
        return m4827b(obj);
    }

    /* renamed from: b */
    private C1159f<TranscodeType> m4827b(Object obj) {
        this.f3803j = obj;
        this.f3809p = true;
        return this;
    }

    /* renamed from: a */
    public C1159f<TranscodeType> m4832a(String str) {
        return m4827b(str);
    }

    /* renamed from: b */
    public C1159f<TranscodeType> m4837b() {
        try {
            C1159f<TranscodeType> c1159f = (C1159f) super.clone();
            c1159f.f3795b = c1159f.f3795b.m5305a();
            c1159f.f3802i = c1159f.f3802i.m4905a();
            return c1159f;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public <Y extends C3545h<TranscodeType>> Y m4833a(Y y) {
        return m4834a((C3545h) y, null);
    }

    /* renamed from: a */
    <Y extends C3545h<TranscodeType>> Y m4834a(Y y, C1312d<TranscodeType> c1312d) {
        return m4823a(y, c1312d, m4836a());
    }

    /* renamed from: a */
    private <Y extends C3545h<TranscodeType>> Y m4823a(Y y, C1312d<TranscodeType> c1312d, C1313e c1313e) {
        C1180j.m4896a();
        C1178i.m4880a((Object) y);
        if (this.f3809p) {
            c1313e = c1313e.m5330i();
            C1310b b = m4829b(y, c1312d, c1313e);
            Object b2 = y.mo3907b();
            if (b.mo1077a(b2) && m4826a(c1313e, (C1310b) b2) == null) {
                b.mo1084h();
                if (((C1310b) C1178i.m4880a(b2)).mo1079c() == null) {
                    b2.mo1073a();
                }
                return y;
            }
            this.f3797d.m17288a((C3545h) y);
            y.mo3906a(b);
            this.f3797d.m17289a(y, b);
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: a */
    private boolean m4826a(C1313e c1313e, C1310b c1310b) {
        return (c1313e.m5343v() != null || c1310b.mo1080d() == null) ? null : true;
    }

    /* renamed from: a */
    public C4786i<ImageView, TranscodeType> m4835a(ImageView imageView) {
        C1180j.m4896a();
        C1178i.m4880a((Object) imageView);
        C1313e c1313e = this.f3795b;
        if (!(c1313e.m5324c() || !c1313e.m5323b() || imageView.getScaleType() == null)) {
            switch (C11581.f3792a[imageView.getScaleType().ordinal()]) {
                case 1:
                    c1313e = c1313e.m5305a().m5325d();
                    break;
                case 2:
                    c1313e = c1313e.m5305a().m5327f();
                    break;
                case 3:
                case 4:
                case 5:
                    c1313e = c1313e.m5305a().m5326e();
                    break;
                case 6:
                    c1313e = c1313e.m5305a().m5327f();
                    break;
                default:
                    break;
            }
        }
        return (C4786i) m4823a(this.f3801h.m4816a(imageView, this.f3798e), null, c1313e);
    }

    /* renamed from: a */
    private Priority m4822a(Priority priority) {
        switch (priority) {
            case LOW:
                return Priority.NORMAL;
            case NORMAL:
                return Priority.HIGH;
            case HIGH:
            case IMMEDIATE:
                return Priority.IMMEDIATE;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unknown priority: ");
                stringBuilder.append(this.f3795b.m5346y());
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private C1310b m4829b(C3545h<TranscodeType> c3545h, C1312d<TranscodeType> c1312d, C1313e c1313e) {
        return m4824a((C3545h) c3545h, (C1312d) c1312d, null, this.f3802i, c1313e.m5346y(), c1313e.m5347z(), c1313e.m5299B(), c1313e);
    }

    /* renamed from: a */
    private C1310b m4824a(C3545h<TranscodeType> c3545h, C1312d<TranscodeType> c1312d, C1311c c1311c, C1181h<?, ? super TranscodeType> c1181h, Priority priority, int i, int i2, C1313e c1313e) {
        C1311c c3546a;
        C1311c c1311c2;
        if (this.f3806m != null) {
            c3546a = new C3546a(c1311c);
            c1311c2 = c3546a;
        } else {
            c1311c2 = null;
            c3546a = c1311c;
        }
        C1310b b = m4828b(c3545h, c1312d, c3546a, c1181h, priority, i, i2, c1313e);
        if (c1311c2 == null) {
            return b;
        }
        int z = r9.f3806m.f3795b.m5347z();
        int B = r9.f3806m.f3795b.m5299B();
        if (C1180j.m4897a(i, i2) && !r9.f3806m.f3795b.m5298A()) {
            z = c1313e.m5347z();
            B = c1313e.m5299B();
        }
        int i3 = z;
        int i4 = B;
        c3546a = c1311c2;
        c3546a.m17975a(b, r9.f3806m.m4824a((C3545h) c3545h, (C1312d) c1312d, c1311c2, r9.f3806m.f3802i, r9.f3806m.f3795b.m5346y(), i3, i4, r9.f3806m.f3795b));
        return c3546a;
    }

    /* renamed from: b */
    private C1310b m4828b(C3545h<TranscodeType> c3545h, C1312d<TranscodeType> c1312d, C1311c c1311c, C1181h<?, ? super TranscodeType> c1181h, Priority priority, int i, int i2, C1313e c1313e) {
        C1311c c1311c2 = c1311c;
        Priority priority2 = priority;
        if (this.f3805l != null) {
            if (r9.f3810q) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            C1181h c1181h2 = r9.f3805l.f3808o ? c1181h : r9.f3805l.f3802i;
            Priority y = r9.f3805l.f3795b.m5345x() ? r9.f3805l.f3795b.m5346y() : m4822a(priority2);
            int z = r9.f3805l.f3795b.m5347z();
            int B = r9.f3805l.f3795b.m5299B();
            if (C1180j.m4897a(i, i2) && !r9.f3805l.f3795b.m5298A()) {
                z = c1313e.m5347z();
                B = c1313e.m5299B();
            }
            int i3 = z;
            int i4 = B;
            C1311c c3549g = new C3549g(c1311c2);
            C1310b a = m4825a((C3545h) c3545h, (C1312d) c1312d, c1313e, c3549g, (C1181h) c1181h, priority, i, i2);
            r9.f3810q = true;
            C1311c c1311c3 = c3549g;
            C1310b a2 = r9.f3805l.m4824a((C3545h) c3545h, (C1312d) c1312d, c3549g, c1181h2, y, i3, i4, r9.f3805l.f3795b);
            r9.f3810q = false;
            c1311c3.m17998a(a, a2);
            return c1311c3;
        } else if (r9.f3807n == null) {
            return m4825a((C3545h) c3545h, (C1312d) c1312d, c1313e, c1311c, (C1181h) c1181h, priority, i, i2);
        } else {
            C1310b c3549g2 = new C3549g(c1311c2);
            C1312d c1312d2 = c1312d;
            c1311c2 = c3549g2;
            C1181h c1181h3 = c1181h;
            int i5 = i;
            int i6 = i2;
            c3549g2.m17998a(m4825a((C3545h) c3545h, c1312d2, c1313e, c1311c2, c1181h3, priority, i5, i6), m4825a((C3545h) c3545h, c1312d2, c1313e.m5305a().m5306a(r9.f3807n.floatValue()), c1311c2, c1181h3, m4822a(priority2), i5, i6));
            return c3549g2;
        }
    }

    /* renamed from: a */
    private C1310b m4825a(C3545h<TranscodeType> c3545h, C1312d<TranscodeType> c1312d, C1313e c1313e, C1311c c1311c, C1181h<?, ? super TranscodeType> c1181h, Priority priority, int i, int i2) {
        return SingleRequest.m17930a(this.f3796c, this.f3801h, this.f3803j, this.f3798e, c1313e, i, i2, priority, c3545h, c1312d, this.f3804k, c1311c, this.f3801h.m4818b(), c1181h.m4906b());
    }
}
